package gs1.kingbbode;

import gs1.kingbbode.common.annotations.Command;
import gs1.kingbbode.common.domain.Menu;
import gs1.kingbbode.common.exceptions.CommandException;
import gs1.kingbbode.common.exceptions.NotFoundCommandException;
import gs1.kingbbode.service.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.util.stream.Collectors.toMap;

/**
 * Created by YG-MAC on 2017. 6. 6..
 */
public class CommandCenter {
    private Map<Integer, Commander> commandMap;
    private Service service;
    private Menu menu;

    public CommandCenter() {
        this.service = new Service();
        this.commandMap = findCommand();
        this.menu = new Menu(this.commandMap);
    }

    private TreeMap<Integer, Commander> findCommand() {
        return Arrays.stream(Service.class.getDeclaredMethods())
                .filter(m -> m.isAnnotationPresent(Command.class))
                .collect(
                        toMap(m -> m.getAnnotation(Command.class).number(),
                                m -> new Commander(m.getAnnotation(Command.class), m, this.service), (ov, nv) -> nv, TreeMap::new)
                );
    }

    public void start(){
        System.out.println("***************************************");
        System.out.println("***** Kingbbode Commander v 0.0.1 *****");
        System.out.println("***************************************");
        this.menu.print();
        Scanner scanner = ScannerHolder.scanner;
        while (scanner.hasNext()){
            try {
                this.execute(scanner.next());
            } catch (CommandException e) {
                System.out.println(e.getMessage());
            }catch (NumberFormatException e) {
                System.out.println("숫자로 입력해주세요.");
            } catch (InvocationTargetException | IllegalAccessException e) {
                System.out.println("System Error : " + e.getMessage());
            }
            this.menu.print();
        }
    }

    private void execute(String number) throws InvocationTargetException, IllegalAccessException {
        int num = Integer.parseInt(number);
        if(!this.commandMap.containsKey(num)){
            throw new NotFoundCommandException();
        }
        this.commandMap.get(num).execute();
    }

    public class Commander {
        private Command command;
        private Method method;
        private Service service;

        Commander(Command command, Method method, Service service) {
            this.command = command;
            this.method = method;
            this.service = service;
        }

        void execute() throws IllegalAccessException, InvocationTargetException {
            try {
                this.method.invoke(this.service);
            } catch (InvocationTargetException e) {
                if(!(e.getCause() instanceof CommandException)){
                    throw e;
                }
                System.out.println(e.getCause().getMessage());
            }
        }

        @Override
        public String toString() {
            return command.number() + ". " + command.name();
        }
    }
}

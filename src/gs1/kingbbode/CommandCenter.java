package gs1.kingbbode;

import gs1.kingbbode.annotations.Command;
import gs1.kingbbode.domain.Menu;

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
    private Map<Integer, Commander> commands;
    private Service service;
    private Menu menu;

    public CommandCenter() {
        this.service = new Service();
        this.commands = findCommand();
        this.menu = new Menu(this.commands);
    }

    private TreeMap<Integer, Commander> findCommand() {
        return Arrays.stream(Service.class.getDeclaredMethods())
                .filter(m -> m.isAnnotationPresent(Command.class))
                .collect(
                        toMap(m -> m.getAnnotation(Command.class).number(),
                                m -> new Commander(m.getAnnotation(Command.class), m), (ov, nv) -> nv, TreeMap::new)
                );
    }

    public void start(){
        System.out.println("***************************************");
        System.out.println("***** Kingbbode Commander v 0.0.1 *****");
        System.out.println("***************************************");
        this.menu.print();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            try {
                this.execute(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 입력해주세요.");
            } catch (InvocationTargetException | IllegalAccessException e) {
                System.out.println("System Error : " + e.getMessage());
            }
            this.menu.print();
        }
    }

    private void execute(String number) throws InvocationTargetException, IllegalAccessException {
        int num = Integer.parseInt(number);
        if(!this.commands.containsKey(num)){
            System.out.println("존재하지 않는 번호입니다.");
            this.menu.print();
            return;
        }
        this.commands.get(num).execute(this.service);
    }

    public class Commander {
        private Command command;
        private Method method;

        Commander(Command command, Method method) {
            this.command = command;
            this.method = method;
        }

        void execute(Service service) throws InvocationTargetException, IllegalAccessException {
            this.method.invoke(service);
        }

        @Override
        public String toString() {
            return command.number() + ". " + command.name();
        }
    }
}

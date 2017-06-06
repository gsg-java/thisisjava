package gs1.kingbbode.domain;

import java.util.Map;

import static java.util.stream.Collectors.joining;

/**
 * Created by YG-MAC on 2017. 6. 6..
 */
public class Menu {
    public Menu(Map<Integer, CommandCenter.Commander> commands) {
        this.menu = commands.values().stream()
                .map(CommandCenter.Commander::toString)
                .collect(joining("\n"));
    }

    private String menu;

    public void print(){
        System.out.println();
        System.out.println("-----------------");
        System.out.println(this.menu);
        System.out.println("-----------------");
        System.out.println();
        System.out.print("입력> ");
    }
}

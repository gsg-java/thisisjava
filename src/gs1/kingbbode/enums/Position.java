package gs1.kingbbode.enums;

import gs1.kingbbode.exceptions.NotFoundCommandException;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by YG-MAC on 2017. 6. 4..
 */
public enum Position {
    SW(1, "사원"),
    DR(2, "대리"),
    GZ(3, "과장"),
    BZ(4, "부장");

    Position(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    private Integer num;
    private String name;



    private static String information = Arrays.stream(Position.values()).map(position -> position.num + ". " + position.name).collect(Collectors.joining(" "));
    public static void print() {
        System.out.println(information);
    }
    public static Position findByNum(Integer num){
        return Arrays.stream(Position.values())
                .filter(position -> Objects.equals(position.num, num))
                .findAny()
                .orElseThrow(NotFoundCommandException::new);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

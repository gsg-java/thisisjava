package gs6.nekisse.exercise;

import gs1.kingbbode.common.exceptions.NotFoundCommandException;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Nekisse_lee on 2017. 8. 9..
 */
public enum Categorys {
     COFFEE(1,"커피메뉴"),
     BEVERAGE(2,"기타음료"),
     SIDEMENU(3,"사이드메뉴");

    private Integer num;
    private String categoryName;

    Categorys(Integer num, String categoryName) {
        this.num = num;
        this.categoryName = categoryName;
    }



    public Integer getNum() {
        return num;
    }

    public String getCategoryName() {
        return categoryName;
    }

    private static String information = Arrays.stream(Categorys.values())
            .map(categorys -> categorys.num + ". " + categorys.categoryName)
            .collect(Collectors.joining(" "));

    public static void print(){
        System.out.println(information);
    }

    public static Categorys findByNum(Integer num){
        return Arrays.stream(Categorys.values())
                .filter(categorys -> Objects.equals(categorys.num, num))
                .findAny()
                .orElseThrow(NotFoundCommandException::new);
    }

    @Override
    public String toString() {
        return  "categoryName: " + categoryName;
    }
}

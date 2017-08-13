package gs6.nekisse.exercise;

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

    @Override
    public String toString() {
        return  "categoryName= " + categoryName;
    }
}

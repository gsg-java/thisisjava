package gs6.nekisse.menu;

/**
 * Created by Nekisse_lee on 2017. 8. 9..
 */
public enum menuCategory {
     COFFEE(1,"커피메뉴"),
     BEVERAGE(2,"기타음료"),
     SIDEMENU(3,"사이드메뉴");

    private Integer num;
    private String categoryName;

    menuCategory(Integer num, String categoryName) {
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

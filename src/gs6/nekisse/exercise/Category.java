package gs6.nekisse.exercise;

/**
 * Created by Nekisse_lee on 2017. 8. 12..
 */
public class Category {
    private int num;
    private String categoryName;

    public Category(int num, String categoryName) {
        this.num = num;
        this.categoryName = categoryName;
    }


    public int getNum() {
        return num;
    }

    public String getCategoryName() {
        return categoryName;
    }

}

package gs6.example.domain;

import java.util.*;

/**
 * Created by YG-MAC on 2017. 8. 12..
 */
public class Menu {

    public Menu() {
        this.menu = new HashMap<>();
    }

    private Map<Category, List<Item>> menu;

    boolean put(Category category, Item item) {
        if (!menu.containsKey(category)) {
            menu.put(category, new ArrayList<>());
        }
        List<Item> categoryItems = menu.get(category);
        return !categoryItems.contains(item) && categoryItems.add(item);
    }

    public String print() {
        StringBuilder stringBuilder = new StringBuilder();
        for(List<Item> entry : menu.values()){
            for(Item item : entry) {
                stringBuilder
                        .append(item.print());
                        /*
                        .append(item.getName())
                        .append(" : ")
                        .append(item.getPrice()).append("\n");
                        */
            }
        }
        return stringBuilder.toString();
    }

    public Item findItemById() {
        return menu.get(new Category("")).get(1);
    }

    //remove


    //get()

    //get(String category)

    //get(String category, String name)
}

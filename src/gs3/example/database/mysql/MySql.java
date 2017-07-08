package gs3.example.database.mysql;

import gs3.example.database.Database;

/**
 * Created by YG-MAC on 2017. 7. 8..
 */
public class MySql implements Database {
    @Override
    public void connect() {
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        System.out.println("MySql Connect");
        a();
    }

    private void a(){
        System.out.println("function");
    }

    @Override
    public void excute(String query) {
        System.out.println("MySql excute");
    }
}

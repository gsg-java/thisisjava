package gs3.example;

import gs3.example.database.Database;

/**
 * Created by YG-MAC on 2017. 7. 8..
 */
public class Dao {
    private Database database;

    public Dao(Database database) {
        this.database = database;
        this.database.connect();
    }

    public void findAll(){
        database.excute("select * from a");
    }
}

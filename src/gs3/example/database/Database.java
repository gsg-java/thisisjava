package gs3.example.database;

/**
 * Created by YG-MAC on 2017. 7. 8..
 */
public interface Database {
    void connect();
    void excute(String query);
}

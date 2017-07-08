package gs3.example;

import gs3.example.database.mysql.MySql;
import gs3.example.database.oracle.Oracle;
import org.junit.Test;

/**
 * Created by YG-MAC on 2017. 7. 8..
 */
public class DaoTest {
    @Test
    public void 구현체_교체_테스트_Oracle(){
        Dao dao = new Dao(new Oracle());
        dao.findAll();
    }

    @Test
    public void 구현체_교체_테스트_MySql(){
        Dao dao = new Dao(new MySql());
        dao.findAll();
    }
}

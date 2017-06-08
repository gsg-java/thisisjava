package gs1.kingbbode;

import gs1.kingbbode.domain.Member;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YG-MAC on 2017. 6. 6..
 */
public class Database {
    Map<String, Member> db;

    public Database() {
        this.db = new HashMap<>();
        db.put("권용근", new Member());
    }
}

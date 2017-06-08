package gs1.kingbbode;

import gs1.kingbbode.domain.Member;
import gs1.kingbbode.enums.Position;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by YG-MAC on 2017. 6. 6..
 */
public class Database {
    Map<String, Member> db;

    public Database() {
        this.db = new HashMap<>();
        db.put("권용근", new Member("권용근", Position.BZ));
        db.put("오민호", new Member("권용근", Position.SW));
        db.put("윤호성", new Member("권용근", Position.SW));
        db.put("이선호", new Member("권용근", Position.GZ));
        db.put("이은지", new Member("권용근", Position.DR));
        db.put("임민주", new Member("권용근", Position.SW));
        db.put("한은탁", new Member("권용근", Position.SW));
    }

    public void save(String name, Position position){
        db.put(name, new Member(name, position));
    }

    public Collection<Member> findAll() {
        return db.values();
    }

    public Member findByName(String name){
        if(!db.containsKey(name)){
            return null;
        }
        return db.get(name);
    }
}

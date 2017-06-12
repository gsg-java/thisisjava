package gs1.kingbbode.repository;

import gs1.kingbbode.common.domain.Member;
import gs1.kingbbode.common.enums.Position;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by YG-MAC on 2017. 6. 6..
 */
public class MemberRepository implements Repository<String, Member>{
    private Map<String, Member> store;

    public MemberRepository() {
        this.store = new HashMap<>();
        store.put("권용근", new Member("권용근", Position.BZ));
        store.put("오민호", new Member("오민호", Position.SW));
        store.put("윤호성", new Member("윤호성", Position.SW));
        store.put("이선호", new Member("이선호", Position.GZ));
        store.put("이은지", new Member("이은지", Position.DR));
        store.put("임민주", new Member("임민주", Position.SW));
        store.put("한은탁", new Member("한은탁", Position.SW));
    }

    @Override
    public void save(Member member){
        store.put(member.getName(), member);
    }

    @Override
    public Collection<Member> findAll() {
        return store.values();
    }

    @Override
    public Member findOne(String key) {
        return this.store.getOrDefault(key, null);
    }
    @Override
    public void delete(Member member){
        store.remove(member.getName());
    }

    public Member findByName(String name){
        if(!store.containsKey(name)){
            return null;
        }
        return store.get(name);
    }

}

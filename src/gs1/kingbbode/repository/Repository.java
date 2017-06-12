package gs1.kingbbode.repository;

import java.util.Collection;

/**
 * Created by YG-MAC on 2017. 6. 10..
 */
public interface Repository<K,T> {
    void save(T t);
    Collection<T> findAll();
    T findOne(K k);
    void delete(T t);
}

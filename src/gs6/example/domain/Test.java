package gs6.example.domain;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by YG-MAC on 2017. 7. 26..
 */
public class Test {
    @org.junit.Test
    public void 아이템_추가_테스트() {

    }

    @org.junit.Test
    public void 카테고리_추가_테스트() {

    }

    @org.junit.Test
    public void 할인_테스트() {
        Order order = new Order();
        order.add(new Item("아아", 1000));
        order.add(new DiscountItem("KT", 10));
        assertThat(order.calcPrice(), is(900));
    }
}

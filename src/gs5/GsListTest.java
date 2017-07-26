package gs5;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;

/**
 * Created by YG-MAC on 2017. 7. 26..
 */
public class GsListTest {

    List<String> list;
    int testSize;

    @Before
    public void setup(){
        list = new ArrayList<>();
        testSize = 3;
        for(int i=0;i<testSize;i++){
            list.add(String.valueOf(i));
        }
    }

    @Test
    public void 추가가_되는가(){
        assertThat(list.add("t1"), is(true));
        assertThat(list.get(testSize), is("t1"));
    }

    @Test
    public void 추가_후_순서가_보장되는가(){
        list.add("t1");
        list.add("t2");
        assertThat(list.get(testSize + 1), is("t2"));
    }

    @Test
    public void 특정_Index_추가가_되는가(){
        list.add("t1");
        list.add("t2");
        list.add("t3");
        list.add(testSize + 1, "t4");
        assertThat(list.get(testSize + 1), is("t4"));
        assertThat(list.get(testSize + 2), is("t2"));
    }

    @Test
    public void 특정_Index_교체가_되는가(){
        list.add("t1");
        list.add("t2");
        list.add("t3");
        list.set(testSize + 1, "t4");
        assertThat(list.get(testSize + 1), is("t4"));
        assertThat(list.get(testSize + 2), is("t3"));
    }

    @Test
    public void 포함되있는지_조회가_잘_되는가() {
        list.add("t1");
        list.add("t2");
        list.add("t3");
        assertThat(list.contains("t1"), is(true));
        assertThat(list.contains("t2"), is(true));
        assertThat(list.contains("t3"), is(true));
        assertThat(list.contains("t4"), is(false));
    }

    @Test
    public void 객체_삭제가_잘_되는가() {
        list.add("t1");
        list.add("t2");
        list.add("t3");
        list.remove("t2");
        assertThat(list.contains("t1"), is(true));
        assertThat(list.contains("t2"), is(false));
        assertThat(list.contains("t3"), is(true));
    }

    @Test
    public void Index_삭제가_잘_되는가(){
        list.add("t1");
        list.add("t2");
        list.add("t3");
        list.remove(testSize + 1);
        assertThat(list.contains("t1"), is(true));
        assertThat(list.contains("t2"), is(false));
        assertThat(list.contains("t3"), is(true));
    }

    @Test
    public void 삭제_후에도_순서가_보장_되는가() {
        list.add("t1");
        list.add("t2");
        list.add("t3");
        list.add("t4");
        list.add("t5");
        list.add("t6");
        list.remove("t2");
        assertThat(list.get(testSize + 1), is("t3"));
        list.remove("t3");
        assertThat(list.get(testSize + 1), is("t4"));
        list.remove(0);
        assertThat(list.get(testSize), is("t4"));
        assertThat(list.get(testSize + 1), is("t5"));
        assertThat(list.get(testSize + 2), is("t6"));
    }

    @Test
    public void 사이즈_조회가_정확한가(){
        list.add("t1");
        assertThat(list.size(), is(testSize + 1));
        list.add("t2");
        assertThat(list.size(), is(testSize + 2));
        list.add("t3");
        assertThat(list.size(), is(testSize + 3));
        list.add("t4");
        assertThat(list.size(), is(testSize + 4));
        list.add("t5");
        assertThat(list.size(), is(testSize + 5));
        list.set(testSize + 1, "t5");
        assertThat(list.size(), is(testSize + 5));
        list.add(testSize + 1, "t6");
        assertThat(list.size(), is(testSize + 6));
        list.remove("t1");
        assertThat(list.size(), is(testSize + 5));
        list.remove(testSize);
        assertThat(list.size(), is(testSize + 4));
    }

    @Test
    public void 초기화가_잘_되는가(){
        list.add("t1");
        list.add("t2");
        list.add("t3");
        list.clear();
        assertThat(list.contains("t1"), is(false));
        assertThat(list.contains("t2"), is(false));
        assertThat(list.contains("t3"), is(false));
        assertThat(list.size(), is(0));
    }
}

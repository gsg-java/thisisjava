package gs5.nekisse;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Nekisse_lee on 2017. 7. 23..
 */
public class NekisseListTest {

    List<String> list;

    @Before
    public void setup(){
        list = new NekisseList();
    }

    @Test
    public void 리스트에_추가하면_들어가는가(){
        assertThat(list.add("1"), is(true));
        assertThat(list.get(0), is("1"));
    }

    @Test
    public void 리스트에_순서가_보장가_보장되는가(){
        list.add("1");
        list.add("2");
        list.add("3");
        assertThat(list.get(0), is("1"));
        assertThat(list.get(1), is("2"));
        assertThat(list.get(2), is("3"));
    }

    @Test
    public void 리스트에서_삭제가_잘_되는가(){
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        assertThat(list.remove(3), is("4"));
        assertThat(list.remove("1"), is(true));
        assertThat(list.remove("2"), is(true));
        assertThat(list.remove("3"), is(true));
        assertThat(list.contains("1"), is(false));
        assertThat(list.contains("2"), is(false));
        assertThat(list.contains("3"), is(false));
        assertThat(list.contains("4"), is(false));

    }

    @Test
    public void 리스트에_포함되어있는지_확인이_되는가(){
        list.add("1");
        assertThat(list.contains("1"), is(true));
        assertThat(list.contains("2"), is(false));
    }
}

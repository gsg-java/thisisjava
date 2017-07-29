package gs5.minho;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 7. 29..
 */
public class Test {
    public static void main(String[] args) {
        MinhoList<Integer> list = new MinhoList<>();
        list.add(2);
        list.remove(0);
        System.out.print(list.get(0));
    }
}

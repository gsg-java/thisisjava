package gs1.nekisse.Member.model;

/**
 * Created by Nekisse_lee on 2017. 6. 5..
 */
public class Member {

    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String toString(){
        return String.format("이름 : ", name);
    }
}







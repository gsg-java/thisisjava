package Member;

/**
 * Created by Nekisse_lee on 2017. 6. 5..
 */
public class Member {

    String name;


    public Member(String name) {
        this.name = name;

    }
    public String toString(){
        return String.format("이름 : ", name);
    }


  public static boolean isNum(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
  }

}







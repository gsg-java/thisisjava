/**
 * Created by Nekisse_lee on 2017. 6. 5..
 */
public class Ano1 {

    @Ano(name = "사원추가")
    public void add(){
        System.out.println("사원을 추가합니다");
    }

    @Ano(name = "수정")
    public void mod(){
        System.out.println("사원을 수정합니다");
    }

    @Ano(name = "사원삭제")
    public void del(){
        System.out.println("사원을 삭제합니다");
    }

    @Ano(name = "사원조회")
    public void search(){
        System.out.println("사원을 조회합니다");
    }




}

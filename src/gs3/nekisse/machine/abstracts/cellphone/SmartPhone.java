package gs3.nekisse.machine.abstracts.cellphone;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class SmartPhone extends Phone {
    public SmartPhone(String brand, String type, String name) {
        super(brand, type, name);
        this.brand =brand;
        this.type =type;
        this.name = name;
    }

    @Override
    public void call() {
        super.call();
    }

    void internetSearch(){
            System.out.println(brand + " " + name + type +  "을 사용하여 인터넷 검색을 시작합니다.");
    }


    }


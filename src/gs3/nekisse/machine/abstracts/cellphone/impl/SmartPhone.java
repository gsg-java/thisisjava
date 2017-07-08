package gs3.nekisse.machine.abstracts.cellphone.impl;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class SmartPhone extends Phone {
    public SmartPhone(String brand, String type, String name) {
        super(brand, type, name);

    }

    @Override
    public void call() {
        super.call();
    }

    public void internetSearch(){
            System.out.println(brand + " " + name + type +  "을 사용하여 인터넷 검색을 시작합니다.");
    }


    }


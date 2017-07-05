package gs3.nekisse.machine.abstracts.cellphone;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class DmbPhone extends Phone {


    public DmbPhone(String brand, String type, String name) {
        super(brand, type, name);
        this.brand =brand;
        this.type =type;
        this.name = name;
    }

    public void watchTv(){
        System.out.println(brand + " " + name + type + "을 사용하여 티비를 시청합니다.");
    }

    }


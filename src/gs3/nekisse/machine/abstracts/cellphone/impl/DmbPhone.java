package gs3.nekisse.machine.abstracts.cellphone.impl;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class DmbPhone extends Phone {
       //  머신을 상속받은 폰 클래스에선 필드값이 있어야    call()메소드의   name+ type를  사용할수 있었는데
    // 폰클래스를 상속받은 디엠비폰 클래스에서는  필드값 선언없이   watchTv 클래스에서    brand, type, name등을 사용할수 있다  이유는.>????>??>>?>???>

    public DmbPhone(String brand, String type, String name) {
        super(brand, type, name);

    }

    public void watchTv(){                  //질문   super.brand 와 this.brand ,   brand  출력값이 같은데  다른점은.??
        System.out.println(super.brand + " " + this.name + type + "을 사용하여 티비를 시청합니다.");
    }

    }


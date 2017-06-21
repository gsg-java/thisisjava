package gs2.kingbbode;

import gs2.kingbbode.car.Car;
import gs2.kingbbode.car.chevrolet.compact.CompactChvroletCar;
import gs2.kingbbode.car.chevrolet.sedan.SedanChvroletCar;
import gs2.kingbbode.car.chevrolet.sport.SportChvroletCar;
import gs2.kingbbode.car.chevrolet.suv.SUVChvroletCar;
import gs2.kingbbode.car.hyundai.compact.CompactHyundaiCar;
import gs2.kingbbode.car.hyundai.sedan.SedanHyundaiCar;
import gs2.kingbbode.car.hyundai.sport.SportHyundaiCar;
import gs2.kingbbode.car.hyundai.suv.SUVHyundaiCar;
import gs2.kingbbode.car.kia.compact.CompactKiaCar;
import gs2.kingbbode.car.kia.sedan.SedanKiaCar;
import gs2.kingbbode.car.kia.sport.SportKiaCar;
import gs2.kingbbode.car.kia.suv.SUVKiaCar;
import gs2.kingbbode.car.samsung.sedan.SedanSamsungCar;
import gs2.kingbbode.car.samsung.suv.SUVSamsungCar;

/**
 * Created by YG-MAC on 2017. 6. 19..
 */
public class Main {
    public static void main(String[] args) {
        Car[] park = {
                new SedanSamsungCar("SM5"),
                new SUVSamsungCar("QM5"),
                new CompactKiaCar("레이"),
                new SedanKiaCar("K5"),
                new SUVKiaCar("스포티지"),
                new SportKiaCar("스팅어"),
                new CompactHyundaiCar("아토스"),
                new SedanHyundaiCar("아반테"),
                new SUVHyundaiCar("투싼"),
                new SportHyundaiCar("투스카니"),
                new CompactChvroletCar("스파크"),
                new SedanChvroletCar("말리부"),
                new SUVChvroletCar("올란도"),
                new SportChvroletCar("카마로")
        };
        for(Car car : park){
            System.out.println(car.navigate(350));
        }
    }
}

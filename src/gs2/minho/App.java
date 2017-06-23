package gs2.minho;


import gs2.minho.Brand.Chevrolet;
import gs2.minho.Brand.Hyundai;
import gs2.minho.Brand.KIA;
import gs2.minho.Brand.Samsung;
import gs2.minho.Car.Car;
import gs2.minho.Engine.CompactCarEngine;
import gs2.minho.Engine.SUVEngine;
import gs2.minho.Engine.SedanEngine;
import gs2.minho.Engine.SportsCarEngine;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 19..
 */
public class App {
    public static void main(String[] args) {
        Car[] park = {
                new Car("SM5", new Samsung() , new SedanEngine()),
                new Car("QM5", new Samsung() , new SUVEngine()),

                new Car("레이", new KIA() , new CompactCarEngine()),
                new Car("K5", new KIA() , new SedanEngine()),
                new Car("스포티지", new KIA() , new SUVEngine()),
                new Car("스팅어", new KIA() , new SportsCarEngine()),

                new Car("아토스", new Hyundai() , new CompactCarEngine()),
                new Car("아반테", new Hyundai() , new SedanEngine()),
                new Car("투싼", new Hyundai() , new SUVEngine()),
                new Car("투스카니", new Hyundai() , new SportsCarEngine()),

                new Car("스파크", new Chevrolet() , new CompactCarEngine()),
                new Car("말리부", new Chevrolet() , new SedanEngine()),
                new Car("올란", new Chevrolet() , new SUVEngine()),
                new Car("카마로", new Chevrolet() , new SportsCarEngine()),
        };

        for(Car car : park){
            System.out.println(car.navigate(350));
        }
    }
}

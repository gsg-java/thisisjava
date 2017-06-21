package gs2.kingbbode.car;

import gs2.kingbbode.brand.Brand;
import gs2.kingbbode.engine.Engine;

/**
 * Created by YG-MAC on 2017. 6. 19..
 */
public class Car {
    private int fuelEfficiency = 10;
    private int speed = 100;
    private String name;
    private Brand brand;
    private Engine engine;

    public Car(String name, Brand brand, Engine engine) {
        this.name = name;
        this.brand = brand;
        this.engine = engine;
    }

    public String navigate(int distance){
        int fuelEfficiency = this.calculateFuelEfficiency(this.fuelEfficiency);
        int fuelPrice = this.calculateFuelPrice(distance, fuelEfficiency);
        int speed = this.calculateSpeed(this.speed);
        String time = this.calculateTime(distance, speed);
        return this.name + " ( 브랜드 : " + this.brand.getName() +
                ", 종류 : " + this.engine.getModel() +
                ", 주유 종류 : " + this.engine.getOilType().getName() +
                ", 연비 : " + fuelEfficiency +
                "km , 속도 : " + speed +
                "km, 소요 시간 : " + time +
                ", 비용 : " + fuelPrice +
                "원)";

    }

    private String calculateTime(int distance, int speed){
        int hour = (int) (distance / (double)speed);
        int min = (int) (((distance / (double)speed) - hour)*60);
        int sec = (int) (((((distance / (double)speed) - hour)*60) - min)*60);
        return hour + "시간 " + min + "분 " + sec + "초";
    }

    private int calculateFuelPrice(int distance, int fuelEfficiency){
        return ((int) (Math.ceil(distance / (double)fuelEfficiency))
                        * (brand.discount(engine.getOilType())));
    }

    private int calculateFuelEfficiency(int fuelEfficiency){
        return brand.renovateFuel(engine.makeFuel(fuelEfficiency));
    }

    private int calculateSpeed(int speed){
        return brand.renovateSpeed(engine.makeSpeed(speed));
    }
}

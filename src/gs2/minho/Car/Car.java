package gs2.minho.Car;

import gs2.minho.Brand.Brand;
import gs2.minho.Engine.Engine;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 19..
 */
public class Car implements CarInterface {

    private int fuelEfficiency = 10;
    private int speed = 100;
    private Brand brand;
    private Engine engine;
    private String name;

    public Car(Brand brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
        this.valueSetting();
    }

    public void valueSetting() {
        fuelEfficiency = brand.influenceFuelEfficiency(fuelEfficiency);
        fuelEfficiency = engine.influenceFuelEfficiency(fuelEfficiency);
        speed = brand.influenceSpeed(speed);
        speed = engine.influenceSpeed(speed);
    }

    public int costOfchargingFuel(int amount) {
        int cost = engine.costOfChargingFuel(amount);
        int discountCost = brand.discountCost(amount, engine.fuelType());
        return cost - discountCost;
    }
    @Override
    public String navigate(int distance) {
        double timeToDrive = distance / speed;
        int necessaryAmount = distance / fuelEfficiency;
        return name + "()";

        //(브랜드 : 쉐보레, 종류 : 경차, 주유 종류 : 경유, 연비 : xx km, 속도 : xx km, 걸린 시간 : xx 시간, 비용 : xx 원)
    }
}

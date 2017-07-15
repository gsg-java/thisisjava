package gs2.minho.car;

import gs2.minho.brand.Brand;
import gs2.minho.engine.Engine;

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

    public Car(String name, Brand brand, Engine engine) {
        this.name = name;
        this.brand = brand;
        this.engine = engine;
        this.valueSetting();
    }

    private void valueSetting() {
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
        String timeToDrive = calculatorTime(distance);
        double necessaryAmount = costOfchargingFuel(distance / fuelEfficiency);
        return name + " (" + brand.toString() + engine.toString() + engine.fuelType().toString() +
                "연비 : " + fuelEfficiency + "km, 걸린 시간 : " + timeToDrive + ",  비용 : " + necessaryAmount + "원 )";

        //(브랜드 : 쉐보레, 종류 : 경차, 주유 종류 : 경유, 연비 : xx km, 속도 : xx km, 걸린 시간 : xx 시간, 비용 : xx 원)
    }

    private String calculatorTime(int distance) {
        double hourTmp = distance / (double)speed;
        int hour = (int)hourTmp;
        double minTmp = (hourTmp - hour) * 60;
        int min = (int)minTmp;
        int sec = (int)((minTmp - min) * 60);

        return hour + "시 " + min + "분 " + sec + "초 ";
    }
}

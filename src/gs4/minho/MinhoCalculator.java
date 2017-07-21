package gs4.minho;

import java.util.Scanner;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 7. 12..
 */
public class MinhoCalculator {
    public static void main(String[] argc) {
        MinhoOperator plus = new MinhoOperator("+");
        MinhoOperator minus = new MinhoOperator("-");
        MinhoOperator multiply = new MinhoOperator("*");
        MinhoOperator divide = new MinhoOperator("/");

        MinhoInteger one = new MinhoInteger(1);
        MinhoDouble twoPointFive = new MinhoDouble(2.5);
        MinhoInteger three = new MinhoInteger(3);
        MinhoDouble fourPointFive = new MinhoDouble(4.5);
        MinhoDouble zeroPointOne = new MinhoDouble(0.1);

        System.out.println(divide.calculate( multiply.calculate(fourPointFive, minus.calculate(plus.calculate(twoPointFive,one), three)), zeroPointOne));
    }
}


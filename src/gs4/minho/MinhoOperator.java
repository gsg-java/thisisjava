package gs4.minho;

import gs3.kingbbode.human.Minho;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 7. 15..
 */

// enum 으로 해도 좋을듯
public class MinhoOperator {
    private String operator;

    MinhoOperator(String operator) {
        this.operator = operator;
    }

    MinhoNumber calculate(MinhoNumber left, MinhoNumber right) {
        MinhoNumber calculatingLeft, calculatingRight;
        MinhoNumber resultCalculated = null; // 이거 질문!!!!! null 리턴 가능성

        if (left instanceof MinhoDouble || right instanceof MinhoDouble) {
            calculatingLeft = new MinhoDouble(left.getDoubleValue());
            calculatingRight = new MinhoDouble(right.getDoubleValue());
        } else {
            calculatingLeft = new MinhoInteger(left.getIntValue());
            calculatingRight = new MinhoInteger(right.getIntValue());
        }

        switch (operator) {
            case "+":
                resultCalculated = calculatingLeft.plus(calculatingRight); break;
            case "-":
                resultCalculated = calculatingLeft.minus(calculatingRight); break;
            case "*":
                resultCalculated = calculatingLeft.multiply(calculatingRight); break;
            case "/":
                if (calculatingRight.equals(new MinhoDouble(0))) System.out.print("divided by zero");
                resultCalculated = calculatingLeft.divide(calculatingRight); break;
            default:
                System.out.println("연산자 잘못 입력했다.");
        }

        return resultCalculated;
    }
}

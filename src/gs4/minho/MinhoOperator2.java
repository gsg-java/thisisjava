package gs4.minho;

/**
 * Created by YG-MAC on 2017. 7. 15..
 */
public enum  MinhoOperator2 {
    PLUS("+", MinhoNumber::plus),
    MINUS("-", MinhoNumber::minus),
    MULTIPLY("*", MinhoNumber::multiply),
    DIVIDE("/", MinhoNumber::divide);

    private String chr;
    private Operator operator;

    MinhoOperator2(String chr, Operator operator) {
        this.chr = chr;
        this.operator = operator;
    }

    public MinhoNumber calculate(MinhoNumber left, MinhoNumber right){
        MinhoPair minhoPair = transMinhoNumber(left, right);
        return this.operator.apply(minhoPair.left, minhoPair.right);
    }

    interface Operator {
        MinhoNumber apply(MinhoNumber left, MinhoNumber right);
    }

    private MinhoPair transMinhoNumber(MinhoNumber left, MinhoNumber right){
        if (isContainsDouble(left, right)) {
            return new MinhoPair(new MinhoDouble(left.getDoubleValue()), new MinhoDouble(right.getDoubleValue()));
        }
        return new MinhoPair(new MinhoInteger(left.getIntValue()), new MinhoInteger(right.getIntValue()));
    }

    private boolean isContainsDouble(MinhoNumber left, MinhoNumber right){
        return left instanceof MinhoDouble || right instanceof MinhoDouble;
    }

    class MinhoPair {
        MinhoNumber left;
        MinhoNumber right;

        MinhoPair(MinhoNumber left, MinhoNumber right) {
            this.left = left;
            this.right = right;
        }
    }
}

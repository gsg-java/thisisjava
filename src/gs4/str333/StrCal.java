package gs4.str333;

public class StrCal {
	public static void main(String[] args) {

        System.out.println(new StrInteger(10).sum(new StrInteger(20)).getIntNumber());
        System.out.println(new StrDouble(12.4).sub(new StrInteger(20)).getDoubleNumber());
        System.out.println(new StrInteger(11).mul(new StrInteger(20)).getIntNumber());
        System.out.println(new StrDouble(44).div(new StrDouble(20)).getDoubleNumber());
	}
}

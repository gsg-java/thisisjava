package str333;

public class StrDouble implements StrNumber {
	private double number;

	@Override
	public int getIntNumber() {
		// TODO Auto-generated method stub
		return (int) this.number;
	}

	@Override
	public double getDoubleNumber() {
		// TODO Auto-generated method stub
		return (double) this.number;
	}

	public StrDouble() {
		super();
	}

	public StrDouble(double number) {
		super();
		this.number = number;
	}

	@Override
	public StrNumber sum(StrNumber strNumber) {
		// TODO Auto-generated method stub
		this.number += strNumber.getDoubleNumber();
		return new StrDouble(this.number);
	}

	@Override
	public StrNumber sub(StrNumber strNumber) {
		// TODO Auto-generated method stub
		this.number -= strNumber.getDoubleNumber();
		return new StrDouble(this.number);
	}

	@Override
	public StrNumber mul(StrNumber strNumber) {
		this.number *= strNumber.getDoubleNumber();
		return new StrDouble(this.number);
	}

	@Override
	public StrNumber div(StrNumber strNumber) {
		this.number /= strNumber.getDoubleNumber();
		return new StrDouble(this.number);
	}

}

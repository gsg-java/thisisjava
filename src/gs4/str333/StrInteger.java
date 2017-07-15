package gs4.str333;

public class StrInteger implements StrNumber {
	private int number;

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

	public StrInteger() {
		super();
	}

	public StrInteger(int number) {
		super();
		this.number = number;
	}

	@Override
	public StrNumber sum(StrNumber strNumber) {
		// TODO Auto-generated method stub
		this.number += strNumber.getIntNumber();
		return new StrInteger(this.number);
	}

	@Override
	public StrNumber sub(StrNumber strNumber) {
		// TODO Auto-generated method stub
		this.number -= strNumber.getIntNumber();
		return new StrInteger(this.number);
	}

	@Override
	public StrNumber mul(StrNumber strNumber) {
		this.number *= strNumber.getIntNumber();
		return new StrInteger(this.number);
	}

	@Override
	public StrNumber div(StrNumber strNumber) {
		this.number /= strNumber.getIntNumber();
		return new StrInteger(this.number);
	}
}

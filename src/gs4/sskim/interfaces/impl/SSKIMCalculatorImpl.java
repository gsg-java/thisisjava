package gs4.sskim.interfaces.impl;

import gs4.sskim.integer.SSKIMInteger;
import gs4.sskim.interfaces.SSKIMCalculator;

public class SSKIMCalculatorImpl implements SSKIMCalculator{

	@Override
	public void sskim_plus(SSKIMInteger a, SSKIMInteger b) {
		System.out.print("덧셈 ");
		System.out.println(a.value + b.value);
	}

	@Override
	public void sskim_minus(SSKIMInteger a, SSKIMInteger b) {
		System.out.print("뺄셈 ");
		System.out.println(a.value - b.value);
	}

	@Override
	public void sskim_multi(SSKIMInteger a, SSKIMInteger b) {
		System.out.print("곱셈 ");
		System.out.println(a.value * b.value);
	}

	@Override
	public void sskim_divide(SSKIMInteger a, SSKIMInteger b) {
		System.out.print("나눗셈 ");
		System.out.println(a.value / b.value);
	}
	
	
}

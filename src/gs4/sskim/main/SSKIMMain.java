package com.sskim.main;

import com.sskim.integer.SSKIMInteger;
import com.sskim.interfaces.impl.SSKIMCalculatorImpl;

public class SSKIMMain{
	public static void main(String[] args) {
		
		//계산기 기능
		SSKIMCalculatorImpl calImpl = new SSKIMCalculatorImpl();
		//TODO 여기서 Integer 타입 
		
		SSKIMInteger val1 = new SSKIMInteger(30);
		SSKIMInteger val2 = new SSKIMInteger(40);
		
		calImpl.sskim_plus(val1, val2);
		calImpl.sskim_minus(val1, val2);
		calImpl.sskim_multi(val1, val2);
		calImpl.sskim_divide(val1, val2);
		
	}
}

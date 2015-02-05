package com.leonardoz.cditech.math;

import com.leonardoz.cditech.identifiers.Audit;

@Audit
public class MathOperations {

	public void sum(int a, int b) {
		int res = a + b;
		System.out.println(res);
	}

	public void mult(int a, int b) {
		int res = a * b;
		System.out.println(res);
	}

}

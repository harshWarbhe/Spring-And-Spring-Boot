package com.harsh.sbeans;

public class B {
	private A a;

	public B() {
		System.out.println("B :: 0 param constructor");
	}

	public void setA(A a) {
		System.out.println("B.setB()");
		this.a = a;
	}

	@Override
	public String toString() {
		return "B...";
	}

}

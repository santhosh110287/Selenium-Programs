package com.sa.sample1;

/*
 * inheritance
 * overriding
 * upcasting
 */
interface A
{
	void m1();
}

class B implements A{

	public void m1() {
		System.out.println("m1 of B");
	}
}

class C implements A{

	public void m1() {
		System.out.println("m1 of C");
	}
}

public class Demo1 {
	public static void test(A a)
	{
		a.m1();
	}
	public static void main(String[] args) {
		A a=new C();
		Demo1.test(a);
	}
}
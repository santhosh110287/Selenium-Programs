package com.sa.sampleexamples;  //Date: 20-01-2022

class A{
	void m1()
	{
		System.out.println("Hi");
	}
}
class B  extends A{
	void m1()
	{
		System.out.println("Bye");
	}
}
public class Demo5 {
	public static void main(String[] args) {
		//A a1=new A();
		//a1.m1();//Hi
		//B b1=new B();
		//b1.m1();//Bye
		A a1;
		B b1;
		b1=new B();
		//a1=(A)b1;
		a1=b1; //auto upcasting
		a1.m1();
		B b2=(B)a1;
		b2.m1();
		
	}
}

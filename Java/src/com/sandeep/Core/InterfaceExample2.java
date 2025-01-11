package com.sandeep.Core;

interface A{
	void a();
	void x();
}
interface B{
	void b();
	void y();
}
interface C extends B{
	void c();
	void z();
}
class ABCD implements A,C{

	@Override
	public void b() {
		System.out.println("in b");
		
	}

	@Override
	public void y() {
		System.out.println("in y");
		
	}

	@Override
	public void c() {
		System.out.println("in c");
		
	}

	@Override
	public void z() {
		System.out.println("in z");
		
	}

	@Override
	public void a() {
		System.out.println("in a");
		
	}

	@Override
	public void x() {
		System.out.println("in x");
		
	}
	
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		ABCD obj= new ABCD();
		obj.a();
		obj.b();
		obj.c();
		obj.x();
		obj.y();
		obj.z();
		
	}

}

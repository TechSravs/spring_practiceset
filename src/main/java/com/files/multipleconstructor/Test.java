package com.files.multipleconstructor;

public class Test {
	//by default it will follow top to bottom,but always string type will be executed first
	
	private int x;
	private int y;
	public Test(double x, double y) {
		
		this.x =(int) x;
		this.y =(int)y;
		System.out.println("constructor:---double:double");
	}
	public Test(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("constructor:---int:int");
	}
	public Test(String x,String y) {
		this.x=Integer.parseInt(x);
		this.y=Integer.parseInt(y);
		System.out.println("constructor:---String:String");
	}
	
	public void add() {
		System.out.println("value of x is:- "+this.x);
		System.out.println("value of y is:- "+this.y);
		System.out.println("result is:- "+(this.x+this.y));
	}
	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}
	

}

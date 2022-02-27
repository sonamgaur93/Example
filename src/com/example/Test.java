package com.example;
class Test1{
	static int s;
	int s1;
	
	Test1(int s,int s1){
		this.s=s;
		this.s1=s1;
	}
	void show() {
		System.err.println(s);
		System.err.println(s1);
	}
}
public class Test {
	public static void main(String [] args) {
		Test1 t1=new Test1(100,000);
		t1.show();
	
		}


}

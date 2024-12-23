package com.practice.mylist;
class A{
	int val=5;
	
}
public class My {

	public static void main(String[] args) {
		A am=new A();
		System.out.println(am.val);
		changeVal(am);
		System.out.println(am.val);
		// TODO Auto-generated method stub

	}

	private static void changeVal(A ac) {
		ac=new A();
		System.out.println(ac.val);
		
		
	}

}

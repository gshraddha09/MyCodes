package com.practice.mylist;

interface J {
	void show();
}

class LamdaExpressionExmple {

	public static void main(String[] args) {
		J obj;
		obj = () -> System.out.println("hi from new class");
		obj.show();

	}
}
//	when we write  we have class here so in file path we shall have 
//   a LamdaExpressionExmple$1 file as its anaymous
//	J obj=new J() {
//		public void show() {
//			System.out.println("hi from A");
//		}
//	}

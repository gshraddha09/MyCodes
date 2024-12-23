
package com.practice.dsa;


public class Stack {
	int top;
	int[] stackArray;
	int size;

	Stack(int size) {
		this.top = -1;
		this.stackArray = new int[size];
		this.size = size;

	}

	void push(int value) {
		if (top == size - 1) {
			System.out.println("stack is full");
		} else {
			stackArray[++top] = value;
		System.out.println(value+" inserted");
		}
	}

	void display() {
		 if(top==-1) {
			 System.out.println("stack is empty");
		 }
		for (int i = 0; i <=top; i++) {
			System.out.println(stackArray[i]);
		}
	}

	void pop() {
		 if(top==-1) {
			 System.out.println("stack is empty");
		 }
		 else {
			 int val=stackArray[top--];
			 System.out.println(val+"removed from stack");
			 
		 }
	 }

	// 30-2
	// 20-1
	// 10-0
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();
		stack.push(50);
		stack.pop();
		stack.pop();
		stack.display();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();
		

	}

}

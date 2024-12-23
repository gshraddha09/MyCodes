package com.practice.dsa;

class MyArraylist<T> {
	Object list[];
	int intial;
	int capacity = 2;
	int size;

	public MyArraylist() {
		this.list = new Object[capacity];
		this.intial = 0;
		this.size=0;
	}

	public void add(T value) {
		if (intial >= capacity) {
			reSizeArray();
		}

		list[intial] = value;
		intial++;
		size++;

	}

	public void reSizeArray() {
		int newCapacity = list.length * 2;
		Object newArray[] = new Object[newCapacity];
		System.arraycopy(list, 0, newArray, 0, list.length);
		list = newArray;
	}

	public void display() {
		System.out.println("===");
		for (int i = 0; i < size; i++) {
			System.out.println(list[i]);
		}
	}
	public void remove(int index) {
		for(int i=index;i<size-1;i++) {
			list[i]=list[i+1];
		}
		size--;
		
	}

	public static void main(String[] args) {
		MyArraylist<Integer> m = new MyArraylist();
		for (int i = 0; i <4; i++) {
			m.add(i);
		}
		m.display();
		m.remove(1);
		m.display();

	}
}

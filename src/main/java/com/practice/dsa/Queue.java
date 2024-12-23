package com.practice.dsa;

public class Queue {
	int size;
	int[] queueArray;
	int rear;
	int front;

	Queue(int size) {
		this.size = size;
		this.queueArray = new int[size];
		this.rear = -1;
		this.front = 0;
	}

	void enqueue(int value) {
		
		if (rear == size - 1) {
			System.out.println("Queue is full");
		} else {
			queueArray[++rear] = value;
			System.out.println(value + " is inserted");
		}
		

	}

	void display() {
		if (rear==-1) {
			System.out.println(" Queue is empty");
		}
		System.out.println("=======");
		for (int i = front; i <= rear; i++) {
			System.out.println(queueArray[i]);
		}
	}

	void dequeue() {
		if (rear==-1 && front>rear) {
			System.out.println("Queue is empty");
		} else if (front <= rear) {
			System.out.println(queueArray[front] + " is removed");
			front++;
		}
		if(front>rear) {
			front=0;
			rear=-1;
		}
	}

	public static void main(String[] args) {
		Queue queue = new Queue(2);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		
		
		
	}
	// 10

}

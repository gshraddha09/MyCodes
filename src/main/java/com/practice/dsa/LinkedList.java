package com.practice.dsa;

class Nodee {
	int value;
	Nodee next;

}

public class LinkedList {

	public static void main(String[] args) {
		Nodee head = null;
		Nodee current = null;
		for (int i = 0; i <= 2; i++) {
			if (head == null) {
				head = new Nodee();
				head.value = i;
				current = head;
			} else {
				current.next = new Nodee();
				current.next.value = i;
				current = current.next;
			}

		}
		current = iterateLinkedList(head);
		current = insert(current, 3);
		current = insert(current, 5);
		current = insert(current, 8);
//		current=iterateLinkedList(head);
		System.out.println(" current" + current.value);
//		current.next=head;
//		current=iterateLinkedList(head);
//		detectCylic(head);
//		current=reverseLinkedList(head);
		iterateLinkedList(head);
		findMiddleElement(head);
		// h1
		// 10->
		// 15->30
		// t
		// 3->6->9->
		// h2
	}

	private static void findMiddleElement(Nodee head) {
		Nodee slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}
		System.out.println(" middle ele is " + slow.value);
	}

	private static Nodee reverseLinkedList(Nodee head) {

		Nodee current = head, prev = null, after = null;
		// null<-1<-2<-5
		// c
		// p
		// a
		while (current != null) {
			after = current.next;
			current.next = prev;
			prev = current;
			current = after;

		}
		return prev;

	}

	private static void detectCylic(Nodee head) {
		Nodee slow = head, fast = head;
		Nodee current = head;
		boolean isCycleFound = false;
		while (fast != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				isCycleFound = true;
				break;
			} //
				// 0 1 2 5
		}
		if (isCycleFound) {
			System.out.println("cycle found");
		} else
			System.out.println("not found");
	}

	private static Nodee insert(Nodee present, int val) {
		Nodee current = present;
		current.next = new Nodee();
		current.next.value = val;
		System.out.println(" inserted " + val);
		current = current.next;
		return current;
	}

	private static Nodee iterateLinkedList(Nodee head) {
		Nodee current = head;
		Nodee prev = null;
		while (current != null) {
			if (current.next != null) {
				System.out.print(current.value + "->");
			} else {
				System.out.println(current.value);
				prev = current;

			}
			current = current.next;
		}
		return prev;
	}

}

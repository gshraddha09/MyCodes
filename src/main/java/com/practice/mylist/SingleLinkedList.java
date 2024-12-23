package com.practice.mylist;

public class SingleLinkedList {

	public static void main(String[] args) {
		Node1 head = null;
		Node1 curr = head;
		int arr[] = {};
		for (int i = 0; i < arr.length; i++) {
			if (head == null) {
				head = new Node1(arr[i]);
				curr = head;
			} else {
				curr.next = new Node1(arr[i]);
				curr = curr.next;

			}
		}
//		Traverse(head);
//		 1)Insert at end method
//		     a)at end--done
//			 b)insert at beginning--done  while empty
//			 c)insert at specific postion--done
//			 d) even links are there insert at beginning
//		 2)InsertAtPostion Method
//  		 3)delete method
//		 	a)delete at begining
//			b)delete at middle with value
//			c)delete at end

//		head = insert(head, 20);
//		head = insertAtPostion(2, 80, head);
//
		Node1 result = deleteNode(25, head);

		Traverse(result);

	}

	private static Node1 deleteNode(int val, Node1 head) {

		Node1 curr = head;
		Node1 prev = null;
		int index = 1;
		while (curr != null) {
			if (index == 1 && curr.value == val) {
				curr = curr.next;
				return curr;
			}
			if (curr.value == val) {
				prev.next = curr.next;
			}
			index++;
			prev = curr;
			curr = curr.next;
		}
		return head;
	}

	private static Node1 insertAtPostion(int position, int val, Node1 head) {
		int size = getSize(head);
		if (size == 0 && position > 1) {
			System.out.println("size exceeded");
			return head;
		}
		if (position <= 0 || position > size + 1) {
			System.out.println("Invalid index");
			return head;
		}

		if (head == null) {
			head = new Node1(val);
			return head;
		}
		Node1 curr = head;
		Node1 temp = null;
		Node1 newNode = null;
		int i = 1;

		while (curr != null) {
			if (position == 1) {
				newNode = new Node1(val);
				newNode.next = curr;
				return newNode;
			}
			if (i == position - 1) {
				temp = curr.next;
				newNode = new Node1(val);
				curr.next = newNode;
				newNode.next = temp;
				break;
			}
			i++;
			curr = curr.next;

		}

		return head;
	}

	private static Node1 insert(Node1 head, int val) {
//		Node1 temp=head;
		if (head == null) {
			return new Node1(val);
		}
		Node1 curr = head;
		Node1 prev = null;
		while (curr != null) {
			// System.out.println(curr.value);
			prev = curr;
			curr = curr.next;
		}
		prev.next = new Node1(val);
		return head;
	}

	private static void Traverse(Node1 head) {
		Node1 curr = head;
		while (curr != null) {
			if (curr.next != null) {
				System.out.print(curr.value + "->");
			} else
				System.out.print(curr.value);

			curr = curr.next;
		}

	}

	private static int getSize(Node1 head) {
		Node1 curr = head;
		int size = 0;
		while (curr != null) {
//			System.out.println(curr.value);
			curr = curr.next;
			size++;
		}
		return size;

	}

}

class Node1 {
	int value;
	Node1 next;

	Node1(int value) {
		this.value = value;
	}

	Node1() {

	}

}
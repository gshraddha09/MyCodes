package com.practice.mylist;

class Node {
	int val;
	Node next;

}

public class LinkedList {

	public static void main(String[] args) {
		int arr[] = {};
		Node head = null;
		Node current = null;
		int count = 0;
		int index = 5, value = 10;
		for (int i = 0; i < arr.length; i++) {
			if (head == null) {
				head = new Node();
				head.val = arr[i];
				current = head;

			} else {
//				Node n1 = new Node();
				current.next = new Node();
				current.next.val = arr[i];

				current = current.next;

			}

		}
//		head = InsertAt(1, 1, head);
//		head = InsertAt(4, 5, head);
//		head = deleteNode(1, head);
		// head=InsertAt(1, 25, head);
//		int size=travsersal(head,count);
//		System.out.println("count is "+size);
		FindMiddleElement(head);

	}

	private static void FindMiddleElement(Node head) {
		if (head == null) {
			System.out.println("empty");
			return;
		}
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.val);
	}

	private static int travsersal(Node head, int count) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
			count++;
		}
		return count;
	}

	private static Node InsertAt(int index, int value, Node current) {
		if (index == 1) {
			Node n = new Node();
			n.val = value;
			n.next = current;
			return n;
		}
		Node head = current;
		int j = 1;
		while (current != null) {
			if (j == index - 1) {
				Node temp = current.next;
				current.next = new Node();
				current.next.val = value;
				current.next.next = temp;

			}
			j++;
			current = current.next;

		}
		return head;
	}

	public static Node deleteNode(int value, Node head) {

		if (head != null && head.val == value) {
			head = head.next;
			return head;
		}

		Node cur = head;
		while (cur != null && cur.next != null) {
			if (cur.next.val == value) {
				Node temp = cur.next.next;
				cur.next = temp;
				break;

			}
			cur = cur.next;
		}
		return head;

	}

	private static boolean IsCycleDetected(Node head) {
		Node slow = null, fast = head;
		while (fast != null) {
			fast = fast.next.next;
			slow = slow.next;

			if (slow == fast) {
				return true;
			}
		}
//		//1,2
//	     |__|
		// s
		// f
		return false;
	}

	private static Node RotateArrayByK(Node head, int k) {

		Node curr = head;
		int size = 1;
		while (curr.next != null) {
			size++;
			curr = curr.next;
		}
		curr.next = head;
		Node temp = head;
		Node nextNode = head;
		int index = 1;
		k = k % size;
		while (index <= size - k) {
			if (index == size - k) {
				nextNode = temp.next;
				temp.next = null;

			}
			index++;
			temp = temp.next;

		}
		head = nextNode;
		return head;

	}

	public static Node reverseLinkedList(Node head) {
		Node current=head,after=null,prev=null;
		while(current!=null) {
			after=current.next;
			current.next=prev;
			prev=current;
			current=after;
			
		}
		return prev;
 
	}

	private static void FindMiddleElement1(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.val);

	}

	private static void Traversal(Node curr) {
		while (curr != null) {

			System.out.println(curr.val);
			curr = curr.next;

		}
	}

}

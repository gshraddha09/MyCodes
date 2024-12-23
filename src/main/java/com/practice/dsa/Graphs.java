package com.practice.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Node {
	int value;
	List<Node> connectedList;

	public Node(int value) {
		this.value = value;
		this.connectedList = new ArrayList<>();
	}
}

public class Graphs {

	public static void main(String[] args) {
		Set<Node> visited = new HashSet<>();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		n1.connectedList.add(n3);
		n1.connectedList.add(n2);
		n2.connectedList.add(n4);
		n4.connectedList.add(n5);
		n5.connectedList.add(n6);
		// n3.connectedList.add(n6);
		n3.connectedList.add(n7);
		n7.connectedList.add(n6);

		// dfs(n1,visited);
		// bfs(n1, visited);
		 
		System.out.println(findShortestPath(n1, n6, visited));

	}

	private static List<Integer> findShortestPath(Node start, Node end, Set<Node> visited) {
		Queue<Node> queue = new LinkedList<>();
		Map<Node, Integer> distance = new HashMap<>();
		Map<Node, Node> getpath = new HashMap<>();
		queue.add(start);
		distance.put(start, 0);
		getpath.put(start, null);

		while (!queue.isEmpty()) {
			Node polledNode = queue.poll();
			int currentDistance = distance.get(polledNode);
			for (Node n : polledNode.connectedList) {
				if (!distance.containsKey(n)) {
					distance.put(n, currentDistance + 1);
					getpath.put(n, polledNode);
					queue.add(n);

				}
				if (n == end) {
					return getShortestPath(getpath, end);
				}

			}

		}
		return new ArrayList<>();
//		    1
//		   /  \
//		 2     3
//		  \    /\
//		   7  8  4
//		   		  \	
//		           5
//		  
//		      BFS: 1 2 3 7 8 4  5
	}

	private static List<Integer> getShortestPath(Map<Node, Node> getpath, Node end) {
		List<Integer> path = new ArrayList<>();
		Node current=end;
		while(current!=null) {
			path.add(current.value);
			current =getpath.get(current);
		}
		Collections.sort(path);
		return path;
	}

	public static void bfs(Node root, Set<Node> visited) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		visited.add(root);
		System.out.print(root.value + "->");

		while (!queue.isEmpty()) {
			Node polledNode = queue.poll();
			for (Node n : polledNode.connectedList) {
				if (!visited.contains(n)) {
					System.out.print(n.value + "->");
					queue.add(n);
					visited.add(n);
				}
			}
		}
	
	}

	public static void dfs(Node root, Set<Node> set) {
		System.out.print(root.value + "->");
		set.add(root);

		for (Node n : root.connectedList) {
			if (!set.contains(n))
				dfs(n, set);
		}
	}
}

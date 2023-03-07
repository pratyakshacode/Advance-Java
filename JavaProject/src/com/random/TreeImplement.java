package com.random;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Scanner;

public class TreeImplement {
	
	
	static Scanner sc = new Scanner(System.in);
	
	static class Node {
		int data;
		Node left; 
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static Node buildTree(Node root) {
		
		System.out.println("Enter the data : ");
		int data = Integer.parseInt(sc.nextLine());
		
		if(data == -1) return null;
		root = new Node(data);
		
		System.out.println("Left Node : ");
		root.left = buildTree(root.left);
		
		System.out.println("Right Node : ");
		root.right = buildTree(root.right);

		return root;
	}
	
	
	public static void levelOrderTraversal(Node root) {
		
		if(root == null) return;
		
		Queue<Node> q = new ArrayDeque<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			
			Node front = q.poll();
			
			System.out.println(front.data + " ");
			
			if(front.left != null) {
				q.add(front.left);
			}
			if(front.right != null) {
				q.add(front.right);
			}
		}
	}
	
	// 10 12 15 -1 -1 16 -1 -1 13 -1 18 -1 -1
	public static void main(String [] args) {
		
		Node root = null;
		
		root = buildTree(root);
		
		try {
			
		System.out.println(root.data + " " + root.left.data + " " + root.right.data);
		
		} catch(NullPointerException e) {
			
			e.printStackTrace();
		}
		
		levelOrderTraversal(root);
		
		
	}
	
	
	
}

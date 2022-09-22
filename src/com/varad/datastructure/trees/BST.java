package com.varad.datastructure.trees;

public class BST {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}
	
	Node root;
	BST(int[] arr){
		for(int val : arr) {
			root = add(root,val);
		}
	}
	
	 void display(Node node) {
		 
		 if(node == null) {
			 return;
		 }
		 
		display(node.left);
		System.out.println(node.data + " ");
		display(node.right);
	}

	Node add(Node node,int data) {
		
		if(node==null) {
			return new Node(data);
		}
		
		if(data > node.data) {
			node.right = add(node.right,data);
		}
		else if(data < node.data) {
			node.left = add(node.left,data);
		}
		else {
			
		}
		
		return node;
	}
	
	void display() {
		display(root);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int[] arr = {50,25,12,37,30,40,75,62,60,70,80};
		BST tree = new BST(arr);
		tree.display();
	}
}

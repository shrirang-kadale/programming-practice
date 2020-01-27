package com.data.structures.java.linkedlist;
public class MyLinkedList {
	
	public Node head;
	
	class Node {
		public int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	
	public static void main(String args[]) {
		
		MyLinkedList mll = new MyLinkedList();
		
		mll.insert(10);
		
		mll.insert(20);
		
		mll.insert(30);
		
		mll.insert(40);
		
		mll.insert(50);
		
		mll.insert(60);

		
		mll.insertAfter(25, 20);
		
		mll.delete(30);
		
		mll.display();
		
		mll.length();
		
		System.out.println(">>>" + mll.searchElement(10));
	}


public void insert(int data) {
	
	Node node = new Node(data);
	
	if(head == null) {
		head = node;
		return;
	}
	
	Node temp = head;
	
	while(temp.next != null) {
		temp = temp.next;
	}
	
	temp.next = node;
	return;
}

public void insertAfter(int data, int prevNode) {
	
	Node node = new Node(data);
	
	Node temp = head;
	
	while(temp.data != prevNode) {
		temp = temp.next;
	}
	
	node.next = temp.next;
	temp.next = node;
	
	return;
}

public void delete(int data) {
	
	if(head == null)
		return;
	
	Node temp = head;
	
	Node prevNode = temp;
	
	
	while(temp.data != data) {
		prevNode = temp;
		temp = temp.next;
	}
	
	prevNode.next = temp.next;
	
	
}


public void display() {
	
	Node temp = head;
	
	while(temp != null) {
		System.out.println(temp.data);
		temp = temp.next;
	}
}

public void length() {

	Node temp = head;
	
	int length = 0;
	
	while(temp != null) {
		length++;
		temp = temp.next;
	}
	
	System.out.println("The length is : " + length);
	
}

public boolean searchElement(int data) {
	boolean found = false;
	if(head == null)
		return found;
	Node temp = head;
	
	while(temp != null) {
		if(temp.data == data) {
			found = true;
		}
		temp = temp.next;
	}
	
	return found;
}

}
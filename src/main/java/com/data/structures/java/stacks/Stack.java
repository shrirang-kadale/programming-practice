/**
 * 
 */
package com.data.structures.java.stacks;

/**
 * @author skadale
 *
 */
public class Stack {
	
	public static int TOP = -1;
	int stack[] = new int[5];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.push(6);
		stack.printStack();
		

	}
	
	public int[] push(int element) {
		
		if(TOP >= 4) {
			System.out.println("Stack is full");
			return stack;
		}
		
		TOP++;
		stack[TOP] = element;
		return stack;
	}
	
	public int[] pop() {
		if(TOP == -1) {
			System.out.println("Stack is empty");
			return stack;
		}
		
		stack[TOP] = 0;
		TOP--;
		return stack;
	}
 	
	public void printStack() {
		for(int element : stack) {
			System.out.println(element);
		}
	}
	
	

}

/*
 * 
 * This is simple node for list implementations
 * 
 * [DATA|Next] --> [DATA|Next] --> [DATA|Next]
 * 		0				1				2
 */
package com.ds.base;

public class Node<E> {

	private E data;
	private Node<E> next;
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	public Node(E data, Node<E> next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
	
	
	
}

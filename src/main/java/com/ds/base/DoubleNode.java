/*
 * 
 * This is simple node for list implementations
 * 
 * [DATA|Next] --> [DATA|Next] --> [DATA|Next]
 * 		0				1				2
 */
package com.ds.base;

public class DoubleNode<E> {
	
	private DoubleNode<E> previous;
	private E data;
	private DoubleNode<E> next;
	public DoubleNode<E> getPrevious() {
		return previous;
	}
	public void setPrevious(DoubleNode<E> previous) {
		this.previous = previous;
	}
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public DoubleNode<E> getNext() {
		return next;
	}
	public void setNext(DoubleNode<E> next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "DoubleNode [previous=" + previous + ", data=" + data
				+ ", next=" + next + "]";
	}
	public DoubleNode(DoubleNode<E> previous, E data, DoubleNode<E> next) {
		super();
		this.previous = previous;
		this.data = data;
		this.next = next;
	}



}

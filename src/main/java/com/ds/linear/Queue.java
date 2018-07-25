package com.ds.linear;

import com.ds.base.Node;

public class Queue<E> {

	private Node<E> start;
	int first, last;

	public Queue() {
		start = new Node<E>();
		start.setData(null);
		start.setNext(null);
		first = -1;
		last = -1;

	}

	public void enQueue(E data) {
		Node<E> tempNode;
		if ((this.first == -1 && this.last == -1)) {
			start.setNext(new Node<E>(data, null));
			first++;
			last++;
		} else if ((this.first == 0 && this.last == 0)) {
			this.start.getNext().setNext(new Node<E>(data, null));
			last++;
		} else {
			tempNode = this.start;
			for (int i = this.first; i <= this.last; i++) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(new Node<E>(data, null));
			last++;
		}
	}
	
	public E dequeue() throws Exception{
		E data=null;
		if(this.first==-1 && this.last==-1){
			throw new Exception("Cannot dequeue an Empty Queue");
		}
		else if(this.first==0 && this.last==0){
			data=this.getStart().getNext().getData();
			this.getStart().setNext(null);
			this.first--;
			this.last--;
			
		}else if(this.first< this.last){
			data=this.getStart().getNext().getData();
			this.getStart().setNext(this.getStart().getNext().getNext());
			this.last--;
			
		}
		return data;
	}

	public Node<E> getStart() {
		return start;
	}

	public void setStart(Node<E> start) {
		this.start = start;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
	}

}

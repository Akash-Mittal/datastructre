/*
 * List Based Stack implementation 
 * This has  Node 
 * 
 *  * [DATA|Next] --> [DATA|Next] --> [DATA|Next]
 * 		-1				0				1
 * 		Start
 */
package com.ds.linear;

import java.util.Objects;

import com.ds.base.Node;

// TODO: Auto-generated Javadoc
/**
 * The Class Stack.
 *
 * @author Akash Mittal
 * @param <E> the element type
 * @@task Loyality Program Assignment
 */
public class Stack<E> {

/** The top. */
private int top;

/** The start. */
private Node<E> start;

/**
 * Prints the.
 */
public void print(){
	Node<E> temp = this.start;
	for(;temp.getNext()!=null;temp=temp.getNext())
		System.out.println();
}


public Boolean contains(E data){
	Node<E> tempNode = this.start.getNext();
	for(int i=0;i<this.getTop();i++){
		if(tempNode.getData().equals(data))
			return true;
		else
			tempNode= tempNode.getNext();
	}
	return false;
}


/**
 * Instantiates a new stack.
 */
public Stack() {
	this.top=-1;
	this.start = new Node<E>();
	this.start.setData(null);
	this.start.setNext(null);
}

/**
 * Pop.
 *
 * @return the e
 * @throws Exception the exception
 */
public E pop() throws Exception{
	E data =null;
	if(this.getTop()<-1)
		throw new Exception("Stack doesnot exist");
	else if(this.getTop()==-1)
		throw new Exception("Cannot remove the Start Node");
	else if(this.getTop()==0){
		data = this.start.getNext().getData();
		this.start.setNext(null);
		this.top--;
		return data;
	}
	else{
		Node<E> tempNode= this.start;
		for(int i=0;i<this.top;i++){
			tempNode= tempNode.getNext();
		}	
		data =tempNode.getNext().getData();
		tempNode.setNext(null);
		this.top--;
		return data;
	}
}

/**
 * Push.
 *
 * @param data the data
 * @return the int
 */
public int push(E data){
	Node<E> newNode = new Node<E>(data, null);
	if(top==-1){
		this.start.setNext(newNode);
		return ++this.top;
	}
	else{
		Node<E> tempNode;
		for(tempNode=this.start;Objects.nonNull(tempNode.getNext());tempNode=tempNode.getNext());
		tempNode.setNext(newNode);	
		return ++this.top;
	}
}


/**
 * Instantiates a new stack.
 *
 * @param top the top
 * @param start the start
 */
public Stack(int top, Node<E> start) {
	super();
	this.top = top;
	this.start = start;
}

/**
 * Gets the top.
 *
 * @return the top
 */
public int getTop() {
	return top;
}

/**
 * Sets the top.
 *
 * @param top the new top
 */
public void setTop(int top) {
	this.top = top;
}

/**
 * Gets the start.
 *
 * @return the start
 */
public Node<E> getStart() {
	return start;
}

/**
 * Sets the start.
 *
 * @param start the new start
 */
public void setStart(Node<E> start) {
	this.start = start;
}


/**
 * The main method.
 *
 * @param args the arguments
 * @throws Exception the exception
 */
public static void main(String[] args) throws Exception {
	Stack<String>  target = new Stack<String>();
	target.push("Adam");
	System.out.println(target.getStart());
	target.push("Sandra");
	System.out.println(target.getStart());
	target.push("Peter");
	System.out.println(target.getStart());
	target.push("Mike");
	System.out.println(target.getStart());
	target.push("Falco");
	System.out.println(target.getTop());

	System.out.println(target.getStart());
	System.out.println(target.pop());
	System.out.println(target.getStart());
	System.out.println(target.pop());
	System.out.println(target.getStart());
	System.out.println(target.pop());
	System.out.println(target.getStart());
	System.out.println(target.getTop());
	

}
	
	
}

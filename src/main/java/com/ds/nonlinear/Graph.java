package com.ds.nonlinear;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import com.ds.base.Node;
import com.ds.linear.Stack;

public class Graph<E> {
private Node<?> nodeArray[];
private int nodeArraySize;

public Graph() {
nodeArray=null;
nodeArraySize=-1;
}

public void printNodeArray(){
	for(int i=0;i<nodeArray.length;i++){
		System.out.println(nodeArray[i]);
	}
}


private void addAdjacentNodes(Node<String> node,int bucketLocation ){
	Node<String> tempNode;
	if(Objects.nonNull(this.nodeArray[bucketLocation])){
		for(tempNode=(Node<String>) this.nodeArray[bucketLocation];Objects.nonNull(tempNode.getNext());tempNode = tempNode.getNext());
		tempNode.setNext(node);
	}
}

private void addNodetoArray(Node<?> node ){
	for(int i=0;i<nodeArray.length;i++){
		if(Objects.isNull(nodeArray[i])){
			nodeArray[i]=node;
			break;
		}
	}
}


public Node<?>[] buildLinkedRepresentationFromArray(int integerArray[][]){
	this.setNodeArraySize(integerArray.length);
	this.nodeArray = new Node<?>[this.nodeArraySize];	
	for(int i = 0 ; i < integerArray.length;i++){
		this.addNodetoArray(new Node<String>(i+"",null));		
		for(int j =0 ; j < integerArray[i].length;j++){
			if(integerArray[i][j]==1){
				this.addAdjacentNodes(new  Node<String>(j+"",null), i);
			}
		}
	}
	return this.nodeArray;
}


public Node<?>[] getNodeArray() {
	return nodeArray;
}


public void setNodeArray(Node<?>[] nodeArray) {
	this.nodeArray = nodeArray;
}


public int getNodeArraySize() {
	return nodeArraySize;
}


public void setNodeArraySize(int nodeArraySize) {
	this.nodeArraySize = nodeArraySize;
}

public List<E> depthFirstSearch(Node<E> nodeArray[]) throws Exception{
	List<E> traversed= new LinkedList<>();
	
	Stack<E> stack = new Stack<>();
	for(int i=0;i<nodeArray.length;i++){
		if(!stack.contains(nodeArray[i].getData())&&(!traversed.contains(nodeArray[i].getData()))){
			traversed.add( nodeArray[i].getData());
			for(Node<E> tempNode= nodeArray[i].getNext();Objects.nonNull(tempNode);tempNode = tempNode.getNext()){
				if((!stack.contains(tempNode.getData()))&&(!traversed.contains(tempNode.getData())))
				stack.push(tempNode.getData());
			}
		}
		if((!traversed.contains(nodeArray[i].getData()))&&(stack.getTop()>-1))
		traversed.add(stack.pop());
	}
	return traversed;
}


public static void main(String[] args) throws Exception {
	Graph<String> graph = new Graph<String>();
	int intArray[][] = new int[4][4];
	intArray[0][0]=0;
	intArray[0][1]=0;
	intArray[0][2]=1;
	intArray[0][3]=1;
	intArray[1][0]=1;
	intArray[1][1]=0;
	intArray[1][2]=1;
	intArray[1][3]=0;
	intArray[2][0]=0;
	intArray[2][1]=0;
	intArray[2][2]=0;
	intArray[2][3]=1;
	intArray[3][0]=0;
	intArray[3][1]=1;
	intArray[3][2]=0;
	intArray[3][3]=0;
	List<String> path=graph.depthFirstSearch(
	(Node<String>[]) graph.buildLinkedRepresentationFromArray(intArray));
	
	for (String string : path) {
		System.out.println(string);
	}
	
}

	
}

/*
 * Graph Traversal using Stack
 * Although the Nodes should have some sort of Status.
 * 1- Ready
 * 2-on the Stack
 * 3-Processed
 * 
 */
package com.ds.nonlinear.apps;

import com.ds.nonlinear.Graph;

public class DeapthFirstSearch {

	
	public static void main(String[] args) {
		StringBuilder traversed;
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
		graph.buildLinkedRepresentationFromArray(intArray);
		graph.printNodeArray();
	}
}

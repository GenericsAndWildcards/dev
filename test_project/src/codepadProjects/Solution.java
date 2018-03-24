package codepadProjects;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    Node head = new Node(1);
    Node c1 = new Node(2);
    Node c2 = new Node(3);
    head.left = c1;
    head.right = c2;
    Node c11 = new Node(4);
    Node c12 = new Node(5);    
    c1.left = c11;
    c1.right = c12;
    Node c21 = new Node(6);
    Node c22 = new Node(7);
    c2.left = c21;
    c2.right = c22;
    
    zigzagTraversal(head);
    System.out.println();
    levelTraversal(head);
    
  }
  
  public static class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
      this.data = data;
    }
  }
  
  public static void zigzagTraversal(Node head){
    
    if(null == head)
    	return;
	Stack<Node> currStack = new Stack<Node>();
    Stack<Node> nextStack = new Stack<Node>();
    boolean leftFirst = false;
    
    currStack.add(head);
    while(!currStack.isEmpty()){
      Node currNode = currStack.pop();
      if(null != currNode){ // null check not required
	      System.out.print(currNode.data + " ");
	      if(leftFirst){
	    	  if(null != currNode.left)
	    		  nextStack.add(currNode.left);
	    	  if(null != currNode.right)
	    		  nextStack.add(currNode.right);
	      }
	      else{
	    	  if(null != currNode.right)
	    		  nextStack.add(currNode.right);
	    	  if(null != currNode.left)
	        	nextStack.add(currNode.left);
	      }
      }
      if(currStack.isEmpty()){
        leftFirst = !leftFirst;
        Stack<Node> temp = currStack;
        currStack = nextStack;
        nextStack = temp;
        System.out.println();
      }
      
    }
  }
  
  public static void levelTraversal(Node root){
      if(null == root){
          return;
      }
      
      Queue<Node> currQueue = new LinkedList<Node>();
      Queue<Node> nextQueue = new LinkedList<Node>();
      
      currQueue.add(root);
      while(currQueue.size() > 0){
          Node temp = currQueue.remove();
          System.out.print(temp.data + " ");
          if(null != temp.left){
              nextQueue.add(temp.left);
          }
          if(null != temp.right){
              nextQueue.add(temp.right);
          }
          if(currQueue.size() == 0){
              System.out.println();
              Queue<Node> tempQueue = currQueue;
              currQueue = nextQueue;
              nextQueue = tempQueue;
          }
      }
  }
    
}

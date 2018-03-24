package test_project;

import java.util.NoSuchElementException;

public class StackUsingArray<T> {
	
	T[] stackArray;
	int topPosition;   //default to zero
	
	public StackUsingArray(int initialSize){
		stackArray = (T[]) new Object[initialSize];
	}
	
	public void push(T data){
		if(topPosition >= stackArray.length){
			throw new ArrayIndexOutOfBoundsException();
		}
		stackArray[topPosition++] = data;
	}
	
	public T pop(){
		if(topPosition == 0){
			throw new NoSuchElementException("Stack Underflow");
		}
		return stackArray[--topPosition];
		
	}
	
	public T peek(){
		if(topPosition == 0){
			throw new NoSuchElementException("Stack Underflow");
		}
		return stackArray[topPosition - 1];
	}
	
	public static void main(String[] args) 
    {
		StackUsingArray<Integer> s = new StackUsingArray<Integer>(10);
        s.push(10);
        s.push(20);
        s.push(40);
        System.out.println("Top element :" + s.peek());
        s.pop();
        s.push(30);
        System.out.println("Top element :" + s.peek());
        s.pop();
        System.out.println("Top element :" + s.peek());
        
    }

}

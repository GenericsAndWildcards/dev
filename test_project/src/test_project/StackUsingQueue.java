package test_project;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingQueue<T> {
	
	Queue<T> queue = new LinkedList<T>();
	int count;
	
	public void push(T data){
		
		int size = queue.size();
		
		queue.add(data);
		
		for(int i = 0; i< size; i++){
			T element = queue.remove();
			queue.add(element);
		}
		
	}
	
	public T pop(){
		if(queue.isEmpty()){
			throw new NoSuchElementException("stack inderflow");
		}
		return queue.remove();
	}
	
	public T peek(){
		if(queue.isEmpty()){
			throw new NoSuchElementException("stack inderflow");
		}
		return queue.peek();
	}
	
	public static void main(String[] args) 
    {
		StackUsingQueue<Integer> s = new StackUsingQueue<Integer>();
        s.push(10);
        s.push(20);
        System.out.println("Top element :" + s.peek());
        s.pop();
        s.push(30);
        System.out.println("Top element :" + s.peek());
        s.pop();
        System.out.println("Top element :" + s.peek());
        
    }


}

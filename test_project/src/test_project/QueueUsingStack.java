package test_project;

import java.util.Stack;

public class QueueUsingStack<T> {
	
	private Stack<T> s1 = new Stack<T>();
	private Stack<T> s2 = new Stack<T>();
	T front;

	// Push element x to the back of queue.
	public void enqueue(T x) {
	    if (s1.empty())
	        front = x;
	    s1.push(x);
	}
	
	public T dequeue() {
	    if (s2.isEmpty()) {
	        while (!s1.isEmpty())
	            s2.push(s1.pop());
	    }
	    if(!s2.isEmpty()){
	    	return s2.pop(); 
	    }
	    return null;   
	}
	
	public T peek() {
	    if (!s2.isEmpty()) {
	            return s2.peek();
	    }
	    return front;
	}
	
	public static void main(String[] args) 
    {
		QueueUsingStack<Integer> s = new QueueUsingStack<Integer>();
        s.enqueue(10);
        s.enqueue(20);
        s.enqueue(30);
        s.enqueue(40);
        s.enqueue(50);
        System.out.println("Top element :" + s.peek());
        s.dequeue();
        s.enqueue(70);
        System.out.println("Top element :" + s.peek());
        s.dequeue();
        System.out.println("Top element :" + s.peek());
        
    }

}

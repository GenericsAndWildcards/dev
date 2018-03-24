package test_project;

import java.util.NoSuchElementException;

public class StackUsingLinkedList<T> {
	
	int count;
	ListNode<T> top;
	
	public void push(T data){
		ListNode<T> entry = new ListNode<T>(data);
		entry.next = top;
		top = entry;
		count++;
	}
	
	public T pop(){
		if(null == top){
			throw new NoSuchElementException("Underflow Exception") ;
		}
		T data = top.data;
		top = top.next;
		count--;
		return data;
	}
	
	public T peek(){
		if(null == top){
			throw new NoSuchElementException("Underflow Exception") ;
		}
		return top.data;
	}
	
	public static void main(String[] args) 
    {
		StackUsingLinkedList<Integer> s = new StackUsingLinkedList<Integer>();
        s.push(10);
        s.push(20);
        s.push(40);
        System.out.println("Top element :" + s.peek());
        s.pop();
        s.push(30);
        System.out.println("Top element :" + s.peek());
        s.pop();
        System.out.println("Top element :" + s.peek());
        s.pop();
        System.out.println("Top element :" + s.peek());
        
    }


}

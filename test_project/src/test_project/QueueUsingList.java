package test_project;

import java.util.NoSuchElementException;

public class QueueUsingList<T> {
	
	ListNode<T> head, tail;
	int size;
	
	public void enqueue(T data){
		
		ListNode<T> currNode = new ListNode<T>(data);
		if(null == tail){
			head = tail = currNode;
		}else{
			tail.next = currNode;
			tail = currNode;
		}
		size++;
	}
	
	public T dequeue(){
		if(head == null){
			throw new NoSuchElementException("queue underflow");
		}
		
		T data = head.data;
		head = head.next;
		if(null == head){
			tail = null;
		}
		size--;
		return data;
	}
	
	public T peek(){
		if(head == null){
			throw new NoSuchElementException("queue underflow");
		}
		return head.data;
	}
	
	public static void main(String[] args) 
    {
		QueueUsingList<Integer> s = new QueueUsingList<Integer>();
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

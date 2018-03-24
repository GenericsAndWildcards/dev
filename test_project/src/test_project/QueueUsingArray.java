package test_project;

import java.util.NoSuchElementException;

public class QueueUsingArray<T> {
	
	int size, begin, end, capacity;
	T[] array;
	
	public QueueUsingArray(int size){
		this.size = size;
		array = (T[]) new Object[size];
	}
	
	public void enqueue(T data){
		if(capacity == size){
			throw new ArrayIndexOutOfBoundsException();
		}
		array[end++] = data;
		end = end%size;
		capacity++;
	}
	
	public T dequeue(){
		if(0 == capacity){
			throw new NoSuchElementException("Queue underflow");
		}
		T output = array[begin++];
		begin = begin%size;
		capacity--;
		return output;
			
	}
	
	public T peek(){
		if(0 == capacity){
			throw new NoSuchElementException("Queue underflow");
		}
		return array[begin];
	}
	
	public static void main(String[] args) 
    {
		QueueUsingArray<Integer> s = new QueueUsingArray<Integer>(5);
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

package codepadProjects;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/*
 * Improvement on previous solution: Instead of using the timer to reset the request count value every second, 
 * we can maintain a queue of previous requests that happened within this second. If size of this queue  is less than 10,
 * we can allow the request, otherwise reject it.
 * 
 * Every call to function allowRequest() will 1st adjust the queue and remove all requests that happened more that a second ago.
 * Then it will simple check the size of the queue and return true if its less than 10
 * 
 */

public class RateLimiter {
	

	private int time;
	private int allowedRequests;
	private Queue<Long> prevRequests;
	
	public RateLimiter(int allowedRequests, int time){
		this.time = time;
		this.allowedRequests = allowedRequests;
		this.prevRequests = new LinkedList<Long>();
	}
	
	public synchronized boolean allowRequest(){
		Long timeInMillis = System.currentTimeMillis();
		Iterator<Long> i = prevRequests.iterator();
		while(i.hasNext()){
			if(timeInMillis - i.next() > this.time * 1000){
				i.remove();
			}
			else{
				break;
			}
		}
		if(prevRequests.size() < allowedRequests){
			prevRequests.add(timeInMillis);
			return true;
		}
		else{
			return false;
		}
	}
	
	public void callHTTP(){
		if(allowRequest()){
			System.out.println(Thread.currentThread().getName()+ ": requesting over HTTP");
		}else{
			System.out.println(Thread.currentThread().getName()+ ": Request limit reached");
		}
	}
	
	public class HttpRequester implements Runnable{

		RateLimiter r;
		public HttpRequester(RateLimiter r){
			this.r = r;
		}		
		@Override
		public void run() {
			Random rand = new Random();
		       for(int i = 0; i < 100; i++){
		           r.callHTTP();
		           try {
		        	int  n = rand.nextInt(200) + 10;// any delay between 10 to 210 ms
					Thread.sleep(n);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		       }			
		}
		
	}
	
	public static void main(String[] args){
		RateLimiter r = new RateLimiter(10, 1);
		RateLimiter.HttpRequester r1 = r.new HttpRequester(r);
		RateLimiter.HttpRequester r2 = r.new HttpRequester(r);
		
		new Thread(r1, "t1").start();
		new Thread(r2, "t2").start();
	       
	       
	   }

}

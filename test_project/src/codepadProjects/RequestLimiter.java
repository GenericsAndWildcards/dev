package codepadProjects;

/*
Imagine that you have an application that needs to make HTTP requests to
an external API. Suppose that we never want to call this API more than 10 times
per second. Implement a rate limiter to enforce this.

Ex: Suppose you have a function like
void makeHTTPRequest()

You don't have to implement this function, but write a wrapper around it to ensure
that it's not called more than 10x per second.
*/

import java.lang.System;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class RequestLimiter{
   
   private int callLimit;
   private int numRequests;
   
   public RequestLimiter(int callLimit, int durationInSeconds){
       
       this.callLimit = callLimit;
       Timer timer = new Timer();
       timer.schedule(new TimerTask(){
           @Override
           public void run() {
               synchronized(this){  
                   System.out.println("Timer reset");   
                   numRequests = 0; 
               }
           }
       }, durationInSeconds*1000, durationInSeconds*1000); // This will reset the timer every second
   }
   
   
   public synchronized boolean addRequestCount(){
       
       if(numRequests >= callLimit){          
           return false;
       }
       else{
           numRequests++;          
           return true;
       }
       
   }
   
   public void makeHTTPRequest(){
       if(addRequestCount()){
    	   System.out.println("request: " + numRequests); 
       }else{
    	   System.out.println("Limit reached, can't call service");
       }
   }
   
   public static void main(String[] args){
       RequestLimiter r = new RequestLimiter(10, 1);
       Random rand = new Random();
       for(int i = 0; i < 100; i++){
           r.makeHTTPRequest();
           try {
        	int  n = rand.nextInt(200) + 10;// any delay between 10 to 210 ms
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       }
       
   }
   
   
}
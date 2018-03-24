package test_project;

import java.util.HashMap;
import java.util.Map;

//https://www.programcreek.com/2013/03/leetcode-lru-cache-java/

public class LRUCache {
	
	DoubleLinkListNode head, end;
	Map<Integer, DoubleLinkListNode> cache = new HashMap<Integer, DoubleLinkListNode>();
	int capacity;
	
	public LRUCache(int capacity){
		this.capacity = capacity;
	}
	
	public int get(int key){
		if(cache.containsKey(key)){
			DoubleLinkListNode val = cache.get(key);
			remove(val);
			setHead(val);
			return val.value;
		}
		else{
			return -1;
		}
	}
	
	public void remove(DoubleLinkListNode n){
        if(n.pre!=null){
            n.pre.next = n.next;
        }else{
            head = n.next;
        } 
        if(n.next!=null){
            n.next.pre = n.pre;
        }else{
            end = n.pre;
        }
    }
	
	public void setHead(DoubleLinkListNode n){
        n.next = head;
        n.pre = null;
 
        if(head!=null)
            head.pre = n;
 
        head = n;
 
        if(end ==null)
            end = head;
    }
	
	public void set(int key, int val){
		if(cache.containsKey(key)){
			DoubleLinkListNode value = cache.get(key);
			value.value = val;
			remove(value);
			setHead(value);
		}else{
			DoubleLinkListNode newNode = new DoubleLinkListNode(key, val);
			if(cache.size() >= capacity){
				cache.remove(end.key);
				remove(end);
			}
			cache.put(key, newNode);
			setHead(newNode);
		}
	}

}

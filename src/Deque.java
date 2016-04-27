import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
	
   private Node first;
   private Node last;
   public int length;
   
   //doubly linked list to run in constant time 
   
public Deque(){// construct an empty deque       
	length=0;
	first =null;
	}                    

   
public boolean isEmpty(){ // is the deque empty?
	if(length==0){return true;
	}
	return false;
	}                
  
 public int size(){// return the number of items on the deque
	return length;
	}                        
  
 public void addFirst(Item item){// add the item to the front
	 Node newNode = new Node();
	 newNode.item = item;
	 
	 if(isEmpty()){
		 first = newNode;
		 last = newNode;
		 
	 }else{//first nodes previous value to new node,
		 first.previous=newNode;
		 
		 //then new nodes next value to first node 
		 newNode.next=first;
		 //then change first value to new node
		 first= newNode;
		 //update counters
		 
	 }
	 length++;
	 
 }          
 
 public void addLast(Item item){// add the item to the end        
	 Node newLastNode = new Node();
	 newLastNode.item = item;
	 
	 if(isEmpty()){
		 first = newLastNode;
		 last = newLastNode;
		 
	 }else{//last nodes next value to new node,
		 last.next=newLastNode;
		 
		 //then new nodes previous value to last node 
		 newLastNode.previous=last;
		 //then change last value to new node
		 last= newLastNode;
		 //update counters
		 
	 }
	 length++;
 }   
 
  public Item removeFirst(){  // remove and return the item from the front
	 Item temp=first.item;
	  if(isEmpty()){
		  throw new NoSuchElementException("Nothing in the Deque");
	  }else{
		  first=first.next;
		  first.previous=null;
		  length--;
	  }
	  
	return temp;}                
 
  public Item removeLast(){  // remove and return the item from the end
	  Item temp=last.item;
	  if(isEmpty()){
		  throw new NoSuchElementException("Nothing in the Deque");
	  }else{
		  last=last.previous;
		  last.next=null;
		  length--;
	  }
	  
	return temp;}                 
  
 public Iterator<Item> iterator(){ return new ListIterator();// return an iterator over items in order from front to end         
  
 }

 private class ListIterator implements Iterator<Item>{
	private Node current = first;
	 
	 public boolean hasNext()  { 
		 return current != null;
		 }
	 public void remove() { 
		 throw new UnsupportedOperationException();
		 }
	 
	 public Item next() {
         if (!hasNext()){
        	throw new NoSuchElementException();
        	}
         Item item = current.item;
         current = current.next; 
         return item;
     }
 }
 
 private class Node { //a node that contains an item and pointers to the next and previous element in the list
	private Item item;
	private Node next;
	private Node previous;
	 
 }
 
 public static void main(String[] args){
	 Deque<String> deck = new Deque<String>();
	 deck.addFirst("pippop1");
	   
	 deck.addFirst("pippop2");
	  deck.addFirst("pippop3");
	   deck.addFirst("pippop4");
	   System.out.println(deck.size());
	 System.out.println(deck.removeFirst());
	 System.out.println(deck.removeFirst());
	 System.out.println(deck.size());
	 
 }   // unit testing (required)
}
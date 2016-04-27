import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdRandom;
public class RandomizedQueue<Item> implements Iterable<Item> {
  public int queueSize;
  private Item[] array;
  
@SuppressWarnings("unchecked")
public RandomizedQueue(){ // construct an empty randomized queue
	   array = (Item[]) new Object[2];
	   queueSize=0;
   }                
   
public boolean isEmpty(){// is the queue empty?
	
	return queueSize==0;
	   
   }                 
   
public int size(){// return the number of items on the queue
	return queueSize;
	   
   }                        
   
public void enqueue(Item item){// add the item
	   if(item==null){
		   throw new java.lang.NullPointerException("Cannot add null item");
	   }
	if(queueSize==array.length){
		    sizeDouble(queueSize);
		   
	   }
	   array[queueSize]=item;
	   queueSize++;
   }           
   
public Item dequeue(){// remove and return a random item
	if(isEmpty()){
		 throw new NoSuchElementException("Nothing in the Queue");
	}
	 if(queueSize<=array.length/4&&queueSize>2){
		 sizeHalf(queueSize);
		   
	   }
	int rand = StdRandom.uniform(queueSize);
	Item holder = array[rand];
	array[rand]=array[queueSize-1];
	array[queueSize-1]=null;
	queueSize--;
	return holder;
	   
   }                    
   
public Item sample() {// return a random item (but do not remove it)
	int rand = StdRandom.uniform(0, queueSize);
	
	return array[rand];
	   
   }                    
   
public Iterator<Item> iterator(){// return an independent iterator over items in random order
	return new ArrayIterator();
   }       

private class ArrayIterator implements Iterator<Item> {
	private int i;
	@SuppressWarnings("unchecked")
	Item[] TAMPA = (Item[]) new Object[queueSize];
	public ArrayIterator(){
		i = 0;
		for(int r=0;r<queueSize;r++){
			int rand1 = StdRandom.uniform(0, queueSize);
			int rand2 = StdRandom.uniform(0, queueSize);
			Item temp = array[rand1];
			array[rand1]=array[rand2];
			array[rand2]=temp;
		}
		for(int g=0;g<queueSize;g++){
			TAMPA[g]=array[g];
		}
	}
	public boolean hasNext(){
		return i<=queueSize -1;
	}
	public void remove(){
		throw new UnsupportedOperationException();
	}
	public Item next(){
		if(!hasNext()){
			throw new NoSuchElementException();
		}
		return TAMPA[i++];
	}
}
   
@SuppressWarnings("unchecked")
private void sizeDouble(int currentSize){ // creates new array twice the size and copies items
	int nextSize = currentSize*2;
	Item[] temp = (Item[]) new Object[nextSize];
	for(int i=0; i<currentSize; i++){
		temp[i]=array[i];
	}
	array=temp;
}
 
@SuppressWarnings("unchecked")
private void sizeHalf(int currentSize){// creates new array half the size and copies items
	if(currentSize<=2){System.out.println("not good");}
	int nextSize = currentSize/2;
	Item[] temp = (Item[]) new Object[nextSize];
	for(int i=0; i<nextSize; i++){
		temp[i]=array[i];
	}
	array=temp;
}


public static void main(String[] args){// unit testing (required)
	RandomizedQueue<String> RQ= new RandomizedQueue<String>();
	RQ.enqueue("pop");
	System.out.println(RQ.size());
	RQ.enqueue("pop1");
	System.out.println(RQ.size());
	
	RQ.enqueue("pop2");
	System.out.println(RQ.size());
	//System.out.println("removed: "+RQ.dequeue());
	//RQ.dequeue();
	System.out.println(RQ.size());
	System.out.println(RQ.sample());
	System.out.println(RQ.sample());
	System.out.println(RQ.sample());
	System.out.println(RQ.sample());
	//RQ.enqueue(null);
	System.out.println();
	System.out.println();
	
	for(String s:RQ){
		System.out.println(s);
	}
   }   
}
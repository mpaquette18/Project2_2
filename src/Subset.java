public class Subset {
   public static void main(String[] args){
	   int k = Integer.parseInt(args[0]) ;
	  
	   RandomizedQueue<String> RQ= new RandomizedQueue<String>();
	   while(!StdIn.isEmpty()) {
	
		String string = StdIn.readString();
        RQ.enqueue(string);
		   
  }
	  
	   for(int j=0; j<k;j++){   
		  System.out.println(RQ.dequeue());
		   
	   }
	   
   }
}
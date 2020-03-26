package problem03;

public class AscendingQueue {
	    private int[] data;
	    private int front,rear;
	    private int size;
	    public AscendingQueue(int size) {
	    	   this.size=size;
		        data =new int[this.size];
		        front=0;
		        rear=-1;
	    }
	    public boolean enqueue(int element) {
	    	 boolean response=false;
		        if(!isFull()){
		            data[rear+1]=element;
		            rear++;
		            response=true;
		           // sorting(); 
		        }
		        else {
		        	System.out.println("overflow at:"+element);
		        }
		        return response;
		}
	    boolean isFull(){
	    	   boolean response=false;
		        if(rear==size-1){
		            response=true;
		        }
		        return response;
	    }

}

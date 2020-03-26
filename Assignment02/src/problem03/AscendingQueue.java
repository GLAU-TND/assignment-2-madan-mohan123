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
	    
	    public void sorting() {
			int c;
			for(int i=0 ; i< rear;i++){                                                      //sorting ascending
				for(int j=0; j<=rear-i-1;j++) {
					if(data[j+1]<data[j]) {                         
				c=data[j+1];
				data[j+1]=data[j];
				data[j]=c;
				}
			}
			}
			
		}

}

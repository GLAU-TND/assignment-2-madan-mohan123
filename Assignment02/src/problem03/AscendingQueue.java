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
}

package problem04;
public class PreOrderSuccessorQueue {
	 Node rear;                                                    //  rear
	    Node front;                                                         //front
	    
	    class Node{                                                        //node of queue
	    	private int data;
	    	private Node next;
	    	Node(int data){
	    		this.data=data;
	    	}
	    }

	public boolean push(int element) {                                              //store tree preorder successor
			Node n=new Node(element);
	    	 boolean response=false;
	    			if(rear==null) {
	    			rear=n;
	    			front=n;
	    			}
	    			else {
	    		rear.next=n;
	    		rear=n;
	    		
	    			}
	    		
	    			return response;
	    		}
}

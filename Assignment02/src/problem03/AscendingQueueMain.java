package problem03;

public class AscendingQueueMain {

	public static void main(String[] args) {
		
		AscendingQueue ar=new AscendingQueue(5);
        ar.enqueue(56);
       ar.enqueue(79);
       ar.enqueue(33);
        ar.enqueue(90);
        ar.enqueue(30);
    
      ar.print();
      ar.dequeue();
      ar.print();
	}

}

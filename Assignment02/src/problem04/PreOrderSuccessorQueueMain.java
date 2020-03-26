package problem04;
public class PreOrderSuccessorQueueMain {

	public static void main(String[] args) {
		BinarySearchTree ob=new BinarySearchTree();
		ob.insert(40);
		ob.insert(50);
		ob.insert(30);
		ob.insert(20);
		ob.insert(100);
		ob.insert(90);
		ob.insert(12);
		ob.insert(35);
		ob.traversePreOrder(ob.getRoot());
		ob.printQueue();
	}

}

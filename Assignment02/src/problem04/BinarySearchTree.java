package problem04;

public class BinarySearchTree {
	PreOrderSuccessorQueue p=new PreOrderSuccessorQueue();
	TreeNode root;
	public TreeNode getRoot() {
		return root;
	}
	public void insert(int data) {                                                  //create funtion to insert element
		TreeNode node=new TreeNode(data);
		if(root==null) {
			root=node;
		}
		else {
			TreeNode temp=root;
			TreeNode parent=null;
			while(temp!=null) {
				parent=temp;
				if(data<=temp.getData()) {
					temp=temp.getLeft();
				}
					else {
						temp=temp.getRight();
					}
				}
			if(node.getData()<=parent.getData()) {
				parent.setLeft(node);
			}
				else {
					parent.setRight(node);
				}
			}
			
			}
}

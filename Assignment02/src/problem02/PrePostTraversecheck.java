package problem02;

import tree.TreeNode;

public class PrePostTraversecheck {
	TreeNode root;
	public TreeNode getRoot() {
		return root;
	}
	public void insert(int data) {
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

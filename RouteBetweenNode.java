
class RbetweenNode{
	static TreeNode root = null;
	public static int count = 0;
	class TreeNode{
		private int data;
		private TreeNode left, right;
		public TreeNode(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}


	}
	public void addTreeNode(int data){
		count += 1;
		TreeNode newTreeNode = new TreeNode(data);
		if(root == null){
			root = newTreeNode;
		}
		
	}

	public void printInorder(TreeNode node){
		if(node == null){
			return;
		}

		printInorder(node.left);
		System.out.println(node.data+" ");
		printInorder(node.right);
	}

}
class RouteBetweenNode{
	public static void main(String[] args) {
		RbetweenNode rbn = new RbetweenNode();
		rbn.addTreeNode(1);
		rbn.addTreeNode(2);
		rbn.printInorder(rbn.root);
		System.out.println(rbn.count);

		
	}
}
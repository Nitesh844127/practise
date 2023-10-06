package MathOp;

public class SymmetricTree {
	int key;
	SymmetricTree left,right;
	SymmetricTree(int item){
		key=item;
		left=right=null;
	}
}
class BinaryTree {
	SymmetricTree root;

	boolean isMirror(SymmetricTree node1, SymmetricTree node2) {
		if (node1 == null && node2 == null)
			return true;
		if (node1 != null && node2 != null && node1.key == node2.key)
			return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
		return false;
	}

	boolean isSymmetric() {
		return isMirror(root, root);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new SymmetricTree(1);
		tree.root.left = new SymmetricTree(2);
		tree.root.right = new SymmetricTree(2);
		tree.root.left.left = new SymmetricTree(3);
		tree.root.left.right = new SymmetricTree(4);
		tree.root.right.left = new SymmetricTree(4);
		tree.root.right.right = new SymmetricTree(3);
		boolean output = tree.isSymmetric();
		if (output == true)
			System.out.println(" Symmetric ");
		else
			System.out.println(" Not Symmetric ");
	}
}

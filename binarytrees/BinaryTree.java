package binarytrees;

public class BinaryTree<T> {
	public static class BinaryTreeNode<T> {
		private T data;
		private BinaryTreeNode<T> left;
		private BinaryTreeNode<T> right;
		
		BinaryTreeNode() {}
		
		BinaryTreeNode(T data) {
			this.data = data;
		}
		
		BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
			this.data = data;
			this.left = left; 
			this.right = right;
		}
		
		void setLeft(BinaryTreeNode<T> left) {
			this.left = left;
		}
		
		void setRight(BinaryTreeNode<T> right) {
			this.right = right;
		}
		
		BinaryTreeNode<T> getLeft() {
			return this.left;
		}
		
		BinaryTreeNode<T> getRight() {
			return this.right;
		}
		
		void setData(T data) {
			this.data = data;
		}
		
		T getData() {
			return this.data;
		}
	}
	
	BinaryTreeNode<T> root;
	
	BinaryTree() {}
	
	BinaryTree(BinaryTreeNode<T> aNode) {
		root = aNode;
	}
	
	int height(BinaryTreeNode<T> aNode) {
		if (aNode == null) {
			return 0;
		}
		
		int leftHeight = height(aNode.left);
		int rightHeight = height(aNode.right);
		
		if (leftHeight > rightHeight) {
			return leftHeight + 1;
		} else {
			return rightHeight + 1;
		}
	}
	
	void printGivenLevel(BinaryTreeNode<T> aNode, int aLevel) {
		if (aNode == null) {
			return;
		}
		
		if (aLevel == 1) {
			System.out.print(aNode.data + " ");
		} else if (aLevel > 1) {
			printGivenLevel(aNode.left, aLevel -1);
			printGivenLevel(aNode.right, aLevel - 1);
		}
	}
	
	void printLevelOrder(BinaryTreeNode<T> aNode) {
		int height = height(aNode);
		for (int i = 0; i < height; i++) {
			printGivenLevel(aNode, i);
			System.out.println();
		}
	}
}

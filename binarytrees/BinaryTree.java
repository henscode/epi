package binarytrees;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree<T> {	
	public static class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		BinaryTreeNode() {}
		
		BinaryTreeNode(T data) {
			this.data = data;
		}
		
		BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T>right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		void setData(T data) {
			this.data = data;
		}
		
		T getData() {
			return this.data;
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
	}
	
	private BinaryTreeNode<T> root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public BinaryTree(BinaryTreeNode<T> aNode) {
		this.root = aNode;
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public BinaryTreeNode<T> insert(T aData) {
		return insertHelper(this.root, aData);
	}
	
	/*
	 *     Insert data recursively
	 */
	public BinaryTreeNode<T> insertHelper(BinaryTreeNode<T> aNode, T aData) {
		if (aNode == null) {
			aNode = new BinaryTreeNode<T>(aData);
			return aNode;
		}
		
		if (aNode.getLeft() == null) {
			aNode = insertHelper(aNode.left, aData);
		} else {
			aNode = insertHelper(aNode.right, aData);
		}
		
		return aNode;
	}
	
	/*
	 *     Compute the height of this node
	 */
	public int height(BinaryTreeNode<T> aNode) {
		if (aNode == null) {
			return 0;
		}
		
		// Compute the height of each sub tree
		int leftHeight = height(aNode.left);
		int rightHeight = height(aNode.right);
		
		if (leftHeight > rightHeight) {
			return leftHeight + 1;
		} else {
			return rightHeight + 1;
		}
	}
	
	public void printLevelOrderRecursion() {
		int treeHeight = height(this.root);
		for (int i = 1; i <= treeHeight; i++) {
			 printGivenLevel(this.root, i);
			 System.out.println();
		}		
	}
	
	public void printGivenLevel(BinaryTreeNode<T> aNode, int level) {
		if (aNode == null) {
			return;
		}
		
		if (level == 1) {
		    System.out.print(aNode.data + " ");	
		} else if (level > 1) {
			printGivenLevel(aNode.left, level - 1);
			printGivenLevel(aNode.right, level - 1);
		}
	}
	
	public void printLevelOrderIterative(BinaryTreeNode<T> aNode) {
		Queue<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
		queue.add(aNode);
		
		while (!queue.isEmpty()) {			
			BinaryTreeNode<T> temp = queue.poll();			
			System.out.print(temp.data + " ");		
			
			if (temp.left != null) {
				queue.add(temp.left);
			}
			
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
	}
	
	public void printLevelOrderIterativeLineByLine(BinaryTreeNode<T> aNode) {
		Queue<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
		queue.add(aNode);
		int count = 1;
		
		while (!queue.isEmpty()) {
			BinaryTreeNode<T> temp = queue.poll();			
			System.out.print(temp.data + " ");		
			count--;
			
			if (temp.left != null) {
				queue.add(temp.left);
			}
			
			if (temp.right != null) {
				queue.add(temp.right);
			}
			
			if (count == 0) {
				System.out.println();
				count = queue.size();
			}
		}
			
	}
	
	/*
	 *     1. Traverse the left subtree
	 *     2. Visit the root
	 *     3. Traverse the right subtree
	 */
	public void inorderTraversalPrint(BinaryTreeNode<T> aNode) {
		if (aNode == null) {
			return;
		}
		
		inorderTraversalPrint(aNode.left);
		System.out.print(aNode.data + " ");
		inorderTraversalPrint(aNode.right);
	}
	
	public void inorderTraversalPrintIterative(BinaryTreeNode<T> aNode) {
		if (aNode == null) {
			return;
		}
		
		Stack<BinaryTreeNode<T>> stack = new Stack<BinaryTreeNode<T>>();
		BinaryTreeNode<T> temp = null;
		while (aNode != null) {
			stack.push(aNode);
			aNode = aNode.left;
		}
		
		
		while (stack.size() > 0) {
			BinaryTreeNode<T> tempNode = stack.pop();
			System.out.print(tempNode.data + " ");
			if (tempNode.right != null) {
				tempNode = tempNode.right;
				
				// next node to be visited is leftmost
				while(tempNode != null) {
					stack.push(tempNode);
					tempNode = tempNode.left;
				}
			}
		}
		
		
	}
	
	
	/*
	 *     1. Visit the root
	 *     2. Traverse the left subtree
	 *     3. Traverse the right subtree
	 */
	public void preorderTraversalPrint(BinaryTreeNode<T> aNode) {
		if (aNode == null) {
			return;
		}
		
		System.out.print(aNode.data + " ");
		preorderTraversalPrint(aNode.left);
		preorderTraversalPrint(aNode.right);
	}
	
	/*
	 *     1. Traverse the left subtree
	 *     2. Traverse the right subtree
	 *     3. Visit the root
	 */
	public void postorderTraversalPrint(BinaryTreeNode<T> aNode) {
		if (aNode == null) {
			return;
		}
		
		postorderTraversalPrint(aNode.left);
		postorderTraversalPrint(aNode.right);
		System.out.print(aNode.data + " ");
	}
}

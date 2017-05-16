package binarytrees;

import binarytrees.BinaryTree.BinaryTreeNode;

public class BinaryTreeLauncher {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BinaryTreeNode<Integer> one = new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> two = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> three = new BinaryTreeNode<Integer>(3);
		BinaryTreeNode<Integer> four = new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> five = new BinaryTreeNode<Integer>(5);
		BinaryTreeNode<Integer> six = new BinaryTreeNode<Integer>(6);
		BinaryTreeNode<Integer> seven= new BinaryTreeNode<Integer>(7);
		BinaryTreeNode<Integer> eight = new BinaryTreeNode<Integer>(8);
		BinaryTreeNode<Integer> nine = new BinaryTreeNode<Integer>(9);
		BinaryTreeNode<Integer> ten = new BinaryTreeNode<Integer>(10);
		BinaryTreeNode<Integer> eleven = new BinaryTreeNode<Integer>(11);
		BinaryTreeNode<Integer> twelve = new BinaryTreeNode<Integer>(12);
		BinaryTreeNode<Integer> thirteen = new BinaryTreeNode<Integer>(13);
		BinaryTreeNode<Integer> fourteen = new BinaryTreeNode<Integer>(14);
		
		one.setLeft(two);
		one.setRight(three);
		two.setLeft(four);
		two.setRight(five);
		three.setLeft(six);
		three.setRight(seven);
		four.setLeft(eight);
		four.setRight(nine);
		five.setLeft(ten);
		five.setRight(eleven);
		six.setLeft(twelve);
		six.setRight(thirteen);
		seven.setLeft(fourteen);
		
		BinaryTree<Integer> bt = new BinaryTree<Integer>(one);
		
		System.out.println("Height: " + bt.height(one));
		System.out.println("Level Order: ");
		bt.printLevelOrder(one);
	}
}

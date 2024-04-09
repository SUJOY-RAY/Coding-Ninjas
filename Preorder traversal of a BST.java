import java.util.* ;
import java.io.*; 
/*
    Following is the class structure of the BinaryTreeNode class for referance:

	class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*/

import java.util.ArrayList;


public class Solution {
	private static BinaryTreeNode<Integer>constructBST(ArrayList<Integer>preorder,int []index,int minVal,int maxVal){
		if (index[0]>=preorder.size()||preorder.get(index[0])<minVal||preorder.get(index[0])>maxVal) {
			return null;
		}
		
		BinaryTreeNode<Integer>root=new BinaryTreeNode<>(preorder.get(index[0]++));
		root.left=constructBST(preorder, index, minVal, root.data-1);
		root.right=constructBST(preorder, index, root.data+1, maxVal);
		return root;
	}
	public static BinaryTreeNode<Integer> prorderToBST(ArrayList<Integer> preorder) {
		int[]index=new int[]{0};
		return constructBST(preorder, index, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
}

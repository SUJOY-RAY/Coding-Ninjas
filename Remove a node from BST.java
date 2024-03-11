import java.util.* ;
import java.io.*; 
/*****************************************
Following is the BinaryTreeNode structure

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}

******************************************/

public class Solution {

    public static BinaryTreeNode<Integer> removeNode(BinaryTreeNode<Integer> root, int data) {
        if (root==null) {
            return null;
        }

        if (data<root.data) {
            root.left=removeNode(root.left, data);
        }
        
        
        else if(data>root.data){
            root.right=removeNode(root.right, data);
        }

        else{
            if (root.left==null) {
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            root.data=minValue(root.right);
            root.right=removeNode(root.right, root.data);
        }
    return root;
    }

    private static int minValue(BinaryTreeNode<Integer> root){
        int minValue=root.data;
        while(root.left!=null){
            minValue=root.left.data;
            root=root.left;
        }
        return minValue;
    }
    
}

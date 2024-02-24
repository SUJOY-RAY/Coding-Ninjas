import java.util.* ;


import java.io.*; 

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next,prev;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node insert(int k, int val, Node head) {
        Node newNode=new Node(val);
        if (head==null) {
            head=newNode;
        }else if (k==0) {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        else{
            Node current=head;
            for (int i = 0; i < k-1; i++) {
                current=current.next;
            }
            newNode.next=current.next;
            newNode.prev=current;
            if (current.next!=null) {
                current.next=newNode;
            } 
            current.next=newNode;
        }
        return head;
    }
}








import java.util.* ;
import java.io.*; 
/****************************************************************
    Following is the Linked List node structure

    class Node {
    public:
        int data;
        Node *next;
        Node(int data) {
            this->data = data;
            this->next = NULL;
        }
    };

*****************************************************************/

public class Solution {
    public static Node removeNodes(Node head, int k) {
        while (head!=null &&head.data==k) {
            head=head.next;
        }
        
            if (head==null) {
                return null;
            }
            Node current=head;
            while (current.next!=null) {
                if (current.next.data==k) {
                    current.next=current.next.next;
                }else{
                    current=current.next;
                }
            }
        
        return head;
    }
}

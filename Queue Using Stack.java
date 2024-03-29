import java.util.Stack;

public class Solution{
    static class Queue {
        private Stack<Integer>stack1;
        private Stack<Integer>stack2;
        Queue() {
            stack1=new Stack<>();
            stack2=new Stack<>();
        }

        void enQueue(int val) {
            stack1.push(val);
        }

        int deQueue() {
            if (isEmpty()) {
                return -1;
            }
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        int peek() {
            
            if (isEmpty()) {
                return -1;
            }
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }

        boolean isEmpty() {
            
            return stack1.isEmpty()&&stack2.isEmpty();
        }
    }
}

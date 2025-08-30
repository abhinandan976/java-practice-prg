    public class LinkedlistStack {
        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node top;

        public void push(int x) {
            Node newNode = new Node(x);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int data = top.data;
            top = top.next;
            return data;
        }

        public int peek() {
            if (top == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return top.data;
        }

        public static void main(String[] args) {
            LinkedlistStack stack = new LinkedlistStack();
            stack.push(90);
            stack.push(50);
            stack.pop();
            System.out.println("Top element is: " + stack.peek());
            
        }
    }
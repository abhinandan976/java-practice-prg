public class ArrayStack {
    private final int cap;
    private final int[] arr;
    private int top;

    public ArrayStack(int size) {
        this.cap = size;
        this.arr = new int[cap];
        this.top = -1;
    }

    public void push(int val) {
        if(top == cap - 1) {
            System.out.println("Stack Overvflow");
        }
        arr[++top] = val;
    }

    public int pop() {
        if(top == -1){
            System.out.println("Stack Underflow");
        }
         return arr[top--];
    }

    public int peek() {
        if(top == -1) {
            System.out.println("Stack is empty");
        }
        return arr[top];
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(60);
        int result = stack.pop();
        System.out.println("Popped element is: " + result);
        int result1 = stack.peek();
        System.out.println("Top element is: " + result1);
    }
}

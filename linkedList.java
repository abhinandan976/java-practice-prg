public class linkedList{
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
         if(head == null) {
            head = newNode;
         }
         else {
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
         }
    }

    public boolean search(int key) {
        Node current = head;
        while(current != null) {
            if(current.data == key) {
                System.out.println("Element found" + key);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insert(200);
        list.insert(10);
        list.insert(40);
        list.insert(70);
        list.search(40);
        list.display();
    }
}


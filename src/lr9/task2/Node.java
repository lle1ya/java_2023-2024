package lr9.task2;

public class Node {
    int value;
    Node next;

    public Node head;
    public Node tail;

    void addFront(int value) {
        Node a = new Node();
        a.value = value;
        if (head == null) {
            head = a;
            tail = a;
        }else {
            a.next = head;
            head = a;
        }
    }

    void addBack(int value) {
        Node a = new Node();
        a.value = value;
        if (tail == null) {
            tail = a;
            head = a;
        }else {
            a.next = tail;
            tail = a;
        }
    }

    void printList(){
        Node t = this.head;
        while (t != null){
            System.out.println(t.value + " ");
            t = t.next;
        }
    }
}

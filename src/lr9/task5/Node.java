package lr9.task5;

import java.util.Scanner;

public class Node {
    int data;
    Node next;
    Node before;
    public static Node head = null;
    public static Node tail = null;

    public Node(int data, Node next, Node before) {
        this.data = data;
        this.next = next;
        this.before = before;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node reader() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int value = scanner.nextInt();
            Node newNode = new Node(value, null, null);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.before = tail;
                tail = newNode;
            }
        }

        return head;
    }

    public static void createHead() {
        reader();
        Node current = head;
        while (current != null) {
            current = current.next;
        }
    }

    public static void createTail() {
        reader();
        Node current = tail;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            current = current.before;
        }
    }

    public static void addFirst(int number) {
        head = new Node(number, head, null);
    }
    public static void addLast(int number) {
        tail.next = new Node(number,null, tail);
        tail = tail.next;
    }
    public static void insert(int value, int index) {
        Node newNode = new Node(value,null,null);
        Node ref = head;
        int k = 1;
        while(ref.next != null && (k<index)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
        ref = ref.next.next;
        ref.before = newNode;
    }
    public static void removeLast() {
        tail.before.next = null;
        tail = tail.before;
    }
    public static void removeFirst() {
        head = head.next;
    }
    public static void remove(int index){
        int k = 1;
        Node ref = head;
        while(k < index && ref.next != null) {
            k++;
            ref = ref.next;
        }
        ref.next = ref.next.next;
        ref = ref.next.next;
        ref.before = ref.before.before;

    }

    public void createHeadRec(int data) {
        head = createHeadRecHelper(head, data);
    }

    private Node createHeadRecHelper(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        current.next = createHeadRecHelper(current.next, data);
        return current;
    }
    public void createTailRec(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            createTailRecHelper(head, data);
        }
    }

    private void createTailRecHelper(Node current, int data) {
        if (current.next == null) {
            current.next = new Node(data);
        } else {
            createTailRecHelper(current.next, data);
        }
    }
    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node current) {
        if (current == null) {
            return "";
        }
        return current.data + " -> " + toStringRecHelper(current.next);
    }

    public static void printList() {
        Node t = head;
        while (t != null) {
            System.out.println(t.data + " ");
            t = t.next;
        }
    }
}

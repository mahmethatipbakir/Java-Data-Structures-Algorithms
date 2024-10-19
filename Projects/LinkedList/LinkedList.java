package DS.LinkedList;

public class LinkedList {

    Node head;
    Node element;

    public LinkedList() {
        head = new Node(0, null);
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public Node zeroth() {
        return head;
    }

    public Node first() {
        return head.next;
    }

    public void insertAfter(int data, Node element) {
        if (isEmpty()) {
            Node newNode = new Node(data, head.next);
            head.next = newNode;
        } else {
            Node newNode = new Node(data, element.next);
            element.next = newNode;
        }
    }

    public Node find(int data) {
        Node finder = first();

        while (finder.next != null) {
            if (finder.next.data == data) {
                return finder;
            } else {
                finder = finder.next;
            }
        }
        return null;
    }

    public Node findPreviousNode(int data) {

        Node finder = zeroth();

        while (finder.next != null) {
            if (finder.next.data == data) {
                return finder;
            } else {
                finder = finder.next;
            }
        }

        return null;

    }

    public void remove(int data) {
        Node delete = find(data);
        Node before = findPreviousNode(data);

        if (before != null) {
            before.next = delete.next;
        }
    }

    public void printAll() {
        Node writter = zeroth();

        while (writter != null) {
            System.out.println(writter.data + ",");
            writter = writter.next;
        }
    }

}
package DS.Queue;

public class Queue {
    Node front, rear; // Queue'daki ilk ve son eleman
    int size; // Queue'nun boyutu
    int count; // Queue'ya ekleme yapınca artar, çıkarma yapıldığında azalır

    public Queue(int size) {
        this.size = size;
        count = 0;
        front = null;
        rear = null;
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("The Queue is full");
        } else {
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = newNode;
                rear = newNode;
                System.out.println(data + " was added first.");
            } else {
                rear.next = newNode;
                rear = rear.next;
                System.out.println(data + " was added.");
            }
            count += 1;
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty.");
        } else {
            System.out.println(front.data + " was deleted.");
            front = front.next;
            count--;
        }
    }

    public void Print() {
        if (isEmpty()) {
            System.out.println("the Queue is empty.");
        } else {
            Node temp = front;
            System.out.println("The Queue is:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }
}

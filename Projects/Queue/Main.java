package DS.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.Print();
        queue.deQueue();
        queue.Print();
    }
}

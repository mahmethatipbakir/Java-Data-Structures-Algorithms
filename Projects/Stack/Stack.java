package DS.Stack;

public class Stack {
    int size; // Stack boyutu
    int count; // Stack'e ekleme yapınca artar, çıkarma yapıldığında azalır
    Node top; // Stack'teki en üstteki düğüm

    public Stack(int size) {
        this.size = size;
        count = 0;
        top = null;
    }

    public void Push(int data) { // Stack'e eleman ekleme
        Node newNode = new Node(data);
        if (isFull()) {
            System.out.println("The Stack is full.");
        } else {
            if (isEmpty()) {
                top = newNode;
                System.out.println(top.data + " was pushed first.");
            } else {
                newNode.next = top;
                top = newNode;
                System.out.println(top.data + " was pushed.");
            }
            count += 1;
        }
    }

    public void Pop() { // Stack'ten eleman çıkarma
        if (isEmpty()) {
            System.out.println("The Stack is empty.");
        } else {
            System.out.println(top.data + " is popped");
            top = top.next;
            count -= 1;
        }
    }

    public void Print() { // Stack'i yazdırma
        if (isEmpty()) {
            System.out.println("Nothing to print.");
        } else {
            Node temp = top;
            System.out.println("The Stack is:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void topNode() { // Stack'teki top node'u yazdırma
        if (isEmpty()) {
            System.out.println("The Stack is empty.");
        } else {
            System.out.println("The toppest node is " + top.data);
        }
    }

    public boolean isFull() { // Stack dolu mu?
        return count == size;
    }

    public boolean isEmpty() { // Stack boş mu?
        return count == 0;
    }

}

package DS.Stack;

public class Main {
    public static void main(String[] args) {
        Stack list = new Stack(10);
        list.Push(10);
        list.Push(20);
        list.Push(25);
        list.Pop();
        list.Print();
    }
}

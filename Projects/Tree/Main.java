package DS.Tree;

public class Main {
    public static void main(String[] args) {
        Tree newTree = new Tree();
        newTree.root = newTree.insert(newTree.root, 10);
        newTree.root = newTree.insert(newTree.root, 5);
        newTree.root = newTree.insert(newTree.root, 15);
        newTree.root = newTree.insert(newTree.root, 20);
        newTree.root = newTree.insert(newTree.root, 4);
        newTree.root = newTree.insert(newTree.root, 8);
        newTree.root = newTree.insert(newTree.root, 12);

        System.out.println("The Tree's root is " + newTree.root.data);
        System.out.println("The Tree's root's right " + newTree.root.right.data);
        System.out.println("The Tree's root's left " + newTree.root.left.data);
        System.out.println("The Tree's root's left's left " + newTree.root.left.left.data);
        System.out.println("The Tree's root's right's right " + newTree.root.right.right.data);

        System.out.print("Preorder: ");
        newTree.PreOrder(newTree.root);
        System.out.println();
        System.out.print("Inorder: ");
        newTree.InOrder(newTree.root);
        System.out.println();
        System.out.print("Postorder: ");
        newTree.PostOrder(newTree.root);
        System.out.println();

        System.out.println("Tree's height: " + newTree.Height(newTree.root));
        System.out.println("Tree's size: " + newTree.Size(newTree.root));

        newTree.root = newTree.Delete(newTree.root, 4);
        newTree.root = newTree.Delete(newTree.root, 20);
        newTree.root = newTree.Delete(newTree.root, 10);
        System.out.print("After deleting: ");
        newTree.InOrder(newTree.root);
        System.out.println("New root is: " + newTree.root.data);

    }
}

package DS.Tree;

public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    public Node newNode(int data) { // Tree'ye düğüm ekleme
        root = new Node(data);
        System.out.println(data + " was added.");
        return root;
    }

    public Node insert(Node root, int data) { // Tree'ye eklenen düğümün yerini bulma
        if (root != null) {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        } else {
            root = newNode(data);
        }
        return root;
    }

    public void PreOrder(Node root) { // Tree'deki elemanları preorder şekilde yazdırma
        if (root != null) {
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    public void InOrder(Node root) { // Tree'deki elemanları inorder şekilde yazdırma
        if (root != null) {
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
    }

    public void PostOrder(Node root) { // Tree'deki elemanları postorder şekilde yazdırma
        if (root != null) {
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public int Height(Node root) { // Tree'nin yüksekliğini bulma
        if (root == null) {
            return 1;
        } else {
            int left = 0;
            int right = 0;
            left = Height(root.left);
            right = Height(root.right);
            if (left > right)
                return left + 1;
            else
                return right + 1;
        }
    }

    public int Size(Node root) { // Tree'nin boyutunu bulma
        if (root == null) {
            return 0;
        } else {
            return Size(root.left) + Size(root.right) + 1;
        }
    }

    public Node Delete(Node root, int data) { // Tree'de eleman silme
        Node temp1, temp2;
        if (root == null)
            return null;
        if (root.data == data) {
            if (root.left == root.right) { // Silinecek node'un altında başka node yoktur
                root = null;
                return null;
            } else if (root.left == null) { // Root'un solu boşsa sağı doludur
                temp1 = root.right;
                return temp1;
            } else if (root.right == null) { // Root'un sağı boşsa solu doludur
                temp2 = root.left;
                return temp2;
            } else { // Root'un altında 2 tane düğüm vardır
                temp1 = temp2 = root.right;
                while (temp1.left != null) {
                    temp1 = temp1.left;
                }
                temp1.left = root.left;
                return temp2;
            }
        } else {
            if (data < root.data) {
                root.left = Delete(root.left, data);
            } else {
                root.right = Delete(root.right, data);
            }
        }
        return root;
    }

}
package tree;

public class main {
    public static void main(String[] args) {
        ImplementTree tree = new ImplementTree();
        tree.head = tree.insert(tree.head, 25);
        tree.head = tree.insert(tree.head, 11);
        tree.head = tree.insert(tree.head, 15);
        tree.head = tree.insert(tree.head, 16);
        tree.head = tree.insert(tree.head, 23);
        tree.head = tree.insert(tree.head, 79);
        System.out.print("In-order traversal of the binary search tree:");
        tree.printInOrder(tree.head);
        System.out.println();
        System.out.print("post-order traversal of the binary search tree:");
        tree.printPostOrder(tree.head);
        System.out.println();
        System.out.print("pre-order traversal of the binary search tree:");
        tree.printPreOrder(tree.head);
        System.out.println();
    }
}

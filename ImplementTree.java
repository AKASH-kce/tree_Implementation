package tree;

public class ImplementTree {
    node head;

    public node insert(node root, int data) {
        if (root == null) {
            return new node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }
    public void printInOrder(node node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
     
        System.out.print(node.data + " ");
    
        printInOrder(node.right);
    }
    
    public void printPostOrder(node node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
        printInOrder(node.right);
        System.out.print(node.data + " ");
    
      
    }
    
    public void printPreOrder(node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
      
        printInOrder(node.left);
        
        printInOrder(node.right);
      
    }
}

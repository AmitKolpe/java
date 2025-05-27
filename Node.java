// Node class
class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int item) {
        value = item;
        left = right = null;
    }
}

// Binary Tree class
public class BinaryTree {
    TreeNode root;

    // Constructor
    public BinaryTree() {
        root = null;
    }

    // In-order traversal
    void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

    // Pre-order traversal
    void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Post-order traversal
    void postorder(TreeNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value + " ");
        }
    }

    // Insert a node into the binary tree (simple recursive insert for BST)
    TreeNode insert(TreeNode node, int value) {
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }

        if (value < node.value)
            node.left = insert(node.left, value);
        else if (value > node.value)
            node.right = insert(node.right, value);

        return node;
    }

    // Main method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        /* Create following BST
                  50
               /     \
             30       70
            /  \     /  \
          20   40   60   80 
        */
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.print("In-order traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Pre-order traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Post-order traversal: ");
        tree.postorder(tree.root);
        System.out.println();
    }
}

public class InorderBinaryTreeTraversal
{
    int key;
    InorderBinaryTreeTraversal left, right;

    public InorderBinaryTreeTraversal(int item)
    {
        // Constructor to create a new Node with the given item
        key = item;
        left = right = null;
    }
}

class BinaryTree
{
    InorderBinaryTreeTraversal root;

    BinaryTree()
    {
        // Constructor to create an empty binary tree
        root = null;
    }

    void print_Inorder(InorderBinaryTreeTraversal node)
    {
        if (node == null)
            return;

        // Recursively print the left subtree in inorder
        print_Inorder(node.left);

        // Print the key of the current node
        System.out.print(node.key + " ");

        // Recursively print the right subtree in inorder
        print_Inorder(node.right);
    }

    void print_Inorder()
    {     
        // Wrapper method to start printing the tree in inorder
        print_Inorder(root);     
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        // Create a binary tree with nodes and keys
        tree.root = new InorderBinaryTreeTraversal(55);
        tree.root.left = new InorderBinaryTreeTraversal(21);
        tree.root.right = new InorderBinaryTreeTraversal(80);
        tree.root.left.left = new InorderBinaryTreeTraversal(9);
        tree.root.left.right = new InorderBinaryTreeTraversal(29);
        tree.root.right.left = new InorderBinaryTreeTraversal(76);
        tree.root.right.right = new InorderBinaryTreeTraversal(91);

        // Display a message and initiate the inorder traversal
        System.out.println("\nInorder traversal of binary tree is: ");
        tree.print_Inorder(); 
    }
}

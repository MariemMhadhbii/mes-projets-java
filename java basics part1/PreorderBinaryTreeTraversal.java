public class PreorderBinaryTreeTraversal
{
    int key;
    PreorderBinaryTreeTraversal left, right;

    public PreorderBinaryTreeTraversal(int item)
    {
        // Constructor to create a new Node with the given item
        key = item;
        left = right = null;
    }
}

class BinaryTree
{
    PreorderBinaryTreeTraversal root;

    BinaryTree()
    {
        // Constructor to create an empty binary tree
        root = null;
    }

    void print_Preorder(PreorderBinaryTreeTraversal node)
    {
        if (node == null)
            return;

        // Print the key of the current node
        System.out.print(node.key + " ");

        // Recursively print the left subtree in preorder
        print_Preorder(node.left);

        // Recursively print the right subtree in preorder
        print_Preorder(node.right);
    }

    void print_Preorder()  
    {   
        // Wrapper method to start printing the tree in preorder
        print_Preorder(root); 
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        
        // Create a binary tree with nodes and keys
        tree.root = new PreorderBinaryTreeTraversal(55);
        tree.root.left = new PreorderBinaryTreeTraversal(21);
        tree.root.right = new PreorderBinaryTreeTraversal(80);
        tree.root.left.left = new PreorderBinaryTreeTraversal(9);
        tree.root.left.right = new PreorderBinaryTreeTraversal(29);
        tree.root.right.left = new PreorderBinaryTreeTraversal(76);
        tree.root.right.right = new PreorderBinaryTreeTraversal(91);

        // Display a message and initiate the preorder traversal
        System.out.println("Preorder traversal of binary tree is: ");
        tree.print_Preorder();
    }
}

public class PostorderBinaryTreeTraversal
{
    int key;
    PostorderBinaryTreeTraversal left, right;

    public PostorderBinaryTreeTraversal(int item)
    {
        // Constructor to create a new Node with the given item
        key = item;
        left = right = null;
    }
}

class BinaryTree
{
  // Root of Binary Tree
    PostorderBinaryTreeTraversal root;

    BinaryTree()
    {
        // Constructor to create an empty binary tree
        root = null;
    }

 void print_Postorder(PostorderBinaryTreeTraversal node)
    {
        if (node == null)
            return;

        // Recursively print the left subtree in postorder
        print_Postorder(node.left);

        // Recursively print the right subtree in postorder
        print_Postorder(node.right);

        // Print the key of the current node
        System.out.print(node.key + " ");
    }

 void print_Postorder()  
	{   
	   // Wrapper method to start printing the tree in postorder
	   print_Postorder(root);  
	}
        public static void main(String[] args)
    {
       BinaryTree tree = new BinaryTree();

        // Create a binary tree with nodes and keys
        tree.root = new PostorderBinaryTreeTraversal(55);
        tree.root.left = new PostorderBinaryTreeTraversal(21);
        tree.root.right = new PostorderBinaryTreeTraversal(80);
        tree.root.left.left = new PostorderBinaryTreeTraversal(9);
        tree.root.left.right = new PostorderBinaryTreeTraversal(29);
        tree.root.right.left = new PostorderBinaryTreeTraversal(76);
        tree.root.right.right = new PostorderBinaryTreeTraversal(91);

        // Display a message and initiate the postorder traversal
        System.out.println("\nPostorder traversal of binary tree is: ");
        tree.print_Postorder();
    }
}

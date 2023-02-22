// A class to store a binary tree node
class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}
 
class Lecture8
{
    // Recursive function to check if a given binary tree is a sum tree or not
    public static int isSumTree(Node root)
    {
        if(root==null){
            return 0;
        }
        int sum=isSumTree(root.left)+isSumTree(root.right);


        if(sum==root.key){
            return root.key * 2;
        }
        else if(sum==0){
            return root.key;
        }
        else{
            return Integer.MIN_VALUE;

        }


 

    }
 
    public static void main(String[] args)
    {
        /* Construct the following tree
                 44
                /  \
               /    \
              9     13
             / \    / \
            4   5  6   7
        */
        System.out.println(Integer.MIN_VALUE + Integer.MIN_VALUE);
        Node root = new Node(44);
        root.left = new Node(9);
        root.right = new Node(13);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
 
        if (isSumTree(root) != Integer.MIN_VALUE) {
            System.out.println(isSumTree(root));
            System.out.println("Binary tree is a sum tree");
        }
        else {
            System.out.println("Binary tree is not a sum tree");
        }
    }
}

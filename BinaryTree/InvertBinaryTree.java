package BinaryTree;


public class InvertBinaryTree {
	
public static Node invertTree(Node root) 
{
        if(root!=null)
        {
        	Node temp = root.left;
        	root.left=root.right;
        	root.right=temp;
        	invertTree(root.left);
        	invertTree(root.right);
        }
        return root;
    }

public static void printInorder(Node root)
{
	if(root==null)
		return;
	printInorder(root.left);
	System.out.print(root.data+" ");
	printInorder(root.right);
}

public static void main(String args[])
{
			Node B=new Node(12,
					new Node(13,new Node(14, new Node(114), new Node(342)),new Node(16)),
					new Node(20, new Node(111), new Node(1234)));
			Node C=new Node(20, new Node(111), new Node(1234));	
	printInorder(invertTree(B));
	printInorder(invertTree(C));

}

}

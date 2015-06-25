package BinaryTree;


public class Traversal {
	/*
	 *  in-order: left, root, right
	 *  pre-order: root, left, right
	 *  post-order: left, right, root
	 */
	 
	public static void preorder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public static void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	public static void postorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			inorder(root.right);
			System.out.println(root.data);
		}
	}
	
	public static void main(String args[])
	{
		Node B=new Node(12,
				new Node(13,new Node(14, new Node(114), new Node(342)),new Node(16)),
				new Node(20, new Node(111), new Node(1234)));
		Node C=new Node(20, new Node(111), new Node(1234));
		preorder(C);
		System.out.println("----");
		inorder(C);
		System.out.println("----");
		postorder(C);
		}

}
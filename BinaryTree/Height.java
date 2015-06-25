package BinaryTree;


public class Height {
	/*
	 * Height of a binary tree
	 */
	public static int height(Node root)
	{
		if(root==null)
			return 0;
		else
		return 1+Math.max(height(root.left),height(root.right));
	}
	
	public static void main(String args[])
	{
		Node B=new Node(12,
				new Node(13,new Node(14, new Node(114), new Node(342)),new Node(16)),
				new Node(20, new Node(111), new Node(1234)));
		Node C=new Node(20, new Node(111), new Node(1234));		
		System.out.println(height(B));
		System.out.println(height(C));
	}
}

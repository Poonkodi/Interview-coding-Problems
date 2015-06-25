package BinaryTree;

public class Node {
	int data;
	Node left;
	Node right;

	Node(int data,Node left,Node right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
	
	Node(int data)
	{
		this.data=data;
	}
	
	public static boolean findNode(Node root, Node searchNode)
	{
		if(searchNode.data==root.data)
			return true;
		else if(root==null)
			return false;
		else
			return findNode(root.left,searchNode) || findNode(root.right,searchNode);					
	}
	
	public static void main(String args[])
	{
		Node B=new Node(12,
				new Node(13,new Node(14, new Node(114), new Node(342)),new Node(16)),
				new Node(20, new Node(111), new Node(1234)));
		Node C=new Node(20, new Node(111), new Node(1234));	
		System.out.println(findNode(B,new Node(12)));
		System.out.println(findNode(B,new Node(100)));

	}
}


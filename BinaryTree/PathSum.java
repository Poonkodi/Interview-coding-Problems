package BinaryTree;

public class PathSum {

	/* returns the maximum path sum*/
	public static int calculateSum(Node root)
	{
		if(root==null)
			return 0;
	
		else
			return Math.max(root.data+calculateSum(root.left) ,root.data+calculateSum(root.right));		
	}
	
	/* Check whether if there exists a path sum*/
	public static boolean calculateSum(Node root,int targetsum)
	{
		if(root==null)
		{
		
		}
	
		else
			return Math.max(root.data+calculateSum(root.left) ,root.data+calculateSum(root.right));		
	}
	public static void main(String args[])
	{
		 Node B=new Node(12,
					new Node(13,new Node(14, new Node(114), new Node(342)),new Node(16)),
					new Node(20, new Node(111), new Node(1234)));
			Node C=new Node(20, new Node(111), new Node(1234));	
			Node D=new Node(20, new Node(900), new Node(1234));	

		System.out.println(	calculateSum(B));
			System.out.println(calculateSum(C));
			System.out.println(calculateSum(D));

			
	}
}

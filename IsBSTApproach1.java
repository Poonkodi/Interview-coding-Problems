
public class IsBSTApproach1 {
	/*
	 * Check whether binary tree is a binary search tree
	 */
	
	public static boolean isBinarySearchTree(Node root)
	{
		if(root==null)
		{
			return true;
		}
		
		else if(root.left!=null&&root.right!=null)
		{
			if(root.left.data<root.data&&root.right.data>root.data)
			{
				return (isBinarySearchTree(root.left)&&isBinarySearchTree(root.right));
			}
			else
				return false;
		}
		else if(root.left==null&&root.right!=null)
		{
			if(root.right.data>root.data)
				return (isBinarySearchTree(root.right));
		}
		
		else if(root.right==null&&root.left!=null)
		{
			if(root.left.data>root.data)
				return (isBinarySearchTree(root.left));
		}
		else if(root.left==null&&root.right==null)
		{
			return true;
		}
		return false;
	}

	public static void main(String args[])
	{
		Node B=new Node(12,
				new Node(13,new Node(14, new Node(114), new Node(342)),new Node(16)),
				new Node(20, new Node(111), new Node(1234)));
		Node C=new Node(20, new Node(111), new Node(1234));	
		Node D=new Node(20, new Node(11), new Node(1234));	
		Node E=new Node(12,
				new Node(11,new Node(9, new Node(8), new Node(342)),new Node(16)),
				new Node(114, new Node(111), new Node(1234)));

		System.out.println(isBinarySearchTree(B));
		System.out.println(isBinarySearchTree(C));
		System.out.println(isBinarySearchTree(D));
		System.out.println(isBinarySearchTree(E));


	}
}

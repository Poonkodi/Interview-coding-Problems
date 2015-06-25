
public class BSTinsertion {

	/*
	 * Insert node to a binary search tree
	 */
	public static Node insertNode(Node root,int element)
	{
		if(root!=null)
		{
			if(element<root.data)
			{
				//System.out.println("root.left="+root.left.data+","+element);
				root.left= insertNode(root.left,element);
			}
			else if(element>root.data)
			{
				//System.out.println("root.right="+root.right.data+","+element);
				root.right=insertNode(root.right,element);
			}
		}
		else
		{
			return new Node(element);
		}
		return root;

	}

	public static void printInorder(Node root)
	{
		if(root!=null)
		{
			printInorder(root.left);
			System.out.print(root.data+"--");
			printInorder(root.right);
		}

	}


	public static void main(String args[])
	{
		Node D=new Node(20, new Node(11), new Node(1234));	
		Node E=new Node(12,
				new Node(11,new Node(9, new Node(8), new Node(342)),new Node(16)),
				new Node(114, new Node(111), new Node(1234)));
		Node F=new Node(8,new Node(3),new Node(10));
		Node L=new Node(8,new Node(3,new Node(1),new Node(6)),new Node(10,null,new Node(14,new Node(13),null)));
		printInorder(L);
		System.out.println();
		Node G=insertNode(L,15);
		printInorder(G);


	}

}

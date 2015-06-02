
public class MirrorImageTree {

	public static Node mirror(Node root)
	{
		
		if(root!=null)
		{
			
				 Node temp=root.right;
				 root.right=root.left;
				 root.left=temp;
				 mirror(root.left);
				 mirror(root.right);
				 return root;
		}
		return null;
		
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
		Node D=new Node(20, new Node(11), new Node(1234));	
		Node E=new Node(12,
				new Node(11,new Node(9, new Node(8), new Node(342)),new Node(16)),
				new Node(114, new Node(111), new Node(1234)));
		printInorder(B);
		mirror(B);
		System.out.println();
		printInorder(B);
		System.out.println();
		printInorder(C);
		mirror(C);
		System.out.println();
		printInorder(C);
		mirror(D);
		mirror(E);

	}
}

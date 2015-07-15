package BinaryTree;

public class LCABST {
	private static Node findParent(Node root, Node p1,Node p2) {
		if(p1.data<p2.data)
		{
			Node ancestor=p1.parent;
			while(ancestor!=null)
			{
			if(ancestor.data>p1.data&&ancestor.data<p2.data)
				return ancestor;
			ancestor=p1.parent.parent;
			}
		}
		
		return null;
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
		Node D=new Node(20);	
		Node l1=new Node(11);
		Node r1=new Node(1234);
		Node l2=new Node(2);
		Node r2=new Node(13);
		D.AddChildren(l1,r1);
		l1.AddChildren(l2,r2);
		
		Node E=new Node(12,
				new Node(11,new Node(9, new Node(8), new Node(342)),new Node(16)),
				new Node(114, new Node(111), new Node(1234)));
		Node F=new Node(8,new Node(3),new Node(10));
		Node L=new Node(8,new Node(3,new Node(1),new Node(6)),
				new Node(10,null,new Node(14,new Node(13),null)));
		printInorder(D);
		System.out.println("  "+findParent(D,l2,r2).data);

	}	
}


public class TreesAreEqual {

	public static boolean isEqual(Node root1,Node root2)
	{
		if(root1==null&&root2!=null)
			return false;
		else if(root1!=null&&root1==null)
			return false;
		else if(root1==null&&root2==null)
			return true;
		else if(root1.data==root2.data)
		{
			return isEqual(root1.left,root2.left)&&isEqual(root1.right,root2.right);
		}
		else
			return false;
	}
	public static void main(String args[])
	{
		Node B=new Node(12,
				new Node(13,new Node(14, new Node(114), new Node(342)),new Node(16)),
				new Node(20, new Node(111), new Node(1234)));
		Node C=new Node(20, new Node(111), new Node(1234));	
		Node D=new Node(12,
				new Node(13,new Node(14, new Node(114), new Node(342)),new Node(16)),
				new Node(20, new Node(111), new Node(1234)));
		Node E=new Node(20, new Node(111), new Node(1234));	
		
		System.out.println(isEqual(B,C));		
		System.out.println(isEqual(D,C));
		System.out.println(isEqual(C,E));
		System.out.println(isEqual(B,D));
	}
}

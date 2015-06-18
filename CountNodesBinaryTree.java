
public class CountNodesBinaryTree {
	 public static int countNodes(Node root) {
		 if(root==null)
			 return 0;
		 else if(root.left==null&&root.right==null)
	    	 return 1;
	     else
	    	 return 1+countNodes(root.left)+countNodes(root.right);
	    }

	 public static void main(String args[])
	 {
	 Node B=new Node(12,
				new Node(13,new Node(14, new Node(114), new Node(342)),new Node(16)),
				new Node(20, new Node(111), new Node(1234)));
		Node C=new Node(20, new Node(111), new Node(1234));	
		System.out.println(+countNodes(B));
		System.out.println(+countNodes(C));

		}
}

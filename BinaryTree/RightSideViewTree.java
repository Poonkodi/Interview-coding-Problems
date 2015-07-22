package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class RightSideViewTree {
	    public static List<Integer> rightSideView(TreeNode root) {
		    	List<Integer> l=new ArrayList<Integer>();
		        if(root==null)
		        return l;
		    	while(root!=null)
		    	{
		    	l.add(root.val);
		    	root=root.right;
		    	}
		    	return l;
		        
		    }
	    public static void main(String args[])
		{
			TreeNode B=new TreeNode(12,
					new TreeNode(13,new TreeNode(14, new TreeNode(114), new TreeNode(342)),new TreeNode(16)),
					new TreeNode(20, new TreeNode(111), new TreeNode(1234)));
			TreeNode C=new TreeNode(20, new TreeNode(111), new TreeNode(1234,null,new TreeNode(1)));	
			TreeNode D=new TreeNode(20, null, new TreeNode(1234));	
			TreeNode E=new TreeNode(1,new TreeNode(2),null);

			System.out.println(	rightSideView(B).toString());
			System.out.println(	rightSideView(C).toString());
			System.out.println(	rightSideView(D).toString());
			System.out.println(	rightSideView(E).toString());
		}
	}


package BinaryTree;

public class BTreeFromInPostOrder {
	public TreeNode buildTree(int[] inorder, int[] postorder) {

		return buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
	}
	public TreeNode buildTree(int[] inorder, int i_start,int i_end,int[] postorder,
			int p_start,int p_end)
	{
		int root_value=postorder[p_end];
		int index=0;

		if(i_start>i_end||p_start>p_end)
			return null;
		for(int i=i_start;i<i_end;i++)
		{
			if(inorder[i]==root_value)
				index= i;
		}
		System.out.println(root_value+ " processing");

		TreeNode root=new TreeNode(root_value);


		root.left=buildTree(inorder,i_start,index-1,postorder,p_start,(index-i_start)+p_start);

		
		root.right=buildTree(inorder,index+1,i_end,postorder,(index-i_start)+p_start+1,p_end-1);
		
		return root;
	}


	public static void main(String args[])
	{
		BTreeFromInPostOrder b=new BTreeFromInPostOrder();
		int inorder[]={1,2,3,4,5,6,7,8,9};
		int postorder[]={1,3,5,4,2,8,9,7,6};
		b.buildTree( inorder,  postorder);
	}
}

package BinaryTree;
import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Level order traversal of a binary tree
 */
public class LevelOrderTraverse {
	public static void levelOrder(Node root)
	{
		Deque<Node> q=new ArrayDeque<Node>();
		if(root!=null)
		{
		q.add(root);
		}
		while(!q.isEmpty())
		{
			Node current=q.remove();
			System.out.println(current.data);
			if(current.left!=null)
			q.add(current.left);
			if(current.right!=null)
			q.add(current.right);
		}				
	}
	
	public static void main(String args[])
	{
		Node B=new Node(12,
				new Node(13,new Node(14, new Node(114), new Node(342)),new Node(16)),
				new Node(20, new Node(111), new Node(1234)));
		Node C=new Node(20, new Node(111), new Node(1234));		
		levelOrder(B);
		levelOrder(C);
	}
}

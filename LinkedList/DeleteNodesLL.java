package LinkedList;


public class DeleteNodesLL {
	/*
	 * Delete alternate nodes in a LinkedList
	 */
	public static void deleteNode(LLNode node)
	{
		LLNode head=node;
		while(node!=null)
		{
			node.next=node.next.next;
			node=node.next;
		}
	}
	public static void printLLNode(LLNode node)
	{
		while(node!=null)
		{
			System.out.print(node.data+"--");
			node=node.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		LLNode LL=new LLNode(1,new LLNode(2,
				new LLNode(3,new LLNode(4,
						new LLNode(5,new LLNode(6,null))))));
		printLLNode(LL);
		deleteNode(LL);
		printLLNode(LL);
	}
}

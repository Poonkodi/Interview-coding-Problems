package LinkedList;

public class ReversLinkList {
	public static LLNode reverseList(LLNode head)
	{
		LLNode current,prev,third;
		current=head.next;
		third=current.next;
		head.next=null;
		current.next=head;
		prev=current;
		current=third;
		while(current!=null)
		{
			System.out.println("processing current"+current.data);
			third=current.next;
			current.next=prev;
			prev=current;
			System.out.println("what is next"+current.next.data);
			current=third;
		}
		
		return prev;
		
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
		printLLNode(reverseList(LL));
	}
}

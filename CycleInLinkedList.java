
public class CycleInLinkedList {
	/*
	 * find a loop in the linkedlist
	 * @return true - if loop exists
	 * @return fals - if loop doesnt exist
	 */
	public static boolean findCycle(LLNode node)
	{
		LLNode ptr1=node,ptr2=node;
		while(ptr1!=null &&ptr2!=null)
		{
			ptr1=ptr1.next;
			if(ptr2.next!=null)
				ptr2=ptr2.next.next;
			if(ptr1==ptr2)
				return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		LLNode LL=new LLNode(1,new LLNode(2,
				new LLNode(3,new LLNode(4,
						new LLNode(5,new LLNode(6,null))))));
		System.out.println(findCycle(LL));
	}
}

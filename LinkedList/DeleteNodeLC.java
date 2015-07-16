package LinkedList;

public class DeleteNodeLC {
	    public void deleteNode(LLNode node) {
	        LLNode prev=null;
	        while(node.next!=null)
	        {
	            node.data=node.next.data;
	            prev=node;
	            node=node.next;
	        }
	        prev.next=null;
	    }
	}


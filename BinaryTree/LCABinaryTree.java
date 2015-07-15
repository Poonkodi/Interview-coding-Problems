package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;

public class LCABinaryTree {

	public static void printarray(ArrayList<Node> n ) {
		for (Node x : n) {
			System.out.println("[" + x.data + "]");
		}
		System.out.println();
	}

	public static Node commonAncestor(Node root, Node p1, Node p2) {
		System.out.println(+p1.data + "---" + p2.data);

		ArrayList<Node> parents1 = new ArrayList<Node>();
		ArrayList<Node> parents2 = new ArrayList<Node>();

		Node parent1 = p1.parent;
		while (parent1 != null) {
			parents1.add(parent1);
			parent1 = parent1.parent;
		}

		Node parent2 = p2.parent;
		while (parent2 != null) {
			parents2.add(parent2);
			parent2 = parent2.parent;
		}

		Collections.reverse(parents1);
		Collections.reverse(parents2);

		printarray(parents1);
		System.out.println(parents1.get(0).data);
		printarray(parents2);

//		for (Node par1 : parents1) {
//			for (Node par2 : parents2) {
//				if (par1 == par2) return par2;
//			}
//		}
		Node lastmatched = null;
		for(int i=0;i<parents1.size()&&i<parents2.size();i++)
		{
			if(parents1.get(i)==parents2.get(i))
			{
				 lastmatched=parents1.get(i);
			}
			else
				return lastmatched;
		}
		

		System.out.println("Default returning root ");
		return lastmatched;
	}

	public static void main(String args[]) {
		Node root = new Node(12);
		Node l1 = new Node(33);
		Node r1 = new Node(44);

		root.AddChildren(l1, r1);
		Node l2 = new Node(3);


		l1.AddLeft(l2);
		//l2.AddRight(r2);


		Node r3 = new Node(1023);
		Node r4 = new Node(4096);
		r3.AddLeft(r4);
		Node r2 = new Node(43);

		r1.AddLeft(r3);
		r1.AddRight(r2);

		Node common = commonAncestor(root, r2, r3);
		System.out.println(common.data);
	}
}

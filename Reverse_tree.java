import java.util.*;
class Node {
	int data;
	Node left, right;
	public Node(int data)
	{
	this.data=data;
	left=right=null;
	}
}
public class Reverse_tree {
		Node root; 
		void reverseLevelOrder(Node node) 
		{ 
			int h = height(node); 
			int i; 
			for (i = h; i >= 1; i--) 
			{ 
				display(node, i); 
			} 
		} 
		void display(Node node, int level) 
		{ 
			if (node == null) 
				return; 
			if (level == 1) 
				System.out.print(node.data + " "); 
			else if (level > 1) 
			{ 
				display(node.right, level - 1); 
				display(node.left, level - 1); 
			} 
		}
		int height(Node node) 
		{ 
			if (node == null) 
				return 0; 
			else
			{ 
				int lh = height(node.left); 
				int rh = height(node.right); 

				if (lh > rh) 
					return(lh + 1); 
				else
					return(rh + 1); 
			} 
		}
		public static void main(String args[]) 
		{ 
			Reverse_tree tree = new Reverse_tree(); 

			tree.root = new Node(40); 
			tree.root.left = new Node(30); 
			tree.root.right = new Node(70); 
			tree.root.left.left = new Node(20); 
			tree.root.left.right = new Node(35);
	        tree.root.right.left = new Node(50);
	        tree.root.right.right = new Node(80); 
			
	        tree.reverseLevelOrder(tree.root); 
		} 
}

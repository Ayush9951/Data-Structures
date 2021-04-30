/*
	->  1
	  /   \
      -> 2     3         level Order= 1,2,3,4,5,6,7
   	/ \   / \	 
    -> 4   5 6   7       

*/

import java.util.*;
class node													
{
	int data;
	node left;
	node right;
	node(int data)
	{
		this.data=data;
	}
}
class Level_Order
{
	// using ArrayList

	static node root;
	void levelOrder(node root)
	{
		if(root==null)
		{
			System.out.println("Tree is empty");
		}
		else
		{
			ArrayList<node> list=new ArrayList<>();
			list.add(root);
			while(list.size()!=0)
			{ 
			      node t=list.get(0);
			      if(t.left!=null)
			      {
				  list.add(t.left);
			      }
			      if(t.right!=null)
			      {
				  list.add(t.right);
			      }	 
			      System.out.print(list.remove(0).data+" ");
			}
		}
		
	}
	
	// using Queue
	
	/*
	void levelOrder(node root)
	{
		if(root==null)
		{
			System.out.println("Tree is Empty");
		}
		else
		{
			Queue<node> q=new LinkedList<>();
			q.add(root);
			while(q.size()!=0)
			{ 
			      node t=q.peek();
			      if(t.left!=null)
			      {
				  q.add(t.left);
			      }
			      if(t.right!=null)
			      {
				  q.add(t.right);
			      }	 
			      System.out.print(q.poll().data+" ");
			}
		}
	}
	
	*/
	
	public static void main(String args[])
	{
		Level_Order tree=new Level_Order();
		tree.root=new node(1);
		
		tree.root.left=new node(2);
		tree.root.right=new node(3);
		
		tree.root.left.left=new node(4);
		tree.root.left.right=new node(5);
		
		tree.root.right.left=new node(6);
		tree.root.right.right=new node(7);
		
		tree.levelOrder(root);
	
		
	}
}

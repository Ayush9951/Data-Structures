/*
	    1
	  /   \
	 2     3         
   	/ \   	 
       4   5      
*/




import java.util.*;
class node
{
	node left;
	node right;
	int data;
	node(int data)
	{
		this.data=data;
		
	}
}
class Search_key
{
	static node root;
	static void search(int key)
	{
		if(root==null)
		{
			System.out.println("Tree is Empty");
		}
		else
		{
			if(LevelOrder(key)==true)
			{
				System.out.println("Value Found");
			}
			else
			{
				System.out.println("Value Not Found");
			}
		}
	}
	
	static boolean LevelOrder(int key)
	{
		Queue<node> q=new LinkedList<>();
		q.add(root);
		while(q.size()!=0)
		{
			node t=q.peek();
			if(t.data==key)
			{
				return true;
			}
		        if(t.left!=null)
			{
				q.add(t.left);
			}
			if(t.right!=null)
			{
				q.add(t.right);
			}
			q.poll();
			
		}
		return false;
	}
	public static void main(String args[])
	{
		Search_Key tree=new Search_key();
		tree.root=new node(1);
		
		tree.root.left=new node(2);
		tree.root.right=new node(3);
		
		tree.root.left.left=new node(4);
		
		tree.root.left.right=new node(5);
		
		
		search(5);
	}
}
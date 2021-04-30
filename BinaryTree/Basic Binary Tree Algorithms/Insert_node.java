/*
	    1
	  /   \
	 2     3         
   	/ \   /	\
       4   5 6   7 
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
class Insert_node
{
	static node root;
	static void insert(int key)
	{
		if(root==null)
		{
			root=new node(key);
		}
		else
		{
			LevelOrder(key);
		}
	}
	
	static void LevelOrder(int value)
	{
		Queue<node> q=new LinkedList<>();
		q.add(root);
		while(q.size()!=0)
		{
			node t=q.peek();

			// If no vacant space found we will insert the values in the queue
			if(t.left!=null)
			{
				q.add(t.left);
			}
			if(t.right!=null)
			{
				q.add(t.right);
			}

			// If a vacant space found we will create a node and insert the value 
			if(t.left==null)
			{
				t.left=new node(value);
				q.clear();
				
			}
			else if(t.right==null)
			{
				t.right=new node(value);
				q.clear();
				
			}
			if(q.size()!=0)
			{
				q.poll();
			}
				
		}
		
	}
	static void preOrder(node root)
	{
		if(root==null)
		{
			return ;
		}
		else
		{
			System.out.print(root.data+" ");        // 1 2 4 5 3 6 7
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public static void main(String args[])
	{
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		insert(6);
		insert(7);
		
		preOrder(root);
	}
}
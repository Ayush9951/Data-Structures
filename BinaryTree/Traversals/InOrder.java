/*
	    1
	  /   \
	 2     3         InOrder = 4,2,5,1,6,3,7
   	/ \   / \	 
       4   5 6   7       

*/
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
class InOrder
{
	static node root;
	void inOrder(node root)
	{
		if(root==null)
		{
		return;
		}
		else
		{ 
			inOrder(root.left);
 			System.out.print(root.data+" ");
			inOrder(root.right);	
		}
	}
	
	public static void main(String args[])
	{
		InOrder tree=new InOrder();
		tree.root=new node(1);
		
		tree.root.left=new node(2);
		tree.root.right=new node(3);
		
		tree.root.left.left=new node(4);
		tree.root.left.right=new node(5);
		
		tree.root.right.left=new node(6);
		tree.root.right.right=new node(7);
		
		tree.inOrder(root);
	
		
	}
}
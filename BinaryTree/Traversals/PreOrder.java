/*
	    1
	  /   \
	 2     3         PreOrder = 1 2 4 5 3 6 7
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
class PreOrder
{
	static node root;
	void preOrder(node root)
	{
		if(root==null)
		{
		return;
		}
		else
		{
		        System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);	
		}
	}
	
	public static void main(String args[])
	{
		PreOrder tree=new PreOrder();
		tree.root=new node(1);
		
		tree.root.left=new node(2);
		tree.root.right=new node(3);
		
		tree.root.left.left=new node(4);
		tree.root.left.right=new node(5);
		
		tree.root.right.left=new node(6);
		tree.root.right.right=new node(7);
		
		tree.preOrder(root);
	
		
	}
}
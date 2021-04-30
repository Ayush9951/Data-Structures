/*
	    1
	  /   \
	 2     3         PostOrder = 4 5 2 6 7 3 1
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
class PostOrder
{
	static node root;
	void postOrder(node root)
	{
		if(root==null)
		{
		return;
		}
		else
		{ 
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");	
		}
	}
	
	public static void main(String args[])
	{
		PostOrder tree=new PostOrder();
		tree.root=new node(1);
		
		tree.root.left=new node(2);
		tree.root.right=new node(3);
		
		tree.root.left.left=new node(4);
		tree.root.left.right=new node(5);
		
		tree.root.right.left=new node(6);
		tree.root.right.right=new node(7);
		
		tree.postOrder(root);
	
		
	}
}
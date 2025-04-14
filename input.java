
import java.util.Scanner;
public class Main
{
    public class TreeNode
	{
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode (int data)
	    {
	        this.data=data;
	        this.left = this.right = null;
	    }
	}
	TreeNode root;
	Main ()
	{
	    root = null;
	}
	
	public TreeNode insert(TreeNode root, int dataToBeInserted)
	{
	    if (root == null)
	    {
	        root = new TreeNode(dataToBeInserted);
	        return root;
	    }
	    if (root.data > dataToBeInserted)
	    {
	        root.left = insert(root.left, dataToBeInserted);
	    }
	    else if (root.data < dataToBeInserted)
	    {
	        root.right = insert(root.right, dataToBeInserted);
	    }
	    return root;
	}
	
	public void preOrder(TreeNode root)
	{
	    if (root == null)
	        return;
	    System.out.print(root.data+" ");
	    preOrder(root.left);
	    preOrder(root.right);
	}
	public void inOrder(TreeNode root)
	{
	    if (root == null)
	        return;
	    inOrder(root.left);
	    System.out.print(root.data+" ");
	    inOrder(root.right);	        
	}
	public void postOrder(TreeNode root)
	{
	    if (root == null)
	        return;
	    postOrder(root.left);
	    postOrder(root.right);
	    System.out.print(root.data+" ");
	}
	public void insertIntoTree(int dataToBeInserted)
	{
	    root = insert(root, dataToBeInserted);
	}
	public void preOrderTraversal()
	{
	    preOrder(root);
	}
	public void inOrderTraversal()
	{
	    inOrder(root);
	}
	public void postOrderTraversal()
	{
	    postOrder(root);
	}
    public static void towerOfHanoi(int hanoi, char sou, char aux, char des)
    {
    if (hanoi == 0)
    { 
      return;
    }
    if (hanoi == 1)
    { 
      System.out.println("move from tower " + sou + " to tower " + des);
      return;
    }
    else
    {
      towerOfHanoi(hanoi - 1, sou, des, aux);
      System.out.println("move from tower " + sou + " to tower " + des);
      towerOfHanoi(hanoi - 1, aux, sou, des);
    }
  }
	public static void main(String[] args)
	{
	    Main bst = new Main ();
	    Scanner opt = new Scanner(System.in);
	    Scanner scan = new Scanner(System.in);
	    Scanner tower = new Scanner(System.in);
	    int options;
	    int num;
	    int hanoi;
        System.out.println("Main Menu");
        System.out.println("1.Binary Tree Traversal");    
        System.out.println("•Pre-Order");         
        System.out.println("•In-Order");        
        System.out.println("•Post-Order");  
        System.out.println("2.Tower of Hanoi"); 
        System.out.println("3.About");         
        System.out.println("4.Exit");
        System.out.print("Enter Choice:");       
        options = opt.nextInt();
        switch (options)
        {
            case 1: // Sample flow 1
            System.out.println("Enter 5 numbers:\t");
            for(int i=0; i<5; i++)
                {
                    num = scan.nextInt();
                    bst.insertIntoTree(num);
                }
        
            System.out.print("\nPre-Order:");
            bst.preOrderTraversal();
        
            System.out.print("\nIn-Order:");
            bst.inOrderTraversal();
        
            System.out.print("\nPost-Order:");
            bst.postOrderTraversal();
            
            break;
            
            case 2: // Sample flow 2
            System.out.print("Enter Number of Disks:\t");
		    hanoi = tower.nextInt();
		    towerOfHanoi(hanoi, 'S', 'A', 'D');
            break;

            case 3:// Sample flow 3
            System.out.println("Student Name: Edgardo Capunitan ");
            System.out.println("Subject: Data Structure ");            
            System.out.println("Course: BSIT");            
            break;
            
            case 4: // Sample flow 4
            System.out.println("Thank you for using the program.");
            break;
            
        }
	}
}
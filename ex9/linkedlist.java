import java.util.*;
class node
{
	int data;
	node next;
	node(int data)
	{
		this.data=data;
	}
}
class linkedlist
{
	static node gbnode;
	  static Scanner input=new Scanner(System.in);
	public static void main(String[] args)
	{
		int i,total;
		node head=null;
		System.out.print("enter total : ");
			total=input.nextInt();
		for(i=0;i<total;i++)
		{
			createLinkedlist(head);
		}
		Display(head);
		
	}
	static node createNode()
	{
		int data;
		System.out.print("enter data : ");
			data=input.nextInt();
		
		node newnode=new node(data);
		newnode.next=null;
		return newnode;
 	}
	static void createLinkedlist(node head)
	{
		if(head==null)
		{
			System.out.println("before assing to head "+head);
			head=createNode();
		}
		else
		{
			node temp;
			temp=createNode();
			gbnode.next=temp;
			gbnode=temp;
		}
	}
	static void Display(node head)
	{
		node temp;
		temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}

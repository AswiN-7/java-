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
	  static Scanner input=new Scanner(System.in);
	public static void main(String[] args)
	{
		int i,total;
		node head=null;
		System.out.print("enter total : ");
			total=input.nextInt();
		for(i=0;i<total;i++)
		{
			head=createLinkedlist(head);
			System.out.println( head.data+" "+head.next);
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
	static node createLinkedlist(node head)
	{
		if(head==null)
		{
			head=createNode();
		
		}
		else
		{
			node temp;
			temp=head;
			while(temp!=null)
			{	
				temp=temp.next;
			}
			temp=createNode();	
		}
		return head;	
	}
	static void Display(node head)
	{
		node temp;
		temp=head;
		System.out.println("the elements are : ");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}

import java.util.*;
	
class doublelist
{
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args)
	{
		while(true)
		{
			LinkedList<Integer> dlist=new LinkedList<Integer>();
			System.out.println("ADD REMOVE Elements ");
				AddRemoveElements(dlist);
			System.out.println("traverse : ");
				traverse(dlist);
			System.out.println("sort");
				sortedlist(dlist);
			System.out.println("remove dupilcates ");
				removeDuplicate(dlist);
			int again;
			System.out.print("do continue with other inputs enter 1 :");
				again=input.nextInt();
			if(again!=1)
				break;
		}
	}
	static void traverse(LinkedList<Integer> dlist)
	{
		int len=dlist.size();
		for(int i=0;i<len;i++)
		{
			if(i==0)
				System.out.println("forward order ");
			System.out.print(dlist.get(i) +" ");
			if(i==len-1)
			{
				for(int j=len-1;j>=0;j--)
				{
					if(j==len-1)
						System.out.println("\nbackward order");
					System.out.print( dlist.get(j)+" ");
				}
				System.out.println();
			}			
		}
	}
	static void AddRemoveElements(LinkedList<Integer> dlist)
	{
		int num;
		while(true)
		{
			System.out.print("enter element to add(-1122 to stop) : ");
				num=input.nextInt();
					if(num==-1122)
						break;
				dlist.add(num);
			
		}
		while(true)
		{
			int choice;
			System.out.print("1 --insert element on both sides\n2 --delete first on both sides\n3 --add at particular position\n4 --remove a particular number\n5 --display particular element\n enter choice : ");
				choice=input.nextInt();
			if(choice==1)
			{
				System.out.print("enter element to add first : ");
					num=input.nextInt();
				dlist.addFirst(num);
				System.out.print("enter element to add last : ");
					num=input.nextInt();
				dlist.addLast(num);
				Display(dlist);
			}
			else if(choice==2)
			{
				dlist.removeFirst();
				dlist.removeLast();
				Display(dlist);
			}
			else if(choice==3)
			{
				int position;
				System.out.print("enter number : ");
					num=input.nextInt();
				System.out.print("enter position : ");
					position=input.nextInt();
				dlist.add(position,num);
				Display(dlist);
			}
			else if(choice==4)
			{
				int position;		
				System.out.print("enter element : ");
					num=input.nextInt();
				position=dlist.indexOf(num);
				if(position==-1)
					System.out.println("element not present");
				else
					dlist.remove(position);
				Display(dlist);
			}
			else if(choice==5)
			{
				int position;
				System.out.print("enter element : ");
					num=input.nextInt();
				position=dlist.indexOf(num);
				if(position==-1)
					System.out.println("element not present");
				else
					System.out.println("the number "+num+"is present position "+position);
			}
			else if(choice ==-1)
				break;
		}
			
	}
	static void Display(LinkedList<Integer> dlist)
	{
		System.out.println(dlist);
	}
	static void sortedlist(LinkedList<Integer> dlist)
	{ 
		LinkedList<Integer> temp=new LinkedList<Integer>(dlist);
		Collections.sort(temp);
		Display(temp);
	}
	static void removeDuplicate(LinkedList<Integer> dlist)
	{
		LinkedList<Integer> temp=new LinkedList<Integer>();
		ListIterator<Integer> litr=dlist.listIterator();
		while(litr.hasNext())
		{
			int ele= litr.next();
			if(!temp.contains(ele))
				temp.add(ele);
		}
		Display(temp);
	}
	
	
}
/*
SAMPLE i/o :
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex9$ java doublelist
ADD REMOVE Elements 
enter element to add(-1122 to stop) : 1
enter element to add(-1122 to stop) : 2
enter element to add(-1122 to stop) : 3
enter element to add(-1122 to stop) : 4
enter element to add(-1122 to stop) : 5
enter element to add(-1122 to stop) : 6
enter element to add(-1122 to stop) : 4
enter element to add(-1122 to stop) : -1122
1 --insert element on both sides
2 --delete first on both sides
3 --add at particular position
4 --remove a particular number
5 --display particular element
 enter choice : 1
enter element to add first : 3
enter element to add last : 4
[3, 1, 2, 3, 4, 5, 6, 4, 4]
1 --insert element on both sides
2 --delete first on both sides
3 --add at particular position
4 --remove a particular number
5 --display particular element
 enter choice : 2
[1, 2, 3, 4, 5, 6, 4]
1 --insert element on both sides
2 --delete first on both sides
3 --add at particular position
4 --remove a particular number
5 --display particular element
 enter choice : 3
enter number : 4
enter position : 3
[1, 2, 3, 4, 4, 5, 6, 4]
1 --insert element on both sides
2 --delete first on both sides
3 --add at particular position
4 --remove a particular number
5 --display particular element
 enter choice : 4
enter element : 4
[1, 2, 3, 4, 5, 6, 4]
1 --insert element on both sides
2 --delete first on both sides
3 --add at particular position
4 --remove a particular number
5 --display particular element
 enter choice : 5
enter element : 5
the number 5is present position 4
1 --insert element on both sides
2 --delete first on both sides
3 --add at particular position
4 --remove a particular number
5 --display particular element
 enter choice : -1
traverse : 
forward order 
1 2 3 4 5 6 4 
backward order
4 6 5 4 3 2 1 
sort
[1, 2, 3, 4, 4, 5, 6]
remove dupilcates 
[1, 2, 3, 4, 5, 6]
do continue with other inputs enter 1 :2

*/

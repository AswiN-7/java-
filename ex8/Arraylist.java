import java.util.*; 
public class Arraylist
{
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args)
	{
		int choice;
		ArrayList<String> arr=new ArrayList<String>();
		while(true)
		{
			System.out.print("1 --append\n2 --replace\n3 --display\n4 --insert\n5 --starts with\n6 --Substring\n7 --sort \n8 --remove\n9 --remove duplicates\n10 --index\n-1 --stop\nenter your choice : ");
				choice=input.nextInt();
			if(choice==1)
				append(arr);
			else if(choice==2)
				replace(arr);
			else if(choice==3)
				System.out.println("arr : "+arr);
			else if(choice==4)
				insert(arr);
			else if(choice==5)
				startswith(arr);
			else if(choice==6)
				substring(arr);
			else if(choice==7)
				sort(arr);
			else if(choice==8)
				remove(arr);
			else if(choice==9)
				removeduplicates(arr);
			else if(choice==10)
				index(arr);
			else if(choice==-1)
				break;

		}
	}
	static void append(ArrayList arr)
	{
		String appstring;
		System.out.print("enter String to append : ");
			appstring=input.next();
		arr.add(appstring);

	}
	static void replace(ArrayList arr)
	{
		String newst;
		int position;
		System.out.print("enter String to insert at particular position : ");
			newst=input.next();
		System.out.print("enter position :  ");
			position=input.nextInt();
		arr.set(position,newst);
	}
	static void insert(ArrayList arr)
	{
		String newst;
		int position;
		System.out.print("enter String to insert at particular position : ");
			newst=input.next();
		System.out.print("enter position :  ");
			position=input.nextInt();
		arr.add(position,newst);
	}
	static void startswith(ArrayList arr)
	{
		char x;
		System.out.print("enter character : ");
		x=input.next().charAt(0);
			
		for(int i=0;i<arr.size();i++)
		{
		//System.out.print(" "+i+": ");
			
			String newst=(String)(arr.get(i));
			if(newst.charAt(0)==x)
				System.out.print(newst+" ");			
		}
		System.out.println();
		
	}
	static void substring(ArrayList arr)
	{
		String sub,listele;
		System.out.print("enter sub string : ");
			sub=input.next();
		for(int i=0;i<arr.size();i++)
		{
			listele=(String)arr.get(i);
			if(listele.contains(sub))
				System.out.print(listele+" ");
		}	
	}
	static void sort(ArrayList arr)
	{
		Collections.sort(arr);
		System.out.println(arr);
	}
	static void remove(ArrayList arr)
	{
		String temp;
		System.out.print("enter name to remove : ");
			temp=input.next();
		arr.remove(temp);
	}
	static void removeduplicates(ArrayList<String> arr)
	{
		ArrayList<String> newlist=new ArrayList<String>();
		for(int i=0;i<arr.size();i++)
		{     String element= (String) arr.get(i);
			if(!newlist.contains(element))
			{
				newlist.add(element);
			}
		}
		System.out.println("with out duplicates : "+newlist);
	}
	static void index(ArrayList arr)
	{
		int i;
		String element;
			System.out.print("enter element to find it's index : ");
				element=input.next();
			System.out.println("index is "+arr.indexOf(element));
		
	}
}


/*
SAMPLE I/O:
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex8$ java Arraylist 
1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
-1 --stop
enter your choice : 1
enter String to append : java
1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
-1 --stop
enter your choice : 1
enter String to append : python
1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
-1 --stop
enter your choice : 1
enter String to append : c
1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
-1 --stop
enter your choice : 1
enter String to append : r
1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
-1 --stop
enter your choice : 1
enter String to append : c++
1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
-1 --stop
enter your choice : 4
enter String to insert at particular position : 1
enter position :  1
1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
-1 --stop
enter your choice : 3
arr : [java, 1, python, c, r, c++]
1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
-1 --stop
enter your choice : 5
enter character : ja
java 
1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
-1 --stop
enter your choice : -1



(recomplied)
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex8$ java Arraylist 

1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
10 --index
-1 --stop
enter your choice : 1
enter String to append : aswin
1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
10 --index
-1 --stop
enter your choice : 10
enter element to find it's index : aswin
index is 0
1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
10 --index
-1 --stop
enter your choice : 10
enter element to find it's index : as
index is -1
1 --append
2 --replace
3 --display
4 --insert
5 --starts with
6 --Substring
7 --sort 
8 --remove
9 --remove duplicates
10 --index
-1 --stop

*/

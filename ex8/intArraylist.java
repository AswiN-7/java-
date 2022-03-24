import java.util.*;
class intArraylist
{
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args)
	{	
		int choice;
		ArrayList<Integer>intlist1=new ArrayList<Integer>();
		ArrayList<Integer>intlist2=new ArrayList<Integer>();
		System.out.println("for list 1");
		input(intlist1);
		System.out.println("for list 2");
		input(intlist2);
		System.out.print("elements in list 1 : ");
		output_fun(intlist1);
		System.out.print("elements in list 2 : ");
		output_fun(intlist2);
		while(true)
		{
			System.out.print("1 --union\n2 intersection\n3 --comapare\n4 --merge\n-1 --stop\nenter your choice :  ");
			choice=input.nextInt();
			if(choice==-1)
				break;
			else if(choice==1)
			{
			ArrayList<Integer>U=union(intlist1,intlist2);
			System.out.println(U);			}
			else if(choice==2)
			{
			if(intlist1.size()>=intlist2.size())
				intersection(intlist1,intlist2);
			else
				intersection(intlist2,intlist1);
				
			}
			else if(choice==4)
				merge(intlist1,intlist2);
			else if(choice==3)
				compare(intlist1,intlist2);
		}		
	}
	static void input(ArrayList<Integer> list)
	{
		Integer newint;
		while(true)
		{
			System.out.print("enter Integer to add in list(-1122 to stop) : ");
				newint=input.nextInt();
			if(newint!=-1122)
				list.add(newint);
			else
				break;
		}
	}
	static void output_fun(ArrayList<Integer> list)
	{
		System.out.println(list);		
	}
	static ArrayList<Integer> union(ArrayList<Integer> list1,ArrayList<Integer> list2)
	{
		ArrayList<Integer> U=new ArrayList<Integer>();
		for(Integer temp : list1)
			if(list2.contains(temp)&&!U.contains(temp))	
					U.add(temp);				
		//System.out.println("union is : "+U);		
		return U;
	}
	static void intersection(ArrayList<Integer> list1,ArrayList<Integer> list2)
	{
		ArrayList<Integer> U=new ArrayList<Integer>();
		for(Integer temp : list1)
			if(!list2.contains(temp)&&!U.contains(temp))	
					U.add(temp);				
		System.out.println("union is : "+U);		
	}
	static void merge(ArrayList<Integer> list1,ArrayList<Integer> list2)
	{
		ArrayList<Integer> U=new ArrayList<Integer>();
		U.addAll(list1);
		for(Integer temp : list2)
			if(!U.contains(temp))	
					U.add(temp);				
		System.out.println("mered list is : "+U);		
	}	
	static void compare(ArrayList<Integer> list1,ArrayList<Integer> list2)
	{
		ArrayList<Integer>U=union(list1,list2);
		if(U.size()==list1.size()&&U.size()==list2.size())
			System.out.println("they are same ");
		else
			System.out.println("they aren't same ");
	}
}

/*
SAMPLE i/o: 
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex8$ javac intArraylist.java
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex8$ java intArraylist
for list 1
enter Integer to add in list(-1122 to stop) : 1
enter Integer to add in list(-1122 to stop) : 2
enter Integer to add in list(-1122 to stop) : 3
enter Integer to add in list(-1122 to stop) : 4
enter Integer to add in list(-1122 to stop) : 5
enter Integer to add in list(-1122 to stop) : 6
enter Integer to add in list(-1122 to stop) : 7
enter Integer to add in list(-1122 to stop) : -1122
for list 2
enter Integer to add in list(-1122 to stop) : 1
enter Integer to add in list(-1122 to stop) : 2
enter Integer to add in list(-1122 to stop) : 8
enter Integer to add in list(-1122 to stop) : 9
enter Integer to add in list(-1122 to stop) : 5
enter Integer to add in list(-1122 to stop) : 6
enter Integer to add in list(-1122 to stop) : 3
enter Integer to add in list(-1122 to stop) : 4
enter Integer to add in list(-1122 to stop) : -1122
1 --union
2 intersection
3 --comapare
4 --merge
-1 --stop
enter your choice :  1
[1, 2, 3, 4, 5, 6]
1 --union
2 intersection
3 --comapare
4 --merge
-1 --stop
enter your choice :  2
union is : [8, 9]
1 --union
2 intersection
3 --comapare
4 --merge
-1 --stop
enter your choice :  3
they aren't same 
1 --union
2 intersection
3 --comapare
4 --merge
-1 --stop
enter your choice :  4
mered list is : [1, 2, 3, 4, 5, 6, 7, 8, 9]
1 --union
2 intersection
3 --comapare
4 --merge
-1 --stop
enter your choice :-1  

*/

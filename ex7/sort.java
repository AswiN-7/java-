import java.util.*;

class Sort<T extends Comparable>
{
	T[] array;
	T temp;
	int i,j,size;
	Sort(T[] array,int size)	
	{	
		this.array=array;	
		this.size=size;
		sort();
	}
	<T>  void sort()
		{
			for(i=0;i<size-1;i++)
			{	
				for(j=i+1;j<size;j++)
				{
 					if(array[i].compareTo(array[j])>0)
					{
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}				
				}
			}
		}

	void display()
	{
		int i;
		for(i=0;i<size;i++)
		{
			System.out.print(array[i]+"  ");
		}
	}
}


class sortEg
{
  static Scanner input=new Scanner(System.in);
 public static void main(String[] args)
 {
   while(true)
   {
   int choice,size,i,again;
  System.out.print("1 --interger\n2 --Double\n3 --string\nenter your choice : ");
    choice=input.nextInt();
   System.out.print("enter how many elements you are going to give : ");
     size=input.nextInt();
  if(choice==1)
   {  Integer[] array=new Integer[size];
     for(i=0;i<size;i++)
         {
         System.out.print("enter element "+(i+1)+" : ");
         array[i]=input.nextInt(); 
         }
       Sort<Integer> maxint=new Sort<Integer>(array,size);
	maxint.display();
   }
  else if(choice==2)
     {
       Double[] array=new Double[size];
        for(i=0;i<size;i++)
         {
         System.out.print("enter element "+(i+1)+" : ");
         array[i]=input.nextDouble(); 
         }
       Sort<Double> maxint=new Sort<Double>(array,size);
	maxint.display();
     }
   else if(choice==3)
    { 
     String[] array=new String[size];
     for(i=0;i<size;i++)
         {
         System.out.print("enter element "+(i+1)+" : ");
         array[i]=input.next(); 
         }
       Sort<String> maxint=new Sort<String>(array,size);
	 maxint.display();
    }
    System.out.print("\nto continue with other choice enter 1 ");
        again=input.nextInt();
     if(again!=1)
      break;
   } 
 }
}

/*
SAMPLE I/O:

aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex7$ java sortEg
1 --interger
2 --Double
3 --string
enter your choice : 3
enter how many elements you are going to give : 5
enter element 1 : aswin
enter element 2 : bala
enter element 3 : arthick
enter element 4 : ram
enter element 5 : ragu
arthick  aswin  bala  ragu  ram  
to continue with other choice enter 1 1
1 --interger
2 --Double
3 --string
enter your choice : 1
enter how many elements you are going to give : 5
enter element 1 : 90
enter element 2 : 78
enter element 3 : 56
enter element 4 : 34
enter element 5 : 12
12  34  56  78  90  
to continue with other choice enter 1 1
1 --interger
2 --Double
3 --string
enter your choice : 2
enter how many elements you are going to give : 12
enter element 1 : 12
enter element 2 : 30.4
enter element 3 : 32.6
enter element 4 : 45.0
enter element 5 : 0.0
enter element 6 : 89.6
enter element 7 : 34.6
enter element 8 : 3
enter element 9 : 11
enter element 10 : 23
enter element 11 : 34.5
enter element 12 : 45.6
0.0  3.0  11.0  12.0  23.0  30.4  32.6  34.5  34.6  45.0  45.6  89.6  
to continue with other choice enter 1 -1
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex7$ 


*/


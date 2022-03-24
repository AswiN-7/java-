import java.util.*;
class max<T extends Comparable>
{
 T[] array;
 T maxele;
 int i,size;
    max(T[] array,int size)
      {
         this.array=array;
         this.size=size;
         maxfind();
      }
     <T> void maxfind()
      {
           maxele=array[0];
           for(i=1;i<size;i++)
            {
               if(maxele.compareTo(array[i])<0)
                {  maxele=array[i];
                   
                }
            }
           System.out.println("maximum element is "+maxele);
           
      }

}
 
class maxgeneric
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
       max<Integer> maxint=new max<Integer>(array,size);
   }
  else if(choice==2)
     {
       Double[] array=new Double[size];
        for(i=0;i<size;i++)
         {
         System.out.print("enter element "+(i+1)+" : ");
         array[i]=input.nextDouble(); 
         }
       max<Double> maxint=new max<Double>(array,size);
     }
   else if(choice==3)
    { 
     String[] array=new String[size];
     for(i=0;i<size;i++)
         {
         System.out.print("enter element "+(i+1)+" : ");
         array[i]=input.next(); 
         }
       max<String> maxint=new max<String>(array,size);

    }
    System.out.print("to continue with other choice enter 1 ");
        again=input.nextInt();
     if(again!=1)
      break;
   } 
 }
}

/*
SAMPLE I/O:
1 --interger
2 --Double
3 --string
enter your choice : 2
enter how many elements you are going to give : 4
enter element 1 : 1.8
enter element 2 : 1.4
enter element 3 : 2.9
enter element 4 : 3.2
maximum element is 3.2
to continue with other choice enter 1 1
1 --interger
2 --Double
3 --string
enter your choice : 3
enter how many elements you are going to give : 4   
enter element 1 : asad
enter element 2 : asdaasd
enter element 3 : zzzz
enter element 4 : x
maximum element is zzzz
to continue with other choice enter 1 2

*/

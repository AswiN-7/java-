import java.util.*;
class linear_binary
 {
   public static void main(String args[]) 
  { 
     Scanner s=new Scanner(System.in);
    int i,num,choice,key,result=0;
    
         System.out.print("enter how many numbers your are going to give : ");
         num=s.nextInt();

               int[]array=new int[num];
                input(array,num,s);
             System.out.print("1-linear search\n2-binary search\nenter choice : ");
             choice=s.nextInt();
         System.out.print("enter key : ");
         key=s.nextInt();
    if(choice==1)
        result=linear_search(array,num,key);
    else if(choice==2)
      {
       sort(array,num);
       result=binary_search(array,num,key);
      }
     display(array,num,result);
   
  }
   static void input(int array[],int num,Scanner s)
    {
       int i;
       for(i=0;i<num;i++)
     {
      System.out.print("enter number "+(i+1)+" : ");
      array[i]=s.nextInt();
     }
         
    }
  static int linear_search(int array[],int num,int key)
  {
    int i;
    for(i=0;i<num;i++)
      { if(key==array[i])
          return i;
     }
    return -1;
  }
  static void display(int array[],int num,int result)
    {
      int i;
      
       for(i=0;i<num;i++)
           System.out.println(" number "+(i+1)+" : "+(array[i]));
       if(result==-1)
             System.out.println("number is not there in the given list of numbers ");
        else
             System.out.println("position of the given number is :"+(result+1));   
     
    }
  static void sort(int array[],int num)
    { 
      int i,j,temp;
      for(i=0;i<num;i++)
         for(j=i+1;j<num;j++)
          { 
            if(array[i]>array[j])
             {
              temp=array[i];
              array[i]=array[j];
              array[j]=temp;
             
             }
          }
      
    }
   static int binary_search(int array[],int num,int key)
      {
        int i,j,middle;
          middle=num/2;
        if(key<array[0])
          return -1;
        else if(key>array[num-1])
           return -1;
        else if(key==array[middle])
            return middle;
         else if(key<array[middle])
            { 
             for(i=0;i<middle;i++)
                {
                   if(key==array[i])
                      return i;
                }
               return -1;
            } 
          else if(key>array[middle])
            { 
             for(i=middle+1;i<num;i++)
                {
                   if(key==array[i])
                      return i;
                }
               return -1;
            } 
           else
             return -1;
      }
    
}

/*
 SAMPLE I/O :

aswin-HP-Pavilion-Laptop-15-cs2xxx:~/Desktop/java/programs/1b$ java linear_binary
enter how many numbers your are going to give : 5
enter number 1 : 1
enter number 2 : 2
enter number 3 : 3
enter number 4 : 5
enter number 5 : 7
1-linear search
2-binary search
enter choice : 1
enter key : 3
 number 1 : 1
 number 2 : 2
 number 3 : 3
 number 4 : 5
 number 5 : 7
position of the given number is :3
aswin@aswin-HP-Pavilion-Laptop-15-cs2xxx:~/Desktop/java/programs/1b$ java linear_binary
enter how many numbers your are going to give : 5
enter number 1 : 4
enter number 2 : 8
enter number 3 : 9
enter number 4 : 0
enter number 5 : 4
1-linear search
2-binary search
enter choice : 2
enter key : 0
 number 1 : 0
 number 2 : 4
 number 3 : 4
 number 4 : 8
 number 5 : 9
position of the given number is :1



  
*/

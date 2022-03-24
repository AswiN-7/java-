class sumofn
{public static void main(String args[])
 {
  int i,sum=0;
   int num=Integer.parseInt(args[0]);
   for(i=1;i<=num;i++)
    sum+=i;
     
   System.out.println("sum of given number "+num+" is "+sum );
  } 
}
 

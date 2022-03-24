class factorial
{public static void main(String args[])
  {
   int i,factorial=1;
   int num=Integer.parseInt(args[0]);
   for(i=2;i<=num;i++)
    factorial*=i;
     
   System.out.println("factorial of given number "+num+" is "+factorial );
  } 
}

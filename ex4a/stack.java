import java.util.*;

interface AdtStack
{
 void maximumSize();
 boolean isFull();
 boolean isEmpty();
 void push(char element);
 char pop();
 char peep(int position);
}

class Stack implements AdtStack
{
 int size=15,top=-1,capacity=15,temp=-1;
  
 public void maximumSize()
  {
   size=15;
  }
  
 char[] array=new char[15];
 public boolean isFull()
 {
  return top==capacity;
 }
 public boolean isEmpty()
 {
  return top==-1;
 }
 public void push(char element)
 {      
     if(!isFull())
     {
       array[++top]=element;
     }
 
 }
 public char pop()
 {
       return array[top--];
 }
 public char peep(int position)
 {
   return array[position];
 }
}

class stack
{
  static Scanner input=new Scanner(System.in);
  public static void main(String[] args)
  {
    String exp,exp1,exp2;
    int result1,result2,again,choice;
    while(true)
    {
     System.out.print("1--checking expression\n2--two stack cheking\nenter :  ");
     choice=input.nextInt();
      if(choice==1)
   	{ 		System.out.print("enter expression to check wheather it is balanced or not : ");
    		exp=input.next();
    		result1=check(exp); 
    		if(result1==1)
      			System.out.println("given expression perfectly balanced !");
   		 else
     			 System.out.println("given is not balanced expression ");
   }   
     else if(choice==2)
     {
      System.out.print("enter expression 1: ");
      		exp1=input.next();
      System.out.print("enter expression 2: ");
    		exp2=input.next();
       result2=checktwostacks(exp1,exp2);
       if(result2==-1)
             System.out.println("they are different ");
       else if(result2==1)
               System.out.println("given two expressions are same");
        else if(result2==0)
               System.out.println("length is same but they have different elements ");
     }  
    System.out.print("if you want to continue with others inputs press 1 : ");
         again=input.nextInt();
         if(again!=1)
            break;
    }
  }
  static int  check(String exp)
  {
   Stack s=new Stack();
   
    int i;
    char temp;
   
   for(i=0;i<exp.length();i++)
   { 
     if(exp.charAt(i)=='['||exp.charAt(i)=='{'||exp.charAt(i)=='(')
     {
    
       s.push(exp.charAt(i));
    }
     else if(exp.charAt(i)==']'||exp.charAt(i)=='}'||exp.charAt(i)==')')
     {
        if(s.isEmpty())//if  stack  has no element then it is inbalanced
          return -1;
        temp=s.pop();
        
       if((temp=='['&&exp.charAt(i)!=']')||(temp=='{'&&exp.charAt(i)!='}')||(temp=='('&&exp.charAt(i)!=')'))//checking for correct pranthesis
       { 
           return -1; 
        }
     }
     
   }
   if(s.isEmpty())
     return 1;
   return 1;
  }

  static int  checktwostacks(String exp1,String exp2)
  {
   Stack s1=new Stack();
   Stack s2=new Stack();
   int i,len1,len2;
   char temp1,temp2;
  len1=exp1.length();
  len2=exp2.length();
  if(len1!=len2)
  	{
             return -1;
        }
   else 
        {
          for(i=0;i<len1;i++)
           {
              s1.push(exp1.charAt(i));
              s2.push(exp2.charAt(i));
           }
           while(!s1.isEmpty())
                {
                  temp1=s1.pop();
                  temp2=s2.pop();
                  if(temp1!=temp2)
                     return 0; 
                  else if(temp1==temp2&&s1.top==0)
                       return 1;
                  
                 }
             return 0;
              
             
        }
                  
  }
  

  
}
/*
SAMPLE I/O:

1--checking expression
2--two stack cheking
enter :  2
enter expression 1: 154
enter expression 2: 123
length is same but they have different elements 
if you want to continue with others inputs press 1 : 1
1--checking expression
2--two stack cheking
enter :  1
enter expression to check wheather it is balanced or not : ((2+3){8*9})
given expression perfectly balanced !
if you want to continue with others inputs press 1 : 1
1--checking expression
2--two stack cheking
enter :  2
enter expression 1: 123
enter expression 2: 123
given two expressions are same
if you want to continue with others inputs press 1 :2

*/

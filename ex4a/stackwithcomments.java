import java.util.*;

interface AdtStack
{
 void maximumSize();
 boolean isFull();
 boolean isEmpty();
 void push(char element);
 char pop();
 char peep();
}

class Stack implements AdtStack
{
 int size=15,top=-1,capacity=15;
  
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
       System.out.println("array top element : "+array[top]+"index "+top);
     }
 
 }
 public char pop()
 {
       return array[top--];
 }
 public char peep()
 {
   return array[top];
 }
}

class stack
{
  static Scanner input=new Scanner(System.in);
  public static void main(String[] args)
  {
    String exp;int result;
    System.out.print("enter expression to check wheather it is balanced or not : ");
    exp=input.next();
    result=check(exp); 
    if(result==1)
      System.out.println("given expression perfectly balanced !");
    else
      System.out.println("given is not balanced expression ");
  }
  static int  check(String exp)
  {
   Stack s=new Stack();
   
    int i;
    char temp;
    System.out.println(exp.length()+" len ");
    
   for(i=0;i<exp.length();i++)
   { System.out.println(" "+exp.charAt(i)+"  "+i);
     if(exp.charAt(i)=='['||exp.charAt(i)=='{'||exp.charAt(i)=='(')
     {
      System.out.println(exp.charAt(i)+" push ");
       s.push(exp.charAt(i));
       System.out.println("after push");
     }
     else if(exp.charAt(i)==']'||exp.charAt(i)=='}'||exp.charAt(i)==')')
     {
        System.out.println("	"+exp.charAt(i)+" pop "); 
        if(s.isEmpty())
          return -1;
        temp=s.pop();
        
         System.out.println("	"+temp+" temp "); 
       if((temp=='['&&exp.charAt(i)!=']')||(temp=='{'&&exp.charAt(i)!='}')||(temp=='('&&exp.charAt(i)!=')'))
       {  System.out.println("in pop ");
           return -1; 
        }
     }
     
   }
   System.out.println("finall stack ");
   if(s.isEmpty())
     return 1;
   return 1;
  }
}



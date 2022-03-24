import java.util.*;
class stack<T>
{
  T[] array;
  int top=-1;
  int capacity=15;
	    stack(T[] array)
	    {
	      this.array=array;
	    }
            boolean isFull()
            {
                 return top==capacity;
            }
            boolean isEmpty()
 	    {
                return top==-1;
            }
            void push(T element)
            {
               if(!isFull())
                array[++top]=element;
               else 
                 System.out.println("Stack full");
            }
            T pop()
            {
                if(isEmpty())
 		  return null;
                 return array[top--];
            } 
 

}

class generices
{
 public static void main(String[] args)
 {
  Scanner inp=new Scanner(System.in);
   while(true)
    {
        int choice,again;
        System.out.print("1 --INTEGER\n2 --FLOAT\n3 --STRING\nenter your choice : ");
        choice=inp.nextInt();
        
        if(choice==1)
        {
  		Integer[] array=new Integer[5];
                stack<Integer>s=new stack<Integer>(array);
 		
		while(1>0)
		 {
		      int option,temp;
		      System.out.print("1 --push\n2 --pop\n-1 --stop\nenter your choice : ");
		           option=inp.nextInt();
	 	      if(option==1)
		      {
		       		System.out.print("enter element to be pushed : ");
			  	temp=inp.nextInt();
		       		s.push(temp);
		      }
		       else if(option==2)
		        {
	 	      		System.out.println("element : "+s.pop());
		        }
 			else if(option==-1)
				break;
		         
		 }

        }
        else if(choice==3)
        {
  			String[] array=new String[5];
        		stack<String>s=new stack<String>(array);
			while(1>0)
		 {
		      int option;
		       String temp;
		      System.out.print("1 --push\n2 --pop\n-1 --stop\nenter your choice : ");
		           option=inp.nextInt();
	 	      if(option==1)
		      {
		       		System.out.print("enter element to be pushed : ");
			  	temp=inp.next();
		       		s.push(temp);
		      }
		       else if(option==2)
		        {
	 	      		System.out.println("element : "+s.pop());
		        }
 			else if(option==-1)
				break;
		         
		 }

        }
        else if(choice==2)
        {
                 Float[] array=new Float[5];
        		stack<Float>s=new stack<Float>(array);
			while(1>0)
		        {
		      int option;
		       Float	temp;
		      System.out.print("1 --push\n2 --pop\n-1 --stop\nenter your choice : ");
		           option=inp.nextInt();
	 	      if(option==1)
		      {
		       		System.out.print("enter element to be pushed : ");
			  	temp=inp.nextFloat();
		       		s.push(temp);
		      }
		       else if(option==2)
		        { 
	 	      		System.out.println("element : "+s.pop());
		        }
 			else if(option==-1)
				break;
		         
		 }
        }
  	System.out.print("do you want to continue with other operations press 1");
           again=inp.nextInt();
	if(again!=1)
		break;
    }

       }
}


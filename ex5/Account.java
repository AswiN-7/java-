import java.util.*;
class PANRequiredException extends Exception
{
  PANRequiredException()
  {
   
  }
}

class MinBalRequiredException extends Exception
{
  MinBalRequiredException()
  { 
  }
}
class AccountNotFoundException extends Exception
{
  AccountNotFoundException(long x)
  {
   System.out.print("AccountNotFoundException :"+x);
  }
}
class PANFormatMismatchException extends Exception
{
    PANFormatMismatchException(String x)
    {
      super(x);
   }
    
 
}
class BranchNotFoundException extends Exception
{
  BranchNotFoundException(String x)
  {
   super(x);
  }
}
class NotEnougMoneyInAccountException extends Exception
{
  NotEnougMoneyInAccountException()
  {
  }
}


class Account
{
     static  Scanner input=new Scanner(System.in);
  public static void main(String[] args)
  {
   String name,branch,pan_num;
   long acct_num;
   float balance;
   Account a=new Account();
   String[] branchname={"chennai","adayar"};
   int i,choice;
   long[] arract={123456789012l,19876543210987l,123459876019l,678901234512l,12l};
   System.out.print("enter name : ");
   		name=input.next();
   System.out.print("enter  Branch : ");
                 branch=input.next();
 try{
       for(i=0;i<branchname.length;i++)
       		{
         		if(branchname[i].equals(branch))
           			break;
         		else if(i==branchname.length-1)
                            throw new   BranchNotFoundException(branch);
     		} 
       
      
     System.out.print("enter account number : ");
        acct_num=input.nextLong();
 
              	for(i=0;i<arract.length;i++)
       		{
         		if(arract[i]==acct_num)
           			break;
         		else if(i==arract.length-1)
             			throw new  AccountNotFoundException(acct_num);
     		}
 
                System.out.print("1--deposit\n2--withdraw\nenter choice : ");
                choice=input.nextInt();
                if(choice==1)
            		deposit();
                else if(choice==2)
            		withdrawal();
                else
                   System.out.println("enter correct choice ");
           }
    	   catch(BranchNotFoundException e)
   		{
    			System.out.println(e+" is not found ");
   		}
           catch(AccountNotFoundException e)
           	{
             		System.out.println(" this number not found in our's account list  ");               
             	}
           catch(PANFormatMismatchException m)
           	{
                          System.out.println(m+" is not in correct format");
           	}
      
        catch(NotEnougMoneyInAccountException e)
		{
	                  System.out.println("not enough money ");
		}
         catch(MinBalRequiredException e)
		{
                	   System.out.println("minimum should maintain in account so you can't take that much ammount\nminimum balance is atleast 1000");
	         }

  }
  static void deposit() throws PANFormatMismatchException
  {
    float money;
     String pan_number;
    System.out.print("enter money :");
     money=input.nextFloat();
 			try
   			{
   		      		if(money>25000)
   	           		throw new PANRequiredException();
   			}
   catch(PANRequiredException e)
			   {
            			System.out.print(e+ " money is greater than 25,000 so enter pan number :");
             			pan_number=input.next();
             			if(!(pan_number.matches("[a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][0-9][0-9][0-9][0-9][a-zA-Z]")))
                               	{
                                                  throw new PANFormatMismatchException(pan_number);
                                 }
                          }
                  System.out.println("money deposited");
   
  }
  static void withdrawal() throws NotEnougMoneyInAccountException,MinBalRequiredException
  {
   float balance,wdmoney;
   System.out.print("enter balance :");
           balance=input.nextFloat();
    System.out.print("enter money to withdraw :");
           wdmoney=input.nextInt();
    
       if(balance-wdmoney<1000)
           throw new MinBalRequiredException();
       else if(wdmoney>balance)
           throw new NotEnougMoneyInAccountException();
               System.out.println("collect money ");
   
  }


}


/*
  SAMPLE I/O:
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex5$ java Account
enter name : aswin
enter  Branch : adayar
enter account number : 123456789012
1--deposit
2--withdraw
enter choice : 1
enter money :234561
PANRequiredException money is greater than 25,000 so enter pan number :aswin1234N
money deposited
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex5$ java Account
enter name : arthick
enter  Branch : chennai
enter account number : 19876543210987
1--deposit
2--withdraw
enter choice : 2
enter balance :5000 
enter money to withdraw :3000
collect money 

*/

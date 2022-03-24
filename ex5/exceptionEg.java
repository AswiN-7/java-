import java.util.*;
class MinorityCitizenship extends Exception
{
   MinorityCitizenship(String x)
   {
     super(x);
   }
}
class Person
{
 String name;
 String age;
 String aadhar;
  int tmpvar;
 void assignInput(String name,String age,String aadhar) throws MinorityCitizenship,NullPointerException,NumberFormatException
 {
      
  this.name=name;
  for(int i=0;i<age.length();i++)
      {
              tmpvar=age.charAt(i);
              if(!(tmpvar>47)||!(tmpvar<58))
                  throw new NumberFormatException();
          }
  this.age=age;
  this.aadhar=aadhar;
  canVote();
  hasAadhar();
 }
 void canVote() throws MinorityCitizenship
 
  {
   if(age.matches("^[0-1][0-7]$"))
     throw new MinorityCitizenship(name);
      
  }
  void hasAadhar() throws NullPointerException
  {int len=aadhar.length();
    int temp;
   if(len!=12)
   {
     throw new NullPointerException();
   }
   else 
     {for(int i=0;i<len;i++)
         
          {
              temp=aadhar.charAt(i);
              if(!(temp>47)||!(temp<58))
                  throw new NullPointerException();
          }
      }  
  }
}

class exception 
{ 
  static Scanner input=new Scanner(System.in);
  static int countp;
 public static void main(String[] args)
 {
  int size;
  System.out.print("enter how many persons  you are going to give : ");
  size=input.nextInt();
  Person[] p=new Person[size];
  try{input_fun(p,size);}
  catch(MinorityCitizenship e)
  {
   System.out.println("person can't vote util reching 18\n"+e);
   
  }
  catch(NullPointerException e)
  {
   System.out.println("aadhar number is invalid  \n"+e);
    
  }
  catch(NumberFormatException e)
   {
     System.out.println("age should in integer \n "+e);
   }

  output_fun(p);
   
 } 
 static void input_fun(Person[] p,int size) throws MinorityCitizenship,NullPointerException,NumberFormatException
 {
  String name,age,aadhar;
    for(int i=0;i<size;i++)
   {
  System.out.print("enter name Person "+(i+1)+" :");
  	name=input.next();
  System.out.print("enter age  : ");
        age=input.next();
  System.out.print("enter aadhar number : ");
        aadhar=input.next();
   System.out.println();
   p[countp]=new Person();
   p[countp].assignInput(name,age,aadhar);  
   countp++;    
   }
 }

 static void output_fun(Person[] p)
 {
  for(int i=0;i<countp;i++)
  {
    System.out.print("\nname             :"+p[i].name);
    System.out.print("\nage              :"+p[i].age);
    System.out.println("\naadhar number    :"+p[i].aadhar);
  }       
 }
 
}

/*
SAMPLE I/O:
enter how many persons  you are going to give : 3
enter name Person 1 :as
enter age  : 19
enter aadhar number : 123456789012

enter name Person 2 :asw
enter age  : 18
enter aadhar number : 123456789012

enter name Person 3 :aswi
enter age  : 28
enter aadhar number : 12

aadhar number is invalid 

name             :as
age              :19
aadhar number    :123456789012

name             :asw
age              :18
aadhar number    :123456789012

*/

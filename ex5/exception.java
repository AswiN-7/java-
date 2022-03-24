import java.util.*;
class Person
{
 String name;
 string age;
 String aadhar;
 void getInput(String name,String age,String aadhar)
 {
      
  this.name=name;
  for(int i=0;i<age.length();i++)
  {
    if()
  }
  try{this.age=age;}
  catch(NumberFormatException e)
        {
      System.out.println("age is integer but assigning to DIFFERENT format ");
        }
  try{this.aadhar=aadhar;}
  catch(NullPoinrtException e)
 {
      System.out.println("invalid aadhar number ");
 }
  
 }
 int canVote()
 {
  
  return age;
 }
 int hasAadhar()
 {
  if(aadhar<=100000000000l&&aadhar>=999999999999l)
   return 1;
  return 0;
 }
 
}

class exception 
{ static Scanner input=new Scanner(System.in);
  static int countp;
 public static void main(String[] args)
 {
  int size;
  System.out.print("enter how many persons  you are going to give");
  size=input.nextInt();
  Person[] p=new Person[size];
  input_fun(p);
   
 } 
 static void input_fun(Person[] p)
 {
  String name,age,aadhar;
  System.out.print("enter name :");
  	name=input.next();
  System.out.print("enter age  : ");
        age=input.next();
  System.out.print("enter aadhar number : ");
        aadhar=input.next();
  
 }

 static void output_fun(Person[] p)
 {
  for(int i=0;i<countp;i++)
  {
    System.out.print("name             :"+p[i].name);
    System.out.print("age           : "+p[i].age);
    System.out.print("aadhar number : "+p[i].aadhar);
  }       
 }
 
}

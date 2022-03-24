import java.util.*;
class Person
{
  String name,dob,address;
  int age;
  void assign_inp(String name,String dob,String address,int age)
  {
    this.name=name;
    this.dob=dob;
    this.address=address;
    this.age=age;

  }
 
}

class Student extends Person
{
  String dept,performance;
  double mark;int exca;
  void set_inp(String name,String dob,String address,int age,String dept,int exca,double mark)
  {
  assign_inp(name,dob,address,age);
  this.dept=dept;
  this.mark=mark;
  this.exca=exca;
   cal_per();
  }
 void cal_per()
  {
   if(mark>=9)
     {if(exca>=3)
         performance="outstanding";
       else
         performance="Excellent";
     }
    else if(mark>=7&&mark<=8.9)
      {if(exca>3)
         performance="Excellent";
       else
         performance="good";
        
      }
   else if(mark>=6&&mark<=6.9)
       {if(exca>3)
         performance="good";
        else
          performance="fair";
     
       }
    else
      performance="fair";
  }
}
class Professor extends Person
{
  String dept,performance;
  int nop,fp;
   void set_inp(String name,String dob,String address,int age,String dept,int nop,int fp)
    {
      assign_inp(name,dob,address,age);
         this.dept=dept;
         this.nop=nop;
         this.fp=fp;
         cal_per();
    }

  void cal_per()
  {
   if(nop>=9)
     {if(fp>=3)
         performance="outstanding";
       else
         performance="Excellent";
     }
    else if(nop>=7&&nop<=8)
      {if(fp>3)
         performance="Excellent";
       else
         performance="good";
        
      }
   else if(nop>=5&&nop<=6)
       {if(fp>3)
         performance="good";
        else
          performance="fair";
     
       }
    else
      performance="fair";
  }
  

      
}

class person_detials
{
  static Scanner input=new Scanner(System.in);
  static int counts,countp; 
 public static void main(String[] args)
 {
  int total,choice;
  System.out.print("enter how many person detials you are going to give : ");
  total=input.nextInt();
  Student[] s=new Student[total];
  Professor[] p=new Professor[total];
   for(int i=0;i<total;i++)
   {
    System.out.print("\t1--Professor\n\t2--Student\nenter designation : ");
    choice=input.nextInt();
    if(choice==2)
     input_fun(s);
    else if(choice==1)
      input_fun(p);
    }
   output_fun(s,p);
 }
  static void input_fun(Student[] s)
  {
   String dept,name,dob,address;
   double mark;
   int exca,age;
     
  
   System.out.print("enter name of student "+(counts+1)+": ");
   name=input.next();
   System.out.print("enter department : ");
   dept=input.next();
   System.out.print("enter date of birth : ");
   dob=input.next();
   System.out.print("enter age : ");
   age=input.nextInt();
   System.out.print("enter mark (CGPA): ");
   mark=input.nextDouble();
   System.out.print("enter how extra curricular activities "+name+" involved : ");
   exca=input.nextInt();
   System.out.print("enter address : ");
   address=input.next();
   s[counts]=new Student();
   s[counts].set_inp(name, dob, address, age, dept, exca, mark);
   counts++;
   
   
  }
  
  static void input_fun(Professor[] p)
  {
   String dept,name,dob,address;
   int fp,nop,age;
     
  
   System.out.print("enter name of professor "+(counts+1)+": ");
   name=input.next();
   System.out.print("enter department : ");
   dept=input.next();
   System.out.print("enter date of birth : ");
   dob=input.next();
   System.out.print("enter age : ");
   age=input.nextInt();
   System.out.print("enter number of publication "+name+" done : ");
   nop=input.nextInt();
   System.out.print("enter how many internal funded  "+name+" involved : ");
   fp=input.nextInt();
   System.out.print("enter address : ");
   address=input.next();
   p[countp]=new Professor();
   p[countp].set_inp(name,dob,address,age,dept,nop,fp);
   countp++;
   
   
  }
  static void output_fun(Student[] s,Professor[] p)
  {
     
      for(int i=0;i<counts;i++)
     {
        if(i==0)
         { if(counts>1)
           System.out.println("------>STUDENTS<--------");
       else
           System.out.println("------>STUDENT<--------");
         }  
      System.out.println("name of the student : "+s[i].name+"\ndepartment :"+s[i].dept+"\ndate of birth : "+s[i].dob+"\nage : "+s[i].age+"\nmark : "+s[i].mark+"\nno.of extra curricular activities involved :"+s[i].exca+"\naddress :"+s[i].address+"\nperformance: "+s[i].performance);
     }
            
       for(int i=0;i<countp;i++)
     {
        if(i==0)
         { if(countp>1)
           System.out.println("------>PROFESSORS<--------");
       else
           System.out.println("------>PROFESSOR<--------");
         }  
      System.out.println("name of the professor : "+p[i].name+"\ndepartment :"+p[i].dept+"\ndate of birth : "+p[i].dob+"\nage : "+p[i].age+"\nnumber of publication : "+p[i].nop+"\nnumber of funded projects :"+p[i].fp+"\naddress :"+p[i].address+"\nperformance: "+p[i].performance);
     }
            
    
  }
}

/*SAMPLE I/O:
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/programs/2a$ java person_detials
enter how many person detials you are going to give : 3
	1--Professor
	2--Student
enter designation : 1
enter name of professor 1: Ramesh            
enter department : IT    
enter date of birth : 04/07/1970
enter age : 49
enter number of publication Ramesh done : 7
enter how many internal funded  Ramesh involved : 5
enter address : CHENNAI
	1--Professor
	2--Student
enter designation : 2
enter name of student 1: Vijay    
enter department : CSE
enter date of birth : 03/07/2000 
enter age : 19
enter mark (CGPA): 8.4
enter how extra curricular activities Vijay involved : 5
enter address : kalavakkam
	1--Professor
	2--Student
enter designation : 2
enter name of student 2: Aswin
enter department : BME
enter date of birth : 02/10/2000
enter age : 18
enter mark (CGPA): 8.6
enter how extra curricular activities Aswin involved : 4
enter address : Neikuppai
------>STUDENTS<--------
name of the student : Vijay
department :CSE
date of birth : 03/07/2000
age : 19
mark : 8.4
no.of extra curricular activities involved :5
address :kalavakkam
performance: Excellent
name of the student : Aswin
department :BME
date of birth : 02/10/2000
age : 18
mark : 8.6
no.of extra curricular activities involved :4
address :Neikuppai
performance: Excellent
------>PROFESSOR<--------
name of the professor : Ramesh
department :IT
date of birth : 04/07/1970
age : 49
number of publication : 7
number of funded projects :5
address :CHENNAI
performance: Excellent

*/

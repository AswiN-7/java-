import java.util.*;
 
interface Student
{
 float[] getMarks();
 float calcGPA();
	int a=9;
 static void ads()
	{
		System.out.println("hi");
	}
}

class Person
{
 private String name,address;
 public Person(String name,String address)
 {
  this.name=name;
  this.address=address;
 }
 public String getName()
 {
  return name;
 }
 public String getAddress()
 {
  return address;
 }
 public void setAddress(String address)
 {
  this.address=address; 
 }
 
}

class Employee extends Person
{
 private String empid,dept;
 private int basic;
 public Employee(String name,String address,String empid,String dept,int basic)
 {
  super(name,address);
  this.empid=empid;
  this.dept=dept;
  this.basic=basic;
 }
 public String getEmpid()
 {
  return empid;
 }
 public String getDept()
 {
  return dept;
 }
 public int getBasic()
 {
  return basic;
 }
 public void setBasic(int basic)
 {
  this.basic=basic;
 }
 public void setDept(String dept)
 {
  this.dept=dept;
 }
 float calSalary()
 {
   return basic*2;
 }
}
 
class Faculty extends Employee
{
 private String designation,course;
 public Faculty(String name,String address,String empid,String dept,int basic,String desig,String course)
 {
  super(name,address,empid,dept,basic);
   designation=desig;
   this.course=course;
 }  
 public String getDesig()
 {
  return designation;
 }
 public String getCourse()
 {
  return course;
 }
 public void setDesig(String desig)
 {
  designation=desig;
 }
 public void setCourse()
 {
  this.course=course;
 }
 public float calSalary()
 {
  return getBasic()*3;
 }
}

class TeachingAssistant extends Employee implements Student
{
 private String project,course;
 float[] marks=new float[5];

 public TeachingAssistant(String name,String address,String empid,String dept,int basic,String project,String course,float[] marks)
 {
  super(name,address,empid,dept,basic);
  this.project=project;
  this.course=course;
  for(int i=0;i<5;i++)
      this.marks[i]=marks[i];
 }
 public float[] getMarks()
 {
  return marks;
 }
 public float calcGPA()
 {
   int temp=0;
   for(int i=0;i<5;i++)
   temp+=marks[i];
   return temp/50;
 }
 public String getProject()
 {
    return project;  
 }
 public String getCourse()
 {
    return course;
 }
 public void setCourse()
 {
   this.course=course;
 }
 public float calSalary() 
 {
   return getBasic()*4;
 }
}

class testInterface
{ static int countta,countf;
  static Scanner input=new Scanner(System.in);
 public static void main(String[] args)
 {
   int choice,size;
    System.out.print("enter how many person detials you are going to give : ");
    size=input.nextInt();
   Faculty[] f=new Faculty[size];
   TeachingAssistant[] ta=new TeachingAssistant[size];
   for(int i=0;i<size;i++)
   {
    System.out.print("1-faclty\n2-TeachingAssistant\nenter your choice : ");
    choice=input.nextInt(); 
    if(choice==1)
      input_fun(f);
    else if(choice==2)
       input_fun(ta);
   }
   output(f,ta);
  
 }
 static void input_fun(Faculty[] f)
 {
   String name,address,empid,dept,course,desig;
   int  basic;
   System.out.print("enter name : ");
  	 name=input.next();
   System.out.print("enter address : ");
  	 address=input.next();
   System.out.print("enter empid : ");
  	 empid=input.next();
   System.out.print("enter department : ");
  	 dept=input.next();
   System.out.print("enter course : ");
  	 course=input.next();
   System.out.print("enter designation : ");
  	 desig=input.next();
   System.out.print("enter basic pay : ");
  	 basic=input.nextInt();
   f[countf]=new Faculty(name,address,empid,dept,basic,desig,course);
   countf++;
 }
 
 static void input_fun(TeachingAssistant[] ta)
 {
   String name,address,empid,dept,course,project;
   int  basic;
   float[] marks=new float[5];

   System.out.print("enter name : ");
  	 name=input.next();
   System.out.print("enter address : ");
  	 address=input.next();
   System.out.print("enter empid : ");
  	 empid=input.next();
   System.out.print("enter department : ");
  	 dept=input.next();
   System.out.print("enter course : ");
  	 course=input.next();
   System.out.print("enter project : ");
  	 project=input.next();
   System.out.print("enter basic pay : ");
  	 basic=input.nextInt();
   for(int i=0;i<5;i++)
    {
     System.out.print("enter mark["+(i+1)+"] : ");
     marks[i]=input.nextFloat();
    }
   ta[countta]=new TeachingAssistant(name,address,empid,dept,basic,project,course,marks);
    countta++;
  }
  static void output(Faculty[] f,TeachingAssistant[] ta)
  {
  
  for(int i=0;i<countf;i++)
    {
    System.out.println("\nNAME : "+f[i].getName()+"\nADDRESS : "+f[i].getAddress()+"\nEMPID : "+f[i].getEmpid()+"\nDEPARTMENT : "+f[i].getDept()+"\nCOURSE :  "+f[i].getCourse()+"\nDESIGNATION : "+f[i].getDesig()+"\nBASIC PAY : "+f[i].getBasic()+"\nSALARY : "+f[i].calSalary());
    }  
    for(int i=0;i<countta;i++)
    {
    System.out.print("NAME : "+ta[i].getName()+"\nADDRESS : "+ta[i].getAddress()+"\nEMPID : "+ta[i].getEmpid()+"\nDEPARTMENT : "+ta[i].getDept()+"\nCOURSE :  "+ta[i].getCourse()+"\nPROJECT : "+ta[i].getProject()+"\nBASIC PAY : "+ta[i].getBasic()+"\nSALARY : "+ta[i].calSalary());
   System.out.print("\nMARKS : ");
   for(int j=0;j<5;j++)
           System.out.print("	"+ta[i].marks[j]);
     
       System.out.println("GPA : "+ta[i].calcGPA());
  } 
   

  }
}

/*SAMPLE I/O : 
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex4b$ java PersonDetials
enter how many person detials you are going to give : 2
1-faclty
2-TeachingAssistant
enter your choice : 1
enter name : dharshan            
enter address : 19/66
enter empid : 17
enter department : cse
enter course : python
enter designation : professor
enter basic pay : 100000
1-faclty
2-TeachingAssistant
enter your choice : 2
enter name : aswin
enter address : 00/00
enter empid : 0
enter department : cse
enter course : python
enter project : chandrayan
enter basic pay : 10
enter mark[1] : 12
enter mark[2] : 43
enter mark[3] : 56
enter mark[4] : 76
enter mark[5] : 78

NAME : dharshan
ADDRESS : 19/66
EMPID : 17
DEPARTMENT : cse
COURSE :  python
DESIGNATION : professor
BASIC PAY : 100000
SALARY : 300000.0
NAME : aswin
ADDRESS : 00/00
EMPID : 0
DEPARTMENT : cse
COURSE :  python
PROJECT : chandrayan
BASIC PAY : 10
SALARY : 40.0
MARKS : 	12.0	43.0	56.0	76.0	78.0
GPA : 5.0

*/

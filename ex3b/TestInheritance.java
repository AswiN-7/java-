import java.util.*;
class Person
{
 private long aadhaar;
 private String name,address;
 private String gender;
 public Person(long aadhaar,String name,String address,String gender)
  {
   this.aadhaar=aadhaar;
   this.name=name;
   this.address=address;
   this.gender=gender;
  } 
 public String getName()
  { 
    return name;
  }
  public long getAadhaar()
  {
   return aadhaar;
  }
  public String getAddress()
  {
   return address;
  }
  public void setAddress(String address)
  {
   this.address=address;
  }
  public String getGender()
  {
   return gender;
  }
}

class Student extends Person
{
 private String program;
 private int year;
 private float totalmark;
 public Student(long aadhaar,String name,String address,String gender,String program,int year,float totalmark)
 {
   super(aadhaar,name,address,gender);
   this.program=program;
   this.year=year;
   this.totalmark=totalmark;
   
 }
 public String getProgram()
 {
   return program;
 }
 public int getYear()
 {
  return year;
 }
 public void setYear(int year)
  {
   this.year=year;
  }
 public float getTotal()
  {
   return totalmark;
  }
 public float calGpa()
 {
   return totalmark/10;
 }
 public String getCourse()
 {
   return program;
 }
}
class Faculty extends Person
{
private String designation,department;
private float basic_pay,gross_salary,deductions,net_salary,da,pf,hra,mi;
public Faculty(long aadhaar,String name,String address,String gender,String designation,String department,float basic_pay)
{
  super(aadhaar,name,address,gender);
  this.designation=designation;
  this.department=department;
  this.basic_pay=basic_pay;
 da=basic_pay*0.6f;
 mi=basic_pay*0.085f;
 hra=basic_pay*0.1f;
 pf=basic_pay*0.08f;
 gross_salary=basic_pay+da+hra;
  deductions=mi+pf;
  
}
public String getDesig()
 {
   return designation;  
 }
 public void setDesig(String designation)
 {
   this.designation=designation;
 }
 public String getDept()
 {
   return department;
 }
 public void setBasic(float basic)
 {
 basic_pay=basic;
 } 
 public float getBasic()
 {
  return basic_pay;
 }
 public float calSalary()
 {
 net_salary=gross_salary-deductions;
  
  return net_salary;
 }
} 

class TestInheritance
 {
  static Scanner input=new Scanner(System.in); 
  static int counts,countf;
  public static  void main(String[] args)
  {
    int choice,total;
    System.out.print("enter how many person detials you are going to give     : ");
       total=input.nextInt();
     
      Student[] s=new Student[total];
      Faculty[] f=new Faculty[total];
    for(int i=0;i<total;i++)
    {
      System.out.print("1--Student\n2--faculty\nenter      : ");
      choice=input.nextInt();
      if(choice==1)
        input_fun(s);
      else if(choice==2)
       input_fun(f);
    }
    output_fun(f,s);
 }
   static void input_fun(Student[] s)
   {
     int year;long aadhaar;
    
     String name,address,program;
     String gender;
     float totalmark;
     System.out.print("enter name of student "+(counts+1)+"     : ");
     name=input.next();
    System.out.print("enter aadhaar number     : ");
     aadhaar=input.nextLong();
      System.out.print("enter year     : ");
    year=input.nextInt();
     System.out.print("enter gender     : ");
    gender=input.next();
     System.out.print("enter course     : ");
    program=input.next();
   System.out.print("enter total marks     : ");
   totalmark=input.nextFloat();
   System.out.print("enter address     : ");
    address=input.next();
  
   s[counts]=new Student( aadhaar, name, address, gender, program,year, totalmark);
    counts++;
      
   }
  static void input_fun(Faculty[] f)
   {
     long aadhaar;int year;
     String name,address,designation,department;
     String gender;
     float basic_pay;
     System.out.print("enter name of Faculty "+(countf+1)+"     : ");
     name=input.next();
    System.out.print("enter aadhaar number     : ");
     aadhaar=input.nextLong();
     System.out.print("enter gender     : ");
    gender=input.next();
     System.out.print("enter desination     : ");
    designation=input.next();
    System.out.print("enter department     : ");
     department=input.next();
   System.out.print("enter basic pay     : ");
   basic_pay=input.nextFloat();
   System.out.print("enter address     : ");
   address=input.next();
   f[countf]=new Faculty( aadhaar, name, address, gender,designation,department,basic_pay);
    countf++;
   
}
 static void output_fun(Faculty[] f, Student[] s)
{
   for(int i=0;i<counts;i++)
  {
     if(i==0)
     {
      if(counts>1)
       System.out.println("- --- ----STUDENTS--- -- -");
      else
         System.out.println("- --- ----STUDENT--- -- -"); 
     }
     System.out.println("name  :		"+s[i].getName()+"\nAadhaar  :	"+s[i].getAadhaar()+"\nGender  :	"+s[i].getGender()+"\nYear  : "+s[i].getYear()+"\nTaken Course  :	"+s[i].getCourse()+"\nTotal marks  :	"+s[i].getTotal()+"\nAddress  :	"+s[i].getAddress()+"\nGpa  :	"+s[i].calGpa() +"\n\n");
  
  }

   for(int i=0;i<countf;i++)
  {
    if(i==0)
     {
      if(countf>1)
       System.out.println("- --- ---FACULTIES--- -- -");
      else
         System.out.println("- --- ----FACULTY--- -- -"); 
     }
     
    
     System.out.println("name  :		"+f[i].getName()+"\nAadhaar  :	 "+f[i].getAadhaar()+"\n Gender         :	 "+f[i].getGender()+"\nDesignation  :	 "+f[i].getDesig()+"\nDepatment  :	 "+f[i].getDept()+"\nbasic pay  :	 "+f[i].getBasic()+"\nAddress  :	 "+f[i].getAddress()+"\nSalary  :	"+f[i].calSalary()+"\n\n");
  
  }
  
} 
}
/*
SAMPLE I/O :
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/programs/2b$ javac TestInheritance.java 
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/programs/2b$ java TestInheritance
enter how many person detials you are going to give     : 3
1--Student
2--faculty
enter      : 1
enter name of student 1     : mageshwaran
enter aadhaar number     : 212234545665
enter year     : 2
enter gender     : male
enter course     : civil
enter total marks     : 89
enter address     : thondapadi
1--Student
2--faculty
enter      : 2
enter name of Faculty 1     : yuvarai
enter aadhaar number     : 123434556776
enter gender     : male
enter desination     : teacher
enter department     : english
enter basic pay     : 5000
enter address     : padalur
1--Student
2--faculty
enter      : 1
enter name of student 2     : saravakumar
enter aadhaar number     : 1234567765456  
enter year     : 2
enter gender     : male
enter course     : fashion_design
enter total marks     : 91
enter address     : padalur
- --- ----STUDENTS--- -- -
name     :		mageshwaran
Aadhaar     :	212234545665
Gender     :	male
Year     : 2
Taken Course     :	civil
Total marks     :	89.0
Address     :	thondapadi
Gpa         :	8.9


name     :		saravakumar
Aadhaar     :	1234567765456
Gender     :	male
Year     : 2
Taken Course   :	fashion_design
Total marks     :	91.0
Address     :	padalur
Gpa         :	9.1


- --- ----FACULTY--- -- -
name         :		yuvarai
Aadhaar         :	 123434556776
 Gender         :	 male
Designation   :	 teacher
Depatment     :	 english
basic pay     :	 5000.0
Address     :	 padalur
Salary    :	7675.0


*/



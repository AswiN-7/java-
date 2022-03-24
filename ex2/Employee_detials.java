import java.util.*;
class Employee
{
 String  emp_name,emp_address,mail_id;
 long mobile_no;
  Employee(String emp_name,String emp_address,String mail_id,long mobile_no)
    { 
      this.emp_name=emp_name;
      this.emp_address=emp_address;
      this.mail_id=mail_id;
      this.mobile_no=mobile_no;
    }

 
}
class Programmer extends Employee
{
 double basic_pay,da,hra,pf,scf,allowance=2000,gross_sal,deduction,net_sal;
 Programmer(String emp_name,String emp_address,String mail_id,long mobile_no,double basic_pay)
 {
   super(emp_name,emp_address,mail_id,mobile_no);
   this.basic_pay=basic_pay;
   da=basic_pay*0.17;
   hra=basic_pay*0.1;
   pf=basic_pay*0.12;
   scf=basic_pay*0.001;
 }
 void calgross_pay()
   {
     gross_sal=basic_pay+da+hra;
     deduction=pf+scf;
   }
     
   
void calnet_pay()
  {
    net_sal=gross_sal-deduction;
  }
 
}

class AssistantProfessor extends Employee
{
 double basic_pay,da,hra,pf,scf,allowance=5000,gross_sal,deduction,net_sal;
  AssistantProfessor(String emp_name,String emp_address,String mail_id,long mobile_no,double basic_pay)
 {
   super(emp_name,emp_address,mail_id,mobile_no);
   this.basic_pay=basic_pay;
   da=basic_pay*0.17;
   hra=basic_pay*0.1;
   pf=basic_pay*0.12;
   scf=basic_pay*0.001;
 }
 void calgross_pay()
   {
     gross_sal=basic_pay+da+hra;
     deduction=pf+scf;
   }
     
   
void calnet_pay()
  {
    net_sal=gross_sal-deduction;
  }
 
}

class AssociativeProfessor extends Employee
{
 double basic_pay,da,hra,pf,scf,allowance=10000,gross_sal,deduction,net_sal;
  AssociativeProfessor(String emp_name,String emp_address,String mail_id,long mobile_no,double basic_pay)
 {
   super(emp_name,emp_address,mail_id,mobile_no);
   this.basic_pay=basic_pay;
   da=basic_pay*0.17;
   hra=basic_pay*0.1;
   pf=basic_pay*0.12;
   scf=basic_pay*0.001;
 }
 void calgross_pay()
   {
     gross_sal=basic_pay+da+hra;
     deduction=pf+scf;
   }
     
   
void calnet_pay()
  {
    net_sal=gross_sal-deduction;
  }
 
}

class Professor extends Employee
{
 double basic_pay,da,hra,pf,scf,allowance=1500,gross_sal,deduction,net_sal;
 Professor(String emp_name,String emp_address,String mail_id,long mobile_no,double basic_pay)
 {
   super(emp_name,emp_address,mail_id,mobile_no);
   this.basic_pay=basic_pay;
   da=basic_pay*0.17;
   hra=basic_pay*0.1;
   pf=basic_pay*0.12;
   scf=basic_pay*0.001;
 }
 void calgross_pay()
   {
     gross_sal=basic_pay+da+hra;
     deduction=pf+scf;
   }
     
   
void calnet_pay()
  {
    net_sal=gross_sal-deduction;
  }
 
}
 class Employee_detials
{
   static Scanner inp=new Scanner( System.in);
    static  int countp,countap,countasp,countprof;
  public static void main(String[] args)
  {
   int choice,total;
    System.out.print("enter how many employee detials you are going to give : ");
    total=inp.nextInt();
     Programmer[] p=new Programmer[total];
     AssistantProfessor[] ap=new AssistantProfessor[total];
     AssociativeProfessor[] asp=new AssociativeProfessor[total];
     Professor[] prof=new Professor[total];
   for(int i=0;i<total;i++)
   {
    System.out.print("1--Programmer\n2--Assitant professor\n3--assoicative professor\n4--professsor\nenter designation : ");
    choice=inp.nextInt();
   
    if(choice==1)
       input_fun(p);
    else if(choice==2)
         input_fun(ap); 
     else if(choice==3)
         input_fun(asp);         
   else if(choice==4)
         input_fun(prof);

   }
    output(p,ap,asp,prof);               
  }
 static void input_fun(Programmer[] p)
  {
       String emp_name,emp_address,mail_id;
       long mobile_no;
       double basic_pay;
    
       System.out.print("enter name : ");
       emp_name=inp.next();
       System.out.print("enter email id of "+emp_name+" : ");
       mail_id=inp.next();
       System.out.print("enter address : ");
       emp_address=inp.next();
       System.out.print("enter mobile number : ");
       mobile_no=inp.nextLong();
       System.out.print("enter basic pay  : ");
       basic_pay=inp.nextDouble();
       p[countp]=new Programmer(emp_name,emp_address,mail_id,mobile_no,basic_pay);
       p[countp].calgross_pay();
       p[countp].calnet_pay();
       countp++;
        
  }   
 static void input_fun(AssistantProfessor[] ap)
  {
       String emp_name,emp_address,mail_id;
       long mobile_no;
       double basic_pay;
    
       System.out.print("enter name : ");
       emp_name=inp.next();
       System.out.print("enter email id of "+emp_name+" : ");
       mail_id=inp.next();
       System.out.print("enter address : ");
       emp_address=inp.next();
       System.out.print("enter mobile number : ");
       mobile_no=inp.nextLong();
       System.out.print("enter basic pay  : ");
       basic_pay=inp.nextDouble();
       ap[countap]=new AssistantProfessor(emp_name,emp_address,mail_id,mobile_no,basic_pay);
       ap[countap].calgross_pay();
       ap[countap].calnet_pay();     
        countap++;
  }   

  static void input_fun(AssociativeProfessor[] asp)
  {
       String emp_name,emp_address,mail_id;
       long mobile_no;
       double basic_pay;
    
       System.out.print("enter name : ");
       emp_name=inp.next();
       System.out.print("enter email id of "+emp_name+" : ");
       mail_id=inp.next();
       System.out.print("enter address : ");
       emp_address=inp.next();
       System.out.print("enter mobile number : ");
       mobile_no=inp.nextLong();
       System.out.print("enter basic pay  : ");
       basic_pay=inp.nextDouble();
       asp[countasp]=new AssociativeProfessor(emp_name,emp_address,mail_id,mobile_no,basic_pay);
       asp[countasp].calgross_pay();
       asp[countasp].calnet_pay(); 
       countasp++;
  }  
  static void input_fun(Professor[] prof)
  {
       String emp_name,emp_address,mail_id;
       long mobile_no;
       double basic_pay;
    
       System.out.print("enter name : ");
       emp_name=inp.next();
       System.out.print("enter email id of "+emp_name+" : ");
       mail_id=inp.next();
       System.out.print("enter address : ");
       emp_address=inp.next();
       System.out.print("enter mobile number : ");
       mobile_no=inp.nextLong();
       System.out.print("enter basic pay  : ");
       basic_pay=inp.nextDouble();
       prof[countprof]=new Professor(emp_name,emp_address,mail_id,mobile_no,basic_pay);
       prof[countprof].calgross_pay();
       prof[countprof].calnet_pay(); 
       countprof++;
  }  

   static void output(Programmer[] p, AssistantProfessor[] ap, AssociativeProfessor[] asp,Professor[] prof)
   {           
          
              for(int i=0;i<countp;i++) 
               {    if(i==0)
                       System.out.println("\t----PROGRAMMER---"); 
                   
                  System.out.println("               Name : "+p[i].emp_name+"\nMail-ID : "+p[i].mail_id+"\nAddress : "+p[i].emp_address+"\nMobile-No : "+p[i].mobile_no+"\nBasic pay : "+p[i].basic_pay+"\nNet salary : "+p[i].net_sal +"\nGross salary : "+p[i].gross_sal+"\nDeductions : "+p[i].deduction);
            //   static{System.out.println("\t----PROGRAMMER---");}
                                             
               }
           
               for(int i=0;i<countap;i++) 
               {
                   if(i==0)
                       System.out.println("\t----ASSISTANT PROFESSOR---");
                  System.out.println("               Name : "+ap[i].emp_name+"\nMail-ID : "+ap[i].mail_id+"\nAddress : "+ap[i].emp_address+"\nMobile-No : "+ap[i].mobile_no+"\nBasic pay : "+ap[i].basic_pay+"\nNet salary : "+ap[i].net_sal +"\nGross salary : "+ap[i].gross_sal+"\nDeductions : "+ap[i].deduction);
               // static{System.out.println("\t----ASSISTANT PROFESSOR---");}
               }
               for(int i=0;i<countasp;i++) 
               {  
                  if(i==0)
                      System.out.println("\t----ASSOCIATIVE PROFESSOR---"); 
                     
                     
                  System.out.println("               Name : "+asp[i].emp_name+"\nMail-ID : "+asp[i].mail_id+"\nAddress : "+asp[i].emp_address+"\nMobile-No : "+asp[i].mobile_no+"\nBasic pay : "+asp[i].basic_pay+"\nNet salary : "+asp[i].net_sal +"\nGross salary : "+asp[i].gross_sal+"\nDeductions : "+asp[i].deduction);
                //  static{System.out.println("\t----ASSOCIATIVE PROFESSOR---");}                
               }
for(int i=0;i<countprof;i++) 
               {   if(i==0)
                      System.out.println("\t----PROFESSOR---");
               
                  System.out.println("               Name : "+prof[i].emp_name+"\nMail-ID : "+prof[i].mail_id+"\nAddress : "+prof[i].emp_address+"\nMobile-No : "+prof[i].mobile_no+"\nBasic pay : "+prof[i].basic_pay+"\nNet salary : "+prof[i].net_sal +"\nGross salary : "+prof[i].gross_sal+"\nDeductions : "+prof[i].deduction);
                              //    static{System.out.println("\t----PROFESSOR---");}
               }
   }          
}




/*
SAMPLE I/O:
    cs1027@u20:~/Desktop/java_lab/2a$ javac Employee_detials.java 
cs1027@u20:~/Desktop/java_lab/2a$ java Employee_detials
enter how many employee detials you are going to give : 3
1--Programmer
2--Assitant professor
3--assoicative professor
4--professsor
enter designation : 1
enter name : aswin
enter email id of aswin : msaswin37@
enter address : neikuppai
enter mobile number : 6382728735 
enter basic pay  : 5000 
1--Programmer
2--Assitant professor
3--assoicative professor
4--professsor
enter designation : 4
enter name : bala
enter email id of bala : balakrishnan2001@
enter address : permbalur
enter mobile number : 6372727484
enter basic pay  : 10000
1--Programmer
2--Assitant professor
3--assoicative professor
4--professsor
enter designation : 3
enter name : nanthan
enter email id of nanthan : nanthanas23@
enter address : trichy
enter mobile number : 6362827287
enter basic pay  : 12000
	----PROGRAMMER---
               Name : aswin
Mail-ID : msaswin37@
Address : neikuppai
Mobile-No : 6382728735
Basic pay : 5000.0
Net salary : 5745.0
Gross salary : 6350.0
Deductions : 605.0
	----ASSOCIATIVE PROFESSOR---
               Name : nanthan
Mail-ID : nanthanas23@
Address : trichy
Mobile-No : 6362827287
Basic pay : 12000.0
Net salary : 13788.0
Gross salary : 15240.0
Deductions : 1452.0
	----PROFESSOR---
               Name : bala
Mail-ID : balakrishnan2001@
Address : permbalur
Mobile-No : 6372727484
Basic pay : 10000.0
Net salary : 11490.0
Gross salary : 12700.0
Deductions : 1210.0
*/




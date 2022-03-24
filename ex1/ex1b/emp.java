import java.util.*;
class employee
{
 String name;
 int id,yoe,designation;
 double basic_pay,da,hra,lic,pf,working_hrs,hourly_wages,deductions,gross_salary,net_salary;
    
 void grosspay()
  {
  if(designation==1)
    { da=2000;
      hra=1000;
      gross_salary=working_hrs*hourly_wages+da+hra;
       if(lic==0)
         deductions=500;
       else
          deductions=lic+500;
    
          
    }
   else if(designation==2)
    {
      da=basic_pay*0.4;
      hra=basic_pay*0.1;
      pf=basic_pay*0.8;
    gross_salary=basic_pay+da+hra;
    if(lic==0)
         deductions=pf;
       else
          deductions=lic+pf;
  
    
   }
   
  else if(designation==3)
    {
      da=basic_pay*0.3;
      hra=basic_pay*0.1;
      pf=basic_pay*0.8;
      gross_salary=basic_pay+da+hra;
    if(lic==0)
         deductions=pf;
       else
          deductions=lic+pf;
  
   
    }
 }
 void netpay()
   {
    net_salary=gross_salary-deductions;
   }
  
}

class emp
{ public static void main(String[] args)
   {
    Scanner input=new Scanner(System.in);
     int size,i,search_id,search_idp,payres; 
           System.out.print("enter how many employee details you are going to give : ");
    size=input.nextInt();
    employee[]emparray=new employee[size];
    for(i=0;i<size;i++)
      {
       emparray[i]=new employee();
       assign(emparray,input,i);
      }
      System.out.print("enter employee ID to show his payslip : ");
       search_id=input.nextInt();  
       System.out.println("PAY SLIP\n----------------------------------------------------- ");
      payres= payslip(emparray,search_id,size);
      if(payres!=-1)
          display(emparray,payres);
      else
          System.out.println("that ID is not available  ");
        System.out.println("\n----------------------------------------------------- ");
     System.out.print("enter employee ID to show his promotion : "); 
            search_idp=input.nextInt();
       
      promotion(emparray,search_idp,size);        
      for(i=0;i<size;i++)
             display(emparray,i); 
            
   
  }
  static void assign(employee []emparray,Scanner input,int i)
      {
        System.out.print("enter name of the employee "+(i+1)+" : ");
            emparray[i].name=input.next();
        System.out.print("enter id of "+emparray[i].name+" : ");
            emparray[i].id=input.nextInt();
         
        System.out.print("enter year of experiance of  : ");
            emparray[i].yoe=input.nextInt();
        
         System.out.print("enter lic amount(if you are not opted enter zero) : ");
            emparray[i].lic=input.nextDouble();
        System.out.print("enter basic pay of : ");
            emparray[i].basic_pay=input.nextDouble();
        System.out.print("enter working hours of : ");       
            emparray[i].working_hrs=input.nextInt();
        System.out.print("enter hourly wages of  : "); 
             emparray[i].hourly_wages=input.nextDouble();
        System.out.print("1-INTERN\n2-MANAGER\n3-OTHERS(Trainner,Analyst,Software Engineer)\nenter designation  : ");
            emparray[i].designation=input.nextInt();
             emparray[i].grosspay();
              emparray[i].netpay();
 
      
      }
  static void display(employee []emparray,int i)
      {
             
         System.out.println("NAME               : "+ emparray[i].name);
         System.out.println("ID                 : "+ emparray[i].id);
         System.out.println("YEAR OF EXPERIENCE : "+ emparray[i].yoe);
         System.out.println("GROSS SALARY       : "+ emparray[i].gross_salary); 
         System.out.println("NET SALARY         : "+ emparray[i].net_salary);
          
       }
  static int payslip(employee []emparray, int search_id,int size)
       { int i;
      
                     
     for(i=0;i<size;i++)
                {if(search_id==emparray[i].id)
                  return i;
                }
            return -1;
       } 
   static void promotion(employee []emparray,int search_idp,int size)
    {
       int promotionvar,temp,yoetemp;
       promotionvar=payslip(emparray,search_idp,size);
        if(promotionvar==-1)
         System.out.println("oops! this employee id is not available here ");
        else
          {
            temp=emparray[promotionvar].designation;
            yoetemp=emparray[promotionvar].yoe;
           if(temp==1)
             {
              System.out.println("current status is intern ");
             if(yoetemp<5)
               System.out.println(emparray[promotionvar].name +" is not completed at least five years yet so wait for some more years  !!");
             else if(yoetemp>=5&&yoetemp<15)
                 System.out.println(emparray[promotionvar].name +" can be promoted to ANALYST (or) SOFTWARE ENGINEER !!");
             else if(yoetemp>=15&&yoetemp<30)
                System.out.println(emparray[promotionvar].name +" can be promoted to MANAGER !!");
             else 
               System.out.println(emparray[promotionvar].name +" is over experianced so retirement will be the promotion !! ");
           }
           else if(temp==2)
             {
                System.out.println("current status is OTHERS(analyst,software engineer) ");
             if(yoetemp<5)
               System.out.println(emparray[promotionvar].name +" is not completed at least five years yet so wait for some more years  !!");
             else if(yoetemp>=5&&yoetemp<15)
                System.out.println(emparray[promotionvar].name +" can be promoted to MANAGER !!");
              else 
               System.out.println(emparray[promotionvar].name +" is over experianced so retirement will be the promotion !! ");
             }

            else if(temp==3)
             {
                System.out.println("current status is MANAGER");
             if(yoetemp<5)
               System.out.println(emparray[promotionvar].name +" is not completed at least five years yet so wait for some more years  !!");
             else if(yoetemp>=5&&yoetemp<20)
                System.out.println(emparray[promotionvar].name +" has only some more years for retirement  !!");
              else 
               System.out.println(emparray[promotionvar].name +" is over experianced so retirement will be the promotion !! ");
             }
          
          }
    }
}

/*
SAMPLE I/O :
aswin@aswin-HP-Pavilion-Laptop-15-cs2xxx:~/Desktop/java/programs/1b$ java emp
enter how many employee details you are going to give : 1
enter name of the employee 1 : as
enter id of as : 12
enter year of experiance of  : 3
enter lic amount(if you are not opted enter zero) : 0
enter basic pay of : 400
enter working hours of : 3
enter hourly wages of  : 350
1-INTERN
2-MANAGER
3-OTHERS(Trainner,Analyst,Software Engineer)
enter designation  : 1
enter employee ID to show his payslip : 12
PAY SLIP
----------------------------------------------------- 
NAME               : as
ID                 : 12
YEAR OF EXPERIENCE : 3
GROSS SALARY       : 4050.0
NET SALARY         : 3550.0

----------------------------------------------------- 
enter employee ID to show his promotion : 12
current status is intern 
as is not completed at least five years yet so wait for some more years  !!
NAME               : as
ID                 : 12
YEAR OF EXPERIENCE : 3
GROSS SALARY       : 4050.0
NET SALARY         : 3550.0

*/

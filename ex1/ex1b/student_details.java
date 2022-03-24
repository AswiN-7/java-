import java.util.*;

class student_details
{
  public static void main(String args[])
    {  Scanner inp=new Scanner(System.in);
       System.out.print("how many students you are going to give : "); 
       int size,i,search_id,deptresult,idresult;
       String search_dept;
       size=inp.nextInt();
       student[]sarray=new student[size];

       for(i=0;i<size;i++)

        {
           sarray[i]=new student();
           sarray[i].input(i);
           sarray[i].grade();
   
        }
       System.out.print(" enter student id to search in the list : "); 
        search_id=inp.nextInt();
       System.out.print("enter student dept to search in the list : ");
        search_dept=inp.next();
        deptresult=search(search_dept,size,sarray);
         if(deptresult==-1)
            System.out.println("no entered dept not in the list");
         else
            System.out.print("yes dept is present in the list and its position is"+(deptresult+1));
        idresult=search(search_id,size,sarray);
           if(idresult==-1)
            System.out.println("no entered dept not in the list");
         else
            System.out.print("yes dept is present in the list and its position is"+(deptresult+1));



      
for(i=0;i<size;i++)
      sarray[i].display(size);
}

  static int search(String search_dept,int size,student []sarray)
     { int i;
       for(i=0;i<size;i++)
        {
         if((search_dept.compareTo(sarray[i].dept))==0)
           return i;
        }
      return -1;
     }
     
   static int search(int search_id,int size,student []sarray)
     { int i;
       for(i=0;i<size;i++)
        {
         if(search_id==sarray[i].id)
           return i;
        }
      return -1;
     }
    
       

}
class student
{
  Scanner s=new Scanner(System.in);
  int id;
 String name;
 String dept;
 int []marks=new int[3];
 String grade;
 int total=0;
 float average;
 void input(int i)
{
 int j;
 
   
    System.out.print("enter name of student "+(i+1)+" : ");
    name=s.nextLine();
    System.out.print("enter department  : ");
    dept=s.next();
    System.out.print("enter id of "+name+" : ");
    id=s.nextInt();
    System.out.println("enter marks :");
    for(j=0;j<3;j++)
      {
     System.out.print("enter marks "+(j+1)+": ");
    marks[j]=s.nextInt();
    total+=marks[j];
       }
   

}


void grade()
    {
      average=total/30;
      if(average>=9)
        grade="O";
       else if(average>=8&&average<9)
        grade="A+";
      else if(average>=7&&average<8)
           grade="A";
      else if(average>=6&&average<7)
           grade="B+";
       else if(average>=4&&average<6)
           grade="B";
       else
         grade="FAIL";
        
    }
  
  
  void display(int size)
    {
      int j;
    
         System.out.println("	NAME : "+name);
         System.out.println("	ID   : "+id);
         System.out.println("	DEPT : "+dept);
         System.out.print("	MARKS: ");
         for(j=0;j<3;j++)
           System.out.print(marks[j]+"  ");
         System.out.println("	GRADE: "+grade);
      
      
    }
    
}

/* SAMPLE I/O:

C:\Users\Shannupriya\Desktop\java>javac student_details.java

C:\Users\Shannupriya\Desktop\java>java student_details
how many students you are going to give : 4
enter name of student 1 : vijay
enter department  : it
enter id of vijay : 121
enter marks :
enter marks 1: 89
enter marks 2: 87
enter marks 3: 78
enter name of student 2 : aswin
enter department  : cse
enter id of aswin : 027
enter marks :
enter marks 1: 78
enter marks 2: 98
enter marks 3: 87
enter name of student 3 : arthick
enter department  : 87
enter id of arthick : 89
enter marks :
enter marks 1: 87
enter marks 2: 76
enter marks 3: 89
enter name of student 4 : praveen
enter department  : cse
enter id of praveen : 73
enter marks :
enter marks 1: 87
enter marks 2: 89
enter marks 3: 87
 enter student id to search in the list : 27
enter student dept to search in the list : cse
yes dept is present in the list and its position is2yes dept is present in the l
ist and its position is2        NAME : vijay
        ID   : 121
        DEPT : it
        MARKS: 89  87  78       GRADE: A+
        NAME : aswin
        ID   : 27
        DEPT : cse
        MARKS: 78  98  87       GRADE: A+
        NAME : arthick
        ID   : 89
        DEPT : 87
        MARKS: 87  76  89       GRADE: A+
        NAME : praveen
        ID   : 73
        DEPT : cse
        MARKS: 87  89  87       GRADE: A+

*/

class student
{public static void main(String[] args)
    { 
       int total;float average;
       String name=args[0];
       int id=Integer.parseInt(args[1]);
       String dept=args[2];
       int mark1=Integer.parseInt(args [3]);
       int mark2=Integer.parseInt(args [4]);
       int mark3=Integer.parseInt(args [5]);
       total=mark1+mark2+mark3;
       average=total/30;
       grade(average);
       int searchid=Integer.parseInt(args [6]);
        if(id==searchid)
          System.out.println("yes id correct");
        else
            System.out.println("no id not correct");
        
       String searchdept=args[7];
       if((dept.compareTo(searchdept))==0)
          System.out.println("yes department is correct");
       else
         System.out.println("no  department not  is correct");
   }
  static void grade(float average)
    {if(average<=9)
         System.out.println("grade is O");
       else if(average>=8&&average<9)
           System.out.println("grade is A+");
      else if(average>=7&&average<8)
           System.out.println("grade is A");
      else if(average>=6&&average<7)
           System.out.println("grade is B+");
       else if(average>=4&&average<6)
           System.out.println("grade is B");
       else
         System.out.println("FAIL");
        
    }
}
 /* SAMPLE I/O :
aswin@aswin-HP-Pavilion-Laptop-15-cs2xxx:~/Desktop/java/programs/ass 1$ javac student.java 
aswin@aswin-HP-Pavilion-Laptop-15-cs2xxx:~/Desktop/java/programs/ass 1$ java student aswin 27 cse 70 80 80 27 cse
grade is O
yes id correct
yes department is correct

*/

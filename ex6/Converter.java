import java.util.*;
import mypackage.currency.*;
//import mypackage.distance.*;
//import mypackage.time.*;

class Converter
{
 public static void main(String[] args)
 {
  Scanner input=new Scanner(System.in);
  while(true)
  {
   int option,choice,again;
  System.out.print("1--currency converter\n2--Distance converter\n3--Time convereter\nenter your option : ");
  		option=input.nextInt();
  if(option==1)
  {
    float money;
    System.out.print("\t1--INR to DOLLAR\n\t2--INR to EURO\n\t3--INR to YEN\n\t4--DOLLAR to INR\n\t5--EURO to INR\n\t6--YEN to INR\nENTER YOUR CHOICE :");
    choice=input.nextInt();
    System.out.print("eneter money : ");
    money=input.nextFloat();
    CurrencyConverter c=new CurrencyConverter(money,choice);
    System.out.println("money is converted "+c.cmoney);   
  }
  else if(option==2)
  {
    float distance;
    System.out.print("\t1--METER to KILOMETER\n\t2--MILES to KILOMETER\n\t3--KILOMETER to METER\n\t4--KILOMETER to MILES\nENTER YOUR CHOICE : ");
   choice=input.nextInt();
   System.out.print("enter distance : ");
   distance=input.nextFloat();
   DistanceConverter d=new DistanceConverter(distance,choice);
   System.out.println("distance is converted "+d.cdistance);
  }
  else if(option==3)
  {
   float time;
   System.out.print("\t1--HOURS to MINUTES\n\t2--MINUTES to SECONDS\n\t3--MINUTES to HOURS\n\t4--SECONDS to MINUTES\nENTER YOUR CHOICE :");
    choice=input.nextInt();
    System.out.print("enter time : ");
     time=input.nextFloat();
     TimeConverter t=new TimeConverter(time,choice);
     System.out.println("time is converted  "+t.ctime);
  }
  System.out.print("\t\t\tdo you want continue with options press 1 :  ");
   again=input.nextInt();
   if(again!=1)
      break;
 }
}
}
/*
SAMPLE I/O :
 swin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex6$ javac Converter.java 
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex6$ java Converter
1--currency converter
2--Distance converter
3--Time convereter
enter your option : 1
	1--INR to DOLLAR
	2--INR to EURO
	3--INR to YEN
	4--DOLLAR to INR
	5--EURO to INR
	6--YEN to INR
ENTER YOUR CHOICE :1
eneter money : 1
money is converted 0.014
			do you want continue with options press 1 :  1
1--currency converter
2--Distance converter
3--Time convereter
enter your option : 2
	1--METER to KILOMETER
	2--MILES to KILOMETER
	3--KILOMETER to METER
	4--KILOMETER to MILES
ENTER YOUR CHOICE : 2
enter distance : 1
distance is converted 1.60934
			do you want continue with options press 1 :  1
1--currency converter
2--Distance converter
3--Time convereter
enter your option : 3
	1--HOURS to MINUTES
	2--MINUTES to SECONDS
	3--MINUTES to HOURS
	4--SECONDS to MINUTES
ENTER YOUR CHOICE :4   
enter time : 2
time is converted  0.033333335
			do you want continue with options press 1 :  2



*/



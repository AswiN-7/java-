import java.util.*;
public class bill
{
     
	public static void main(String[] args) {
          double total;
	    Scanner s= new Scanner(System.in);
		System.out.print("enter id :");
		detials.consumer_no=s.nextInt();
		System.out.print("enter name : ");
		detials.consumer_name=s.next();
		System.out.print("enter previous month reading :");
		detials.pmr=s.nextInt();
		System.out.print("enter current month reading :");
		detials.cmr=s.nextInt();
		System.out.print("domestic - 1\ncommercial -2\nenter correct type connection  :");
		detials.tyc=s.nextInt();
		total=unit_claculator();
           output(total);
	}
	static double unit_claculator()
	{
	    int unit;
	    double money,total;
	      unit=detials.cmr-detials.pmr;
	      
	    if(detials.tyc==1)
	    {
	        if(unit<0 )
	         money= 0;
	       else if(unit>0&&unit<=100)
	          money= 1;
	       else if(unit>100&&unit<=200)
	           money= 2.50;
	       else if(unit>200&&unit<=500)
	          money=4;
	          else
	            money=6;
       total=money*unit;
       
	    }
      else 
      { if(unit<0 )
	         money= 0;
	       else if(unit>0&&unit<=100)
	          money= 2;
	       else if(unit>100&&unit<=200)
	           money=4.50;
	       else if(unit>200&&unit<=500)
	          money=6;
	          else
	            money=7;
       total=money*unit;
       
	    }
      return total;
	}
	static void output(double total)
	 {
	     	System.out.println("Name of the consumer : "+detials.consumer_name);
	     	System.out.println("Consumer id          : "+detials.consumer_no);
	     	if(detials.tyc==1)
	     			System.out.println("type of connection     : demestic");
	     	else
	               System.out.println("type of connection     : commercial");
	         System.out.println("total amount : "+total);
	 }
}
 class detials
{
  static  int consumer_no;
 static   String consumer_name;
  static  int pmr;
  static  int cmr;
  static  int tyc;
}

/*SAMPLE I/O:
aswin@aswin-HP-Pavilion-Laptop-15-cs2xxx:~/Desktop/java/programs/1b$ java bill
enter id :1096
enter name : aswin
enter previous month reading :1000
enter current month reading :1300
domestic - 1
commercial -2
enter correct type connection  :2
Name of the consumer : aswin
Consumer id          : 1096
type of connection     : commercial
total amount : 1800.0

*/

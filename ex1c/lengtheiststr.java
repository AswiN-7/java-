/*
find lengtheist word in line
*/

import java.util.*;
class lengtheiststr
{ 
  public static void main(String[] args)
  { Scanner input=new Scanner(System.in);
    int max,i,index,temp;
    System.out.print("enter line of text to find it\'s lentheist word : ");
    String inpstr=input.nextLine();
    String[] splitstr=inpstr.split(" ");
    max=splitstr[0].length();
    index=0;
    for(i=0;i<splitstr.length;i++)
    { temp=splitstr[i].length();
     if(temp>max)
       { max=temp;
         index=i;
       }
    }
    
    System.out.println("the maximum length word in the given line is [ "+splitstr[index]+" ]\n its index is "+(index+1));
 }
}
/*SAMPLE I/O:
aswin@aswin-HP-Pavilion-Laptop-15-cs2xxx:~/Desktop/java/programs/1c$ javac lentheiststr.java 
aswin@aswin-HP-Pavilion-Laptop-15-cs2xxx:~/Desktop/java/programs/1c$ java lentheiststr
enter line of text to find it's lentheist word : helping others is art in this rotating earth
the maximum length word in the given line is [ rotating ]
 its index is 7

*/

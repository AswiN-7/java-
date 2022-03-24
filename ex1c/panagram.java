import java.util.*;
class panagram
{ public static  void main(String[] args)
  {Scanner input=new Scanner(System.in);
   String inpstr,panagram_str;
   panagram_str="abcdefghijklmnopqrstuvwxyz";
   int result;
   System.out.print("enter a word to find wheather it is palindrome or not : ");
   inpstr=input.next();
   result=panagramcheck(inpstr,panagram_str);
   if(result>0)
     System.out.println("given string [ "+inpstr+" ] is panagram");
   else
     System.out.println("given string [ "+inpstr+" ] is not a papanagram");
   
   
  }
 static  int panagramcheck(String inpstr,String panagram_str)
  { int i,j,len1,len2;
    len1=26;
    len2=inpstr.length();
    if(len2<26)
      return -1;
   for(i=0;i<26;i++)
   {  for(j=0;j<len2;j++)
    {
      if(inpstr.charAt(i)==inpstr.charAt(j))
      break;
      else if(j+1==len2)
       return -1;
   
    }

   }
     return 1;
  
  }
}

/*
 SAMPLE I/O:
aswin@aswin-HP-Pavilion-Laptop-15-cs2xxx:~/Desktop/java/programs/1c$ javac panagram.java 
aswin@aswin-HP-Pavilion-Laptop-15-cs2xxx:~/Desktop/java/programs/1c$ java panagram
enter a word to find wheather it is palindrome or not : qwertyuiopasdfghjklzxcvbnm
given string [ qwertyuiopasdfghjklzxcvbnm ] is panagram

*/

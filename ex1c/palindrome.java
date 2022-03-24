import java.util.*;
class palindrome
{ public static void main(String[] args)
  {Scanner input=new Scanner(System.in);
   String inpstr;
   int result;
   System.out.print("enter a word to find wheather it is palindrome or not : ");
   inpstr=input.next();
   result=palindromecheck(inpstr);
   if(result>0)
     System.out.println("given string [ "+inpstr+" ] is palindrome");
   else
     System.out.println("given string [ "+inpstr+" ] is not a palindrome");
   
   
  }
 static int palindromecheck(String inpstr)
  { int i,len;
    len=inpstr.length()-1;
   for(i=0;i<len/2;i++)
    if(inpstr.charAt(i)!=inpstr.charAt(len-i))
      return -1;
     return 1;
  
  }
}

/*
 SAMPLE I/O:
 aswin@aswin-HP-Pavilion-Laptop-15-cs2xxx:~/Desktop/java/programs/1c$ java palindrome
enter a word to find wheather it is palindrome or not : madam
given string [ madam ] is palindrome

*/

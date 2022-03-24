import java.util.*;
import shapes.circle.*;
import shapes.triangle.*;
import shapes.square.*;

class ShapesEg 
{
  static Scanner input=new Scanner(System.in);
   static int counts,countt,countc;
 public static void main(String[] args)
 {
   int choice;
   System.out.print("1--circle\n2--Square\n3--Triangle\nenter choice :");
    choice=input.nextInt();
     
     if(choice==1)
      { 
         float radius;
    System.out.print("enter radius :");
    		radius=input.nextFloat(); 
         Circle c=new Circle(radius);
         System.out.println("circle  "+"\nArea :"+c.getArea()+"\nperimeter : "+c.getPerimeter()); 
     }
     else if(choice==3)
    {
      float base,height,llength,rlength;
      System.out.print("enter base :");
     		base=input.nextFloat();
      System.out.print("enter height : ");
                height=input.nextFloat();
      System.out.print("enter left side length  : ");
                 llength=input.nextFloat();
      System.out.print("enter right side length : ");
                  rlength=input.nextFloat();
       Triangle t=new Triangle(base,height,llength,rlength);
        System.out.println("\t\tTriangle\nArea ="+t.getArea()+"\nperimeter : "+t.getPerimeter()); 
    }
    else if(choice==2)
    {
      float side;
      System.out.print("enter side length : ");
            side=input.nextFloat();
     Square s=new Square(side);
      System.out.println("\t\tSquare\nArea ="+s.getArea()+"\nPerimeter ="+s.getPerimeter());
    }
    
 }
}
/*
SAMPLE I/O :
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex6$ javac ShapesEg.java 
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex6$ java ShapesEg
1--circle
2--Square
3--Triangle
enter choice :1
enter radius :5
circle  
Area :78.5
perimeter : 31.400002
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex6$ java ShapesEg
1--circle
2--Square
3--Triangle
enter choice :2
enter side length : 2
		Square
Area =4.0
Perimeter =8.0
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex6$ java ShapesEg
1--circle
2--Square
3--Triangle
enter choice :3
enter base :2
enter height : 3
enter left side length  : 4
enter right side length : 5
		Triangle
Area =3.0
perimeter : 11.0


*/

import java.util.*;
abstract class Shape
{
 protected String color="red";
 public Shape()
 {
 }
 public Shape(String color)
 {
  this.color=color;
 }
 public String getColor()
 {
  	return color;
 }
 public void setColor(String color)
 {
  this.color=color;
 }
  abstract float getArea();
  abstract float getPerimeter();
}

class Circle extends Shape
{
 protected float radius=1.0f;
 public Circle()
 {
 }
 public Circle(float radius,String color)
 {
  setColor(color);
  this.radius=radius;
 }
 public float getRadius()
 {
  return radius;
 }
 public void setRadius(float radius)
 {
  this.radius=radius;
 }
 public float getArea()
 {
   return 3.14f*radius*radius;
 }
 public float getPerimeter()
 {
  return 3.14f*2*radius;
 }
}

class Rectangle extends Shape
{
 protected float width=1.0f,length=1.0f;
 public Rectangle()
 {
 }
 public Rectangle(float width,float length)
 {
  this.width=width;
  this.length=length;
 }
 public Rectangle(float width,float length,String color)
 {
  super(color);
  this.width=width;
  this.length=length;
 }
  public float getWidth()
  {
   return width;
  }
  public float getLength()
  {
   return length;
  }
 public void setLength(float length)
 {
  this.length=length;
 }
 public void setWidth(float width)
 {
  this.width=width;
 }
 public float getArea()
 {
   return length*width;
 }
 public float getPerimeter()
 {
  return 2*(length+width); 
 }
 
}

class Square extends Rectangle
{
 protected float side;
 public Square()
 {
 }
 public Square(float side)
 {
   this.side=side;
 }
 public Square(float side,String color)
 {
   setColor(color);
   this.side=side;
 }
 public float getSide()
 {
   return side;
 }
 public void setSide(float side)
 {
  this.side=side;
 }
 public float getArea()
 {
   return side*side;
 }
 public float getPerimeter()
 {
  return 2*side;
 }
}

class testAbstract
{
 static int countr,countc,counts;
 static Scanner input=new Scanner(System.in);
 public static void main(String[] args)
 {
   int size,choice;
   System.out.print("enter how many shapes you are going to give : ");
   size=input.nextInt();
   Rectangle[] r=new Rectangle[size];
   Square[] s=new Square[size];
   Circle[] c=new Circle[size];
   for(int i=0;i<size;i++)
   {
    System.out.print("1--circle\n2--rectangle\n3--square\nenter your choice : ");
    choice=input.nextInt();
    if(choice==1)
       input_fun(c);
    else if(choice==2)
       input_fun(r);
    else if(choice==3)
       input_fun(s);
   }
   output_fun(c,r,s);
 }
 static void input_fun(Rectangle[] r)
 {
   float length,width;
   String color;
   System.out.print("enter length of the rectangle : ");
   	length=input.nextFloat();
   System.out.print("enter width : ");
   	width=input.nextFloat();
   System.out.print("enter color : ");
   	color=input.next();
   r[countr]=new Rectangle(width,length,color);
   countr++;
   }
  

  static void input_fun(Circle[] c)
 {
   float radius;
   String color;
   System.out.print("enter radius of the circle : ");
   	radius=input.nextFloat();
   System.out.print("enter color : ");
   	color=input.next();
   c[countc]=new Circle(radius,color);
   countc++;
   }
  
  static void input_fun(Square[] s)
 {
   float side;
   String color;
   System.out.print("enter side of the square : ");
   	side=input.nextFloat();
   System.out.print("enter color : ");
   	color=input.next();
   s[counts]=new Square(side,color);
   counts++;
   }
   static void output_fun(Circle[] c,Rectangle[] r,Square[] s)
   {
    for(int i=0;i<countc;i++)
    {
      if(i==0)
          System.out.println("\t\tCIRCLE");
      System.out.println("COLOR\t :"+c[i].getColor()+"\nRADIUS\t :"+c[i].getRadius()+"\nAREA\t : "+c[i].getArea()+"\nPERIMETER\t : "+c[i].getPerimeter()+"\n");
    }
     for(int i=0;i<countr;i++)
    {
      if(i==0)
          System.out.println("\t\tRECTANGLE");
      System.out.println("COLOR\t :"+r[i].getColor()+"\nLENGTH\t :"+r[i].getLength()+"\nWIDTH\t :"+r[i].getWidth()+"\nAREA\t : "+r[i].getArea()+"\nPERIMETER\t : "+r[i].getPerimeter()+"\n");
    }
    
     for(int i=0;i<counts;i++)
    {
      if(i==0)
          System.out.println("\t\tSQUARE");
      System.out.println("COLOR\t :"+s[i].getColor()+"\nRADIUS\t :"+s[i].getSide()+"\nAREA\t : "+s[i].getArea()+"\nPERIMETER\t : "+s[i].getPerimeter()+"\n");
    }

   }

}

/*SAMPLE I/O : 
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex4b$ javac testAbstract.java 
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex4b$ java testAbstract
enter how many shapes you are going to give : 3
1--circle
2--rectangle
3--square
enter your choice : 1
enter radius of the circle : 4
enter color : red
1--circle
2--rectangle
3--square
enter your choice : 2
enter length of the rectangle : 2
enter width : 3
enter color : greed
1--circle
2--rectangle
3--square
enter your choice : 3
enter side of the square : 5
enter color : yellow
		CIRCLE
COLOR	 :red
RADIUS	 :4.0
AREA	 : 50.24
PERIMETER	 : 25.12

		RECTANGLE
COLOR	 :greed
LENGTH	 :2.0
WIDTH	 :3.0
AREA	 : 6.0
PERIMETER	 : 10.0

		SQUARE
COLOR	 :yellow
RADIUS	 :5.0
AREA	 : 25.0
PERIMETER	 : 10.0
*/

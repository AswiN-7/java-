import java.util.*;
class Shape
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
 {this.color=color;
 }
}
class Circle extends Shape
{
 protected float radius=1.0f;
 public Circle()
 {

 }
 public Circle(float radius)
 {
   this.radius=radius;
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
   return 2*3.14f*radius;
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
}

class TestShape
{
 static Scanner input=new Scanner(System.in);
 static int countc,countr,counts;
 public static void main(String[] args)
 {
   int total,choice,i=0;
  System.out.print("enter how many shapes you are going to give : ");
  total=input.nextInt();
  Circle[] c=new Circle[total];
  Rectangle[] r=new Rectangle[total];
  Square[] s=new Square[total];
  while(i<total)  
  {
   System.out.print("1--circle\n2--Rectangle\n3--Square\nenter which shape you are going to give : ");
   choice=input.nextInt();
   if(choice==1)
    {
     input_fun(c);
    }
   else if(choice==2)
     {  
     input_fun(r);
     }
  else if(choice==3)
    { 
   input_fun(s);
    }
    if(choice>0&&choice<4)
      i++;
   else 
      System.out.println("enter correct choice ");
  }
  output_fun(c,r,s); 
}
 public static void input_fun(Circle[] c)
  { 
    float radius;
    String color;
   System.out.print("enter radius : ");
   radius=input.nextFloat();
   System.out.print("enter color of the circle : ");
   color=input.next();
   c[countc]=new Circle();
    c[countc].setColor(color);
  c[countc].setRadius(radius);
  countc++;
  }
 public static void input_fun(Rectangle[] r)
 {
  float length,width;
  String color;
  System.out.print("enter length : ");
  length=input.nextFloat();
  System.out.print("enter widrh : ");
  width=input.nextFloat();
  System.out.print("enter color of the rectangle : ");
  color=input.next();
  r[countr]=new Rectangle(width,length,color);
  countr++;  
 }
 public static void input_fun(Square[] s)
 {
  float side;
  String color;
  System.out.print("enter side");
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
  System.out.println("		circle  :  "+(i+1)+"\nRadius	: "+c[i].getRadius()+"\nArea 	: "+c[i].getArea()+"\nPerimeter	 :"+c[i].getPerimeter()+"\ncolor 	:"+c[i].getColor()+"\n\n");
 }
 for(int i=0;i<countr;i++)
{
 System.out.println("		Rectangle : "+(i+1)+"\nlength 	: "+r[i].getLength()+"\nWidth	: "+r[i].getWidth()+"\nArea	:"+r[i].getArea()+"\nPerimeter	: "+r[i].getPerimeter()+"\ncolor 	:"+r[i].getColor()+"\n\n");
}
 for(int i=0;i<counts;i++)
 {
 System.out.println("		Square : "+(i+1)+"\nside 	:"+s[i].getSide()+"\nArea	: "+s[i].getArea()+"\ncolor 	:"+s[i].getColor()+"\n\n");
 }
}
}


/*
SAMPLE I/O :
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/programs/2b$ javac TestShape.java 
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/programs/2b$ java TestShape
enter how many shapes you are going to give : 4
1--circle
2--Rectangle
3--Square
enter which shape you are going to give : 1
enter radius : 5
enter color of the circle : blue
1--circle
2--Rectangle
3--Square
enter which shape you are going to give : 2
enter length : 3
enter widrh : 4
enter color of the rectangle : red
1--circle
2--Rectangle
3--Square
enter which shape you are going to give : 3
enter side5
enter color : green
1--circle
2--Rectangle
3--Square
enter which shape you are going to give : 2
enter length : 6
enter widrh : 5
enter color of the rectangle : violet
			circle  :  1
Radius	: 5.0
Area 	: 78.5
Perimeter	 :31.400002
color 	:blue


		Rectangle : 1
length 	: 3.0
Width	: 4.0
Area	:12.0
Perimeter	: 14.0
color 	:red


		Rectangle : 2
length 	: 6.0
Width	: 5.0
Area	:30.0
Perimeter	: 22.0
color 	:violet


		Square : 1
side 	:5.0
Area	: 1.0
color 	:green


*/

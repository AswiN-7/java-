import java.util.*;
abstract class shape
{
	String s;
	shape(String s)
	{
		this.s=s;
	}
	void display()
	{
		System.out.println(s);
	}
	abstract void newm(String s);
}
class circle extends shape
{
	circle(String s)
	{	super(s);
	}
	void newm(String s)
	{
		System.out.println("in newm function "+s);
	}
}

class abs
{
	static  Scanner input=new Scanner(System.in);
	public static void main(String [] args)
	{
		int i;
		String s;

		shape sh[]=new shape[2];
		for( i=0;i<2;i++)
		{
			System.out.print("enter string : ");
			s=input.next();
			sh[i]=new circle(s);
			sh[i].display();
			sh[i].newm(s);
		}
		//s
		
	}
}

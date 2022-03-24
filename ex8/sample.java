import java.util.*;
class sample
{
	public static void main(String[] args)
	{
		ArrayList s=new ArrayList();
		s.add("1122");
		System.out.println("s="+s.get(0));
		String stnew=(String )s.get(0);
			System.out.println("s="+stnew);
			if(stnew.contains("in"))
				System.out.println("yes a is present");
		
	}
}

import java.util.*;
class Movie
{
	String name,actor,genre;
	int year;
	float rating;
	Movie(String name,String actor,String genre,int year,float rating)
	{
		this.name=name;
		this.actor=actor;
		this.genre=genre;
		this.year=year;
		this.rating=rating;
	}
	public String toString()
	{
		String msg="\nNAME : "+name+"\nACTOR : "+actor+"\nYEAR : "+year+"\nGENRE : "+genre+"\nRATING : "+rating+"\n";
		return msg;
	}
}
class RatingComparator implements Comparator<Movie>
{
	public int compare(Movie s1,Movie s2)
	{
		if(s1.rating<s2.rating)
			return 1;
		return-1;
	}
}

class YearComparator implements Comparator<Movie>
{
	public int compare(Movie s1,Movie s2)
	{
		if(s1.year<s2.year)
			return 1;
		return -1;
	}
}
class Movielistsort
{
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args)
	{	int choice;
		Movie tempvar;
		Queue<Movie> movie=new LinkedList<Movie>();
		while(true)
		{
		System.out.print("1 --addnew movie \n2 --remove movie\n3 --sort based on year\n4 --sort based on rating \nenter choice : ");
			choice=input.nextInt();
		if(choice==1)
		{
			tempvar=createmovieinfo();
			movie.add(tempvar);
			System.out.println(movie);				
		}
		else if(choice==2)
		{
			movie.remove();
			System.out.println(movie);
		}
		else if(choice==3)
		{
			sortbyyear(movie);
		}
		else if(choice==4)
		{
			sortbyrating(movie);
		}
		if(choice==-1)
			break;
		}
		
	}
	static Movie createmovieinfo() 
	{
		String name,actor,genre;
		int year;
		float rating;
		System.out.print("enter name of the movie : ");
			name=input.next();
		System.out.print("enter actor name : ");
			actor=input.next();
		System.out.print("enter genre : ");
			genre=input.next();
		System.out.print("enter year : ");
			year=input.nextInt();
		System.out.print("enter rating : ");
			rating=input.nextFloat();
		Movie tempvar=new Movie(name,actor,genre,year,rating);
			return tempvar;
	}
	static void sortbyyear(Queue<Movie> movie)
	{
	Movie temp;
	LinkedList<Movie> yearsort=new LinkedList<Movie>(movie);
	System.out.println(yearsort.get(0).year);
	for(int i=0;i<yearsort.size();i++)
		for(int j=i+1;j<yearsort.size();i++)
		{
			if(yearsort.get(i).year>yearsort.get(j).year)
			{
				temp=yearsort.get(i);
				yearsort[i]=yearsort.get(j);
				yearsort[j]=temp;
			}
		}
		//Collections.sort(yearsort,new YearComparator( ));
	System.out.println(yearsort);
	
	}
	static void sortbyrating(Queue<Movie> movie)
	{
	LinkedList<Movie> ratingsort=new LinkedList<Movie>(movie);
	for(int i=0;i<ratingsort.size();i++)
		Collections.sort(ratingsort,new RatingComparator( ));
	System.out.println(ratingsort);
	
	} 
}

/*
SAMPLE i/o : 
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/ex9$ java Movielist
1 --addnew movie 
2 --remove movie
3 --sort based on year
4 --sort based on rating 
enter choice : 1
enter name of the movie : a
enter actor name : aa
enter genre : qq
enter year : 2019
enter rating : 7.8
[
NAME : a
ACTOR : aa
YEAR : 2019
GENRE : qq
RATING : 7.8
]
1 --addnew movie 
2 --remove movie
3 --sort based on year
4 --sort based on rating 
enter choice : 1
enter name of the movie : w
enter actor name : ww
enter genre : wwe
enter year : 1011
enter rating : 10.0
[
NAME : a
ACTOR : aa
YEAR : 2019
GENRE : qq
RATING : 7.8
, 
NAME : w
ACTOR : ww
YEAR : 1011
GENRE : wwe
RATING : 10.0
]
1 --addnew movie 
2 --remove movie
3 --sort based on year
4 --sort based on rating 
enter choice : 1
enter name of the movie : r
enter actor name : rr
enter genre : rrg
enter year : 2017
enter rating : 5.6
[
NAME : a
ACTOR : aa
YEAR : 2019
GENRE : qq
RATING : 7.8
, 
NAME : w
ACTOR : ww
YEAR : 1011
GENRE : wwe
RATING : 10.0
, 
NAME : r
ACTOR : rr
YEAR : 2017
GENRE : rrg
RATING : 5.6
]
1 --addnew movie 
2 --remove movie
3 --sort based on year
4 --sort based on rating 
enter choice : 3
[
NAME : a
ACTOR : aa
YEAR : 2019
GENRE : qq
RATING : 7.8
, 
NAME : r
ACTOR : rr
YEAR : 2017
GENRE : rrg
RATING : 5.6
, 
NAME : w
ACTOR : ww
YEAR : 1011
GENRE : wwe
RATING : 10.0
]
1 --addnew movie 
2 --remove movie
3 --sort based on year
4 --sort based on rating 
enter choice : 4
[
NAME : w
ACTOR : ww
YEAR : 1011
GENRE : wwe
RATING : 10.0
, 
NAME : a
ACTOR : aa
YEAR : 2019
GENRE : qq
RATING : 7.8
, 
NAME : r
ACTOR : rr
YEAR : 2017
GENRE : rrg
RATING : 5.6
]
1 --addnew movie 
2 --remove movie
3 --sort based on year
4 --sort based on rating 
enter choice : -1
*/

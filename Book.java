
public class Book {

	
	String title,url;
	int year,pages,volume;
	
	public Book(String t,int p,int y,int v,String u)
	{
		title=t;
		pages=p;
		volume=v;
		year=y;
		url=u;
	}
	public String get_title()
	{
		return title;
	}
	public int get_year()
	{
		return year;
	}
	public String url()
	{
		return url;
	}
}

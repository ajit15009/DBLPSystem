import java.util.*;

public class Author implements Comparable<Author> {
	String name;
	List<Book>Publications;
	public Author(String n)
	{
		name=n;
	}
	public String get_name()
	{
		return name;
	}
	public void add_publication(Book B)
	{
		Publications.add(B);
	}
	public int compareTo(Author a)
	{
		if(this.name.equals(a.get_name()))
			return 1;
		else if(this.name.toLowerCase().contains(a.get_name().toLowerCase()))
			return 1;
		else if(a.get_name().toLowerCase().contains(this.name.toLowerCase()))
			return 1;
		else return 0;
	}
	public static void main(String[] args)
	{
		System.out.println("Hello");
	}

}

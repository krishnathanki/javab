import java.util.*;
public class Books implements Comparable<Books>{
	String title,author,publisher;
	int id;
	static int count=1;
	float price;
	
	Books(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Title:");
		title=sc.nextLine();
		System.out.println("Author:");
		author=sc.nextLine();
		System.out.println("Publisher:");
		publisher=sc.nextLine();
		System.out.println("Price:");
		price=sc.nextFloat();
		id=count;
		count++;
	}
	public String toString()
	{
		return "Book id:"+id+" "+title+" by "+author+" Published by"+publisher+" costing "+price;
	}
	public float getprice()
	{
		return price;
	}
	public String auth()
	{
		return author;
	}
	public String gettitle()
	{
		return title;
	}
	public String getpublisher()
	{
		return publisher;
	}
	public void setpublisher(String p)
	{
		publisher=p;
	}
	public int compareTo(Books b1)
	{
		return (int)(this.price-b1.getprice());
	}
}
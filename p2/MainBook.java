import java.util.*;
public class MainBook{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		ArrayList<Books> mybooks= new ArrayList<Books>();
		ArrayList<Books> sortedbooks= new ArrayList<Books>();

		while(true)
		{
			System.out.println("1.New Book\n2.Display\n3.Search\n4.Price\n5.Search by title\n6.Search by Publisher\n7.Update publisher for a book\n8.Exit\nEnter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: mybooks.add(new Books());break;
			case 2: sortedbooks=(ArrayList<Books>mybooks.clone();
				Collections.sort(sortedbooks);
				for(Books b:mybooks)
				{
					System.out.println(b);
				}
				break;
			case 3: sc.nextLine();
				System.out.println("Enter name of Author:");
				String a= sc.nextLine();
				for(Books b:mybooks)
				{
					if(b.auth().equals(a))
					{
						System.out.println(b);
					}
				}
				break;
			case 4: System.out.println("Display books priced above:");
				float p=sc.nextFloat();
				for(Books b:mybooks)
				{
					if(b.getprice()>p)
					{
						System.out.println(b);
					}		
				}
				break;
			case 5: sc.nextLine();
				System.out.println("Enter Title:");
				String t=sc.nextLine();
				for(Books b:mybooks)
				{
					if(b.gettitle().contains(t))
					{
						System.out.println(b);
					}
				}
				break;
			case 6: sc.nextLine();
				System.out.println("Enter name of Publisher: ");
				String pu= sc.nextLine();
				for(Books b:mybooks)
				{
					if(b.getpublisher().equals(pu))
					{
						System.out.println(b);
					}
				}
				break;
			case 7:	sc.nextLine();
				System.out.println("Enter Title: ");
				String tit= sc.nextLine();
				System.out.println("Enter Publisher: ");
				String pub= sc.nextLine();
				for(Books b:mybooks)
				{
					if(b.gettitle().equals(tit))
					{
						b.setpublisher(pub);
					}
				}
			default: return;
		}
}		
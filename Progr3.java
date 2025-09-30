class Book
{
public String bname;
public int bno;
public String author;
public int pages;
public Book(String bname, int bno, String author, int pages)
{
this.bname=bname;
this.bno=bno;
this.author=author;
this.pages=pages;
}
public void display()
{
System.out.println("book name is " + bname);
System.out.println("With bnumber "+bno);
System.out.println("Its author is "+author);
System.out.println("and no.of pages "+ pages);
}
}
public class Progr3
{
public static void main(String args[])
{
Book std=new Book("silent patient", 30091706, "alex",300);
std.display();
}
}

class Class1 {
Class1()
{
System.out.println("Object created");
}
protected void finalize() {
System.out.println("finalize() method called");
}
}
public class bookdata {
public static void main(String[] args) {
Class1 obj = new Class1();
obj = null;
System.gc();
}
}


class bookdata{
public static void main(String args[]) {
String sb1 = "bookname";
String sb2 = "book title";
System.out.println("sb1 is " + sb1);
System.out.println("sb2 is " + sb2);
}
}
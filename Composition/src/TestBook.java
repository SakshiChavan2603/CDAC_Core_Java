
public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book.Lesson l2 = b1.new Lesson();
		l2.m1();
		
		Book b2 = new Book(12,"xyz",1,"lesson1");
		System.out.println(b2);
	}

}

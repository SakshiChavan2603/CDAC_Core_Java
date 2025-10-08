
public class Book {
	private int bid;
	private String bname;
	Lesson l1;
	
	class Lesson{
		private int lid;
		private String lname;
		
		public Lesson() {
			lid = 0;
			lname = null;
		}
		
		public Lesson(int lid, String lname) {
			this.lid = lid;
			this.lname = lname;
		}
		
		public void m1() {
			System.out.println("In m1 of lesson");
		}
	}
	
	public Book() {
		bid = 0;
		bname = null;
		l1 = null;
	}
	
	public Book(int bid, String bname, int lid, String lname) {
		this.bid = bid;
		this.bname = bname;
		this.l1 = new Lesson(lid,lname);
	}
	
	public String toString() {
		return " bid "+ bid + " bname: "+ bname + " lid " + l1.lid + " lname "+ l1.lname;
	}
}

import java.util.Date;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s);
		
		Student s1 = new Student(10,"Sakshi",25,50,new Date(2003,0,11));
		System.out.println(s1);
		
		s1.setM1(70);
		System.out.println(s1.getM1());
	}

}

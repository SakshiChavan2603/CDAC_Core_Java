import java.util.Date;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentService {

	static Student[] studarr;
	static int cnt = 0;

	static {
		studarr = new Student[100];
		studarr[0] = new Student(1, "Sakshi", 80, 90, new Date(2003, 9, 23));
		studarr[1] = new Student(2, "Sakshi", 70, 79, new Date(2006, 10, 13));
		studarr[2] = new Student(3, "Prachi", 50, 40, new Date(2013, 9, 22));
		cnt = 3;
	}

	public static boolean addNewStudent() {
		if(cnt<100) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ID");
			int id = sc.nextInt();
		
			System.out.println("Enter the Name: ");
			String name = sc.next();
		
			System.out.println("Enter the Marks1");
			float m1 = sc.nextFloat();
		
			System.out.println("Enter the Marks2");
			float m2 = sc.nextFloat();
		
			System.out.println("Enter the Date of Birth");
			String date = sc.next();
		
			Date bdate = null;
		
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
			try {
				bdate = sdf.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			studarr[cnt] = new Student(id,name,m1,m2,bdate);
			cnt++;
			return true;
		}else {
			return false;
		}
	}

	public static Student[] displayAllData() {
		return studarr;
//		Student[] arr = new Student[cnt];
//		for(Student s: studarr) {
//			if(s==null) {
//				break;
//			}
//		}
		
	}

	public static boolean searchById(int id) {
		for(Student s: studarr) {
			if(s!=null) {
				if(s.getId() == id) {
					return true;
				}
			}
		}
		return false;
	}

	public static Student[] serachByName(String name) {
		Student[] arr = new Student[cnt];
		int i=0;
		for(Student s:studarr) {
			if(s!=null) {
				if(s.getName().equals(name)) {
					arr[i] = s;
					i++;
				}else {
					break;
				}
			}
		}
		if(i>0) {
			return arr;
		}
		return null;	
	}

	public static boolean updateMarks(int id, float m1, float m2) {
		if(studarr != null) {
			for(Student s:studarr) {
				if(s!=null) {
					if(s.getId()==id) {
						s.setM1(m1);
						s.setM2(m2);
						return true;
					}
				}else {
					break;
				}
			}
		}
		return false;
	}
	
	
}

import java.util.*;

public class TestStudentArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.print(" 1. Add new Student\n 2. Display All\n 3. Serach By id\n");
			System.out.print(" 4. Serach By Name\n 5.Update Marks\n 6.Exit\n");
			System.out.print("Enter the Choice\n");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					boolean status = StudentService.addNewStudent();
					if(status) {
						System.out.println("Student added Successfully");
					}else {
						System.out.println("Not added successfully");
					}
					break;
				
				case 2:
					Student[] stuarr = StudentService.displayAllData();
					for(Student s : stuarr) {
						if(s==null)
							break;
						System.out.println(s);
					}
					break;
				
				case 3:
					System.out.println("Entre the id to search:");
					int id = sc.nextInt();
					status = StudentService.searchById(id);
					if(status) {
						System.out.println("Studnet found");
					}else {
						System.out.println("Student not found");
					}
					break;
				
				case 4:
					System.out.println("Enter the Name to search");
					String name = sc.next();
					Student[] arr = StudentService.serachByName(name);
					if(arr!=null) {
						for(Student s: arr) {
							if(s!=null) {
								System.out.println(s);
							}else {
								break;
							}	
						}
					}else {
						System.out.println("not found");
					}
					break;
					
				case 5:
					System.out.println("Enter the id of student to update");
					id = sc.nextInt();
					
					System.out.println("Enter the m1 marks:");
					float m1 = sc.nextFloat();
					
					System.out.println("Enter the m2 marks");
					float m2 = sc.nextFloat();
					status = StudentService.updateMarks(id,m1,m2);
					if(status) {
						System.out.println("Updated successfully");
					}else {
						System.out.println("not found");
					}
					break;
				
				case 6:
					System.exit(0);
				
				default:
					System.out.println("Invalid choice");
					break;
			}
		}while(choice!=6);
	}

}

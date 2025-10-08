import java.util.*;

public class TestIPLTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.print(" 1. Display all Teams\n 2.Add new Team\n 3.Add new Player");
			System.out.print(" 4. Find team by id\n 5.Find team by player\n 6.Exit\n");
			System.out.print("Enter the choice\n");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					TeamService.displayAllTeams();
					break;
				
				case 2:
					boolean status=TeamService.addNewTeam();
					if(status) {
						System.out.println("Team added successfully!");
					}else {
						System.out.println("Team not added");
					}
					break;
			}

		}while(choice!=6);
	}

}

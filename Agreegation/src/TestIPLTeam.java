import java.util.*;

public class TestIPLTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.print(" 1. Display all Teams\n 2.Add new Team\n 3.Add new Player\n");
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
						System.out.println("Player added successfully!");
					}else {
						System.out.println("Team not added");
					}
					break;
				
				case 3:
					System.out.println("Enetr Teamr id");
					int tid = sc.nextInt();
					System.out.println("Enetr Player id");
					int pid = sc.nextInt();
					System.out.println("Enetr Player name");
					String pname = sc.next();
					sc.nextLine();
					System.out.println("Enetr speciality");
					String sp = sc.next();
					status = TeamService.addNewPlayer(tid,pid,pname,sp);
					if(status) {
						System.out.println("Team added successfully!");
					}else {
						System.out.println("Team not added");
					}
					break;
				
				case 4:
					System.out.println("Enetr Team id");
					tid = sc.nextInt();
					Team t = TeamService.findTeamByid(tid);
					if(t!=null) {
						System.out.println(t);
					}else {
						System.out.println("Team not found");
					}
					break;
				
				case 5:
					System.out.println("Enter the player id");
					pid = sc.nextInt();
					Team t1 = TeamService.findTeamByPlayerId(pid);
					if(t1!=null) {
						System.out.println(t1);
					}else {
						System.out.println("Player not found");
					}
					break;
				case 6:
					System.exit(0);
				
				default:
					System.out.println("Invalid Choice");
					break;			
			}

		}while(choice!=6);
	}

}

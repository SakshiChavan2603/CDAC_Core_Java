
public class TeamService {
	static Team[] tarr;
	static int count = 0;
	
	static {
		tarr = new Team[20];
		//first team
		Player[] plist = new Player[11];
		plist[0] = new Player(45,"Rohit Sharma","BatsMan");
		plist[1] = new Player(18,"Virat Kohali","BatsMan");
		plist[2] = new Player(98,"Bumarah","Bowler");
		Player c = new Player(45,"Rohit Sharma","BatsMan");
		tarr[0] = new Team(1,"Mumbai Indians",c,plist,3);
		
		//second team
		Player[] plist1 = new Player[11];
		plist[0] = new Player(65,"Shreyas Iyer","BatsMan");
		plist[1] = new Player(38,"Hardik Pandya","BatsMan");
		plist[2] = new Player(58,"Rishbh Pant","Bowler");
		Player c1 = new Player(65,"Shreyas Iyer","BatsMan");
		tarr[1] = new Team(1,"Mumbai Indians",c1,plist1,3);
		
		count = 2;	
	}

	public static void displayAllTeams() {
		for(Team t : tarr) {
			if(t!=null) {
				System.out.println(t);
			}else {
				break;
			}
		}
	}

	public static boolean addNewTeam() {
		if(count < tarr.length) {
			System.out.println("Enetr team id");
		}
	}
	
	
}

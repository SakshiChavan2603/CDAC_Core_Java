import java.util.*;

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
		plist1[0] = new Player(65,"Shreyas Iyer","BatsMan");
		plist1[1] = new Player(38,"Hardik Pandya","BatsMan");
		plist1[2] = new Player(58,"Rishbh Pant","Bowler");
		Player c1 = new Player(65,"Shreyas Iyer","BatsMan");
		tarr[1] = new Team(2,"Chenni",c1,plist1,3);
		
		count = 2;	
	}

	//display all teams
	public static void displayAllTeams() {
		for(Team t : tarr) {
			if(t!=null) {
				System.out.println(t);
			}else {
				break;
			}
		}
	}
	
	// add new team
	public static boolean addNewTeam() {
		Scanner sc = new Scanner(System.in);
		if(count < tarr.length) {
			
			//create team
			System.out.println("Enetr team id");
			int tid = sc.nextInt();
			System.out.println("Enetr team name");
			String tname = sc.next();
			
			//create captain
			System.out.println("Enetr Player id");
			int pid = sc.nextInt();
			System.out.println("Enetr Player name");
			String pname = sc.next();
			System.out.println("Enetr speciality");
			String sp = sc.next();
			Player c = new Player(pid,pname,sp);
			
			Player[] plist = new Player[15];
			plist[0] = c;
			int i=1;
			String ans;
			//add players
			do {
				System.out.println("Enetr Player id");
				pid = sc.nextInt();
				System.out.println("Enetr Player name");
				pname = sc.next();
				sc.nextLine();
				System.out.println("Enetr speciality");
				sp = sc.next();
				Player p = new Player(pid,pname,sp);
				plist[i] = p;
				System.out.println("Do you want to add palyer (y/n)");
				ans = sc.next();
			}while(ans.equals("y"));
			
			tarr[count] = new Team(tid,tname,c,plist,i);
			count++;	
			return true;
		}else {
			return false;
		}
	}
	
	//add new player to the team
	public static boolean addNewPlayer(int tid, int pid, String pname, String sp) {
		Team t = findTeamByid(tid);
		
		if(t!=null) {
			Player p = new Player(pid,pname,sp);
			int size = t.getSize();
			t.getPlist()[size] = p;
			t.setSize(size+1);
			return true;
		}
		return false;
		
	}
	
	//find team by id
	public static Team findTeamByid(int tid) {
		for(Team t : tarr) {
			if(t!=null) {
				if(t.getTId() == tid) {
					return t;
				}
			}else {
				break;
			}
		}
		return null;
	}
	
	//find team by player id
	public static Team findTeamByPlayerId(int pid) {
		for(Team t1: tarr) {
			if(t1!=null) {
				//get player list of the particular team
				Player[] plist = t1.getPlist();
				if(plist!=null) {
					for(Player p: plist) {
						if(p!=null) {
							if(p.getPId() == pid) {
								return t1;
							}
						}else{
							continue;
						}
					}
				}
				
			}else {
				break;
			}
		}
		return null;
	}
	
}

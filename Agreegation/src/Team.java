import java.util.Arrays;

public class Team {
	private int id ;
	private String tname;
	Player captain;
	Player[] plist;
	int size;
	public Team() {
		super();
	}
	public Team(int id, String tname, Player captain, Player[] plist, int size) {
		super();
		this.id = id;
		this.tname = tname;
		this.captain = captain;
		this.plist = plist;
		this.size = size;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Player getCaptain() {
		return captain;
	}
	public void setCaptain(Player captain) {
		this.captain = captain;
	}
	public Player[] getPlist() {
		return plist;
	}
	public void setPlist(Player[] plist) {
		this.plist = plist;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", tname=" + tname + ", captain=" + captain + ", plist=" + Arrays.toString(plist)
				+ ", size=" + size + "]";
	}
	
}

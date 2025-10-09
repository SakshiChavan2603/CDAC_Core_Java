
public class Player {
	
	private int pid;
	private String name;
	private String speciality;
	
	public Player() {
		pid = 0;
		name = null;
		speciality = null;
	}

	public Player(int id, String name, String sp) {
		this.pid =id;
		this.name = name;
		speciality = sp;
	}
	
	public int getPId() {
		return pid;
	}

	public void setPId(int id) {
		this.pid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "Player [id=" + pid + ", name=" + name + ", speciality=" + speciality + "]";
	}
	
	
}

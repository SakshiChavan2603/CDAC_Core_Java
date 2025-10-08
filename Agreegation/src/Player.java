
public class Player {
	
	private int id;
	private String name;
	private String speciality;
	
	public Player() {
		id = 0;
		name = null;
		speciality = null;
	}

	public Player(int id, String name, String sp) {
		this.id =id;
		this.name = name;
		speciality = sp;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Player [id=" + id + ", name=" + name + ", speciality=" + speciality + "]";
	}
	
	
}

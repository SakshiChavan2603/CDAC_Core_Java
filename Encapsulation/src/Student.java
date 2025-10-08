import java.util.Date;

public class Student {
	private int id;
	private String name;
	private float m1;
	private float m2;
	private Date bdate;
	
	//Default Constructor
	public Student() {
		id = 0;
		name = null;
		m1 = 0.0f;
		m2 = 0.0f;
		bdate = null;
	}
	
	//Parameterized Constructor
	public Student(int id,String nm, float m1, float m2, Date bdate) {
		this.id = id;
		name = nm;
		this.m1= m1;
		this.m2 = m2;
		this.bdate = bdate;
	}
	
	//Setter
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setM1(float m1) {
		this.m1 = m1;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	
	//Getter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getM1() {
		 return m1;
	}
	public float getM2() {
		return m2;
	}
	public Date getBdate() {
		return bdate;
	}
	
	public String toString() {
		return "ID:" + id + " Name: "+ name + " M1: " + m1 + " M2: "+ m2 + " Date: " + bdate;
	}
}

import java.util.Date;

public class VehicleService {
	private int Vid;
	private String Oname;
	private String type;
	private Date DateOfPurchase;
	
	//Default Constructor
	public VehicleService() {
		super();
	}
	
	//Parameterised Constructor
	public VehicleService(int vid, String oname, String type, Date dateOfPurchase) {
		super();
		Vid = vid;
		Oname = oname;
		this.type = type;
		DateOfPurchase = dateOfPurchase;
	}
	
	
	public int getVid() {
		return Vid;
	}
	public void setVid(int vid) {
		Vid = vid;
	}
	public String getOname() {
		return Oname;
	}
	public void setOname(String oname) {
		Oname = oname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateOfPurchase() {
		return DateOfPurchase;
	}
	public void setDateOfPurchase(Date dateOfPurchase) {
		DateOfPurchase = dateOfPurchase;
	}

	public String toString() {
		return "VehicleService [Vid=" + Vid + ", Oname=" + Oname + ", type=" + type + ", DateOfPurchase="
				+ DateOfPurchase + "]";
	}
	
	
}

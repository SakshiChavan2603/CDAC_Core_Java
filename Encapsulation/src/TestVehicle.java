import java.util.Date;

public class TestVehicle {

	public static void main(String[] args) {
		VehicleService v = new VehicleService();
		System.out.println(v);
		
		VehicleService v1 = new VehicleService(1, "BMW", "4 Wheeler", new Date(2025, 9, 06));
		
		System.out.println(v1);

	}

}

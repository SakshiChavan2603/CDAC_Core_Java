import java.util.*;

public class TestArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of row");
		int row = sc.nextInt();
		
		int arr[][] = new int[row][];
		
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		
		sc.close();
	}

}

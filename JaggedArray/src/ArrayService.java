import java.util.*;

public class ArrayService {

	public static void acceptData(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the size of "+ i +" column");
			int col = sc.nextInt();
			arr[i] = new int[col];
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enetr the data: ");
				arr[i][j]= sc.nextInt();
			}
		}
	}

	public static void displayData(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}

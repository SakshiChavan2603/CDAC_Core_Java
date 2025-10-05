import java.util.*;

public class ArrayService {
	
	//accept data to dyanamic array
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

	// display data of dynamic array
	public static void displayData(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	//find max from the dynamic array
	public static int findMaxFromArray(int[][] arr) {
		int max = arr[0][0];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(max<arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	
	//find max row-wise from dynamic array
	public static int[] maxRowwise(int[][] arr) {
		int[] temp = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			temp[i] = arr[i][0];
			for(int j=0;j<arr[i].length;j++) {
				if(temp[i]<arr[i][j]) {
					temp[i]= arr[i][j];
				}
			}
		}
		return temp;
	}
	
	//find max column-wise from dynamic array
	public static int[] maxColumnwise(int[][] arr) {
		
		//find maxlength of the column
		int maxlength = arr[0].length;
		for(int i=0;i<arr.length;i++) {
			if(maxlength < arr[i].length) {
				maxlength = arr[i].length;
			}
		}
		
		int[] temp = new int[maxlength];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(temp[j]<arr[i][j]) {
					temp[j] = arr[i][j];
				}
			}
		}
		return temp;
	}

	public static int[] additionRowwise(int[][] arr) {
		int temp[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum = sum + arr[i][j];
			}
			temp[i] = sum;
		}
		return temp;
	}

	public static int[] additionColumnwise(int[][] arr) {
		// TODO Auto-generated method stub
		return null;
	}

}

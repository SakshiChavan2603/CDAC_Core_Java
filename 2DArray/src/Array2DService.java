import java.util.*;

public class Array2DService {

	//Accept data
	public static void acceptData(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		
		for(int i =0 ;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println("Enter the data");
				arr[i][j] = sc.nextInt();
			}
		}
		
	}

	//Display data
	public static void displayData(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	//Addition of 2D Array
	public static int addArray(int[][] arr) {
		int sum =0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
		
	}

	//Row Wise Addition of 2D Array
	public static int[] rowwiseAddition(int[][] arr) {
		int temp[] = new int[arr.length];
		int k = 0;
		for(int i =0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			temp[k] = sum;
			k++;
		}
		if(k > 0) {
			return temp;
		} else {
			return null;
		}
		
	}

	//Column Wise Additon of 2D Array
	public static int[] columnwiseAddition(int[][] arr) {
		int k = 0;
		int temp[] = new int[arr.length];
		for(int i = 0; i < arr[0].length;i++) {
			int sum = 0;
			for(int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			temp[k] = sum;
			k++;
		}
		if(k > 0) {
			return temp;
		} else {
			return null;
		}
	}

	//Addition of 2 Arrays
	public static int[][] addTwoArray(int[][] arr, int [][] arr2) {
		int temp[][] = new int[arr.length][arr[0].length];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				temp[i][j] = arr[i][j] + arr2[i][j];
			}
		}
		return temp;
	}

	//Multiplication of 2 Arrays
	public static int[][] multiplyTwoArray(int[][] arr, int[][] arr2) {
		if(arr[0].length == arr2.length) {
			int temp[][] = new int[arr.length][arr2[0].length];
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr2[0].length; j++) {
					for(int k = 0; k < arr.length; k++) {
						temp[i][j] += arr[i][k] * arr2[k][j]; 
					}
				}
			}
			return temp;
			
		} else {
			return null;
		}
	}

	public static int[][] transpsoeMatrix(int[][] arr) {
		if(arr.length == arr[0].length) {
			int temp[][] = new int[arr.length][arr[0].length];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					temp[i][j] = arr[j][i];
				}
			}
			return temp;
		}else {
			return null;
		}
		
	}



}

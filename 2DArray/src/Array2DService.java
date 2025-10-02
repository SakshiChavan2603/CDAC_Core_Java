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

	//transpose of matrix
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
	
	//check matrix is identity or not
	public static boolean checkIdentityMatrix(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j && arr[i][j]!=1) {
					return false;
				}else if(i!=j && arr[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}

	//rotate array row- wise upward
	public static int[][] rotateByRowwise(int[][] arr, int n) {
		int temp[][] = new int[arr.length][arr[0].length];
		
		//copy arr into temp
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[i][j] = arr[i][j];
			}
		}
		//rotate array n times
		for(int rotate=0;rotate<n;rotate++) {
			//store last row in 1 array
			int temp1[] = temp[0];
		
			//shift rows
			for(int i=0;i<temp.length-1;i++) {
				temp[i]= temp[i+1];
			}
			//shift 1st row to last row
			temp[arr.length-1] = temp1;
		}
		return temp;
	}

	//rotate array column wise
	public static int[][] rotateByColumnwise(int[][] arr, int n) {
		int temp[][] = new int[arr.length][arr[0].length];
		
		//copy arr into temp
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[i][j] = arr[i][j];
			}
		}
		for(int rotate=0;rotate<n;rotate++) {
			//store last column value in new 1Darray
			int temp1[] = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				temp1[i] = temp[i][temp.length-1];
			}
		
			//shift all columns towards right by 1 column
			//storing from 2nd last column
			for(int i=0; i<temp.length; i++) {
				for(int j=temp[i].length-2; j>=0 ; j--) {
					temp[i][j+1] = temp[i][j];
				}
			}
		
			//copy temp1 to the 0th index
			for(int i=0; i<temp.length; i++) {
				temp[i][0] = temp1[i];
			}
		}
		
		return temp;
	}

	//convert 2D array to 1D array
	public static int[] convert2Dto1D(int[][] arr) {
		int temp[] = new int[arr.length*arr[0].length];
		int k = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				temp[k] = arr[i][j];
				k++;
			}
		}
		return temp;
	}

	//Maximum from the 2D array;
	public static int maxFrom2DArray(int[][] arr) {
		int max = arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	
	//Maximum row-wise
	public static int[] maxRowwise(int[][] arr) {
		int temp[] = new int[arr.length];
		int max;
		int k =0;
		
		for(int i=0;i<arr.length;i++) {
			max = arr[i][0];
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
					temp[k] = arr[i][j];
				}
			}
			//temp[k] = max;
			k++;
		}
		return temp;
	}

	public static int[] maxColumwise(int[][] arr) {
		int temp[] = new int[arr[0].length];
		int max;
		int k=0;
		
		for(int i=0;i<arr[0].length;i++) {   //column
			max = arr[0][i];
			for(int j=0;j<arr.length;j++) {  //row
				if(arr[j][i] > max) {
					//max = arr[j][i];
					temp[k] = arr[j][i];
				}
			}
			//temp[k] = max;
			k++;
		}
		return temp;
		
	}
	
	



}

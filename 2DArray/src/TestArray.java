import java.util.*;

public class TestArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the size for row");
		int row = sc.nextInt();
		
		System.out.println("enetr the size for columns");
		int col = sc.nextInt();
		
		int [][] arr = new int[row][col];
		Array2DService.acceptData(arr);
		System.out.println("1st Array Data:");
		Array2DService.displayData(arr);
		
		//For 2nd Array
		int [][] arr2 = new int[row][col];
		Array2DService.acceptData(arr2);
		System.out.println("2nd Array Data:");
		Array2DService.displayData(arr2);
		
		int choice;
		do {
			System.out.print(" 1.Addition of 2D array\n 2.Rowwise Addition\n 3.Columnwise Addition\n");
			System.out.print(" 4. Addition of Two Array\n 5. Multiplication of Two Array\n");
			System.out.print(" 6. Transpose of Matrix\n 7. Check Identity Matrix\n");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					int sum = Array2DService.addArray(arr);
					System.out.println("Sum of the 2D array is : " + sum);
					break;
					
				case 2:
					int temp[] = Array2DService.rowwiseAddition(arr);
					for(int val:temp) {
						System.out.println(val);
					}
					break;
					
				case 3:
					int temp1[] = Array2DService.columnwiseAddition(arr);
					for(int val:temp1) {
						System.out.println(val);
					}
					break;
					
				case 4:
					int temp2[][] = Array2DService.addTwoArray(arr, arr2);
					Array2DService.displayData(temp2);
					break;
					
				case 5:
					int temp3[][] = Array2DService.multiplyTwoArray(arr, arr2);
					if(temp3 == null) {
						System.out.println("Can't do MUltiplication");
					} else {
						Array2DService.displayData(temp3);
					}
					break;
					
				case 6:
					int temp4[][] = Array2DService.transpsoeMatrix(arr);
					if(temp4 == null) {
						System.out.println("Can't do tranpose of matrix");
					}else {
						Array2DService.displayData(temp4);
					}
					break;
					
				case 7:
					
		
			}
		}while(choice!=15);

	}

}

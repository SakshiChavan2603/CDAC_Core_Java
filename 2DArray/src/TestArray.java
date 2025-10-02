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
//		int [][] arr2 = new int[row][col];
//		Array2DService.acceptData(arr2);
//		System.out.println("2nd Array Data:");
//		Array2DService.displayData(arr2);
		
		int choice;
		do {
			System.out.print(" 1.Addition of 2D array\n 2.Rowwise Addition\n 3.Columnwise Addition\n");
			System.out.print(" 4. Addition of Two Array\n 5. Multiplication of Two Array\n");
			System.out.print(" 6. Transpose of Matrix\n 7. Check Identity Matrix\n");
			System.out.print(" 8. Rotate array rowwise\n 9. Rotate array columwise\n");
			System.out.print(" 10. Convert 2D array into 1D array\n");
			System.out.print(" 11. Maximum from the array\n 12. maximum rowwise\n 13. maximum columnwise\n");
			System.out.print(" 14. Exit\n");
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
					
//				case 4:
//					int temp2[][] = Array2DService.addTwoArray(arr, arr2);
//					Array2DService.displayData(temp2);
//					break;
//					
//				case 5:
//					int temp3[][] = Array2DService.multiplyTwoArray(arr, arr2);
//					if(temp3 == null) {
//						System.out.println("Can't do MUltiplication");
//					} else {
//						Array2DService.displayData(temp3);
//					}
//					break;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
					
				case 6:
					int temp4[][] = Array2DService.transpsoeMatrix(arr);
					if(temp4 == null) {
						System.out.println("Can't do tranpose of matrix");
					}else {
						Array2DService.displayData(temp4);
					}
					break;
					
				case 7:
					boolean status = Array2DService.checkIdentityMatrix(arr);
					if(status) {
						System.out.println("This is identity matrix");
					}else {
						System.out.println("This is not identity matrix");
					}
					break;
					
				case 8:
					System.out.println("Enetr the no of rotation rowwise");
					int n = sc.nextInt();
					int temp5[][] = Array2DService.rotateByRowwise(arr,n);
					Array2DService.displayData(temp5);
					break;
					
				case 9:
					System.out.println("Enetr the no of rotation column-wise");
					n = sc.nextInt();
					int temp6[][] = Array2DService.rotateByColumnwise(arr,n);
					Array2DService.displayData(temp6);
					break;
				
				case 10:
					int temp7[] = Array2DService.convert2Dto1D(arr);
					for(int val: temp7) {
						System.out.print(val + "\t");
					}
					break;
				
				case 11:
					int max = Array2DService.maxFrom2DArray(arr);
					System.out.println("Maximum fom the array is "+ max);
					break;
				
				case 12:
					int temp8[] = Array2DService.maxRowwise(arr);
					for(int i=0;i<temp8.length;i++) {
						System.out.println(i + " row max element is " + temp8[i]);
					}
					break;
				
				case 13:
					int temp9[] = Array2DService.maxColumwise(arr);
					for(int i=0;i<temp9.length;i++) {
						System.out.println(i + " column max element is " + temp9[i]);
					}
					break;
					
				case 14:
					System.out.println("Exit");
					System.exit(0);
					break;
					
				default:
					System.out.println("Entre valid choice...");
					break;
			
			}
		}while(choice!=14);

	}

}

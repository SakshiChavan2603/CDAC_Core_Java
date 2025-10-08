import java.util.*;

public class TestArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of row");
		int row = sc.nextInt();
		
		int arr[][] = new int[row][];
		
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		int choice;
		do {
			System.out.print(" 1. Max from the array\n 2. Max row-wise\n 3. Max column-wise\n");
			System.out.print(" 4. Addition row-wise\n 5. Addition colum-wise\n 6. Addition of all element\n");
			System.out.print(" 7. Exit\n");
			System.out.println("enter the choice");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					int max = ArrayService.findMaxFromArray(arr);
					System.out.println("Maximum:"+max);
					break;
					
				case 2:
					int[] temp = ArrayService.maxRowwise(arr);
					for(int i=0;i<temp.length;i++) {
						System.out.println(i+1 + "Row max value is "+ temp[i]);
					}
					break;
					
				case 3:
					temp = ArrayService.maxColumnwise(arr);
					for(int i=0;i<temp.length;i++) {
						System.out.println(i+1 + "Column max value is "+ temp[i]);
					}
					break;
				
				case 4:
					temp = ArrayService.additionRowwise(arr);
					for(int i=0;i<temp.length;i++) {
						System.out.println("Addition of "+ (i+1) + " " + temp[i]);
					}
					break;
					
				case 5:
					temp = ArrayService.additionColumnwise(arr);
					for(int i=0;i<temp.length;i++) {
						System.out.println("Addition of "+ (i+1) + " " + temp[i]);
					}
					break;
				
				case 6:
					int sum = ArrayService.additionArray(arr);
					System.out.println("Addition of Array is "+sum);
					break;
				
				case 7:
					System.out.println("Thank You!!");
					System.exit(0);
				
				default:
					System.out.println("Invalid Choice!");
					break;
			}

			
		}while(choice!=7);
		sc.close();
	}

}

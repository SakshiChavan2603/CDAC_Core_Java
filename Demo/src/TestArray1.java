import java.util.*;
class TestArray1{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Entre the size of the array\n");
	int size = sc.nextInt();
	
	int[] arr = new int[size]; 

	int choice;
	
	
	do{
		System.out.print(" 1.Accept Data\n 2.Display Data\n 3.Find Min Number\n 4.Find MAx number\n 5.Find nth Min\n 6.Find nth Max\n 7.Serach By value\n 8..Exit\n");
		System.out.println("Eneter the choice:");
		choice = sc.nextInt();
		switch(choice){
			case 1:
				ArrayService.acceptData(arr);
				break;
			case 2:
				ArrayService.displayData(arr);
				break;
			case 3:
				int min = ArrayService.findMinNo(arr);
				System.out.println("Minimum No is "+min);
				break;
			case 4:
				int max = ArrayService.findMaxNo(arr);
				System.out.println("Maximum No is "+max);
				break;
			case 5:
				int n;
				System.out.println("Enter the position for nth minimum element");
				n = sc.nextInt();
				int nthMin = ArrayService.nthMinimum(arr,n);
				System.out.println(n+"Minimum element is"+nthMin);
				break;
			case 6:
				System.out.println("Enter the position for nth maximum element");
				n = sc.nextInt();
				int nthMax = ArrayService.nthMaximum(arr,n);
				System.out.println(n+"Maximum element is"+nthMax);
				break;
		
			case 7:
				int ele;
				System.out.println("Element the elemnt to search");	
				ele = sc.nextInt();
				if(ArrayService.searchByValue(arr,ele)){
					System.out.println(ele +" Found");
				}else{
					System.out.println(ele + " Not found");
				}
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
		}
	}while(choice!=0);
	sc.close();
	}
}
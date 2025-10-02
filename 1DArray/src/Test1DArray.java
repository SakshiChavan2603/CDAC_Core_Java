import java.util.*;

public class Test1DArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		Array1DService.acceptData(arr);
		Array1DService.displayData(arr);
		
		int choice;
		
		do {
			System.out.print("1.Display All Prime no\n 2.Addition of odd No\n");
			System.out.print(" 3.Find Factorial of elemnets which are less than 7\n ");
			System.out.print("4.Find nth max prime no\n 5.Find nth min prime no\n");
			System.out.print("Enetr the choice:\n");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					int[] prime = new int[size];
					prime = Array1DService.displayAllPrime(arr);
					Array1DService.displayData(prime);
					break;
					
				case 2:
					int sum = Array1DService.sumOfOdd(arr);
					System.out.print("Sum of odd numbers is: "+ sum+"\n");
					break;
					
				case 3:
					int[] fact = new int[size];
					fact = Array1DService.factorialOfNoLess7(arr);
					Array1DService.displayData(fact);
				case 4:
					int pos;
					System.out.println("Enetr the position to find out prime number");
					pos = sc.nextInt();
					
					int maxPrime = Array1DService.nthMaxPrime(arr,pos);
					
					if(maxPrime == 0) {
						System.out.println("Element is not preset at "+ pos + "th position");
					}else {
						System.out.println(pos + " at this prime no is "+ maxPrime);
					}
					break;
				case 5:
					System.out.println("Enetr the position to find out prime number");
					pos = sc.nextInt();
					
					int minPrime = Array1DService.nthMinPrime(arr,pos);
					
					if(minPrime == 0) {
						System.out.println("Element is not preset at "+ pos + "th position");
					}else {
						System.out.println(pos + " at this prime no is "+ minPrime);
					}
					break;
			}
		}while(choice!=6);
	}
}
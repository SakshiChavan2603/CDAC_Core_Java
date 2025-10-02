import java.util.Scanner;

public class Array1DService {
	
	//Accept data from user
	public static void acceptData(int[] arr){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("Enetr the data");
			arr[i] = sc.nextInt();
		}
	}
	
	//display data
	public static void displayData(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
	//To check no is prime or not
	private static boolean isPrime(int n) {
		if(n == 2) {
			return true;
		}else if(n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	//display all prime numbers from the array
	public static int[] displayAllPrime(int[] arr) {
		int[] prime = new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				prime[j] = arr[i];
				j++;
			}
		}
		return prime;
	}

	//addition of odd numbers in array
	public static int sumOfOdd(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	//Factorial of numbers that are less than 7
	public static int[] factorialOfNoLess7(int[] arr) {
		int factorial[] = new int[arr.length];
		int k =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<7) {
				int fact = 1;
				for(int j=1;j<=arr[i];j++) {
					fact = fact *j;
				}
				factorial[k] =fact;
				k++;
			}
		}
		return factorial;
	}
	
	//maximum position of element
	private static int findMaxPos(int[] arr, int start){
		int pos = start;
		int max = arr[pos];
		for(int i=start+1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
				pos = i;
			}
		}
		return pos;	
	}
	
	//nth maximum no in the prime no array
	private static int nthMaximum(int[] arr, int n){
		for(int i=0;i<n;i++){
			int pos = findMaxPos(arr,i);
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		return (arr[n-1]);
	}
	
	//nth prime number from the given array
	public static int nthMaxPrime(int[] arr, int pos) {
		int prime1[] = new int[arr.length];
		prime1 = Array1DService.displayAllPrime(arr);
		int maxPrime = Array1DService.nthMaximum(prime1, pos);
		return maxPrime;
	}
	
	//find position of minimum element
	private static int findMinPos(int[] arr, int start){
		int pos = start;
		int min = arr[pos];
		for(int i=start+1;i<arr.length;i++){
			if(arr[i]<min && arr[i]!=0){
				min = arr[i];
				pos = i;
			}
		}
		return pos;
	}

	//nth minimum prime no 
	public static int nthMinimum(int[] arr, int n){
		for(int i=0;i<n;i++){
			int pos = findMinPos(arr,i);
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		return (arr[n-1]);
	}

	// nth minimum prime no 
	public static int nthMinPrime(int[] arr, int pos) {
		int prime2[] = new int[arr.length];
		prime2 = Array1DService.displayAllPrime(arr);
		Array1DService.displayData(prime2);
		int minPrime = Array1DService.nthMinimum(prime2, pos);
		return minPrime;
	}
}

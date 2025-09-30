import java.util.*;
class MaximumNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number ");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd number ");
		int n2 = sc.nextInt();
		System.out.println("Enter 3rd number ");
		int n3 = sc.nextInt();

		if(n1 == n2 && n2 == n3) {
			System.out.println("Numbers are equal");
		} else {
			if(n1 > n2 && n1 > n3) {
				System.out.println("Number 1 is greater");
			} else if(n2 > n1 && n2 > n3) {
				System.out.println("Number 2 is greater");
			} else {
				System.out.println("Number 3 is greater");
			}
		}
	}  
}
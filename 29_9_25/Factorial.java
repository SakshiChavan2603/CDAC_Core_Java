import java.util.Scanner;
class Factorial {
	public int factorial(int n) {
		if(n <= 1) {
			return 1;
		} else {
			int fact = 1;
			for(int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			return fact;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int n = sc.nextInt();

		//int fact = factorial(n);
		//System.out.println("Factorial " + fact);

		//int fact = Factorial.factorial(n);
		//System.out.println("Factorial " + fact);

		Factorial f = new Factorial();
		int result = f.factorial(n);
		System.out.println("Factorial " + result);
	} 
}
import java.util.*;
class ArrayService{
	
	public static void acceptData(int[] arr){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("Enetr the data");
			arr[i] = sc.nextInt();
		}
	}

	public static void displayData(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}

	public static int findMinNo(int[] arr){
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}

	public static int findMaxNo(int[] arr){
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
	

	private static int findMinPos(int[] arr, int start){
		int pos = start;
		int min = arr[pos];
		for(int i=start+1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
				pos = i;
			}
		}
		return pos;
	}

	public static int nthMinimum(int[] arr, int n){
		for(int i=0;i<n;i++){
			int pos = findMinPos(arr,i);
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		return (arr[n-1]);
	}

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
	
	public static int nthMaximum(int[] arr, int n){
		for(int i=0;i<n;i++){
			int pos = findMaxPos(arr,i);
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		return (arr[n-1]);
	}

	public static boolean searchByValue(int[] arr, int ele){
		for(int i=0;i<arr.length;i++){
			if(ele == arr[i]){
				return true;
			}
		}
		return false;
	}
}
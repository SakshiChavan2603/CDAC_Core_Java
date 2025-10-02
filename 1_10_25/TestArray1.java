class TestArray1{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Entre the size of the array\n");
	int size = sc.nextInt();
	
	int[] arr = new arr[size]; 

	int choice;
	System.out.print("1.Accept Data\n 2.Display Data\n 3.Find Min Number\n 4.Find MAx number\n 5.Find nth Min\n 6.Find nth Max\n 7.Serach By value\n 8..Exit");
	System.out.println("Enetre the choice");
	choice = sc.nextInt();

	switch(choice){
		case 1:
			acceptData(arr);
			break;
		case 2:
			dispalyData(arr);
			break;
		case 3:
			int min = findMinNo(arr);
			System.out.print("Minimum No is "+min);
			break;
		case 4:
			int max = findMaxNo(arr);
			System.out.print("Maximum No is "+max);
			break;
		case 5:
			int n;
			System.out.println("Enter the position for nth minimum element");
			n = sc.nextInt();
			int nthMin = nthMinimum(arr,n);
			System.out.println(n+"Minimum element is"+nthMin);
			break;
		case 6:
			int n;
			System.out.println("Enter the position for nth maximum element");
			n = sc.nextInt();
			int nthMax = nthMaximum(arr,n);
			System.out.println(n+"Maximum element is"+nthMax);
			break;
		
		case 7:
			int ele;
			System.out.println("Element the elemnt to search");	
			ele = sc.nextInt();
			if(searchByValue(arr,ele)){
				System.out.println(ele+" Found");
			}else{
				System.out.println(ele+ " Not found");
			}
		case 8:
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
	}

	}
}
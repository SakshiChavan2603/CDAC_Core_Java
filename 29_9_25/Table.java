import java.util.*;
class Table{
	public static void printTable(int n){
		if(n<=0){
			System.out.println("Table cannot formed");
		}else{
			for(int i=1;i<=10;i++){
				System.out.println(n + "*" + i + "=" + (n*i));
			}
		}
	}

	public static void main(String[] args){
		if(args.length <=0){
			System.out.println("Error: Pass min 1 Parameter");
		}else{
			int n = Integer.parseInt(args[0]);
			printTable(n);
		}
	}

}
class CommansLineAdd{
	public static void main(String[] args){
		if(args.length<=0){
			System.out.println("Error: Pass min 1 parameters");
		}else{
			int sum = 0;
			for(int i=0;i<args.length;i++){
				sum = sum + Integer.parseInt(args[i]);
			}
			System.out.println("Addition: "+sum);
		}

		
	}
}
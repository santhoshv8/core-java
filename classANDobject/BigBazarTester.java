class BigBazarTester {
	
	public static void main(String a[]){
		
	BigBazar ref =new BigBazar();
	
	ref.branch="J P nagar";
	ref.gstNo="AAA4524461YYY";
	ref.noOfWorkers = 100;
	
	System.out.println(ref.branch);
	System.out.println(ref.gstNo);
	System.out.println(ref.noOfWorkers);
	
	BigBazar big = ref ;
	
	System.out.println(big.branch);
	System.out.println(big.gstNo);
	System.out.println(big.noOfWorkers);
	}

}
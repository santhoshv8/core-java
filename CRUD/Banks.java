class Banks{
      
	    static String banksNames[]={null,null,null,null,null}; 
		
		static int index ;
		
		public static boolean addBanksNames(String bankName){ 
		     
			   System.out.println("inside addBankNames");
			       
			   				   
				  banksNames[index] = bankName;   
				  index++; 
               
			   System.out.println("end of addBanksNames");
			   return true ;
		}
		public static void getBanksNames(){
			
			for(int index = 0 ; index<banksNames.length ; index++){
				String ref = banksNames[index];
				
				System.out.println("Banks Name is "+ ref);
			}
		}
}
class Stadium{
      
	    static String stadiumNames[]={null,null,null,null,null}; 
		
		static int index ;
		
		public static boolean addStadiumNames(String stadiumName){ 
		     
			   System.out.println("inside addStadiumNames");
			       
			   				   
				  stadiumNames[index] = stadiumName;   
				  index++; 
               
			   System.out.println("end of addStadiumNames");
			   return true ;
		}
		public static void getStadiumNames(){
			
			for(int index = 0 ; index<stadiumNames.length ; index++){
				String ref = stadiumNames[index];
				
				System.out.println("Stadium Name is "+ ref);
			}
		}
}
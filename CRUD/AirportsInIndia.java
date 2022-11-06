class AirportsInIndia{
      
	    static String airportsNames[]={null,null,null,null,null}; 
		
		static int index ;
		
		public static boolean addAirportsNames(String airportsName){ 
		     
			   System.out.println("inside addAirportNames");
			       
			   				   
				  airportsNames[index] = airportsName;   
				  index++; 
               
			   System.out.println("end of addAirportsNames");
			   return true ;
		}
		public static void getAirportsNames(){
			
			for(int index = 0 ; index<airportsNames.length ; index++){
				String ref = airportsNames[index];
				
				System.out.println("Airport Name is "+ ref);
			}
		}
}
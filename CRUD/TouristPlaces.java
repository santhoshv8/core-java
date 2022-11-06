class TouristPlaces{
      
	    static String touristPlacesNames[]={null,null,null,null,null}; 
		
		static int index ;
		
		public static boolean addTouristPlacesNames(String touristPlacesName){ 
		     
			   System.out.println("inside addTouristPlacesNames");
			       
			   				   
				  touristPlacesNames[index] = touristPlacesName;   
				  index++; 
               
			   System.out.println("end of addTouristPlacesNames");
			   return true ;
		}
		public static void getTouristPlacesNames(){
			
			for(int index = 0 ; index<touristPlacesNames.length ; index++){
				String ref = touristPlacesNames[index];
				
				System.out.println("TouristPlaces Name is "+ ref);
			}
		}
}
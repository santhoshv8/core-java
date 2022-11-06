class Beaches{
      
	    static String beachNames[]={null,null,null,null,null}; //beachNames[]={"Malpe",null};
		
		static int index ;
		
		public static boolean addBeachNames(String beachName){ //saveBeach , storeBeach , createBeach
		     
			   System.out.println("inside addBeachNames");
			       // beachNames[0] = "Malpe" ; internal part
				   // beachNames[1] = "Marina" ;
                
			   				   
				  beachNames[index] = beachName;  //beachNames[index++] = beachName; 
				  index++; 
               
			   System.out.println("end of addBeachNames");
			   return true ;
		}
		//Read Operation
		public static void getBeachNames(){
			for(int index = 0 ; index<beachNames.length ; index++){
				String ref = beachNames[index];
				
				System.out.println("Beach Name is "+ ref);
			}
		}
}
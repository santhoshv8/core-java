class AirCooler
{
    static String brand ;
    static String color ;
    static String price ;
    static boolean isConnected ;
   
     public static boolean onOrOff()
     {
	     System.out.println("inside onOrOff()");
		 
		 if(isConnected == false)
		 {
		     isConnected = true ;
			 System.out.println("AirCooler is truned on");
		 }
		 else if(isConnected == true)
		 {
		      isConnected = false ;
			  System.out.println("AirCooler is truned off");
		 }
		 System.out.println("end of onOrOff");
		 return isConnected ;
     }	 
}
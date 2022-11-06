class Speaker
{
    static String brand ;
	static String color ;
	static int price ;
	static boolean isConnected ;
	static int minVolume ;
	static int currentVolume ;
	static int maxVolume ;
	
	public static boolean onOrOff()
	{
	     System.out.println("inside onOrOff()") ;
		 //update opration
		 if(isConnected == false)
		 {
		    isConnected = true ;
			System.out.println("speaker is truned on");
		 }
		 else if (isConnected == true)
		 {
		     isConnected = false ;
			 System.out.println("speaker is truned off");
		 }
		 System.out.println("end of onOrOff()");
		 return isConnected;
	}
	
	public static void increaseVolume()
	{
		//update opration
		System.out.println("inside increaseVolume()");
		if (isConnected == true)
		{
			if(currentVolume<maxVolume)
			{
				currentVolume=currentVolume+1;
				System.out.println("the current volume is: "+currentVolume);
			}
			else
			{
			    System.out.println("max volume reached...");	
			}
		}
			else
			{
				System.out.println("Gube....first speaker on madu");
			}
		
	}
	public static void decreaseVolume()
	{
		System.out.println("inside decreaseVolume()");
		if(isConnected == true)
		{
			if(currentVolume>minVolume)
			{
				currentVolume = currentVolume -1 ;
				System.out.println("The currentVolume is :" +currentVolume);
			}
			else
			{
				System.out.println("minVolume reached...");
			}
		}
			else
			{
				System.out.println("Gube....first speaker on madu");
			}
		
	}	
}
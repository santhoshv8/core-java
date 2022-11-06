class Zomato
{
   
   public static double takeOrder(String item )
   {
	   item = "Mosaranna" ;
	  if(item == "pizza")
	  {
	    System.out.println("Thank you for ordering " + item);
	  return 100;
	  }
	  if(item == "Burger")
	  {
	     System.out.println("Thank you for ordering " + item);
	  return 60;
	  }
	   if(item == "SouthIndianThali")
	  {
	     System.out.println("Thank you for ordering " + item);
	  return 250;
	  }
	   if(item == "Mosaranna")
	  {
	     System.out.println("Thank you for ordering " + item);
	  return 25;
	  }
	   if(item == "pastries")
	  {
	     System.out.println("Thank you for ordering " +  item);
	  return 60;
	  }
	  
	  return 0.0 ;
   }
   
    
   public static double takeOrder(String item , int quality )
   {
	 item = "Mosaranna" ;
	  quality = 58 ;
	  if(item == "pizza")
	  {
	    System.out.println("Thank you for ordering " + item);
	  return 100*quality;
	  }
	  if(item == "Burger")
	  {
	     System.out.println("Thank you for ordering " + item);
	  return 60*quality;
	  }
	   if(item == "SouthIndianThali")
	  {
	     System.out.println("Thank you for ordering " + item);
	  return 250*quality;
	  }
	   if(item == "Mosaranna")
	  {
	     System.out.println("Thank you for ordering " + item);
	  return 25*quality;
	  }
	   if(item == "pastries")
	  {
	     System.out.println("Thank you for ordering " +  item);
	  return 60*quality;
	  }
	  
	  return 0.0 ;
   }
}
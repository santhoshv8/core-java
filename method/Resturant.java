class Resturant
{
   static void getFoodMenu(String [] foodMenu)
   {
      System.out.println("inside getFoodMenu method ");
	  System.out.println("Food Menu size is " + foodMenu.length);
	  System.out.println("List of foodMenu are ");
	  for(int f=0 ; f< foodMenu.length ; f++)
	  {
		  System.out.println(foodMenu[f]);
	  }
	  System.out.println("end of getFoodMenu method ");
	  
   }
}

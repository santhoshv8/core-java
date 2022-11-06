class ShowRoom
{
  static void getCars(String [] cars)
  {
     System.out.println("inside getCars() ") ;
	 System.out.println("no of cars " + cars.length);
	 System.out.println("List of cars") ;
	 for (int c=0; c<cars.length; c++)
	 {
	    System.out.println(cars[c]);
	 }
	 System.out.println("end of getCars() ");
  }
  static void getBikes(String [] bikes)
  {
     System.out.println("inside getBikes() ") ;
	 System.out.println("no of bikes " + bikes.length);
	 System.out.println("List of bikes") ;
	 for (int b=0; b<bikes.length; b++)
	 {
	    System.out.println(bikes[b]);
	 }
	 System.out.println("end of getBikes() ");
  }
}
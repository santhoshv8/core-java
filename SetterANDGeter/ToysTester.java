class ToysTester
{
   public static void main(String [] args)
   {
      Toys.setToysName("Panda");
	  Toys.setToysColor("White");
	  Toys.setToysPrice(1000);
	  
	  System.out.println("The Toy Name is " + Toys.getToysName());
	  System.out.println("The Toy Color is " + Toys.getToysColor());
	  System.out.println("The Toy Price is " + Toys.getToysPrice());
   }
}
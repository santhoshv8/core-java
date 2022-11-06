class LgWashingMachineTester
{
   public static void main (String a[])
   {
       System.out.println("main method started");
	   
	   LgWashingMachine.brand = "LG" ;
	   LgWashingMachine.color = "white" ;
	   LgWashingMachine.price = "15000" ;
	   LgWashingMachine.onOrOff();
	   
	   System.out.println("main method ended");
	   
   }
}
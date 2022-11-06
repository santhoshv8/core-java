class Garage
{
    static void getVehicalNos(String [] vehicalNos)
	{
	   System.out.println("inside getVehicalNos() ");
	   System.out.println("No of vehicalNos " + vehicalNos.length);
	   System.out.println("List of vehicalNos ");
	   for (int v=0; v<vehicalNos.length; v++ )
	   {
	      System.out.println(vehicalNos[v]);
	   }
	   System.out.println("end of getVehicalNos() ");
	}
}



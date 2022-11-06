class ECommerceTester
{
   public static void main (String []args)
   {
	   ECommerce.setECommerceName("Amezon");
	   ECommerce.setProduct("OPPO Mobile");
	   ECommerce.setProductColor("black");
	   ECommerce.setProductPrice(25000);
	   
	   System.out.println("The ECommerce Name is "+ECommerce.getECommerceName());
	   System.out.println("The ECommerce product is "+ECommerce.getProduct());
	   System.out.println("The ECommerce product Color is "+ECommerce.getProductColor());
	   System.out.println("The ECommerce product Price is "+ECommerce.getProductPrice());
   }
}
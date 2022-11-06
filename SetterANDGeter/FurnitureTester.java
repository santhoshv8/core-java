class FurnitureTester
{
	public static void main(String []a)  // (String []a) is used for command line argument
	{
	Furniture.setFurnitureType("wood") ;
	Furniture.setFurnitureColor("Gray") ;
	Furniture.setFurniturePrice(30000) ;
	
	System.out.println("Furniture Type is " + Furniture.getFurnitureType());
	System.out.println("Furniture color is " + Furniture.getFurnitureColor());
	System.out.println("Furniture price is " + Furniture.getFurniturePrice());
	}
}
class paint
{
	static int paintId ;
	static String brandName ;
	static String color ;
	
	static void setPaintId(int pId)
	{
		paintId = pId ;
	}
	static int getPaintId()
	{
		return paintId ;
	}
	
	static void setBrandName(String name)
	{
		brandName = name ;
	}
	static String getBrandName ()
	{
		return brandName;
	}
	
	static void setColor(String c)
	{
		color = c ;
	}
	static String getColor()
	{
		return color ;
	}
}
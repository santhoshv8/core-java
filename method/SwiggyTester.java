class SwiggyTester
{
    public static void main (String a[])
	{
	//invoking a mathod
	String ref = Swiggy.takeOrder() ;
	
	System.out.println("your final order is ready...with" + ref) ;
	}
}

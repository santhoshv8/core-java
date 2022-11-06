class TeaStall
{
	static int teaStallId;
	static String name ;
	static String address ;
	static long contactNo ;
	
	//setter and getter
	static void setTeaStallId(int id)
	{
		   // id = 5678;
		   //teaStallId = 5678 ;
		teaStallId = id ;
	}
	static int getTeaStallId()
	{
		return teaStallId ;
	}
	
	static void setContactNo(long cNo)
	{
		contactNo = cNo ;
	}
	static long getContactNo()
	{
		return contactNo ;
	}
	
	static void setName(String n)
	{
		name = n ;
	}
	static String getName()
	{
		return name ;
	}
	
	static void setAddress(String add)
	{
		address = add ;
	}
	static String getAddress()
	{
		return address ;
	}
}
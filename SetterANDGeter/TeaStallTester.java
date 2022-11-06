class TeaStallTester
{
	public static void main (String []args)
	{
		TeaStall.setTeaStallId(5678);
		TeaStall.setContactNo(9482151122L);
		TeaStall.setName("Beereswara cha angadi");
		TeaStall.setAddress("Bengalore");
		
		System.out.println("TeaStall id is "+ TeaStall.getTeaStallId());
		System.out.println("TeaStall contactNO is " +TeaStall.getContactNo());
		System.out.println("TeaStall name is " +TeaStall.getName());
		System.out.println("TeaStall address is " + TeaStall.getAddress());
		
	}
	
}
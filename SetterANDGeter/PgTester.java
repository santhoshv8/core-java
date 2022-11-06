class PgTester 
{
        public static void main(String args[])
		{
		     Pg.setpgId(101);
		     Pg.setpgName("Paying Guest");
		     Pg.setprice(5000);
		
		     System.out.println("pgId is " +Pg.getpgId());
		     System.out.println("pgName is " +Pg.getpgName());
		     System.out.println("price is " +Pg.getprice());
		}
}



class Hockey
{
   static void getTeamMembers(String[] teamMembers)
   {
      System.out.println("inside getTeamMembers() ");
	  System.out.println("no of teamMembers is " + teamMembers.length);
	  System.out.println("List of teamMembers are");
	  for(int p=0; p<teamMembers.length; p++)
	  {
	     System.out.println(teamMembers[p]);
	  }
	  System.out.println("end of getTeamMembers() ");
   }
}









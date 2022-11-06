class Login
{
   // method overloading  
  public static void credentials(String name)
   {
       System.out.println("Logged in with name : " + name);
   }
   public static void credentials(String name , long contactNo)
   {
       System.out.println("Logged in with name : " + name + "and Mobile no : " + contactNo);
   }
}

//change in the type of parameter, no of parameter , interchange in the parameter
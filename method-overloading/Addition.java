class Addition
{
   //method declaration
   public static void add (int a ,int b)
   {
	   System.out.println(a+b);
   }
   //method overloading
   public static void add(int a ,int b ,int c)
   {
	   System.out.println(a+b+c);
   }
   
   //substration
   public static void sub (int a ,int b)
   {
	   System.out.println(a-b);
   }
   public static void sub (int a ,int b , int c)
   {
	   System.out.println(a-b-c);
   }
   
   //multiplication
   public static void multiply (int a ,int b)
   {
	   System.out.println(a*b);
   }
   public static void multiply (int a ,int b , int c)
   {
	   System.out.println(a*b*c);
   } 
   
   //devision
   
    public static void div (int a ,int b)
   {
	   System.out.println(a/b);
   }
   public static void div (int a ,int b , int c)
   {
	   System.out.println(a/b/c);
   } 
  
}
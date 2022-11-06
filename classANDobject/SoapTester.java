class SoapTester{
 
   public static void main(String a[]){
    
	//object is a instance of class
	
    //purpose of object is to create a multiple copy of a class
   
   // create a multiple of Soap
   
   //CalssName refer = new ClassName ();
   Soap soap = new Soap() ;
   
   soap.shape = "Oval" ;
   soap.color = "cream" ;
   soap.name = "Dove" ;
   soap.toGetFresh() ;
   
   System.out.println("The Name of soap is "+soap.name );
   System.out.println("The shape of soap is "+soap.shape);
   System.out.println("The color of soap is "+soap.color);

   Soap soap1 = new Soap() ;
	 
   soap1.shape = "Rectangle" ;
   soap1.color = "White" ;
   soap1.name = "Fiama" ;
   soap1.toGetFresh() ;
   
   System.out.println("The Name of soap1 is "+soap.name );
   System.out.println("The shape of soap1 is "+soap.shape);
   System.out.println("The color of soap1 is "+soap.color);
   
   Soap soap2 = new Soap() ;
	 
   soap2.shape = "Round" ;
   soap2.color = "Orange" ;
   soap2.name = "Mysore Sandel Soap" ;
   soap2.toGetFresh() ;
   
   System.out.println("The Name of soap2 is "+soap.name );
   System.out.println("The shape of soap2 is "+soap.shape);
   System.out.println("The color of soap2 is "+soap.color);
   
   Soap soap3 = new Soap() ;
	 
   soap3.shape = "Rectangle" ;
   soap3.color = "Green" ;
   soap3.name = "Cinthol" ;
   soap3.toGetFresh() ;
   
   System.out.println("The Name of soap3 is "+soap.name );
   System.out.println("The shape of soap3 is "+soap.shape);
   System.out.println("The color of soap3 is "+soap.color);
   
   Soap soap4 = new Soap() ;
	 
   soap4.shape = "Ovel" ;
   soap4.color = "Orange" ;
   soap4.name = "Pears" ;
   soap4.toGetFresh() ;
   
   System.out.println("The Name of soap4 is "+soap.name );
   System.out.println("The shape of soap4 is "+soap.shape);
   System.out.println("The color of soap4 is "+soap.color);
   
   }
}
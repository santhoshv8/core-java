package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class Exam {

	//HallTicket is another class
	//has-A-relationship(Associating one class  with other class)
    public HallTicket hallticket ;
	public int fees ;
	
	public boolean allow(HallTicket hallticket) {
		
		boolean isAllowed = false ;
		System.out.println("inside allow method");
		System.out.println("The fees paid is : "+this.fees);
		if (fees >= 1260) {
			System.out.println("Fees is paid ");
			if(hallticket != null) {
			this.hallticket = hallticket ;
			System.out.println("Details of Candidate Hallticket are... ");
			this.hallticket.displayDetails();
			isAllowed = true ;
			System.out.println("hallticket is been issued : now you are allowed");
		}
		else{
			System.out.println("No Hallticket Found");
		}
	}
		else {
			System.out.println("first pay the fees");
		}
		return isAllowed;
    }
}
package com.xworkz.examapp;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.hallticket.HallTicket;

public class ExamTester {

	public static void main(String[] args) {

		String subjectNames[] = {"m1" , "Mom" , "DME-1" , "M2" };
		HallTicket hallticket = new HallTicket("Santhosh" , subjectNames , "3BR16ME150" ,"dabba vtu" );
		Exam exam = new Exam();
		exam.fees = 1260 ;
			boolean isAllowed = exam.allow(hallticket) ;
            System.out.println("Allowed to write : "+isAllowed );
         
	}
}
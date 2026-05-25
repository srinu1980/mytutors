package com.cts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate myObj1 = LocalDate.now(); // Create a date object
	    System.out.println(myObj1); // Display the current date



	    LocalTime myObj2 = LocalTime.now();
	    System.out.println(myObj2);





	    LocalDateTime myObj3 = LocalDateTime.now();
	    System.out.println(myObj3);



	    LocalDateTime myDateObj = LocalDateTime.now();

	    System.out.println("Before formatting: " + myDateObj);

	 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);

/*


	yyyy-MM-dd	"1988-09-29"	
	dd/MM/yyyy	"29/09/1988"	
	dd-MMM-yyyy	"29-Sep-1988"	
	E, MMM dd yyyy	"Thu, Sep 29 1988"
*/


	}

}

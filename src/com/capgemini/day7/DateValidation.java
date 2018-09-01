package com.capgemini.day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;

public class DateValidation {



	public static boolean isValidDate(String inDate, int shift) throws ParseException {

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		format.setLenient(false);
		try {
			format.parse(inDate);
		} 
		
		catch (ParseException e) {
			
			System.out.println("Date " + inDate + " is not valid according to "
					+ ((SimpleDateFormat) format).toPattern() + " pattern.");
			return false;
		}
		
		Calendar c = Calendar.getInstance();
		try{
		    c.setTime(format.parse(inDate));
		}catch(ParseException e){
			e.printStackTrace();
		 }
		   
		c.add(Calendar.DAY_OF_MONTH, shift);  
		
		String newDate = format.format(c.getTime());  
		
		System.out.println("Date after Addition: "+newDate);
		
		
	
		return true;
	
	}
}

package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.DateFormats1;

class DateFormatTest1 {

	@Test
	void testDateFormat1() throws ParseException {
		
				 assertEquals("12/12/2010",DateFormats1.DateFormat1("12122010"));
				 assertEquals("12 December, 2010",DateFormats1.DateFormat2("12122010"));
	    
	}

}

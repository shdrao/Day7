package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.DateValidation;

class DateValidationTest {

	@Test
	void testDateValidation() throws ParseException {
		assertEquals(false, DateValidation.isValidDate("29/02/2011",2));
		assertEquals(true, DateValidation.isValidDate("29/02/2012",2));
		assertEquals(true, DateValidation.isValidDate("20/09/2015",2));
		
	}

}

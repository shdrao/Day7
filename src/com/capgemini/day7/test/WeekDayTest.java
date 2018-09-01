package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.DateFormats1;
import com.capgemini.day7.WeekDay;

class WeekDayTest {

	@Test
	void testWeekDay() {
		assertEquals("Saturday,September 01,2018",WeekDay.displayDay());
		 
	}

}

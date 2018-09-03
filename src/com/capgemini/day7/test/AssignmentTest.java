package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import com.capgemini.day7.Assignment;

class AssignmentTest {

	@Test
	void testAssignment() throws IOException {

		Assignment assignment1 = new Assignment(new File("C:\\A\\B\\A.txt"), LocalDate.of(2010, 10, 20));
		Assignment assignment2 = new Assignment(new File("C:\\A\\B\\B.txt"), LocalDate.of(2010, 10, 25));
		Assignment assignment3 = new Assignment(new File("C:\\A\\B\\C.txt"), LocalDate.of(2010, 10, 15));

		assertEquals(true, Assignment.add(assignment1));
		assertEquals(true, Assignment.add(assignment2));
		assertEquals(true, Assignment.add(assignment3));

		assertEquals(true, Assignment.remove(assignment1));

		assertEquals(assignment3, Assignment.earliestAssignment());
		
		

	}
}

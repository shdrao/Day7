package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.LineCount;

class LineCountTest {

	@Test
	void testLineCount() throws IOException {
		

		assertEquals(5, LineCount.count("C:\\A\\A.txt"));

	}

}

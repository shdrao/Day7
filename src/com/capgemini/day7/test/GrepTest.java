package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Grep;

class GrepTest {

	@Test
	void testLines() throws IOException {
		assertEquals(13, Grep.lineNumber("C:\\A\\E.txt","ABC"));
	}

}

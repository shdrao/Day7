package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistTest {

	@Test
	void testFileExists() {
		File f1=new File("C:\\A\\A.txt");
		assertEquals(true,f1.exists());
		
		
		File f2 = new File("C:\\A\\B.txt");
		assertEquals(false, f2.exists());
	}

}

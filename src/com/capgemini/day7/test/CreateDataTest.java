package com.capgemini.day7.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;
import java.util.function.ToDoubleBiFunction;

import org.junit.jupiter.api.Test;

class CreateDataTest {

	@Test
	void testRandomNumbers() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("C:\\A\\CreateData.txt");
		
		Random rand = new Random();
		try (Writer wr = new FileWriter(file);) {
			for (int i = 0; i < 100; i++) {
				wr.write( new Integer(rand.nextInt(50) + 1).toBinaryString(rand.nextInt(50) + 1));
				wr.write(System.getProperty("line.separator"));
			}

		}
	}
}
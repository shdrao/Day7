package com.capgemini.day7.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Writer;
import java.util.Random;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class RandomTest {

	@Test
	void testRandomNumbers() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("C:\\A\\D.txt");
		TreeSet<Integer> tr = new TreeSet<>();
		Random rand = new Random();
		try (Writer wr = new FileWriter(file);) {
			for (int i = 0; i < 100; i++) {
				wr.write(new Integer(rand.nextInt(50) + 1).toString());
				wr.write(System.getProperty("line.separator"));
			}

		}

		FileReader reader = new FileReader(file);
		BufferedReader buff = new BufferedReader(reader);
		String line = null;
		while ((line = buff.readLine()) != null) {
			tr.add(Integer.parseInt(line));
		}
		for (Integer integer : tr) {
			System.out.println(integer);
		}

	}

}

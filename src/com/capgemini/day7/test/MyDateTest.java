package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.MyDate;

class MyDateTest {

	@Test
	void testMyDate() {
		MyDate md1 = new MyDate("01,06,1896");
		MyDate md2 = new MyDate("03,05,1986");
		MyDate md3 = new MyDate("04,04,1998");
		MyDate md4 = new MyDate("05,03,1988");
		MyDate md5 = new MyDate("06,02,1966");

		ArrayList<MyDate> al = new ArrayList<>();

		al.add(md1);
		al.add(md2);
		al.add(md3);
		al.add(md4);
		al.add(md5);

		File f1 = new File("C:\\A\\C.txt");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f1))) {
			for (MyDate line : al) {
				bw.write(line + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

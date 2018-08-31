package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {

	public static int count(String string) throws IOException {
		
		File f1 = new File(string);

		int i = 0;
		try (FileReader fr = new FileReader(f1); BufferedReader br = new BufferedReader(fr);) {

			while (br.readLine() != null) {
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return i;
	}

}

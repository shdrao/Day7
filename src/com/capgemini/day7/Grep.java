package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grep {

	public static int lineNumber(String file, String key) {
		int count = 0;
		String lines = null;
		String[] lineArray = null;
		File file1 = new File(file);
		try (FileReader reader = new FileReader(file1); BufferedReader br = new BufferedReader(reader)) {
			while ((lines = br.readLine()) != null) {
				lineArray = lines.split("\\s+");
				for (String word : lineArray) {
					if (word.toLowerCase().equals(key.toLowerCase())) {
						System.out.println((count + 1) + lines);
					}
					
				}
				count++;
			}
			return count;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		return count;
	}

}

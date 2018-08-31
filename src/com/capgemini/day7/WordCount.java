package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static int count(String string) throws IOException {

//		File f1 = new File(string);
//		try (FileReader fr = new FileReader(f1); BufferedReader br = new BufferedReader(fr);) {
//			String line = "", str = "";
//			int a = 0;
//			int b = 0;
//			while ((line = br.readLine()) != null) {
//				str += line + " ";
//				b++;
//				// TODO Auto-generated method stub
//				
//			}
//			return b;
//		}
		
		int count=0;
		
		try (FileReader fr = new FileReader(string); BufferedReader br = new BufferedReader(fr);) {
			
			String line;
			String[] stringArray;
			while((line = br.readLine()) != null) {
				stringArray = line.split(" ");
				count = count + stringArray.length;
			}
		}
		return count;
		
		
		
	}
}
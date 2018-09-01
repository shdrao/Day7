package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class VowelsAndconsonants {

	public static Set<Integer> countVAndC(String string) {

		int vowels = 0;
		int consonants = 0;
		File f1 = new File(string);

		try (FileReader fr = new FileReader(f1); BufferedReader br = new BufferedReader(fr)) {

			String line;
			while ((line = br.readLine()) != null) {

				vowels = 0;
				consonants = 0;
				for (int i = 0; i < line.length(); i++) {
					switch (line.charAt(i)) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						vowels++;
						break;
					case ' ': break;
					default:
						consonants++;
					}
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		HashSet<Integer> hs=new HashSet<>();
		hs.add(vowels);
		hs.add(consonants);
		return hs;
		

	}

}
package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.MyDate;

class MyDateTest {

	@Test
	void testMyDate() throws ClassNotFoundException {

		MyDate md1=new MyDate("01/02/2010");
		MyDate md2=new MyDate("02/02/2010");
		MyDate md3=new MyDate("03/02/2010");
		MyDate md4=new MyDate("04/02/2010");
		MyDate md5=new MyDate("05/02/2010");
		
		ArrayList<MyDate> al= new ArrayList<>();
		ArrayList<MyDate> al2;
		al.add(md1);
		al.add(md2);
		al.add(md3);
		al.add(md4);
		al.add(md5);
		
		File file=new File("C:\\A\\B.txt");
		try {
			
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			

			
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			al2 = (ArrayList<MyDate>) ois.readObject();

			for (MyDate myDate : al2) {
				System.out.println(myDate);

			}

			assertEquals(true, al.toString().equals(al2.toString()));
			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

		
		
	}



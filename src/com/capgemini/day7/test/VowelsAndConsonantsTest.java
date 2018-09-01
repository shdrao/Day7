package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.VowelsAndconsonants;

class VowelsAndConsonantsTest {

	@Test
	void test() {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(5);
		hs.add(9);
		assertEquals(hs, VowelsAndconsonants.countVAndC("C:\\A\\C.txt"));
		
	}

}

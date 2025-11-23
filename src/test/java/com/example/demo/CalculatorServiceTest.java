package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

	@Test
	void testAdd() {
		CalculatorService cal=new CalculatorService();
		assertEquals(20, cal.add(15, 5));
	}

}

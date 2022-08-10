package com.gaurav.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	public void test(){
	
	    Math test = new Math();
	    int result = test.add(5,2);
	    assertEquals(7,result);
	
	}

}

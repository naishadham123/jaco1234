package com.java2novice.junit.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java2novice.junit.samples.MyEvenOdd;

public class MyEvenOddTest {
	 @Test
	    public void testEvenOddNumber(){
	        MyEvenOdd meo = new MyEvenOdd();
	        assertEquals("10 is a even number", true, meo.isEvenNumber(10));
	    }

}

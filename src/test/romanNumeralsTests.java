package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.romanNumerals;

public class romanNumeralsTests {
	
	
	@Test
	public void whenValueIsOne()
	{
		assertEquals("I", romanNumerals.findRomanNumeral(1));
	}
	
	@Test
	public void whenValueIsTwo()
	{
		assertEquals("II", romanNumerals.findRomanNumeral(2));
	}
	
	@Test
	public void whenValueIsThree()
	{
		assertEquals("III", romanNumerals.findRomanNumeral(3));
	}
	
	@Test
	public void whenValueIsFour()
	{
		assertEquals("IV", romanNumerals.findRomanNumeral(4));
	}

}

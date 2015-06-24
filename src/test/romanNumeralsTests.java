package test;

import static org.junit.Assert.*;
import main.romanNumerals;

import org.junit.Test;

public class romanNumeralsTests {
	
	@Test
	public void whenValueIsOne()
	{
		assertEquals("I", romanNumerals.findMyRomanNumeral(1));
	}
	
	@Test
	public void whenValueIsTwo()
	{
		assertEquals("II", romanNumerals.findMyRomanNumeral(2));
	}
	
	@Test
	public void whenValueIsThree()
	{
		assertEquals("III", romanNumerals.findMyRomanNumeral(3));
	}
	
	@Test
	public void whenValueIsFive()
	{
		assertEquals("V", romanNumerals.findMyRomanNumeral(5));
	}
	
	@Test
	public void whenValueIsSix()
	{
		assertEquals("VI", romanNumerals.findMyRomanNumeral(6));
	}
	
	@Test
	public void whenValueIsSeven()
	{
		assertEquals("VII", romanNumerals.findMyRomanNumeral(7));
	}
	
	@Test
	public void whenValueIsEight()
	{
		assertEquals("VIII", romanNumerals.findMyRomanNumeral(8));
	}
	
	@Test
	public void whenValueIsTen()
	{
		assertEquals("X", romanNumerals.findMyRomanNumeral(10));
	}
}

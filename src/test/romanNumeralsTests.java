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
	
	@Test
	public void whenValueIsEleven()
	{
		assertEquals("XI", romanNumerals.findMyRomanNumeral(11));
	}
	
	@Test
	public void whenValueIsTwenty()
	{
		assertEquals("XX", romanNumerals.findMyRomanNumeral(20));
	}
	
	@Test
	public void whenValueIsFifty()
	{
		assertEquals("L", romanNumerals.findMyRomanNumeral(50));
	}
	
	@Test
	public void whenValueIsSixty()
	{
		assertEquals("LX", romanNumerals.findMyRomanNumeral(60));
	}
	
	@Test
	public void whenValueIsSeventy()
	{
		assertEquals("LXX", romanNumerals.findMyRomanNumeral(70));
	}
	
	@Test
	public void whenValueIsHundred()
	{
		assertEquals("C", romanNumerals.findMyRomanNumeral(100));
	}
	
	@Test
	public void whenValueIsHundredTen()
	{
		assertEquals("CX", romanNumerals.findMyRomanNumeral(110));
	}
	
	@Test
	public void whenValueIsOneFifty()
	{
		assertEquals("CL", romanNumerals.findMyRomanNumeral(150));
	}
	
	@Test
	public void whenValueIsTwoHundred()
	{
		assertEquals("CC", romanNumerals.findMyRomanNumeral(200));
	}
	
	@Test
	public void whenValueIsTwoFifty()
	{
		assertEquals("CCL", romanNumerals.findMyRomanNumeral(250));
	}
	
	@Test
	public void whenValueIsThreeHundred()
	{
		assertEquals("CCC", romanNumerals.findMyRomanNumeral(300));
	}
	
	@Test
	public void whenValueIsFiveHundred()
	{
		assertEquals("D", romanNumerals.findMyRomanNumeral(500));
	}
	
	@Test
	public void whenValueIsSixHundred()
	{
		assertEquals("DC", romanNumerals.findMyRomanNumeral(600));
	}
	
	@Test
	public void whenValueIsSevenHundred()
	{
		assertEquals("DCC", romanNumerals.findMyRomanNumeral(700));
	}
	
	@Test
	public void whenValueIsThousand()
	{
		assertEquals("M", romanNumerals.findMyRomanNumeral(1000));
	}
	
}
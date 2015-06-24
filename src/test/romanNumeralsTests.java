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
	
	@Test
	public void whenValueIsFour()
	{
		assertEquals("IV", romanNumerals.findMyRomanNumeral(4));
	}
	
	@Test
	public void whenValueIsNine()
	{
		assertEquals("IX", romanNumerals.findMyRomanNumeral(9));
	}
	
	@Test
	public void whenValueIsTwentyNine()
	{
		assertEquals("XXIX", romanNumerals.findMyRomanNumeral(29));
	}
	
	@Test
	public void whenValueIsForty()
	{
		assertEquals("XL", romanNumerals.findMyRomanNumeral(40));
	}
	
	@Test
	public void whenValueIsFortyFour()
	{
		assertEquals("XLIV", romanNumerals.findMyRomanNumeral(44));
	}
	
	@Test
	public void whenValueIsNinetyNine()
	{
		assertEquals("XCIX", romanNumerals.findMyRomanNumeral(99));
	}
	
	@Test
	public void whenValueIsHundredFortyFour()
	{
		assertEquals("CXLIV", romanNumerals.findMyRomanNumeral(144));
	}
	
	@Test
	public void whenValueIsTwoHundredNinetyNine()
	{
		assertEquals("CCXCIX", romanNumerals.findMyRomanNumeral(299));
	}
	
	@Test
	public void whenValueIsFourHundred()
	{
		assertEquals("CD", romanNumerals.findMyRomanNumeral(400));
	}
	
	@Test
	public void whenValueIsFourHundredFortyNine()
	{
		assertEquals("CDXLIX", romanNumerals.findMyRomanNumeral(449));
	}
	
	@Test
	public void whenValueIsSixHundredFiftyFour()
	{
		assertEquals("DCLIV", romanNumerals.findMyRomanNumeral(654));
	}
	
	@Test
	public void whenValueIsNineHundred()
	{
		assertEquals("CM", romanNumerals.findMyRomanNumeral(900));
	}
	
	@Test
	public void whenValueIsNineHundredFortyFour()
	{
		assertEquals("CMXLIV", romanNumerals.findMyRomanNumeral(944));
	}
	
	@Test
	public void whenValueIsNineHundredNinetyNine()
	{
		assertEquals("CMXCIX", romanNumerals.findMyRomanNumeral(999));
	}
	
}
package main;

public class romanNumerals {
	
	private static int myNum[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
	private static String myRoman[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

	public static String findMyRomanNumeral(int num)
	{
		String romanMemory = "";
		
		for(int i=(myNum.length-1); i >= 0; i--)
			for(; (num >= myNum[i]); num -= myNum[i])
				romanMemory += myRoman[i];
		
		return romanMemory;
		
	}

	
	
}

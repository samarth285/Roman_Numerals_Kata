package main;

import java.util.ArrayList;

public class romanNumerals {
	
	private static int myNum[] = {1, 5, 10, 50, 100, 500, 1000};
	private static String myRoman[] = {"I", "V", "X", "L", "C", "D", "M"};

	public static String findMyRomanNumeral(int num)
	{
		String romanMemory = "";
		
		for(int i=(myNum.length-1); i >= 0; i--)
			for(; (num >= myNum[i]); num -= myNum[i])
				romanMemory += myRoman[i];
		
		return romanMemory;
		
	}

	
	
}

package main;

public class romanNumerals {

	// 1 - I, 5 - V, 10 - X, 50 - L, 100 - C, 500 - D, 1000 - M
	
	private static final String ONES = "I";
//	private static final String fives = "V";
//	private static final String tens = "X";
//	private static final String fifties = "L";
//	private static final String hundreds = "C";
//	private static final String fivehundreds = "D";
//	private static final String thousands = "M";
	
	public static String findRomanNumeral(int num)
	{
		String roman = "";
		
		for(;num >= 1; num--)
	        roman += ONES;
	        
	    return roman;
	}

}

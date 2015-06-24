package main;

public class romanNumerals {
	
	private static int myNum[] = {1, 5, 10};
	private static String myRoman[] = {"I", "V", "X"};

	public static String findMyRomanNumeral(int num)
	{
		String romanMemory = "";
		
//		for(; (num >= myNum[2]); num -= myNum[2] )
//			romanMemory += myRoman[2];
//		
//		for(; (num >= myNum[1]); num -= myNum[1] )
//			romanMemory += myRoman[1];
//		
//		for(; (num >= myNum[0]); num -= myNum[0])
//			romanMemory += myRoman[0];
		
		for(int i=(myNum.length-1); i >= 0; i--)
			for(; (num >= myNum[i]); num -= myNum[i])
				romanMemory += myRoman[i];
		
		return romanMemory;
		
	}

	
	
}

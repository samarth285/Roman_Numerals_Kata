package main;

import java.util.TreeMap;

public class romanNumerals {
	
	private final static TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();
	 
	static
	{
		myMap.put(1, "I");
	}
	
	private static int getKeyLessThanNumber(int number)
	{
		return myMap.floorKey(number);
	}
	
	public static String findMyRomanNumeral(int num)
	{
		String romanMemory = "";
		
		for(int iterator = num; iterator >= getKeyLessThanNumber(num); iterator-= getKeyLessThanNumber(num))
		{
			romanMemory += myMap.get(getKeyLessThanNumber(num));
		}
		
		return romanMemory;
	}
	
}

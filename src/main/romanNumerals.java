package main;

import java.util.TreeMap;

public class romanNumerals {
	
	private final static TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();
	 
	static
	{
		myMap.put(1, "I");
		myMap.put(4, "IV");
		myMap.put(5, "V");
		myMap.put(9, "IX");
		myMap.put(10, "X");
		myMap.put(40, "XL");
		myMap.put(50, "L");
		myMap.put(90, "XC");
		myMap.put(100, "C");
		myMap.put(400, "CD");
		myMap.put(500, "D");
		myMap.put(900, "CM");
		myMap.put(1000, "M");
	}
	
	private static int getKeyLessThanNumber(int number)
	{
		return myMap.floorKey(number);
	}
	
	public static String findMyRomanNumeral(int num)
	{
		String romanMemory = "";
		
		for(int iterator = num; iterator > 0; iterator -= getKeyLessThanNumber(iterator))
		{
			romanMemory += myMap.get(getKeyLessThanNumber(iterator));
		}
		
		return romanMemory;
	}
	
}

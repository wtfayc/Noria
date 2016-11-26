package com.ayc.noria.utility;

public class Helper_Machine {

	/**Counts how many true in booleans */
	public int getBooleanCount (boolean... bools)
	{
		int count = 0;
		for (boolean bool : bools) count += (bool ? 1 : 0);
		return count;			
	}
	
}
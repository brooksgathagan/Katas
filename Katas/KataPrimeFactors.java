package com.techelevator;

import java.util.ArrayList;
import java.util.*;

public class KataPrimeFactors 
{
	// I didn't do any TDD/testing for this -- just wanted to solve it.
	// Why is this optional, but Potter isn't?!  This was simple & would be fairly easy to do TDD on!
	
	public List<Integer> factorize(int n)
	{
		List<Integer> primeSet = new ArrayList<>();
		
		if (n <= 1)
		{
			primeSet.add(n);
			System.out.println("Positive integers only!");
			return primeSet;
		}
		
		while (n != 1)
			for (int i = 2; i <= n; i++)
				if (n % i == 0)
				{
					n /= i;
					primeSet.add(i);
					break;
				}

		System.out.println(primeSet);
		return primeSet;
	}
}

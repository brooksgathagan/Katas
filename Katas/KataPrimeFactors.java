package com.techelevator;

import java.util.ArrayList;
import java.util.*;

public class KataPrimeFactors 
{	
	// A simple kata to find the prime factors of an integer, "n"
	public List<Integer> factorize(int n)
	{
		List<Integer> primeSet = new ArrayList<>();
		
		// Per the requirements, we're only looking for numbers greater than 1. If n <= 1, return the number and display a message.
		if (n <= 1)
		{
			primeSet.add(n);
			System.out.println("Numbers greater than 1 only!");
			return primeSet;
		}
		
		// Otherwise, divide "n" by "i" until we hit 1.  
		// We'll only find prime factors this way. If 6 is a factor of "n" for example, we'll never hit 6 in our for-loop --
		// we'll hit 2 (or 3 in the case of 9 being a factor, for example) and break out of our "for" loop, restarting at a check for "2" being a factor again
		// Once we hit 1, which will occur upon finding our last prime factor (a prime #, divisible by itself, will be 1), we stop.  
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

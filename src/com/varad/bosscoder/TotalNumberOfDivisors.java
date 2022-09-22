//$Id$
package com.varad.bosscoder;
//Java program for finding
//number of divisor
import java.io.*;
import java.util.*;
import java.lang.*;


public class TotalNumberOfDivisors {
	
	// program for finding 
	// no. of divisors
	static int divCount(int n)
	{
	    // sieve method for prime calculation
	    boolean hash[] = new boolean[n + 1];
	    Arrays.fill(hash, true);
	    for (int p = 2; p * p < n; p++)
	        if (hash[p] == true)
	            for (int i = p * 2; i < n; i += p)
	                hash[i] = false;
	  
	    // Traversing through 
	    // all prime numbers
	    int total = 1;
	    for (int p = 2; p <= n; p++) 
	    {
	        if (hash[p])
	        {
	  
	            // calculate number of divisor
	            // with formula total div = 
	            // (p1+1) * (p2+1) *.....* (pn+1)
	            // where n = (a1^p1)*(a2^p2).... 
	            // *(an^pn) ai being prime divisor
	            // for n and pi are their respective 
	            // power in factorization
	            int count = 0;
	            if (n % p == 0) 
	            {
	                while (n % p == 0) 
	                {
	                    n = n / p;
	                    count++;
	                }
	                total = total * (count + 1);
	            }
	        }
	    }
	    return total;
	}
	  
	// Driver Code
	public static void main(String[] args)
	{
	    int n = 24;
	    System.out.print(divCount(n));
	    
	    
	    int firstLetter = 701/26-1;
        int secondLetter = 701%26-1;
        
        
        char c1 = (char) ('A'+(char)firstLetter);
        char c2 = (char) ('A'+(char)secondLetter);
        
        
        String ans = ""+c1+c2;
        
        System.out.println(ans);
	    
	}
}

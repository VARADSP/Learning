package com.varad.hackerrank;
//Java program to find sub-array
//having maximum sum of elements modulo m.
import java.util.*;
class MaximumSubArraySum
{

//Return the maximum sum subarray mod m.
static int maxSubarray(int[] arr, int n, int m)
{
	int x = 0;
	int prefix = 0;
	int maxim = 0;
	TreeSet<Integer> S = new TreeSet<Integer>();
	S.add(0);

	// Traversing the array.
	for (int i = 0; i < n; i++)
	{

	// Finding prefix sum.
	prefix = (prefix + arr[i]) % m;

	// Finding maximum of prefix sum.
	maxim = Math.max(maxim, prefix);

	// Finding iterator poing to the first
	// element that is not less than value
	// "prefix + 1", i.e., greater than or
	// equal to this value.
	int it = S.higher(prefix)!=null?S.higher(prefix):0;
//	boolean isFound = false;
//	
//	for (int j : S)
//	{
//		if (j >= prefix + 1)
//		if(isFound == false) {
//			it = j;
//			isFound = true;
//		}
//		else {
//			if(j < it) {
//				it = j;
//			}
//		}
//	}
	if (it != 0)
	{
		maxim = Math.max(maxim, prefix - it + m);
	}

	// adding prefix in the set.
	S.add(prefix);
	}
	return maxim;
}

//Driver code
public static void main(String[] args)
{

	// Driver Code
	int[] arr = new int[] { 1,5,9 };
	int n = 3;
	int m = 5;
	System.out.print(maxSubarray(arr, n, m));
}
}

//This code is contributed by pratham76.

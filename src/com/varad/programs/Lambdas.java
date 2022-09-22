//$Id$
package com.varad.programs;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
public class Lambdas {
	//lamdas and unit testing
	
	public static int add(Integer n1,Integer n2) {
		return n1+n2;
	}
	
	public static <I, O> O executeViaNullSafer(I value, Function<I, O> executorFunction) {
	     return value != null ? executorFunction.apply(value) : null;   
	}
	
	
	@Test
	public static void main(String[] args) {
//		ArrayList<Integer> numbers = new ArrayList<Integer>();		
//		numbers.add(1);
//		numbers.add(2);
//		numbers.add(3);
//		numbers.add(4);
//		numbers.add(5);
//		
//		numbers.forEach((n) -> System.out.println(n));
//		
//		
//		System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
//		
//		assertEquals(15,numbers.stream().mapToInt(Integer::intValue).sum());
//		
//		numbers = (ArrayList<Integer>) numbers.stream().map(n -> n*n).filter(n -> n>20).collect(Collectors.toList());		
//		
//		numbers.forEach((n) -> System.out.println(n));
//		
//		assertEquals(2,add(1,1));
		assertEquals(3, add(1, 2));		
		String value = null;
		
		String trimmedValue = executeViaNullSafer(value, val -> val.trim());
		
		System.out.println(trimmedValue);
		
	}
}

//$Id$
package com.varad.javagenerics;

import java.util.List;
import java.util.Optional;

class Storage<T> {
	private T val;

	public void setVal(T val) {
		this.val = val;
	}

	public T getVal() {
		return this.val;
	}
}

public class GenericType {
	
	
	public Optional<Integer> findSmallesPositiveNumber(
		      List<Integer> numbers) {
		   return numbers.stream()
		      .filter(number -> number > 0)
		      .min(Integer::compare);
		}

	public static void main(String[] args) {
		Storage<Integer> store = new Storage<>();
		store.setVal(100);
		Integer value = store.getVal();
		System.out.println(value);
		
		
	 
		Storage<Double> store2 = new Storage<>();
		store2.setVal(100.00);
	    Double value2 = store2.getVal();
		System.out.println(value2);
		System.out.println("--------");
		System.out.println((Long) null);
		
	}

}
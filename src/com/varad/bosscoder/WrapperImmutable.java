//$Id$
package com.varad.bosscoder;

//Java program to demonstrate that prmitive
//wrapper classes are immutable
class WrapperImmutable {
	public static void main(String[] args) {
		Integer i = new Integer(21);
		System.out.println(i);
		modify(i);
		System.out.println(i);
	}

	private static void modify(Integer i) {
		i = i + 1;
	}
}
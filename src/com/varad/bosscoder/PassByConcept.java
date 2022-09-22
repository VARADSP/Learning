//$Id$
package com.varad.bosscoder;

class MyObject{
	public int var = 10;
}

public class PassByConcept {
	
	
	public static void change(Integer s,MyObject o,String s1) {
		s1 = "asasfas";
		s = 20;
		o.var = 20;
	}
	
	public static void main(String[] args) {
		Integer a = 10;
		String s = "";
		MyObject o = new MyObject();
		change(a,o,s);
		System.out.println(a);
		System.out.println(o.var);
		System.out.println(s);
	}
}

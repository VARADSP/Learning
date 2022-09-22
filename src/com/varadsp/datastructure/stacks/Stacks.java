package com.varadsp.datastructure.stacks;

import java.util.*;

public class Stacks {
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
			
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		
		
	}

}

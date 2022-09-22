package com.varad.programs;

import java.util.Scanner;

public class CodingBat {
	
	public static String notReplace(String str) {
		  String result = "";
		  
		  if(str.equals("is")) return "is not";
		  
		  
		  for(int i=0;i<str.length();i++){
		 
		  
		    if(
		      (i+2 < str.length() && str.substring(i,i+2).equals("is") 
		    && !Character.isLetter(str.charAt(i+2)) && (i==0 || !Character.isLetter(str.charAt(i-1)) )))
		    {
		    	
		    	
		      result += str.substring(i,i+2) + " not";
		      result+=str.charAt(i+2);
		      
		      i = i + 2;
		      
		    }
		    else if(i == str.length()-2 && str.substring(i).equals("is") && !Character.isLetter(str.charAt(i-1)) ){
		      
		      result += str.substring(i,i+2) + " not";
		      i = str.length();
		      
		    }
		    else{
		      result+= str.substring(i,i+1);
		    }
		  }
		  return result;
		  
		  
		}
	
	
	public static void program(){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println("Hello " + a + "!");
	}
	
	
	public static void main(String[] args) {
		
	}

}

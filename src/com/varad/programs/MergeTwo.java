package com.varad.programs;

public class MergeTwo {

	public static String[] mergeTwo2(String[] a, String[] b, int n) {
		  
		  String[] arr = new String[n];
		  
		  int f1=0;
		  int f2=0;
		  int i=0;
		  
		    while(i!=n){
		    
		    if(a[f1].compareTo(b[f2]) < 0){
		      arr[i] = a[f1];
		      f1++;
		    }
		    else if(a[f1].compareTo(b[f2]) > 0 ){
		      
		      arr[i] = b[f2];
		      f2++;
		      
		    }
		    else{
		      arr[i] = a[f1];
		      f1++;
		      f2++;
		    }
		    i++;
		    
		  }
		  
		  return arr;
		}


	
	
	
	public static String[] mergeTwo(String[] a, String[] b, int n) {
	    String[] arr = new String[n];
	    int aIndex = 0;
	    int bIndex = 0;
	        
	    for(int index = 0; index < n; index++) {
	        if(a[aIndex].compareTo(b[bIndex]) < 0) {
	            arr[index] = a[aIndex];
	            aIndex++;
	        } else if(a[aIndex].compareTo(b[bIndex]) > 0) {
	            arr[index] = b[bIndex];
	            bIndex++;
	        } else {
	            arr[index] = a[aIndex];
	            aIndex++;
	            bIndex++;
	        }
	    }
	                                                                        
	    return arr;
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(mergeTwo2(new String[] {"a", "c", "z"}, new String[] {"b", "f", "z"}, 3));
		
		
	}
	
}

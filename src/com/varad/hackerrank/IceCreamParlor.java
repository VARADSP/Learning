package com.varad.hackerrank;
import java.util.*;
public class IceCreamParlor {
	
	public static void whatFlavors(List<Integer> cost, int money) {
	    // Write your code here
	    //track count of ice cream costs
		HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
	    //fill count hashmap
		for(Integer c : cost){
	        count.put(c,count.getOrDefault(c,new Integer(0))+1);
	    }
	    //track their indexes
	    HashMap<Integer,ArrayList<Integer>> index = new HashMap<Integer,ArrayList<Integer>>();
	    Integer k=0;
	    //filling indexes hashmap
	    for(Integer c : cost){
	        if(index.containsKey(c)){
	            index.get(c).add(k);
	        }
	        else{
	            index.put(c,new ArrayList<Integer>(Arrays.asList(k)));
	        }
	        k++;
	    }
	    //check for every ice cream and its counter part
	    //if both values are equal to money get their indexes and print it
	    for(Integer c : cost){
	        if(count.get(c) > 0){
	            int counterPart = money-c;
	            count.put(c,count.get(c)-1);
	            if(count.get(counterPart)!=null && count.get(counterPart) > 0){
	                List<Integer> indexes1 = index.get(c);
	                List<Integer> indexes2 = index.get(counterPart);
	                if(counterPart == c){
	                    System.out.println(indexes1.get(0)+1 + " " + (indexes1.get(1)+1));
	                    break;
	                }
	                else{
	                    System.out.println(indexes1.get(0)+1 + " " + (indexes2.get(0)+1));
	                    break;      
	                }
	            }
	            count.put(c,count.get(c)+1);   
	        }
	    }
	    
	    }
	
	public static void main(String[] args) {
		whatFlavors(new ArrayList<Integer>(Arrays.asList(1,2,3,5,6)), 5);
	}

}

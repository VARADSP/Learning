package training;

import java.util.StringTokenizer;
import java.util.*;
public class Tokenizer {
	
	public static void main(String[] args) {
		
		
		
		StringTokenizer tokenizer = new StringTokenizer("Java Code Geeks - Java Examples");
        
        System.out.println("Remaining Tokens: " + tokenizer.countTokens());
        TreeSet<String> tree = new TreeSet<>();
         
        // loop through tokens
        while (tokenizer.hasMoreTokens()) {
        	tree.add(tokenizer.nextToken());
//            System.out.println("Token:" + tokenizer.nextToken());
//            System.out.println("Remaining Tokens: " + tokenizer.countTokens());
        }
        System.out.println(tree);
        
        
	}

}

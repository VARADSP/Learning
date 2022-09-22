package training;
import java.util.*;
public class Practice {
	
	public static void add1() {
		System.out.println("add1 with 0 args");
	}
	public static void add1(int a) {
		System.out.println("add1 with 1 args");
	}
	
	public static void main(String[] args) {
//		int[] arr1 = {1,2,3};
//		int[] arr2 = {2,3,4};
//		
//		if(Arrays.equals(arr1,arr2)) {
//			System.out.println("same");
//		}
//		else {
//			System.out.println("not same");
//		}
		
		
		int inarr1[] = {1, 2, 3};
	      int inarr2[] = {1, 2, 3}; 
	      Object[] arr1 = {inarr1};  // arr1 contains only one element
	      Object[] arr2 = {inarr2};  // arr2 also contains only one element
	      Object[] outarr1 = {arr1}; // outarr1 contains only one element
	      Object[] outarr2 = {arr2}; // outarr2 also contains only one element        
	      if (Arrays.deepEquals(outarr1, outarr2))
	          System.out.println("Same");
	      else
	          System.out.println("Not same");
	   
	      
	     // System.out.println(Collections.min(Arrays.asList(inarr1)));
	
	      add1(1);
	      add1();
	      
	      Vector v1 = new Vector();
	      v1.add(1);
	      v1.add("asfasf");
	      
	      System.out.println(v1);
		
	      ArrayList list = new ArrayList();
	      list.add("asasg");
	      list.add(1);
	      
	      System.out.println(list);
	
	
	
	
		}
	
	
		
	}


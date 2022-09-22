//$Id$
package leetcodes;
import java.util.*;

public class NextGreaterElement {
	
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],1);
        }
        
        for(int i=0;i<nums1.length;i++){
            if(map.ceilingKey(nums1[i]) != null && map.ceilingKey(nums1[i]) != nums1[i]){
                result.add(map.ceilingKey(nums1[i]));
            }
            else {
                result.add(-1); 
            }
        }
        
        int[] r = new int[result.size()];
        int index = 0;
        for(int l : result){
            r[index++] = l;
        }
        return r;
    }
	
	
	public static void main(String[] args) {
		
		for(int k : nextGreaterElement(new int[] {4,1,2} , new int[] {1,3,4,2})) {
			System.out.println(k);
		};
		
		
		TreeMap<Integer,Integer> map2 = new TreeMap<Integer,Integer>();
        map2.put(2, 1);
        
        map2.put(3, 1);
        
        map2.put(4, 1);
        
        
	}

}

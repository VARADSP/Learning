//$Id$
package leetcodes;

public class MergeArrays {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	       for (int i = m-- + n-- - 1; i > -1 && n > -1; i--) {
	            if (m < 0) {
	                nums1[i] = nums2[n--];
	            } else if (nums1[m] >= nums2[n]) {
	                nums1[i] = nums1[m--];
	            } else {
	                nums1[i] = nums2[n--];
	            }
	        }

	}
	public static void main(String[] args) {
		merge(new int[] {1,2,3,0,0,0},3,new int[] {2,5,6},3);
	}
	
}

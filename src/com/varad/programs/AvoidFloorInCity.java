//$Id$
package com.varad.programs;

import java.util.*;

public class AvoidFloorInCity {

	public static int[] avoidFlood(int[] arr) {
    //write your code here
	HashSet<Integer> set = new HashSet<>();
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){  
                for(int j=i+1; j<arr.length;j++){
                    if(set.contains(arr[j])){
                        ans[i] = arr[j];
                        set.remove(arr[j]);
						break;
                    }
                }
                if(ans[i]==0 && set.size()>0){
                   for(int lake: set){
                       ans[i] = lake;
                       set.remove(lake);
                       break;
                   }
                }
            }else{
                if(set.contains(arr[i]))
                    return new int[arr.length];
				set.add(arr[i]);
                ans[i] = -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
		int[] arr = {1,2,0,0,2,1};
//		for (int i = 0; i < n; i++) {
//			arr[i] = scn.nextInt();
//		}
		int ans[]=avoidFlood(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

	}

}


//$Id$
package com.varad.programs;
import java.util.*;
import java.io.*;

public class RefuelingStops{
    public static int minFuel(int targ, int startFuel, int[][] arr) {
        // write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int fuel=startFuel;
        if(fuel>=targ)
            return 0;
        int j=0, i=0, count=0;
        while(true){
            while(i<arr.length && arr[i][0]<=fuel ){
                pq.add(arr[i][1]);
                i++;
            }
            if(pq.size()==0){
                count = -1;
                break;
            }
            fuel+= pq.remove();
            count++;
            if(fuel>=targ)
                break;
        }
        return count;
    }

    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();
        int startFuel = scn.nextInt();
        int n = scn.nextInt();
        int[][] stations = new int[n][2];
        for(int i=0; i<n; i++){
            stations[i][0] = scn.nextInt();
            stations[i][1] = scn.nextInt();
        }
        System.out.println(minFuel(target, startFuel, stations));
    }
}
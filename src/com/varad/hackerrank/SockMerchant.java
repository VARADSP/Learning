package com.varad.hackerrank;

public class SockMerchant {
	
	
	
	// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        int[] temp = ar;
        int i = 0;
        int j =1;
        while(i < n && n>1){
            if(temp[i] == -1 || j == n-1){ 
                if(j==n-1 && temp[i]!=-1 && temp[i] == temp[j]){
                    count++;
                }
                i++;
                if(i  == n-1) return count;
                j= (i+1)%n;
                continue;
            }
            if(temp[j] != -1 && temp[i] == temp[j]){
                count++;
                temp[j] = -1;
                i++;
                j = (i+1)%n;
            }
            else{
                j = (j+1) % n;
            }
        }
      
        
        return count;


    }
    
    
    
 // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
       int level  = 0;
       int valleyCount = 0;

       for(int i=0;i<s.length();i++){
           if(s.substring(i,i+1).equals("U")){
            level += 1;   
           }
           if(s.substring(i,i+1).equals("D")){
            level -= 1;   
           }
           if(level == -1 && !s.substring(i,i+1).equals("U")){
               valleyCount++;
           }
       }

        return valleyCount;

    }

	
	
	public static void main(String[] args) {
		
		
		//System.out.println(countingValleys(8,"UDDDUDUU"));
		System.out.println(countingValleys(8,"UDDDUDUU"));
		//System.out.println(sockMerchant(9, new int[] {10,20,20,10,10,30,50,10,20}));
	}
 
}

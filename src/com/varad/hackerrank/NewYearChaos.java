package com.varad.hackerrank;

public class NewYearChaos {
	
	
	
	
	   // Complete the minimumBribes function below.
       static void minimumBribes(int[] arr) {
     
        int swapCount = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != i + 1) { // filter cases, when you do not bribe, be at the ith position wherever you are
                if (((i - 1) >= 0) && arr[i - 1] == (i + 1)) { // 1)Being at initial ith position, valid current
                                                              // position after given bribe can be (i-1)th position
                    swapCount++;
                    swap(arr, i, i - 1);
                } else if (((i - 2) >= 0) && arr[i - 2] == (i + 1)) { // 2)Being at initial ith position, valid current
                                                                        // position after given bribes can be (i-2)th
                                                                        // position
                    swapCount += 2;
                    swap(arr, i - 2, i - 1);
                    swap(arr, i - 1, i);
                } else { // 3)Too chaotic (trying to bribe more than 2 people which is ahead of you)
                    System.out.println("Too chaotic");
                    return;
                }
            }

        }
        System.out.println(swapCount);



    }
       


        private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
        
        
        // Function to find minimum swaps 
        static int minimumSwaps(int[] arr) 
        { 
            // Initialise count variable 
            int count = 0; 
            int i = 0; 
            while (i < arr.length) { 
      
                // If current element is 
                // not at the right position 
                if (arr[i] != i + 1) { 
      
                    while (arr[i] != i + 1) { 
                        int temp = 0; 
      
                        // Swap current element 
                        // with correct position 
                        // of that element 
                        temp = arr[arr[i] - 1]; 
                        arr[arr[i] - 1] = arr[i]; 
                        arr[i] = temp; 
                        count++; 
                    } 
                } 
      
                // Increment for next index 
                // when current element is at 
                // correct position 
                i++; 
            } 
            return count; 
        } 

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//minimumBribes(new int[] {2,1,5,3,4});
		
		 int arr[] = { 2, 3, 4, 1, 5 }; 
		  
	        // Function to find minimum swaps 
	        System.out.println(minimumSwaps(arr)); 
	}

}

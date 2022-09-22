//$Id$
package com.varad.bosscoder;
import java.util.*;
public class ExcelSheetColNo {

	
	public static String convertToTitle(int columnNumber) {
        
		ArrayList<String> letters = new ArrayList<String>();
		String ans = "";
        
        letters.add("Z");
		for(int i=0;i<25;i++) {
			letters.add(""+ (char)('A'+ (char)i));
		}
		
		//base 26
		
		
		while(columnNumber > 0) {
			int d = columnNumber-1%26;
		
			columnNumber = columnNumber/26;
			
			ans =  letters.get(d) + ans;
			
		}
		
//        if(columnNumber <= 0){
//            return ans;
//        }
//        
//        
//        while(columnNumber > 0){
//            int place = columnNumber%26;
//            ans = (place==0?"Z":""+(char)((char)(char)'A'+place-1));
//            columnNumber = (int)(place == 0?Math.floor(columnNumber/26)-1:Math.floor(columnNumber/26));
//        }
        
        return ans;
        
    }
	
	public static void main(String[] args) {
		System.out.println(convertToTitle(701));
		
	}

}

	//$Id$
package leetcodes;

public class ZigZagPattern {

	
	  public static String convert2(String s, int numRows) {

	        if (numRows == 1) return s;

	        StringBuilder ret = new StringBuilder();
	        int n = s.length();
	        int cycleLen = 2 * numRows - 2;

	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j + i < n; j += cycleLen) {
	                ret.append(s.charAt(j + i));
	                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
	                    ret.append(s.charAt(j + cycleLen - i));
	            }
	        }
	        return ret.toString();
	    }
	
	public static String convert(String s, int numRows) {

	    if(numRows <= 1)
	        return s;

	    StringBuilder[] sb = new StringBuilder[numRows];
	    boolean flag = false;int count = 0;

	    for(int i = 0; i<numRows; i++)
	        sb[i] = new StringBuilder();

	    for(char ch : s.toCharArray()){
	        if(flag == false){
	            if(count == numRows-1){
	                flag = true;
	                sb[count].append(ch);
	                count = count-1;
	                continue;
	            }
	            sb[count].append(ch);
	            count++;
	        }
	        else{
	            if(count == 0){
	                flag = false;
	                sb[count].append(ch);
	                count = count+1;
	                continue;
	            }
	            sb[count].append(ch);
	            count--;
	        }

	    }

	    for(int i = 1; i<numRows; i++)
	        sb[0].append(sb[i]);
	    
	    return sb[0].toString();
	}
	
	public static void main(String[] args) {
		System.out.println(convert2("PAYPALISHIRING",3));
	}
}

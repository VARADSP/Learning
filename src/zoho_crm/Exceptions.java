//$Id$
package zoho_crm;

public class Exceptions {
	
	static{System.out.println("static block is invoked");}  
	
	public static void main(String[] args) {
	     try  
	        {  
	        int data=50/0; //may throw exception   
	        }  
	            //handling the exception  
	        catch(ArrayIndexOutOfBoundsException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	    }  
	}



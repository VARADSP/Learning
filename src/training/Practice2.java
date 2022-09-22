package training;
import java.util.*;
public class Practice2 {
	
	
	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.forEach((k,v) -> System.out.println(k + " : " + v));
	}

}

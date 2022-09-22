package training;
import java.util.*;

class MyThread11 extends Thread{
	public void run() {
		System.out.println("hello");
	}
	
}
class MyThread22 extends Thread{
	public void run() {
		System.out.println("hello");
	}
	
}

public class Threads extends Thread {
	public static void printTable() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread[] threads = new Thread[5];
		 for (int i = 0; i < threads.length; i++) {
		     threads[i] = new Thread(new Runnable() {
		         public void run() {
		             // some code to run in parallel
		             // this could also be another class that implements Runnable
		        	 printTable();
		         }
		     });
		 }
		 
		 
	}

}

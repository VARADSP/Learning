//$Id$
package com.varad.programs;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
        	
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
            
        	//Set<String> words = new HashSet<String>();
    		//words.addAll(Arrays.asList("leet","code"));
    		
    		//System.out.println(wordBreak("leetcode", words));
    		int count = 0;
    		while(true) {
    			
    			boolean isMozilla = false;
    			  				
    			
    			//mozilla
//    			System.setProperty("webdriver.gecko.driver","/home/local/ZOHOCORP/varad-11942/Downloads/geckodriver-v0.31.0-linux32/geckodriver"); // Setting system properties of FirefoxDriver
//    			FirefoxBinary firefoxBinary = new FirefoxBinary();
//    			FirefoxProfile firefoxProfile = new FirefoxProfile();
//    			firefoxProfile.setPreference("media.volume_scale", "0.0");
//    			FirefoxOptions options = new FirefoxOptions();
//    			options.setProfile(firefoxProfile);
//    			options.setBinary(firefoxBinary);
//    			options.addArguments("-private");
//    			options.setHeadless(true);  // <-- headless set here
//    			
//    			WebDriver driver = new FirefoxDriver(options); //Creating an object of FirefoxDriver
//    					driver.manage().deleteAllCookies();
//    					driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//    					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    					
    				
    			//for span tag
    			//Marathi Dubbed God Of War Ragnarok Story Trailer | Funny ...
    			
    			
    			//chrome
    		System.setProperty("webdriver.chrome.driver",
    			      "/home/local/ZOHOCORP/varad-11942/Downloads/chromedriver_linux64/chromedriver");
    			      // configure options parameter to Chrome driver
    			      ChromeOptions o= new ChromeOptions();
    			      // add Incognito parameter
    			      o.addArguments("--incognito");
    			      o.addArguments("--headless");
    			      o.addArguments("--mute-audio");
    			      // DesiredCapabilities object
    			      DesiredCapabilities c = new DesiredCapabilities();
    			      //set capability to browser
    			      c.setCapability(ChromeOptions.CAPABILITY, o);
    			      WebDriver driver = new ChromeDriver(o);

    			      
    			      // Navigate to url with video being appended to search_query
    			      //driver.get("https://www.youtube.com/results?search_query=marathi+dubbed+god+of+war+ragnarok+trailer");

    			
    			    //open google
    			  	driver.get("https://www.google.com");
    			  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    			  	WebElement r = driver.findElement(By.name("q"));

    			  	//enter this tutorials in search box
    			  	r.sendKeys("gamerware soulstice pc rtx");
    			  	r.sendKeys(Keys.RETURN);
    			  	//wait for suggestions
    			  	
    			  	
    			  	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    			  	
    			  	
    			  	boolean isFound = false;
    			  	
    			  	List<WebElement> elems = driver.findElements(By.tagName("h3"));
    				
    			  	
    			  	for(WebElement ele : elems) {
    			  		String val = ele.getText();
    			  		if(val != null && (val.equalsIgnoreCase("SOULSTICE PC (2022) RTX Walkthrough Gameplay - Part 1"))) {
    			  			isFound = true;
    			  			ele.click();
    			  			break;
    			  		}
    			  	}
    			  	
    			  	if(!isFound) {
    			 
    			  	List<WebElement> elems2 = driver.findElements(By.tagName("span"));
    				
    			  	
    			  	for(WebElement ele : elems2) {
    			  		String val = ele.getText();
    			  		if(val != null && val.contains("SOULSTICE PC (2022) RTX Walkthrough Gameplay - Part 1 ...")) {
    			  			ele.click();
    			  			break;
    			  		}
    			  	}
    			  	
    			  	}
    			  	
    			//  	driver.findElements(By.tagName("h3")).get(2).click();
    			  	try {
    			  	//  WebElement playButton = driver.findElement(By.xpath("//button[@aria-label=\'Play\']"));
    			  		WebElement playButton = driver.findElement(By.className("ytp-play-button"));
    			  	  	
    			  		
    			  		if(playButton != null) {
    			  	  		playButton.click();
    			  	  	}
    					Thread.sleep(5000);
    				} catch (Exception e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    			  	driver.quit();
    			  	System.out.println("Executed ! " + count + " Times");
    			  	count++;
    		}
//    		System.out.println("Total Execution = " + count + " Times");
//    			  	 List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));
    //
//    			     //Get the url of third link and navigate to it
//    			     String third_link = findElements.get(2).getAttribute("href");
//    			     driver.navigate().to(third_link);
//    			  	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sbtc")));
    //
//    			  	WebElement list=driver.findElement(By.className("sbtc"));
//    			  	List<WebElement> rows=list.findElements(By.tagName("li"));
    //
//    			  	for(WebElement elem:rows) {
//    			  	System.out.println(elem.getText());
//    			  	}
      }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}



class MultithreadingDemo2 extends Thread {
    public void run()
    {
        try {
        	
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
            
        	//Set<String> words = new HashSet<String>();
    		//words.addAll(Arrays.asList("leet","code"));
    		
    		//System.out.println(wordBreak("leetcode", words));
    		int count = 0;
    		while(true) {
    			
    			boolean isMozilla = false;
    			  				
    			
    			//mozilla
    			System.setProperty("webdriver.gecko.driver","/home/local/ZOHOCORP/varad-11942/Downloads/geckodriver-v0.31.0-linux32/geckodriver"); // Setting system properties of FirefoxDriver
    			FirefoxBinary firefoxBinary = new FirefoxBinary();
    			FirefoxProfile firefoxProfile = new FirefoxProfile();
    			firefoxProfile.setPreference("media.volume_scale", "0.0");
    			FirefoxOptions options = new FirefoxOptions();
    			options.setProfile(firefoxProfile);
    			options.setBinary(firefoxBinary);
    			options.addArguments("-private");
    			options.setHeadless(true);  // <-- headless set here
    			
    			WebDriver driver = new FirefoxDriver(options); //Creating an object of FirefoxDriver
    					driver.manage().deleteAllCookies();
    					driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
    					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    					
    				
    			//for span tag
    			//Marathi Dubbed God Of War Ragnarok Story Trailer | Funny ...
    			
    			
    			//chrome
//    		System.setProperty("webdriver.chrome.driver",
//    			      "/home/local/ZOHOCORP/varad-11942/Downloads/chromedriver_linux64/chromedriver");
//    			      // configure options parameter to Chrome driver
//    			      ChromeOptions o= new ChromeOptions();
//    			      // add Incognito parameter
//    			      o.addArguments("--incognito");
//    			     o.addArguments("--headless");
//    			     o.addArguments("--mute-audio");
//    			      // DesiredCapabilities object
//    			      DesiredCapabilities c = new DesiredCapabilities();
//    			      //set capability to browser
//    			      c.setCapability(ChromeOptions.CAPABILITY, o);
//    			      WebDriver driver = new ChromeDriver(o);

    			      
    			      // Navigate to url with video being appended to search_query
    			      //driver.get("https://www.youtube.com/results?search_query=marathi+dubbed+god+of+war+ragnarok+trailer");

    			
    			    //open google
    			  	driver.get("https://www.google.com");
    			  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    			  	WebElement r = driver.findElement(By.name("q"));

    			  	//enter this tutorials in search box
    			  	r.sendKeys("gamerware soulstice pc rtx");
    			  	r.sendKeys(Keys.RETURN);
    			  	//wait for suggestions
    			  	
    			  	
    			  	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    			  	
    			  	
    			  	boolean isFound = false;
    			  	
    			  	List<WebElement> elems = driver.findElements(By.tagName("h3"));
    				
    			  	
    			  	for(WebElement ele : elems) {
    			  		String val = ele.getText();
    			  		if(val != null && (val.equalsIgnoreCase("SOULSTICE PC (2022) RTX Walkthrough Gameplay - Part 1") || val.contains("SOULSTICE PC (2022) RTX Walkthrough Gameplay - Part 1"))) {
    			  			isFound = true;
    			  			ele.click();
    			  			break;
    			  		}
    			  	}
    			  	
    			  	if(!isFound) {
    			 
    			  	List<WebElement> elems2 = driver.findElements(By.tagName("span"));
    				
    			  	
    			  	for(WebElement ele : elems2) {
    			  		String val = ele.getText();
    			  		if(val != null && val.contains("SOULSTICE PC (2022) RTX Walkthrough Gameplay - Part 1 ...")) {
    			  			ele.click();
    			  			break;
    			  		}
    			  	}
    			  	
    			  	}
    			  	
    			//  	driver.findElements(By.tagName("h3")).get(2).click();
    			  	try {
    			  	//  WebElement playButton = driver.findElement(By.xpath("//button[@aria-label=\'Play\']"));
    			  		WebElement playButton = driver.findElement(By.className("ytp-play-button"));
    			  	  	
    			  		
    			  		if(playButton != null) {
    			  	  		playButton.click();
    			  	  	}
    					Thread.sleep(5000);
    				} catch (Exception e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    			  	driver.quit();
    			  	System.out.println("Executed ! " + count + " Times");
    			  	count++;
    		}
//    		System.out.println("Total Execution = " + count + " Times");
//    			  	 List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));
    //
//    			     //Get the url of third link and navigate to it
//    			     String third_link = findElements.get(2).getAttribute("href");
//    			     driver.navigate().to(third_link);
//    			  	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sbtc")));
    //
//    			  	WebElement list=driver.findElement(By.className("sbtc"));
//    			  	List<WebElement> rows=list.findElements(By.tagName("li"));
    //
//    			  	for(WebElement elem:rows) {
//    			  	System.out.println(elem.getText());
//    			  	}
      }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}





public class WordBreak {
	public static boolean wordBreak(String s, Set<String> dict) {
		return wordBreakHelper(s, dict, 0);
	}

	public static boolean wordBreakHelper(String s, Set<String> dict, int start) {
		if (start == s.length())
			return true;
		for (String a : dict) {
			int len = a.length();
			int end = start + len;
			// end index should be <= string length
			if (end > s.length())
				continue;
			if (s.substring(start, start + len).equals(a))
				if (wordBreakHelper(s, dict, start + len))
					return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		 int n = 1; // Number of threads
	        for (int i = 0; i < n; i++) {
	            MultithreadingDemo object
	                = new MultithreadingDemo();
	            object.start();
	            MultithreadingDemo object2
                = new MultithreadingDemo();
            object2.start();
	        }
					
	}
}

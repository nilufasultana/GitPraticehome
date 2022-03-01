package com.bit.test;

import java.io.IOException;
import java.util.Properties;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.resource.Utility;



public class BaseTest {
 
public static WebDriver dr;
	
	@Before
	public void openBrowser() throws InterruptedException, IOException {
		Utility k = new Utility();
	Properties xp=	k.getPropertyFile("config.properties");
	String br = xp.getProperty("browser");
		//getPropertyFile("config.properties", "browser");
		
		//String br = System.getProperty("browser");
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\13478\\Downloads\\chromedriver.exe");
			dr = new ChromeDriver();
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver 2");
			dr = new FirefoxDriver();
			System.out.println("Firefox browser -----------");
		}
		else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "path");
			System.out.println("IE browser -----------");
		}
		else if(br.equals("safari")) {
			System.setProperty("webdriver.safari.driver", "path");
			System.out.println("Safari browser -----------");
		}else {
			System.out.println("No match found, Chrom executed");
			System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
			dr = new ChromeDriver();
		}
		
		dr.get("http://www.target.com");
		Thread.sleep(3000);
		//Dimension dimension = new Dimension(1800, 1080);
		//dr.manage().window().setSize(dimension);
		
	}
	
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
	
	System.out.println();
	
	}
	
	
	


}
 


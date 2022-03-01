package com.bit.resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Utility {
	public WebDriver dr;
	public void Utility(WebDriver dr) {
	this. dr = dr;	
	}
public	Properties getPropertyFile(String fileName) throws IOException {
		FileInputStream f = new FileInputStream(fileName);
		Properties p = new Properties();
		p.load(f);
		
		//String pr = p.getProperty(keyName);
		//System.out.println(pr + " property value------------");
		return p;
	


}

}

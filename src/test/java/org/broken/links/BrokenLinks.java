package org.broken.links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrokenLinks {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		int count=0;
		for (int i = 0; i <findElements.size(); i++) {
			String attribute = findElements.get(i).getAttribute("href");
			System.out.println(attribute);
			if (!(attribute==null)) {
				URL url= new URL(attribute);
				URLConnection openConnection = url.openConnection();
				HttpURLConnection connection = (HttpURLConnection) openConnection;
				int responseCode = connection.getResponseCode();
				if (!(responseCode==200)) {
					count++;
					
					
				}
				System.out.println("broken liks are "+attribute);
				
				
				
				
			}
			
		}	System.out.println("broken liks are "+count);
	}

}

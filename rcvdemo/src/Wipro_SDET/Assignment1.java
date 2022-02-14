package Wipro_SDET;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/selectable/");	
		driver.findElement(By.xpath("//li[text()='Cras justo odio']")).click();
		driver.findElement(By.xpath("//ul[@id='verticalListContainer']/li[2]")).click();
		driver.findElement(By.xpath("//ul[@id='verticalListContainer']/li[3]")).click();
		driver.findElement(By.xpath("//ul[@id='verticalListContainer']/li[4]")).click();
		String name1=driver.findElement(By.xpath("//li[text()='Cras justo odio']")).getText();
		String name2=driver.findElement(By.xpath("//ul[@id='verticalListContainer']/li[2]")).getText();
		String name3=driver.findElement(By.xpath("//ul[@id='verticalListContainer']/li[3]")).getText();
		String name4=driver.findElement(By.xpath("//ul[@id='verticalListContainer']/li[4]")).getText();
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		 String url="";
	      List<WebElement> allURLs = driver.findElements(By.tagName("a"));
	      System.out.println("Total links on the Wb Page: " + allURLs.size());
	      
	    for(WebElement url1:allURLs) {
	    	String s=url1.getText();
	    	System.out.println(s);
	    	url1.click();
	    }
	    	  
	    	  
	    	  
	      

	      
	      }
		
		
	}



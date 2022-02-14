package Wipro_SDET;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class contact_form {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Veliganti");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Subramanyam");
		driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("veligantisubbu28@gmail.com");
        driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
        driver.findElement(By.cssSelector("input[id='userNumber']")).sendKeys("9502349130");
       
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        List<WebElement> list=driver.findElements(By.xpath("//a[*]"));
	

		}
}

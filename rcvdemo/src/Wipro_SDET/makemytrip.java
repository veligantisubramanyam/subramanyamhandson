package Wipro_SDET;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	/*public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]")).click();
     

	}}*/
	

		 public static void main(String[] args) throws InterruptedException {
		  // TODO Auto-generated method stub
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\\\browserdriver\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		 
		  
		  driver.get("https://www.makemytrip.com/");
		    Thread.sleep(10000);

		  driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
		  driver.findElement(By.xpath("//li[@class='selected']")).click();
		  
		  driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		  Thread.sleep(5000);
		  
		  String flag = "False";
		 

		  while(flag=="False") {
		   
		   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Feb 17 2022')]")).size()>0) {
		    
		   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Feb 17 2022')]")).click(); 
		   flag="True";
		   Thread.sleep(5000);
		   }
		   
		   else {
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		   }
		   driver.findElement(By.xpath("//a[text()='Search']")).click();
		   Thread.sleep(5000);
		   Alert alrt=driver.switchTo().alert();
		   //Thread.sleep(5000);
		   alrt.dismiss();
		  }
		  
		  
		  
		  
		 }
}

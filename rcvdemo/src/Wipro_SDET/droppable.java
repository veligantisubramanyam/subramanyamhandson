package Wipro_SDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class droppable {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		//WebElement frame=driver.findElement(By.xpath("//*[@id=\"droppableContainer\"]/div"));
		//driver.switchTo().frame(frame);
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("(//div[@id='droppable' and @class='drop-box ui-droppable'])[1]"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		

	}

}

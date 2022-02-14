package Wipro_SDET;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datepickers {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.xpath("//*[@id=\"datePickerMonthYearInput\"]")).click();
		Select month_dropdown=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		month_dropdown.selectByVisibleText("May");
		Select year_dropdown=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		year_dropdown.selectByVisibleText("1996");
		String date="15";
		List<WebElement> allDates=driver.findElements(By.xpath("//div[@role='listbox']//div"));
		
		for(WebElement ele:allDates)
		{
			String dt=ele.getText();
			if(dt.equals(date))
			{
				ele.click();
				break;
			}
		}
		
	}

}

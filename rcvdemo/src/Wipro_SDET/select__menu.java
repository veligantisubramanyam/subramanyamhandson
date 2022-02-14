package Wipro_SDET;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select__menu {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		//driver.findElement(By.xpath("//div[@id='withOptGroup']")).click();
		//driver.findElement(By.xpath("//div[@class=' css-1uccc91-singleValue']")).click();
		//driver.findElement(By.xpath("(//div[@class=' css-yk16xz-control'])[2]")).click();
		
		Select se = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
		
		
		se.selectByVisibleText("White");
		
		 Select select = new Select(driver.findElement(By.id("cars")));

	        
	        System.out.println("The dropdown options are -");

	        List<WebElement> options = select.getOptions();

	        for(WebElement option: options)
	            System.out.println(option.getText());

	        //Using isMultiple() method to verify if the element is multi-select, if yes go onto next steps else eit
	        if(select.isMultiple()){

	            //Selecting option as 'Opel'-- ByIndex
	            System.out.println("Select option Opel by Index");
	            select.selectByIndex(2);

	            
	            System.out.println("Select option saab by Value");
	            select.selectByValue("saab");

	        
	            System.out.println("Select option Audi by Text");
	            select.selectByVisibleText("Audi");

	            
	            System.out.println("The selected values in the dropdown options are -");

	            List<WebElement> selectedOptions = select.getAllSelectedOptions();

	            for(WebElement selectedOption: selectedOptions)
	                System.out.println(selectedOption.getText());


	            
	            System.out.println("DeSelect option Audi by Index");
	            select.deselectByIndex(3);

	            
	            System.out.println("Select option Opel by Text");
	            select.deselectByVisibleText("Opel");

	            
	            System.out.println("The selected values after deselect in the dropdown options are -");
	            List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();

	            for(WebElement selectedOptionAfterDeselect: selectedOptionsAfterDeselect)
	                System.out.println(selectedOptionAfterDeselect.getText());

	            
	            select.deselectAll();
	        }

	        driver.quit();
	    }

	


		
		
	                 
	 }

	



package selassignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSelenium {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Maniraj");
		driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input")).sendKeys("Ganesan");
		driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input")).sendKeys("9840651598");
		driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("Vin@yagar9");
		//dropdown1
		WebElement dropdown01=driver.findElement(By.id("day"));
		Select dd01=new Select(dropdown01);
		dd01.selectByValue("6");
		//dropdown2
		WebElement dropdown02=driver.findElement(By.id("month"));
		Select dd02=new Select(dropdown02);
		dd02.selectByVisibleText("Jul");
		//dropdown3
		WebElement dropdown03=driver.findElement(By.id("year"));
		Select dd03=new Select(dropdown03);
		dd03.selectByValue("1961");
		
		driver.findElement(By.linkText("Female")).click();
		
	}

}

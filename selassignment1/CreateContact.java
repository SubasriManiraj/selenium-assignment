package selassignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Subasri");
		driver.findElement(By.id("lastNameField")).sendKeys("Maniraj");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Suba");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Raj");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("creating a contact");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("subasrimaniraj19@gmail.com");
		
		WebElement dropdown01=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd01=new Select(dropdown01);
		dd01.selectByVisibleText("Oklahoma");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Enter name correctly");
		driver.findElement(By.xpath("//td[@colspan='4']/input")).click();
		
		String text1=driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		System.out.println("Title of Result Page-"+text1);
		
		
	}

		
	
	
	
	
	
	
	

}

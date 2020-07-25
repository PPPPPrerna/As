package pack.As;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ash {

	
	@Test
	public void as() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ashishkumarportfolio.netlify.app/");
		System.out.println(driver.getCurrentUrl());
	
		System.out.println(driver.getTitle());

		//driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Prerna");
		
		driver.findElement(By.xpath("//section[@id='contact']/div/form/input")).sendKeys("Prerna");//By using xpath of Parent class
		
		//driver.findElement(By.xpath("//*[input()='Name']")).sendKeys("Prerna");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prerna@metlife.com");
		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Script 1 passed");
		
		//driver.findElement(By.xpath("//input[text()='Submit']")).click();
		driver.findElement(By.xpath("//input[@id='submit']")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		

	}
}

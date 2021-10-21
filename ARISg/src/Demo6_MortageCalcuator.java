import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6_MortageCalcuator {

	public static void main(String[] args) {
		//Set the Browser property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Navigate to the Mortage Calucaltor
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		
		// Enter the values
		driver.findElement(By.id("homeval")).sendKeys("100000");
		driver.findElement(By.id("downpayment")).sendKeys("1000");
		driver.findElement(By.id("loanamt")).sendKeys("50000");
		driver.findElement(By.id("intrstsrate")).sendKeys("5");
		
		// Click the Calculate button
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.findElement(By.xpath("//input[@class='styled-button']")).click();
		//driver.findElement(By.xpath("//*[@value='Calculate']")).click();
		driver.findElement(By.xpath("//input[@name='cal' and @value='Calcualte']")).click();
		
		//
	
		driver.close();
	}
}
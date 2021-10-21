import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8_Facebook {

	public static void main(String[] args) throws InterruptedException {
		//Set the Browser property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		//Navigate to the google page
		driver.get("https://ww.google.com");
		driver.manage().window().maximize();
		System.out.println("Title is " + driver.getTitle());
		
		//Search for Selenium				
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//input[@name='btnK'])[1]")).click();
		Thread.sleep(2000);
	
		driver.close();
	}

}

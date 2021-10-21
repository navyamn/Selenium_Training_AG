import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7_LinkedIn {

	public static void main(String[] args) throws InterruptedException {
		//Set the Browser property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Open the LinkedIn
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		System.out.println("Title is: " + driver.getTitle());
		
		//Navigate to Sign In Page
		driver.findElement(By.className("nav__button-secondary")).click();
		System.out.println("Title is: " + driver.getTitle());
		
		//Enter User name
		driver.findElement(By.id("username")).sendKeys("HelloWorld");
		
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("password");
		
		//Click on Sign in
		//driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
	
		
		//Print the Error message
		String errmsg=driver.findElement(By.id("error-for-username")).getText();
		System.out.println("Error Message is "+ errmsg);
		
		//Click on Forgot Link
		driver.findElement(By.partialLinkText("Forgot")).click();
		System.out.println("Title is: " + driver.getTitle());
		
		//Click on Join
		driver.findElement(By.linkText("Join now")).click();
		System.out.println("Title is: " + driver.getTitle());
		
		//Count the no of Links
		int link=driver.findElements(By.tagName("a")).size();
		System.out.println(link);
		
		//Wait
		Thread.sleep(5000);
		//Close the browser
		driver.close();
			}

}

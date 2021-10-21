import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11_Gmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.get("https:\\www.gmail.com");
		System.out.println("Title is: " + driver.getTitle());

		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		 Set<String> ids=driver.getWindowHandles();
	        Iterator<String> it=ids.iterator();
	        
	        String GmailWindowID=it.next();
	        String HelpWindowID=it.next();

	        driver.switchTo().window(HelpWindowID);

	        System.out.println("title is : "+driver.getTitle());

	        //driver.close();
	        driver.quit();
		
	
}

}

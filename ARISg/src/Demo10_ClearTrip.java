import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo10_ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.get("https:\\www.cleartrip.com");
		Thread.sleep(4000);
		System.out.println("Title is: " + driver.getTitle());
		
		Select adultsDD = new Select(driver.findElement(By.xpath("//select[@class='bc-neutral-100 bg-transparent']")));
				
		adultsDD.selectByIndex(2);
		Thread.sleep(2000);
		adultsDD.selectByValue("6");
		Thread.sleep(2000);
		adultsDD.selectByVisibleText("8");
		Thread.sleep(2000);
		
		Select kidsDD = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[4]/div/div[3]/select")));
		
		kidsDD.selectByIndex(1);
		Thread.sleep(2000);
		kidsDD.selectByValue("4");
		Thread.sleep(2000);
		kidsDD.selectByVisibleText("6");
		Thread.sleep(2000);
		
		driver.close();
	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https:\\www.google.com");
System.out.println("URL is: "+ driver.getCurrentUrl());
System.out.println("Title is: " + driver.getTitle());
driver.close();
	}

}

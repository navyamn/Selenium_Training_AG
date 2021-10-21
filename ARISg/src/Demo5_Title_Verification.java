import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5_Title_Verification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com");
		String title=driver.getTitle();
		System.out.println("URL is: "+ driver.getCurrentUrl());
		System.out.println("Title is: " + title );
		
		
		if (title.equalsIgnoreCase("Google")) {
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Test Cases is Fail");
		}
		driver.close();

	}

}

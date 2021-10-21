import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo3_IE {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https:\\www.google.com");
		System.out.println("URL is: "+ driver.getCurrentUrl());
		System.out.println("Title is: " + driver.getTitle());
		driver.close();

	}

}

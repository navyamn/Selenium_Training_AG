import java.io.InputStreamReader;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo4_Browser_UserSelection {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(new 
		 InputStreamReader(System.in));		// Create a Scanner object
		 System.out.println("Enter your browser chioce (Chrome, Edge): ");
		 String browser = myObj.nextLine();
		 System.out.println("Your selected browser is " + browser);
		 
		 if(browser.contains("Chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("https:\\www.google.com");
			 System.out.println("URL is: "+ driver.getCurrentUrl());
			 System.out.println("Title is: " + driver.getTitle());
			 driver.close();
		 }
		 
		 else if (browser.contains("Edge")){
			 
				System.setProperty("webdriver.edge.driver", "C:\\Selenium\\browser\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
				driver.get("https:\\www.google.com");
				System.out.println("URL is: "+ driver.getCurrentUrl());
				System.out.println("Title is: " + driver.getTitle());
				driver.close();

		 }
		 else {
			 System.out.println("User selected browser is not valid");
		 }

	}

}

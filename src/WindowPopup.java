import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoption);
		//https://the-internet.herokuapp.com
		
	//	driver.get("https://the-internet.herokuapp.com");
		//WINDOW AUTHENTICATION POPUP HANDLE
		driver.get("http://admin:admin@the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Basic Auth")).click();
	}

}

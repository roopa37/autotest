package automation;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Praveen\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		 URL MyPath= new  URL("http://192.168.1.14:2345/wd/hub");
		
		 
		 
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.BINARY, new  File("C:\\\\Program Files\\\\Mozilla Firefox\\\\firefox.exe"));
		 RemoteWebDriver driver=  new RemoteWebDriver(MyPath,capabilities);
		 driver.get("https://www.google.com");
		 System.out.println(driver.getTitle());
		 
		

	}

}

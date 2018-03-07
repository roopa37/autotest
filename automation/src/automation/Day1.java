package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;;
public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver f= new FirefoxDriver();
		f.get("https://www.facebook.com/");
f.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Roopa");
f.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123");
 f.findElement(By.xpath("//*[@value=\"Log In\"]")).click();	
System.out.println("yes");
		
		f.get("https://www.kayak.com/");
		//f.findElement(By.
	}

}

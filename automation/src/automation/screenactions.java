package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class screenactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Praveen\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		//WebDriver a=new FirefoxDriver();
		//a.get("https://www.amazon.in");
		
		//Actions abc=new Actions(a);
		//WebElement Element= a.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]"));
		//abc.moveToElement(Element).build().perform();
		//WebElement xyz= a.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		//abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("Gsva").build().perform();
		//abc.contextClick(xyz).build().perform();
		/*WebDriver bank= new FirefoxDriver();
		bank.get("http://store.demoqa.com/");
		Actions abc= new Actions(bank);
		WebElement rty= bank.findElement(By.linkText("Product Category"));
		abc.moveToElement(rty).build().perform();
		bank.findElement(By.linkText("iPads")).click();
		
		Thread.sleep(4000);*/
		/*WebDriver F= new FirefoxDriver();
		F.get("https://netbanking.hdfcbank.com/netbanking/");
		System.out.println(F.getPageSource());
		F.switchTo().frame(1);
		F.findElement(By.cssSelector(".input_password")).sendKeys("10000");*/
		
		WebDriver L= new FirefoxDriver();
		L.get("https://www.ebay.com/");
		System.out.println(L.findElements(By.tagName("a")).size());
		//Count the number of links in Footer
		WebElement Footer= L.findElement(By.xpath("//*[@id=\"glbfooter\"]"));
		System.out.println("Footer links count");
		System.out.println( Footer.findElements(By.tagName("a")).size());
		// get the count of second column
		
		WebElement col= L.findElement(By.xpath("/html/body/div[5]/footer/div[2]/table/tbody/tr/td[2]/ul"));
		System.out.println(col.findElements(By.tagName("a")).size());
		String Beforeclicking=null;
		String Afterclicking;
	for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
	{
		// System.out.println(col.findElements(By.tagName("a")).get(i).getText());
		if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
			System.out.println("1");
			col.findElements(By.tagName("a")).get(i).click();
			Beforeclicking=L.getTitle();
			break;
		}
		
	}
		
   Afterclicking=L.getTitle();
   if (Beforeclicking==Afterclicking)
   {
	  L.getPageSource().contains("Site map");
	  System.out.println("pass");
	   
   }
   else {
	   System.out.println("Fail");
   }
		
	}

}

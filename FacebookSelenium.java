package AssignmentCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSelenium {

	private static final By Webdriver = null;
	private static final By  WebDriver = null;

	public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.manage().window().maximize();
	 driver.get("https://en-gb.facebook.com/");
	 String url=driver.getCurrentUrl();
	 System.out.println(url);
	 String sourceData=driver.getPageSource();
	 System.out.println(sourceData);
	 driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("tamil");
	 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("vanan");
	 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7358520346");
	 driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("A123@456");
	 Thread.sleep(5000);
	  WebElement dd1=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	  Select drop1=new Select (dd1);
	  drop1.selectByIndex(10);
	  WebElement dd2=driver.findElement(By.xpath("//select[@title='Month']"));
	  Select drop2=new Select(dd2);
	  drop2.selectByVisibleText("Jun");
	  WebElement dd3=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	  Select drop3=new Select(dd3);
	  drop3.selectByValue("2007");
	  driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	  //driver.close();

	}

}

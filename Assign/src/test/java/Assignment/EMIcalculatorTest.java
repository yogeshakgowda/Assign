package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EMIcalculatorTest {
	public static void main(String[] args) throws InterruptedException 
//	@Test
//	public void test() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		List<WebElement> ele1 = driver.findElements(By.cssSelector("path[fill=\"#B8204C\"]"));
		Actions act=new Actions(driver);
		for(WebElement web:ele1)
		{
			act.moveToElement(web).perform();
			Thread.sleep(3000);
			List<WebElement> tooltips = driver.findElements(By.xpath("//*[@style=\"color:#333333;cursor:default;font-size:12px;fill:#333333;\"]/*"));
															  
			for(WebElement web1:tooltips)
			{
				String text=web1.getText();
				System.out.println(text);
			}
			System.out.println("-------------");
		}
	}
}
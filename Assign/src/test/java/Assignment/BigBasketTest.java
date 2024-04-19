package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketTest {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.bigbasket.com/ps/?q=apple&nc=as");
     String addBtn="//h3[text()='Apple - Royal Gala Economy']/ancestor::div[contains(@class,'SKUDeck___StyledDiv')]//button[text()='Add']";
     WebElement ele1 = driver.findElement(By.xpath(addBtn));
     Thread.sleep(2000);
     Actions act=new Actions(driver);
     //act.scrollToElement(ele1);
     //act.scrollByAmount(0,200);
     ele1.click();
     WebElement ele2 = driver.findElement(By.xpath("//div[@class='flex flex-col false']//span[text()>0]/../following-sibling::button"));
     int need=3;

     for(int i=1;i<need;i++)
     {
         ele2.click();
         Thread.sleep(2000);
     }
     driver.close();
}
}

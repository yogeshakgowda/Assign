package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProKabbadiTest {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.prokabaddi.com/standings");
     Thread.sleep(5000);
     String s=System.getProperty("Browser");
     Thread.sleep(2000);
    // driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']")).click();
     Thread.sleep(2000);
     List<WebElement> eles = driver.findElements(By.xpath("//p[text()='"+s+"']/ancestor::div[@class='row-head']//p[@class='count']"));
     Thread.sleep(2000);
     for(WebElement ele:eles)
     {
         String text = ele.getText();
         Thread.sleep(2000);
         System.out.println(text);
         
     }
     driver.close();
 }
}

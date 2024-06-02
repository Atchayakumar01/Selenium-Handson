package BasicFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowsHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        Set <String> windows1 =  driver.getWindowHandles();
        System.out.println(windows1);

        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();

        Set <String> window2 = driver.getWindowHandles();
        System.out.println(window2);

        Iterator<String> it =  window2.iterator();
        String parentID = it.next();
        String childID = it.next();

        driver.switchTo().window(childID);

        String value = driver.findElement(By.xpath("//strong/a")).getText();
        System.out.println("The printed value is " +value);
        driver.close();
        driver.switchTo().window(parentID);
        driver.close();


    }
}

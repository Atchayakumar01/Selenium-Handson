package BasicFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FrameHandles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div[2]/button[2]/p")).click();

        driver.findElement(By.id("name")).sendKeys("Atchayakumar");

        driver.switchTo().frame(driver.findElement(By.id("frm1")));
        Select dropDown1 = new Select(driver.findElement(By.xpath("//*[@id=\'selectnav1\']")));
        dropDown1.selectByIndex(0);

        driver.switchTo().defaultContent();

        driver.findElement(By.id("name")).sendKeys(" Velayudham");




    }
}

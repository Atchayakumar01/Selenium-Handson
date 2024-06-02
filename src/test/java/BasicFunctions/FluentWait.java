package BasicFunctions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait<W extends SearchContext> {
    public static void main(String[] args) {
        //Fluent wait is used to  tell the Webdriver to wait for  a condition as well as the frequency with which we
        // want to check the condition before throwing an exception.

        //By setting the frequency , we are reducing the burden of a default polling

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");

        driver.findElement(By.id("//*[@id=\"userName\"]")).sendKeys("Atchayakumar");
        driver.findElement(By.id("//*[@id=\"password\"]")).sendKeys("Atchay@1999");
        driver.findElement(By.id("//*[@id=\"login\"]")).click();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        WebElement profile = wait.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(""));

            }



        });




    }
}

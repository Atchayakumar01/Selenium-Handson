package BasicFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        WebDriver driver =  new ChromeDriver();
        driver.get("https://qa-automation-practice.netlify.app/radiobuttons");

        driver.findElement(By.id("radio-button1")).click();
        driver.findElement(By.id("radio-button2")).click();
        WebElement checked = driver.findElement(By.id("radio-button3"));
        checked.click();
        Boolean Status1 = checked.isEnabled();
        System.out.println(Status1);

        WebElement unChecked = driver.findElement(By.id("radio-button4"));
        unChecked.click();
        Boolean Status2 = checked.isEnabled();
        System.out.println(Status2);



    }
}

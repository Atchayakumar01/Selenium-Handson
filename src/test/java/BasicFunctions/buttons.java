package BasicFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class buttons {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/button.xhtml");

        //1.Click and Confirm title.
         driver.findElement(By.id("j_idt88:j_idt90")).click();
         driver.close();

         Thread.sleep(5000);

         //2.Confirm if the button is disabled.
        driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
        driver.close();

        //3.Find the position of the Submit button
        WebElement buttonLocation = driver.findElement(By.id("j_idt88:j_idt94"));
        Point pointxy =buttonLocation.getLocation();
        int xvalue = pointxy.getX();
        int yvalue = pointxy.getY();
        System.out.println("The value of X is " + xvalue);
        System.out.println("The value of Y is " + yvalue);
        driver.close();

        //4.Find the Save button color
        WebElement colurButton = driver.findElement(By.id("j_idt88:j_idt96"));
        String colur = colurButton.getCssValue("background");
        System.out.println("The background colour is " + colur);
        driver.quit();

        //5.Find the height and width of this button
        WebElement size = driver.findElement(By.id("j_idt88:j_idt98"));
        int height = size.getSize().getHeight();
        int width = size.getSize().getWidth();
        System.out.println("The height of the button is " + height);
        System.out.println("The Width of the button is " + width);
        driver.quit();

        //6.Mouse over and confirm the color changed
        WebElement firstButtonColour = driver.findElement(By.id("j_idt88:j_idt100"));
        String previousColour = firstButtonColour.getCssValue("background-color");
        System.out.println("Before Colour is " + previousColour);
        driver.quit();
        //Need to add after mouse touch the button function

        //7.Click Image Button and Click on any hidden button
        driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();









    }
}

package BasicFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDowns {

    public static void main(String[] args) {

        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*"); */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/select.xhtml");

        //1.Which is your favorite UI Automation tool?

         WebElement dropDown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
        Select select = new Select(dropDown1);
        //select.selectByIndex(1);
        //select.selectByValue("2");
        select.selectByVisibleText("Cypress");


        //2.Choose your preferred country.

       Select select1 = new Select(driver.findElement(By.id("j_idt87:country")));
       select1.selectByIndex(3);

       //3.Take a count of total number of options available

        WebElement dropDown3 = driver.findElement(By.id("j_idt87:country_label"));
        Select id = new Select(dropDown3);
        List<WebElement> listOfOptions = id.getOptions();
        int size = listOfOptions.size();
        System.out.println("The total number of element is "  + size);

        //4.Choose language randomly
        driver.findElement(By.id("//*[@id=\"j_idt87:lang_label\"]")).sendKeys("Tamil");









    }


}

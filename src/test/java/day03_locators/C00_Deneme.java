package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C00_Deneme {
    /*
        1- amazon.com'a gidip arama kutusunu locate edin
        2- arama kutusunun tagName'inin input oldugunu test edin
        3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https:/www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // 2- arama kutusunun tagName'inin input oldugunu test edin

        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";

        if(expectedTagName.equals(actualTagName)){
            System.out.println("tagname is Passed");
        }else
            System.out.println("tagname is Failed");

        //3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin

        String actualNameAttribute = aramaKutusu.getAttribute("name");
        String expectedNameAttribute = "field-keywords";

        if(expectedNameAttribute.equals(actualNameAttribute)){
            System.out.println("Attribute Test is Passed");

        }else
            System.out.println("Attribute Test is Failed");

        driver.close();

    }
}

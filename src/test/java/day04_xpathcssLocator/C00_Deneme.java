package day04_xpathcssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C00_Deneme {
    /*
1 ) Bir class oluşturun : Locators_css
2
Main method oluşturun ve aşağıdaki görevi tamamlayın.
a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
b. Locate email textbox
c. Locate password textbox ve
d. Locate signin button
e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini
tıklayın
i. Username : testtechproed@gmail.com
ii. Password : Test1234!
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement berlin = driver.findElement(By.id("pid7_thumb"));
        WebElement movember = driver.findElement(By.id("pid12_thumb"));

        WebElement sailor = driver.findElement(RelativeLocator.with(By.tagName("img")).below(berlin).toLeftOf(movember));
        System.out.println(sailor.getTagName());


    }
}

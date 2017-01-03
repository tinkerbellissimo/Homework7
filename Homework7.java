import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by tinkerbellissimo on 12/29/16.
 */
public class Homework7 {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "/Users/tinkerbellissimo/Downloads/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void test() {
        driver.get("http://localhost/litecart/admin");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();

        int countItems = driver.findElements(By.id("app-")).size();
        List<WebElement> items;
        for (int i = 0; i < countItems; i++) {
            items=driver.findElements(By.id("app-"));
            System.out.println("Main item: "+items.get(i).getText());
            items.get(i).click();
            System.out.println(isElementPresent(driver, By.tagName("h1")));

            int countSubItems = driver.findElements(By.cssSelector("[id*=doc]")).size();
            for (int j = 0; j < countSubItems; j++) {
                List<WebElement> subItems = driver.findElements(By.cssSelector("[id*=doc]"));
                System.out.println("SubItem: "+subItems.get(j).getText());
                subItems.get(j).click();
                System.out.println(isElementPresent(driver, By.tagName("h1")));
            }
        }
    }

    boolean isElementPresent(WebDriver driver, By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Appearence')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-logotype']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Catalog')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-product_groups']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-option_groups']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-manufacturers']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-suppliers']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-delivery_statuses']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-sold_out_statuses']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-quantity_units']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-csv']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Countries')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Currencies')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Customers')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-csv']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-newsletter']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Geo Zones')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Languages')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-storage_encoding']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Modules')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-customer']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-shipping']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-payment']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-order_total']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-order_success']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-order_action']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Orders')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-order_statuses']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Pages')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Reports')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-most_sold_products']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-most_shopping_customers']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Settings')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-defaults']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-general']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-listings']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-images']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-checkout']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-advanced']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-security']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Slides')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Tax')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-tax_rates']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Translations')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-scan']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='doc-csv']/a/span")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'Users')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2][contains(.,'vQmods')]")).click();
        System.out.println(isElementPresent(driver, By.tagName("h1")));
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

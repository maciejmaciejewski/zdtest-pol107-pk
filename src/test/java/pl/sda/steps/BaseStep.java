package pl.sda.steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.sda.TestContext;

import java.time.Duration;

class BaseStep {
    ChromeDriver driver;
    WebDriverWait wait;
    TestContext context;

    public BaseStep(TestContext context) {
        System.setProperty("webdriver.chrome.driver", "/Users/maciejew/dev/selenium/chromedriver");
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.context = context;
    }
}

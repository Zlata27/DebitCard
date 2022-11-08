import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class DebitCardTest1 {

    private WebDriver driver;

    @BeforeAll
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
    }

    @BeforeEach
    void setUpp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearsDown() {
        driver.quit();
        driver = null;
    }


    @Test
    void shouldWriteSomething() {
        driver.get("http://localhost:9999/");
        driver.findElements(By.cssSelector("[data-test-id=name] input")).sendKeys("Иван");
    }

    
}

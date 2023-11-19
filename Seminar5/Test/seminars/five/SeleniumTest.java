package seminars.five;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
//
//    private WebDriver driver;
//
//    @BeforeEach
//    public void setUp() {
//        // Установите свойство системы для chromedriver.
//        System.setProperty("webdriver.chrome.driver", "C:/Users/kotis.HYPERKOT/OneDrive/GeekBrains/14_Unit_Tests/chromedriver.exe");
//        driver = new ChromeDriver();
//    }
//
//    @Test
//    public void testGoogleSearchForSelenium() {
//        // 1. Открывает главную страницу Google.
//        driver.get("https://www.google.com");
//
//        // 2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("Selenium");
//        searchBox.submit();
//
//        // Даем странице время для загрузки результатов
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // 3. В результатах поиска ищет ссылку на официальный сайт Selenium.
//        WebElement seleniumLink = driver.findElement(By.cssSelector("a[href='https://www.selenium.dev']"));
//
//        // Проверяем, что ссылка действительно присутствует среди результатов поиска.
//        assertTrue(seleniumLink.isDisplayed());
//    }
//
//    @AfterEach
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    public static void main(String[] args) {
// System.setProperty("webdriver.chrome.driver",
// "C:/Users/Old_Home/IdeaProjects/Unit-test_Seminars/chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

    }
}
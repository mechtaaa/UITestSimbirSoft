package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Settings {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver.exe");
        driver = new ChromeDriver();
        // для всех тестов будет загружаться драйвер
        Dimension dimension = new Dimension(1280, 1024);
        driver.manage().window().setSize(dimension);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://ya.ru/");
    }
     @After
   public void close() {
        driver.quit();
    }
}
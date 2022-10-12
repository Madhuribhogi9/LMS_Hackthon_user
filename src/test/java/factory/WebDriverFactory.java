package factory;

import Utilities.FileManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebDriverFactory
{
    private static WebDriver driver;

    public static synchronized WebDriver getWebDriver() throws IOException
    {
        if (driver == null) {
            initialize();
        }
        return driver;
    }
    private static Logger logger = LogManager.getLogger(WebDriverFactory.class.getName());

        private static void initialize() throws IOException
        {
            System.setProperty("log4j2.configurationFile","C:\\selenium-grid\\LMS-Hackthon\\src\\test\\java\\Logger\\log4j2\\log4j2.xml" );
        URL chromeURL = WebDriverFactory.class.getClassLoader().getResource("chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chrome driver\\chromedriver.exe");
        logger.info("*****************opening chrome browser*****************");
        driver = new ChromeDriver();
        logger.info("*******************Entering URL***************");
        driver.get(FileManager.getPropertyValue("URL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

    }
}

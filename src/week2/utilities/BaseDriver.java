package week2.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseDriver {
    public static WebDriver driver;
    static {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("incognito");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
    }

}

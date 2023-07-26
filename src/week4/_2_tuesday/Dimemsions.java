package week4._2_tuesday;

import org.openqa.selenium.Dimension;
import week2.utilities.BaseDriver;
import week2.utilities.MyFunctions;


public class Dimemsions extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://itera-qa.azurewebsites.net/");
        Dimension dimension= new Dimension(1200,844);
        driver.manage().window().setSize(dimension);
        MyFunctions.waitFunc(3);
        driver.quit();
    }
}

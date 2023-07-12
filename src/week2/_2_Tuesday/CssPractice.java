package week2._2_Tuesday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import week2.utilities.BaseDriver;
import week2.utilities.MyFunctions;

public class CssPractice extends BaseDriver {

    public static void main(String[] args) {

        // Lets begin with GiftCard Menu

        // 1.step: I will go to amazon.com

        driver.get("https://www.amazon.com");

        MyFunctions.waitFunc(2);

        WebElement giftCard = driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_gc']"));
        System.out.println(giftCard.getText());


        WebElement registry = driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_registry']"));
        System.out.println(registry.getText());




    }


}

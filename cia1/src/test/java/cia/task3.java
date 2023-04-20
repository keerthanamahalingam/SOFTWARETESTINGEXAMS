package cia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {
public static void main(String[] args)
{
WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver = new ChromeDriver(co);
driver.navigate().to("https://www.amazon.in/");
//WebElement acc = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
WebElement acc = driver.findElement(By.xpath("//*[@class=\"nav-icon nav-arrow\"]"));
acc.click();
    driver.navigate().to("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
WebElement order = driver.findElement(By.xpath("//*[@class=\"a-box-inner\"]"));
order.click();
driver.navigate().to("https://www.amazon.in/gp/your-account/order-history?timeFilter=year-2023");
WebElement vieworder = driver.findElement(By.xpath("//*[@class=\"a-link-normal\"]"));
vieworder.click();


}
}

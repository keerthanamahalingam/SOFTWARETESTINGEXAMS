package cia;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {
public static void main(String[] args)
{
WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver = new ChromeDriver(co);

driver.navigate().to("https://www.amazon.in/Apple-iPhone-128GB-Deep-Purple/dp/B0BDJ6ZMCC/ref=sr_1_3?crid=1ZXCJWE2CQA1L&keywords=iphone&qid=1681288425&sprefix=iphone%2Caps%2C375&sr=8-3&th=1#");
WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
addtocart.click();
WebElement check = driver.findElement(By.xpath("//*[@class=\"a-button-input\"]"));
check.click();

driver.navigate().to("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
WebElement qty = driver.findElement(By.id("a-autoid-1-announce"));
qty.click();

WebElement dty = driver.findElement(By.id("quantity_10"));
dty.click();


WebElement update = driver.findElement(By.id("a-autoid-1-announce"));
update.click();

driver.navigate().to("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
WebElement del = driver.findElement(By.xpath("//*[@class=\"a-color-link\"]"));
del.click();

}
}



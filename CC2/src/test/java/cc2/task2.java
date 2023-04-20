


package cc2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {
public static void main(String[] args)
{
WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver=new ChromeDriver(co);
driver.manage().window().maximize();
driver.get("https://www.yatra.com/");
WebElement flight = driver.findElement(By.xpath("//*[@id=\"booking_engine_flights\"]"));
flight.click();
WebElement rtrip = driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[1]/ul[1]/li[2]/a"));
rtrip.click();
}
}


package cc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver(co);
		driver.get ("https://www.saucedemo.com/");
		driver.manage().window().maximize() ;
		WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		txtBoxl.sendKeys("standard_user");
		WebElement txtBox2=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		txtBox2.sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
		WebElement txtBox3=driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
		txtBox3.sendKeys("keerthana");
		WebElement txtBox4=driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
		txtBox4.sendKeys("M");
		WebElement txtBox5=driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
		txtBox5.sendKeys("607467");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		String txt1=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println(txt1);
		String txt2=driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")).getText();
		System.out.println(txt2);
		
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String expectedTitle="Swag Labs";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");
		}
		
		String currentUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.saucedemo.com/checkout-step-two.html";
		if(currentUrl.equals(expectedUrl)) {
			System.out.println("URL Matched");
		}
		else {
			System.out.println("URL not Matched");
		}
		Thread.sleep(5000);		
		
	}

}
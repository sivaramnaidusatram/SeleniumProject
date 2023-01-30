package Automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\APK\\chromedriver_win32\\chromedriver.exe");  
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://94.56.79.244/firstpassadmin/#/");
		 Thread.sleep(5000);
		 driver.findElement(By.id("username")).sendKeys("Cardoc4");
		 driver.findElement(By.id("password")).sendKeys("Akhil@99");
		 driver.findElement(By.xpath("//*[contains(@class,'btn')]")).click();
		//img[src='./static/media/admin-settings.ddf8e409.svg']
		//li[@id='adsettings']//img
		 //(//img)[6]
		 Thread.sleep(10000);
		 //driver.findElement(By.xpath("//*[@id=\"adsettings\"]/a/img")).click();
		 WebElement settings= driver.findElement(By.xpath("//*[@id='adsettings']/a/img"));
		 Actions actions = new Actions(driver);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/*[@id='adsettings']/a/img")));
		 actions.moveToElement(settings).click().perform();
//		 actions.click().perform();
//		 
		System.out.println("Hello World");

	}

}

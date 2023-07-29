package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_01_Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.goodreads.com");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign in with email')]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("bandarilavanya953@gmail.com");

		driver.findElement(By.id("ap_password")).sendKeys("953@Gmail.com");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("(//img[@alt='Dismiss'])[1]")).click();
		driver.findElement(By.name("q")).sendKeys("harry potter",Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'636 Harry Potter Spells')]/../..//span[text()='Want to Read']")).click();
		driver.findElement(By.linkText("My Books")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Harry Potter')]/../../..//img[@alt='Remove from my books']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//img[@alt='Bandari Lavanya'])[1]")).click();
		driver.findElement(By.linkText("Sign out")).click();

		driver.quit();

	}
}

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZipangLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stg-fe-www.elysium-zpngcsn.com/");
		Thread.sleep(4000L);
		driver.get("https://stg-fe-www.elysium-zpngcsn.com/live-games");
		driver.getTitle();

		driver.findElement(By.xpath("/html/body/footer/div[1]/div[1]/ul/li[1]/a")).click();
		driver.get("https://stg-fe-www.elysium-zpngcsn.com/en/casino?category=new-games");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"game-category-tab\"]/li[2]")).click();
		driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[2]/div[1]/nav/ul/li[3]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"game-category-tab\"]/li[3]")).click();
		// driver.findElement(By.cssSelector("#pagination > ul >
		// li.page-list.active")).click();
		driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[2]/div[1]/nav/ul/li[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"game-category-tab\"]/li[5]")).click();
		Thread.sleep(4000L);
		driver.findElement(By.id("game-search")).sendKeys("Break");
		driver.findElement(By.id("game-search-btn")).click();
		driver.findElement(By.xpath("/html/body/footer/div[1]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000L);
		driver.get("https://stg-fe-www.elysium-zpngcsn.com/casino?category=new-games");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"game-category-tab\"]/li[2]")).click();
		// driver.findElement(By.className("page-list next-page ")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"game-category-tab\"]/li[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"game-category-tab\"]/li[4]")).click();
		Thread.sleep(2000L);

		driver.findElement(By.xpath("/html/body/header/div[3]/ul/li[7]/a")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[1]/nav/ul/li[3]")).click();
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[1]/nav/ul/li[4]")).click();
		//driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[1]/nav/ul/li[4]")).click();
		Thread.sleep(2000L);
		// driver.findElement(By.id("game-search")).sendKeys("ice");
		//driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div/nav/ul[3]/li[9]")).click();
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[1]/nav/ul/li[4]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("apply-filter")).click();
		driver.findElement(By.id("game-search")).sendKeys("ice");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/header/div[1]/div[4]")).click();
		driver.findElement(By.xpath("/html/body/header/div[1]/div[5]/div[2]/div[3]/form/div[8]/div/a")).click();
		driver.findElement(By.id("JapanRegistrationForm_username")).sendKeys("Sinke");
		driver.findElement(By.id("JapanRegistrationForm_firstname")).sendKeys("sinke");
		driver.findElement(By.id("JapanRegistrationForm_lastname")).sendKeys("sinke");
		driver.findElement(By.id("JapanRegistrationForm_password")).sendKeys("sinke123");
		driver.findElement(By.id("JapanRegistrationForm_confirm_password")).sendKeys("sinke123");
		driver.findElement(By.id("JapanRegistrationForm_email")).sendKeys("sinke123@yopmail.com");
		driver.findElement(By.id("JapanRegistrationForm_confirm_email")).sendKeys("sinke123@yopmail.com");
		driver.findElement(By.id("JapanRegistrationForm_submit")).click();
		Thread.sleep(4000L);
		
//		
		driver.findElement(By.id("JapanRegistrationForm_birthdate")).sendKeys("2003/08/01");
		driver.findElement(By.id("JapanRegistrationForm_phone")).sendKeys("1111111");
		driver.findElement(By.id("JapanRegistrationForm_zipcode")).sendKeys("11111");
		driver.findElement(By.id("JapanRegistrationForm_city")).sendKeys("Sinke");
		driver.findElement(By.id("JapanRegistrationForm_address")).sendKeys("Sinke1");
		System.out.println(driver.findElement(By.id("JapanRegistrationForm_address")).getText());
		driver.findElement(By.id("JapanRegistrationForm_submit")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div[1]/div[1]/form/div[3]/div[1]/div[1]/div/label/input")).click();
		// driver.findElement(By.xpath("))
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src,new
		// File("C:\\Users\\PC\\OneDrive\\Pictures\\Screenshots"));

	}

}

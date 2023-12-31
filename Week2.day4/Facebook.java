package Week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		//Initialize chromedriver
				ChromeDriver driver = new ChromeDriver();
				//open the website
				driver.get("https://en-gb.facebook.com/");
				//Max the windows
				driver.manage().window().maximize();
				//Implicity Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//click create account
				driver.findElement(By.linkText("Create new account")).click();
				// enter firstName
				driver.findElement(By.name("firstname")).sendKeys("Guru");
				//enter surname
				driver.findElement(By.name("lastname")).sendKeys("Prakash");
				//Enter the Mobile number or email address.
				driver.findElement(By.name("reg_email__")).sendKeys("8438967596");
				//enter the password
				driver.findElement(By.id("password_step_input")).sendKeys("Guru@2000");
				//enter DOB
				//month
				WebElement month =driver.findElement(By.name("birthday_month"));
				Select m = new Select(month);
				m.selectByValue("Sep");
				//day
				WebElement day=driver.findElement(By.id("day"));
				Select d = new Select(day);
				d.selectByIndex(10);
				//year
				WebElement year =driver.findElement(By.id("year"));
				Select y = new Select(year);
				y.selectByValue("2000");
				
	}

}

package Unosquare;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon {

	@Test
	public void loginTest() {
		System.out.println("Starting Amazon");

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		// maximize browser windows
		driver.manage().window().maximize();

		// open test page
		String url = "https://www.amazon.com.mx/";
		driver.get(url);
		System.out.println("page is opened");
		
		WebElement menuOption = driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menuOption).perform();

		WebElement start = driver.findElement(By.linkText("Empieza aquí."));
		start.click();
		
		WebElement customer =driver.findElement(By.id("ap_customer_name"));
		customer.sendKeys("Gerardo Garza");
		
		
		WebElement email =driver.findElement(By.id("ap_email"));
		email.sendKeys("Gerardo.Garza@fake.com");
		
		WebElement condiciones = driver.findElement(By.linkText("Condiciones de Uso"));
		condiciones.click();
		
		WebElement help =driver.findElement(By.id("helpsearch"));
		help.sendKeys("echo" + Keys.ENTER);
		
		WebElement helpecho = driver.findElement(By.linkText("Ayuda para Echo"));
		helpecho.click();
		
		
		

	}

}

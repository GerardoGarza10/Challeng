package Unosquare;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Microsoft {

	@Test
	public void loginTest() {
		System.out.println("Starting Micosoft");

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		// maximize browser windows
		driver.manage().window().maximize();

		// open test page
		String url = "https://www.microsoft.com/en-us/";
		driver.get(url);
		System.out.println("page is opened");
		
		String expectedText = "Office";
		String actualText = "Office";
		Assert.assertEquals(actualText, expectedText, "Actual text is the same");
		System.out.println("The Text Office is the same");
		
		String expectedText2 = "Windows";
		String actualText2 = "Windows";
		Assert.assertEquals(actualText2, expectedText2, "Actual text is the same");
		System.out.println("The Text Windows is the same");
		
		String expectedText3 = "Surface";
		String actualText3 = "Surface";
		Assert.assertEquals(actualText3, expectedText3, "Actual text is the same");
		System.out.println("The Text Surface is the same");
		
		String expectedText4 = "Xbox";
		String actualText4 = "Xbox";
		Assert.assertEquals(actualText4, expectedText4, "Actual text is the same");
		System.out.println("The Text Xbox is the same");
		
		String expectedText5 = "Deals";
		String actualText5 = "Deals";
		Assert.assertEquals(actualText5, expectedText5, "Actual text is the same");
		System.out.println("The Text Deals is the same");
		
		String expectedText6 = "Support";
		String actualText6 = "Support";
		Assert.assertEquals(actualText6, expectedText6, "Actual text is the same");
		System.out.println("The Text Support is the same");
		
		WebElement windows = driver.findElement(By.id("shellmenu_2"));
		windows.click();
		
		WebElement windowsopen = driver.findElement(By.id("c-shellmenu_56"));
		windowsopen.click();
		
		System.out.println("Prueba2");
		WebElement menuOption = driver.findElement(By.xpath("//nav[@id='uhf-g-nav']/ul[@class='js-paddle-items']/li[2]/div[@class='c-uhf-menu js-nav-menu']/ul/li[2]/button[@type='button']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menuOption).perform();
		
		System.out.println("Done Mouse hover on 'Music' from Menu");

		//String label = driver.findElement(By.xpath("//nav[@id='uhf-g-nav']/ul[@class='js-paddle-items']/li[2]/div[@class='c-uhf-menu js-nav-menu']/ul/li[2]/button[@type='button']")).getText();
		String label1 = driver.findElement(By.xpath("//nav[@id='uhf-g-nav']/ul[@class='js-paddle-items']/li[2]/div[@class='c-uhf-menu js-nav-menu']/ul/li[2]/ul//a[@href='https://www.microsoft.com/p/windows-10-home/d76qx4bznwk4']")).getText();
		String label2 = driver.findElement(By.xpath("//nav[@id='uhf-g-nav']/ul[@class='js-paddle-items']/li[2]/div[@class='c-uhf-menu js-nav-menu']/ul/li[2]/ul//a[@href='https://www.microsoft.com/p/windows-10-pro/df77x4d43rkt']")).getText();
		String label3 = driver.findElement(By.xpath("//nav[@id='uhf-g-nav']/ul[@class='js-paddle-items']/li[2]/div[@class='c-uhf-menu js-nav-menu']/ul/li[2]/ul//a[@href='https://www.microsoft.com/en-us/windows/compare-windows-10-home-vs-pro']")).getText();
		String label4 = driver.findElement(By.xpath("//nav[@id='uhf-g-nav']/ul[@class='js-paddle-items']/li[2]/div[@class='c-uhf-menu js-nav-menu']/ul/li[2]/ul//a[@href='https://www.microsoft.com/en-us/windows/windows-10-specifications']")).getText();
		
		
		System.out.println("Brand names are: \n" + label1 + " \n"+ label2 +"\n"+ label3 + "\n" + label4);
		
		WebElement buttonsearch = driver.findElement(By.id("search"));
		buttonsearch.click();
		
		WebElement searchtext =driver.findElement(By.id("cli_shellHeaderSearchInput"));
		searchtext.sendKeys("Visual Studio");
		
		WebElement search = driver.findElement(By.id("search"));
		search.click();
		
		WebElement close = driver.findElement(By.xpath("//div[@id='R1MarketRedirect']/div[2]/button[@class='c-glyph glyph-cancel']"));
		close.click();
		
		WebElement info = driver.findElement(By.xpath("/html//div[@id='moduleregion']/div[1]//ul/li[1]//a[@href='/en-us/d/visual-studio-professional-subscription/dg7gmgf0dst3']//img[@alt='Visual Studio Professional Subscription ']"));
		info.click();	
		
		WebElement close2 = driver.findElement(By.xpath("/html//div[@id='geo-selector-modal']/div[@role='document']/div[@class='modal-content']//button[.='Permanecer en United States - English']"));
		close2.click();
		
		WebElement buttonadd = driver.findElement(By.xpath("/html//div[@id='rootContainer_BuyBox']/section[@class='buy-box material-md-card']/div//a[@href='javascript:void(0)']"));
		buttonadd.click();
		

		

		
		


	}

}

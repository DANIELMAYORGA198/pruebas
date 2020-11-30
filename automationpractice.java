package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.Select;

public class automationpractice {
	private WebDriver driver;
	//By registerLinkLocator = By.linkText("Sign in");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();//carga chrome browser
		driver.get("http:\\automationpractice.com");
		/*By locator = By.className("login");
		WebElement element = driver.findElement(locator);
		element.click();*/
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("oden1@hotmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		//espere por la proxima pagina a cargar
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		String pageHeading = driver.findElement(By.className("page-heading")).getText();
		System.out.println("Page Heading: "+pageHeading);
		
		//WebElement searchBox = driver.findElement(locator);
		//searchBox.sendKeys("Dress"); //type
		//driver.manage().window().maximize();
		driver.findElement(By.id("uniform-id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Francisco");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		WebElement primer = driver.findElement(By.id("customer_firstname"));
		driver.findElement(By.id("customer_lastname")).sendKeys("Moron");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		WebElement apellido = driver.findElement(By.id("customer_lastname"));
		driver.findElement(By.id("email_create")).sendKeys(" ");
		driver.findElement(By.id("isPasswd")).click();
		driver.findElement(By.id("isPasswd")).sendKeys("Moron120");
		WebElement eledia =driver.findElement(By.name("days"));
		Select selecdia = new Select(eledia);
		selecdia.selectByValue("5");
		WebElement elmes =driver.findElement(By.name("months"));
		Select selectmes = new Select(elmes);
		selectmes.selectByValue("5");
		WebElement eleanio =driver.findElement(By.name("years"));
		Select selecanio = new Select(eleanio);
		selecanio.selectByValue("2000");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("firstname")).sendKeys("Francisco");
		driver.findElement(By.id("lastname")).sendKeys("Moron");
		driver.findElement(By.id("company")).sendKeys("Sanext co");
		driver.findElement(By.id("address1")).sendKeys("Cll 5 34 21 avenida porman");
		driver.findElement(By.id("address1")).sendKeys("");
		WebElement eleState =driver.findElement(By.name("id_state"));
		Select selectState = new Select(eleState);
		//selectState.selectByValue("5");
		selectState.selectByVisibleText("Georgia");
		driver.findElement(By.id("postcode")).sendKeys("12211");
		WebElement elepais =driver.findElement(By.name("id_country"));
		Select selecpais = new Select(elepais);
		//selectState.selectByValue("5");
		selecpais.selectByVisibleText("United States");
		driver.findElement(By.id("other")).sendKeys("Jamaica");
		driver.findElement(By.id("phone")).sendKeys("32323922");
		driver.findElement(By.id("phone_mobile")).sendKeys("3121221253");
		driver.findElement(By.id("alias")).sendKeys("Fmoron");
		driver.findElement(By.id("submitAccount")).click();
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		
	}

}

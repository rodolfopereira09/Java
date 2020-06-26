package Testes;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidaPesquisaMagaluTest {
	
	private WebDriver driver;

	@Before
	public void Antes() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[1]")));
		driver.get("http://magazineluiza.com.br");
	}

	@After
	public void Depois() {
		driver.quit();
	}

	@Test
	//valida sacola de compra
	public void Test1() throws InterruptedException {
		driver.findElement(By.id("inpHeaderSearch")).sendKeys("panelas");
		driver.findElement(By.id("btnHeaderSearch")).click();
		driver.findElement(By.xpath("//*[@id=\"product_144129900\"]/div[3]/h2")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[5]/div[1]/div[4]/div[2]/button")).click();
		assertEquals("Código do produto: 144129900", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div/a/p[2]")).getText());
		
	}
	
}

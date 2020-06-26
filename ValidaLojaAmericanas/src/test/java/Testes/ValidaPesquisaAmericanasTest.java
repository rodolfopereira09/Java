package Testes;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidaPesquisaAmericanasTest {
	
	private WebDriver driver;

	@Before
	public void Antes() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://americanas.com.br");
	}

	@After
	public void Depois() {
		driver.quit();
	}

	@Test
	//pesquisa produto
	public void Test1() throws InterruptedException {
		driver.findElement(By.id("h_search-input")).sendKeys("Panelas");
		driver.findElement(By.id("h_search-input")).submit();
		Thread.sleep(2000);
		assertEquals("panelas", driver.findElement(By.xpath("//*[@id=\"content-middle\"]/div[1]/div/div/h1")).getText());
				
	}
	
}



package Testes;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidaPesquisaPage {
	
	WebDriver driver;

	public void abrirsite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.google.com.br/");
	}

	public void pesquisaescola() {
		driver.findElement(By.name("q")).sendKeys("E2E Treinamentos");
		driver.findElement(By.name("q")).submit();
	}

	public void validapesquisaescola() {
		assertEquals("E2E Treinamentos",
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).getText());
		driver.quit();
	}
	
	public void pesquisacarro() {
		driver.findElement(By.name("q")).sendKeys("Ferrari");
		driver.findElement(By.name("q")).submit();
	}
	
	public void validapesquisacarro() {
		assertEquals("Ferrari | Webmotors", driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).getText());
		driver.quit();
	}

}

package Testes;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidaElementosBasicosTest {
	
	WebDriver driver;

	@Before
	public void abrirBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@After
	public void fechar(){
		
		//Por enquanto não vou usar você :(
	}

	@Test
	public void textField() {
		driver.get("https://www.google.com.br/");
		driver.findElement(By.name("q")).sendKeys("Carro");
		assertEquals("Carro", driver.findElement(By.name("q")).getAttribute("value"));
		driver.findElement(By.name("q")).submit();
		driver.quit();
	}
	
	@Test
	public void textArea() {
		driver.get("https://automacaocombatista.herokuapp.com/buscaelementos/inputsetextfield");
		driver.findElement(By.id("textarea1")).sendKeys("Ola Tudo?\nEu sou o Rodrigo.\nPosso ser seu professor?");
		driver.quit();
	}
	
	
	@Test
	public void radioButton() throws InterruptedException {
		driver.get("https://automacaocombatista.herokuapp.com/buscaelementos/radioecheckbox");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[4]/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[3]/label")).click();
		//assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[4]/label")).isSelected());
		driver.quit();
		
		
	}
	
	@Test
	public void checkBox() throws InterruptedException {
		driver.get("https://automacaocombatista.herokuapp.com/buscaelementos/radioecheckbox");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/p[4]/label")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/p[3]/label")).click();
		driver.quit();
		
	}
	
	@Test
	public void comboSelect() throws InterruptedException {
		driver.get("https://automacaocombatista.herokuapp.com/buscaelementos/dropdowneselect");
		Thread.sleep(1000);
//		WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[5]/div[1]/div/input"));
//		element.click();
//		Select combo = new Select(element);
//		combo.selectByVisibleText("Cavaleiros dos Zodiacos");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[5]/div[1]/div/input")).click();
		driver.findElement(By.xpath("//li//span[contains(., 'Cavaleiros dos Zodiacos')]")).click();
		driver.quit();
	}
	
	
	@Test
	public void comboSelectExercicio() throws InterruptedException {
		Thread.sleep(1000);
		driver.get("https://automacaocombatista.herokuapp.com/buscaelementos/dropdowneselect");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[5]/div[1]/div/input")).click();
		driver.findElement(By.xpath("//li//span[contains(., 'Naruto')]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[5]/div[3]/div/input")).click();
		driver.findElement(By.xpath("//li//span[contains(., 'Alemanha')]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[5]/div[4]/div/input")).click();
		driver.findElement(By.xpath("//li//span[contains(., 'Homem')]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[5]/div[5]/div/input")).click();
		driver.findElement(By.xpath("//li//span[contains(., 'Masculino')]")).click();
	}	
}


package Testes;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidaMenuFormularioPage {
	
	WebDriver driver;

	public void abrirsite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://automacaocombatista.herokuapp.com/treinamento/home");
	}

	public void paginaformulario() {
		driver.findElement(By.xpath("//*[@class=\"collapsible-header \"]")).click();
		driver.findElement(By.xpath("//a[contains(@href, \"/users/new\")]")).click();
	}

	public void paginalistarusuario() {
		driver.findElement(By.xpath("//*[@class=\"collapsible-header \"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[2]/a")).click();
	}

	public void preencheformulario(String nome, String ultimonome, String email) {
		driver.findElement(By.id("user_name")).sendKeys(nome);
		driver.findElement(By.id("user_lastname")).sendKeys(ultimonome);
		driver.findElement(By.id("user_email")).sendKeys(email);
	}

	public void botaocriar() {
		driver.findElement(By.name("commit")).submit();
	}

	public void botaovoltar() {
		driver.findElement(By.xpath("//*[@class=\"btn waves-light red\"]")).click();
	}

	public void botaoeditar() {
		driver.findElement(By.xpath("//*[@class=\"btn waves-light blue\"]")).click();
	}
	
	public void botaopesquisalistauser() {
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr[3]/td[9]/a")).click();
	}
	

	public void validausuariocadastrado(String validamsgusercadastrado) {
		assertTrue(driver.findElement(By.id("notice")).getText().contains(validamsgusercadastrado));
		driver.quit();
	}

	public void validaobrigatoriedadecampos(String validaobgcampos) {
		assertTrue(driver.findElement(By.id("error_explanation")).getText()
				.contains(validaobgcampos));
		driver.quit();
	}
	
	public void validapaginahome(String validatelahome) {
		assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/h5")).getText().contains(validatelahome));
		driver.quit();
	}

	public void validapaginaformulario(String validatelaformulario) {
		assertTrue(driver.findElement(By.xpath("//*[@class=\"bold\"]")).getText().contains(validatelaformulario));
		driver.quit();
	}

}

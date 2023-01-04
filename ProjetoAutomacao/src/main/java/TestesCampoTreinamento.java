import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestesCampoTreinamento {
	
	@Test
	public void testeTestField() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("http://google.com");
		driver.get("file:///"+System.getProperty("user.dir")+ "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Teste de escrita");
		Assert.assertEquals("Teste de escrita", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		driver.quit();
	
					
	}

	@Test
	public void testeTextArea() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// driver.get("http://google.com");
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Testes\n\nTeste1\n\nTeste2");
		Assert.assertEquals("Testes\n\nTeste1\n\nTeste2", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
		driver.quit();
	}
	
	@Test
	public void testeRadioButton() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
		driver.quit();
	}

	@Test
	public void testeCheckBox() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
		driver.quit();
	
	
	}
}




		
		
		
		



import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbrirBrowser {
	
	@Test
	public void teste() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
		

	}

}

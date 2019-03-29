package fake;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conexao {

public static WebDriver driver;


	public static WebDriver setUp(String navegador) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (navegador.contains("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("Connection was failed");
		}


		return driver;
	}
}

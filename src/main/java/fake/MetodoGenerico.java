package fake;

import org.openqa.selenium.WebElement;

public class MetodoGenerico extends Conexao {

	public void getUrl() {
		driver.get("https://trabalhador.certponto.com.br");
	}

	public void click(WebElement element) {
		element.click();
	}

	public void escreva(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void waitTime(long time) {
		try {
			Thread.sleep(time);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

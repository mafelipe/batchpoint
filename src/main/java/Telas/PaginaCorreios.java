package Telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import fake.Conexao;

public class PaginaCorreios extends Conexao {

	WebDriver driver;

	public PaginaCorreios(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getBuscaCEP() {

		return driver.findElement(By.xpath("//*[@id=\"reactRoot\"]/div/div[1]/div[1]/header/nav/ul/li[2]/a"));
	}

	public WebElement getBotaoLupaCorreios() {
		return driver.findElement(By.xpath("//*[@id=\"content-servicos\"]/ul/li[2]/form/div[2]/input[2]"));
	}
}

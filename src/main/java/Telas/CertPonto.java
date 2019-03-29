package Telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import fake.Conexao;

public class CertPonto extends Conexao{
	
	WebDriver driver;
	public CertPonto(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public WebElement getBotaoAcessar() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/fieldset/section[1]/div/div[1]/button"));
	}
	
	public WebElement getCampoCPF() {
		return driver.findElement(By.xpath("//*[@id=\"frm-signIn\"]/div[5]/div[2]/input"));
	}
	
	public WebElement getCampoSENHA() {
		return driver.findElement(By.xpath("//*[@id=\"frm-signIn\"]/div[5]/div[3]/input"));
	}
	
	public WebElement getBotaoEntrar() {
		return driver.findElement(By.xpath("//*[@id=\"frm-signIn\"]/div[5]/div[4]/button"));
	}

}

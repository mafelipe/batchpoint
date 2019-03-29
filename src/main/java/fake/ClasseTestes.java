package fake;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Telas.CertPonto;

public class ClasseTestes extends Conexao {

	MetodoGenerico m;

	@Before
	public void init() throws Exception {
		m = new MetodoGenerico();
		Conexao.setUp("chrome");
		m.getUrl();
	}
	@After
	@Test
	public void inicia() throws InterruptedException {
		CertPonto c = new CertPonto(driver);
		m.click(c.getBotaoAcessar());
		m.click(c.getCampoCPF());
		m.waitTime(10);
		m.escreva(c.getCampoCPF(), "374.141.208-21");
		m.escreva(c.getCampoSENHA(), "cai0@ponto");
		m.click(c.getBotaoEntrar());
		m.waitTime(10000);
	driver.close();
	}

}

package br.com.inmetrics.teste.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
WebDriver driver;

String login_username = "usuarioQueJaExiste";
String login_password = "senhaDoUsuarioQueJaExiste";


// Comum ----------------------------------------------------

@Given("launch browser login")
public void launch_browser_login() {
// 	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//	driver = new ChromeDriver();
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");					
    driver = new ChromeDriver();
	driver.get("http://www.inmrobo.tk/accounts/login/");
}

@Then("Open Login")
public void open_login() {
	driver.get("http://www.inmrobo.tk/accounts/login/");
}

@Then("Login")
public void login() {
	driver.findElement(By.name("username")).sendKeys(login_username);
	//cadastrar senha
	driver.findElement(By.name("pass")).sendKeys(login_password);
	//clicar cadastrar
	driver.findElement(By.className("login100-form-btn")).click();
}

@Then("Verificar Entrada")
public void verificar_entrada() {
	driver.findElement(By.id("tabela"));
}

@Then("Fechar")
public void fechar() {
    driver.close();
}

// Cadastrar -------------------------------------------------

@When("Click Cadastrar")
public void click_cadastrar() {
	driver.findElement(By.linkText("Cadastre-se")).click();
}

@When("Cadastrar")
public void cadastrar() {
	String username = "nomeNovoUsuario" + Math.round(Math.random() * 100000000.0);
	String password = "senhaNovoUsuario" + Math.round(Math.random() * 100000000.0);
	
    //preencher usuario
	driver.findElement(By.name("username")).sendKeys(username);
	//cadastrar senha
	driver.findElement(By.name("pass")).sendKeys(password);
	//confirmar senha
	driver.findElement(By.name("confirmpass")).sendKeys(password);
	//clicar cadastrar
	driver.findElement(By.className("login100-form-btn")).click();
	
	login_username = username;
	login_password = password;
}

// Login -----------------------------------------------------------------

// So precisa de etapas em Comum

// Funcionario --------------------------------------------------

@Given("Setup")
public void setup() {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("Excluir editar")
public void excluir_editar() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("Verificar excluir editar")
public void verificar_excluir_editar() {
    // Write code here that turns the phrase above into concrete actions
    
}

}

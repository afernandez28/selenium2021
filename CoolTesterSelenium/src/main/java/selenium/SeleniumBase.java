package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import comun.Base;
public class SeleniumBase extends Base {
	
	
WebDriver driver;
	
	
@FindBy(id="txtUsername")
WebElement txt_usernameById;

@FindBy(id="txtPassword")
WebElement txt_passwordById;

@FindBy(id="btnLogin")
WebElement btn_loginById;


@FindBy (id="spanMessage")
WebElement text_mensajeDeError;


@FindBy(xpath="//a[@id='welcome']")
WebElement link_welcome;
	
	@BeforeTest
	public void initDriver() {
		driver = StartWebDriver();
		PageFactory.initElements(driver, this);
	}
	
	@Test(enabled=true, priority=2)
	public void loginExitoso() {
		
		ingresarTexto(txt_usernameById, "Admin");
		ingresarTexto(txt_passwordById, "admin123");
		click(btn_loginById);
		if(verificarElementoExiste(link_welcome)==false) {
			Assert.fail("El login no fue exitoso");
			
		}
		
	}
	
	@Test(enabled= true, priority=1)
	public void loginFallido() {
		ingresarTexto(txt_usernameById,randomName());
		ingresarTexto(txt_passwordById,randomNumber(3));
		click(btn_loginById);
		
		Assert.assertEquals(text_mensajeDeError.getText(), "Invalid credentials");
		
	}
	
	
	
	

}

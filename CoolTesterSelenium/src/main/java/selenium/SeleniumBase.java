package selenium;

import java.io.File;
import java.net.SocketException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.JsonNode;

import comun.Base;
import comun.SpreadsheetUtil;
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
		//page.getPage(SeleniumBase.class);
	}
	
	@Test(enabled=true, priority=2)
	public void loginExitoso() throws SocketException, InterruptedException {
		
		/*ingresarTexto(txt_usernameById, "Admin");
		ingresarTexto(txt_passwordById, "admin123");
		click(btn_loginById);
		takeScreenShot();
		if(verificarElementoExiste(link_welcome)==false) {
			Assert.fail("El login no fue exitoso");
			
		}*/
		
		 JsonNode nodeTree = readJsonFileByNode(System.getProperty("user.dir") +"/data/json/data.json", "usuario1");
        String userJson = nodeTree.path("user").asText();
        String passwordJson = nodeTree.path("password").asText();
        System.out.println(userJson);
        System.out.println(passwordJson);
        ingresarTexto(txt_usernameById, userJson);
		ingresarTexto(txt_passwordById, passwordJson);
		click(btn_loginById);
		takeScreenShot();
		
		if(verificarElementoExiste(link_welcome)==false) {
			Assert.fail("El login no fue exitoso");
			
		}
		
		closeBrowser();
		
	}

	/*
	@Test(enabled= true, priority=1)
	public void loginFallido() {
		ingresarTexto(txt_usernameById,randomName());
		ingresarTexto(txt_passwordById,randomNumber(3));
		click(btn_loginById);
		
		Assert.assertEquals(text_mensajeDeError.getText(), "Invalid credentials");
		
	}
	*/
	@Test(enabled= true, priority=1)
	public void loginFallido() {
		
		
		 String fileName = System.getProperty("user.dir") +"/data/excel/Test Data.xlsx";
		 
		  String sheet = "usuarios";
	      
		  SpreadsheetUtil spreadsheet = new SpreadsheetUtil(new File(fileName));
	      spreadsheet.switchToSheet(sheet);
	        
	      int row = 2;
	        String user = spreadsheet.getCellData("User", row);
	        String password = spreadsheet.getCellData("Password", row);
	        
	     // ingresarTexto(txt_usernameById,randomName());
			//ingresarTexto(txt_passwordById,randomNumber(3));
	        ingresarTexto(txt_usernameById,user);
	        System.out.println(user);
	        ingresarTexto(txt_passwordById,password);
	        System.out.println(password);
			highlighElement(txt_usernameById);
			highlighElement(txt_passwordById);
			highlighElement(btn_loginById);
			click(btn_loginById);
	   
	        Assert.assertEquals(text_mensajeDeError.getText(), spreadsheet.getCellData("errorMessage", 1));
	        highlighElement(text_mensajeDeError);
	        
	        
	       
	}
	
	
	
	

}

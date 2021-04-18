package vacaciones;

import java.io.File;
import java.net.SocketException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.fasterxml.jackson.databind.JsonNode;

import comun.Base;
import comun.SpreadsheetUtil;
import leave.AssignLeave;
import loginHRM.Login;
import menuHRM.Menu;

public class PeticionVacaciones extends Base{

	public static Logger logger=Logger.getLogger(PeticionVacaciones.class);
	
	String path=System.getProperty("user.dir");
	WebDriver driver;
	String userJS, passwordJS, mensajeErrorJS;
	String userEx, passwordEx, mensajeErrorEx;
	
	@BeforeTest
	public void leerDatos()
	{
		 JsonNode nodeTree = readJsonFileByNode(path+"/data/json/data.json", "usuario1");
	     userJS = nodeTree.path("user").asText();
	     passwordJS= nodeTree.path("password").asText();
	     mensajeErrorJS= nodeTree.path("mensajeError").asText();
	     
	     String fileName = path+"/data/excel/Test Data.xlsx";
		 
		  String sheet = "usuarios";
	      
		  SpreadsheetUtil spreadsheet = new SpreadsheetUtil(new File(fileName));
	      spreadsheet.switchToSheet(sheet);
	        
	      int row = 1;
	      userEx = spreadsheet.getCellData("User", row);
	      passwordEx = spreadsheet.getCellData("Password", row);
	      mensajeErrorEx = spreadsheet.getCellData("errorMessage", row);
	}
	
	@Test(enabled= true, priority=1)
	public void pedirVacionesCorrectamente() throws Exception
	{
		logger.info("========Pedir vaciones inicio=====");
		logger.info("Usuario usuario:"+userJS+ " Password usuaro"+passwordJS);
		driver=StartWebDriver();
		page.getPage(Login.class).loginExitoso(userJS, passwordJS);
		page.getPage(Menu.class).seleccionaMenuSubMenu("Leave", "Assign Leave");
		//page.getPage(AssignLeave.class).validaCamposObligatorios();
		page.getPage(AssignLeave.class).pedirVacacionesValidas("Orange Test","US - Personal","2021-04-19","2021-04-19","Full Day", "Comments","Employee does not have sufficient leave balance for leave request. Click OK to confirm leave assignment.");
		page.getPage(Menu.class).cerrarSession();
		closeBrowser();
		

	
	}
	@Parameters({"browser1","url"})
	@Test(enabled= true, priority=2)
	public void pedirVacionesCorrectamente1(String browser1, String url) throws Exception
	{
		logger.info("========Pedir vaciones inicio=====");
		logger.info("Usuario usuario:"+userJS+ " Password usuaro"+passwordJS);
		driver=StartWebDriver(browser1, url);
		page.getPage(Login.class).loginExitoso(userJS, passwordJS);
		page.getPage(Menu.class).seleccionaMenuSubMenu("Leave", "Assign Leave");
		//page.getPage(AssignLeave.class).validaCamposObligatorios();
		page.getPage(AssignLeave.class).pedirVacacionesValidas("Orange Test","US - Personal","2021-04-19","2021-04-19","Full Day", "Comments","Employee does not have sufficient leave balance for leave request. Click OK to confirm leave assignment.");
		page.getPage(Menu.class).cerrarSession();
		closeBrowser();
		

	
	}
	@Parameters({"browser2","url"})
	@Test(enabled= true, priority=3)
	public void pedirVacionesCorrectamente2(String browser2, String url) throws Exception
	{
		logger.info("========Pedir vaciones inicio=====");
		logger.info("Usuario usuario:"+userJS+ " Password usuaro"+passwordJS);
		driver=StartWebDriver(browser2, url);
		page.getPage(Login.class).loginExitoso(userJS, passwordJS);
		page.getPage(Menu.class).seleccionaMenuSubMenu("Leave", "Assign Leave");
		//page.getPage(AssignLeave.class).validaCamposObligatorios();
		page.getPage(AssignLeave.class).pedirVacacionesValidas("Orange Test","US - Personal","2021-04-19","2021-04-19","Full Day", "","Employee does not have sufficient leave balance for leave request. Click OK to confirm leave assignment.");
		page.getPage(Menu.class).cerrarSession();
		closeBrowser();
		

	
	}
	
	
	@AfterTest()
	public void cerrar() throws SocketException, InterruptedException
	{
		//closeBrowser();
		logger.info("========Pedir vaciones finalizo=====");
	}
}

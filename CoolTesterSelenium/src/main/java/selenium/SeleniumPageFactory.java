package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import comun.LeerProperties;

public class SeleniumPageFactory {
	static LeerProperties prop = new LeerProperties();
	static WebDriver driver;
	static String path = System.getProperty("user.dir");
	
	
	//WebElement con todos los elementos o controles que vamos a interacturar
	
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
	public void StartWebDriver() {
		
		 try {
				prop.getSystemProperties();
				String browser = System.getProperty("BROWSER");
				String url = System.getProperty("URL");
				
				switch(browser) {
				
				case "chrome":
				//path=path+"\\chromedriver\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver",path+"\\chromedriver\\chromedriver.exe");
					ChromeOptions option = new ChromeOptions();
					option.addArguments("--start-maximized");
					option.addArguments("--incognito");
					 driver = new ChromeDriver(option);
					 driver.get(url);
				
					 break;
					 
				case "firefox":
					System.setProperty("webdriver.gecko.driver",path+"\\geckodriver\\geckodriver.exe");
					FirefoxOptions foption=new FirefoxOptions();
					foption.addArguments("--start-maximized");
					foption.addArguments("--incognito");
					driver=new FirefoxDriver(foption);
					driver.get(url);
					break;
					
				case "edge":
					System.setProperty("webdriver.edge.driver", path+"\\edgedriver\\msedgedriver.exe");
					EdgeOptions eoptions=new EdgeOptions();
					eoptions.addArguments("--start-maximized");
					eoptions.addArguments("--incognito");
					driver=new EdgeDriver(eoptions);
					driver.get(url);
					break;
				
				default:	
					System.out.println("El drive ["+browser+" ] no esta configuado para funcionar en este proyecto");
					
				}
				
				//Con PageFactory inicializamos nuestros webelementos para que se encuentren
				PageFactory.initElements(driver, this);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
				Reporter.log("El webdriver fue inicializado "+browser, true);//coon el true lo vemos tanto en el reporte de html y en la consola );
				
				
			    }catch(Exception e)
			    {
			    	e.printStackTrace();
			    	System.out.println("El driver no puede ser inicializado");
			    
			    }
			  
	}// fin startWebDrive
	
	
	
	@Test(enabled=true, priority=3)
	public void LoginFallido() {
	
		txt_usernameById.sendKeys("Angelica");
		Reporter.log("El usuario fue ingresado correctamente");
		txt_passwordById.sendKeys("1234");
		Reporter.log("El password fue ingresado correctamente");
		btn_loginById.click();
		Reporter.log("Se dio clic en el boton Inicio ");

		Assert.assertEquals(text_mensajeDeError.getText(),"Invalid credentials");
		Reporter.log(text_mensajeDeError.getText(),true);
	}
	


}//find starWebdriver

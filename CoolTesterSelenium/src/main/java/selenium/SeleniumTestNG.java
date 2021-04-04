package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import comun.LeerProperties;

public class SeleniumTestNG {

	static LeerProperties prop = new LeerProperties();
	static WebDriver driver;
	static String path = System.getProperty("user.dir");
	
	
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
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
				Reporter.log("El webdriver fue inicializado "+browser, true);//coon el true lo vemos tanto en el reporte de html y en la consola );
				
				
			    }catch(Exception e)
			    {
			    	e.printStackTrace();
			    	System.out.println("El driver no puede ser inicializado");
			    
			    }
			  
	}// fin startWebDrive
	
//Con enabled le decimos que caso de prueba si queremos que se ejecute, sino queremos que se ejecute basta con colocar enabled=false
	@Test(enabled=true, priority=3)
	public void LoginFallido() {
		WebElement txt_usernameById = driver.findElement(By.id("txtUsername"));
		WebElement txt_passwordById = driver.findElement(By.id("txtPassword"));
		WebElement btn_loginById = driver.findElement(By.id("btnLogin"));
		txt_usernameById.sendKeys("Angelica");
		Reporter.log("El usuario fue ingresado correctamente");
		txt_passwordById.sendKeys("1234");
		Reporter.log("El password fue ingresado correctamente");
		btn_loginById.click();
		Reporter.log("Se dio clic en el boton Inicio ");
		
		WebElement text_mensajeDeError =driver.findElement(By.id("spanMessage"));
		Assert.assertEquals(text_mensajeDeError.getText(),"Invalid credentials");
	}
	
	@Test(enabled=true,priority=1)
	public void LoginSoloUsuario() {
		WebElement txt_usernameById = driver.findElement(By.id("txtUsername"));
		WebElement txt_passwordById = driver.findElement(By.id("txtPassword"));
		WebElement btn_loginById = driver.findElement(By.id("btnLogin"));
		txt_usernameById.sendKeys("Angelica");
		Reporter.log("El usuario fue ingresado correctamente");
		//txt_passwordById.sendKeys("1234");
		//Reporter.log("El password fue ingresado correctamente");
		txt_passwordById.clear();
		btn_loginById.click();
		Reporter.log("Se dio clic en el boton Inicio ");
		
		WebElement text_mensajeDeError =driver.findElement(By.id("spanMessage"));
		Assert.assertEquals(text_mensajeDeError.getText(),"Password cannot be empty");
		Reporter.log(text_mensajeDeError.getText(),true);
	}
	
	@Test(enabled=true, priority=2)
	public void LoginSoloPassword() {
		WebElement txt_usernameById = driver.findElement(By.id("txtUsername"));
		WebElement txt_passwordById = driver.findElement(By.id("txtPassword"));
		WebElement btn_loginById = driver.findElement(By.id("btnLogin"));
		//txt_usernameById.sendKeys("Angelica");
		//Reporter.log("El usuario fue ingresado correctamente");
		txt_passwordById.sendKeys("1234");
		Reporter.log("El password fue ingresado correctamente");
		txt_usernameById.clear();
		btn_loginById.click();
		Reporter.log("Se dio clic en el boton Inicio ");
		
		WebElement text_mensajeDeError =driver.findElement(By.id("spanMessage"));
		Assert.assertEquals(text_mensajeDeError.getText(),"Username cannot be empty");
		Reporter.log(text_mensajeDeError.getText(),true);
	}
	
	@Test(enabled=true, priority=4)
	public void LoginExitoso() {
		WebElement txt_usernameById = driver.findElement(By.id("txtUsername"));
		WebElement txt_passwordById = driver.findElement(By.id("txtPassword"));
		WebElement btn_loginById = driver.findElement(By.id("btnLogin"));
		txt_usernameById.sendKeys("Admin");
		Reporter.log("El usuario fue ingresado correctamente");
		txt_passwordById.sendKeys("admin123");
		Reporter.log("El password fue ingresado correctamente");
		btn_loginById.click();
		Reporter.log("Se dio clic en el boton Inicio ");
		

		try {

			WebElement link_welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
			if (link_welcome.getSize() != null) {
				Reporter.log("El login fue exitoso",true);
			
			}
		} catch (NoSuchElementException e) {
			Assert.fail("El login no fue exitoso");
			
		}
		
		//driver.quit();//cierra todas las pestañas
		//driver.close();//Solo cierra esta pestaña, no todas.
		
		
	}
	
	@AfterTest
	public void terminamos() {
		Reporter.log("Termino el test",true);
		driver.close();
	}
	
	
	
	
}//fin clase

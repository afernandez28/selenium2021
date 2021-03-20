package selenium;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import comun.LeerProperties;

public class SeleniumTest {
	public static Logger log = Logger.getLogger(SeleniumTest.class);

	static LeerProperties prop = new LeerProperties();

	public static void main(String[] args) {
		String rutaChrome = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaChrome);
		// Options para abrir
		// Para buscar as argumentos que podemos utilizar buscarlo en interner desde la
		// doc de Chrome Dirve
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		// un implicit wait que nos sirve para demorar la ejecucion
		// esto solo es para evitar fallas que no ha encontrado un elemento porque no ha
		// cargado la pagina.
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);

		prop.getSystemProperties();
		String url = System.getProperty("URL");
		log.info("Se abrira un URL");
		driver.get(url);
		WebElement txt_usernameById = driver.findElement(By.id("txtUsername"));
		WebElement txt_passwordById = driver.findElement(By.id("txtPassword"));
		WebElement btn_loginById = driver.findElement(By.id("btnLogin"));
		// WebElement
		// txt_passwordByXpath=driver.findElement(By.xpath("//div[@Id='divPassword']/input"));
		// WebElement txt_usernameByName=driver.findElement(By.name("txtUsername"));
		// WebElement
		// txt_usernameByXpath=driver.findElement(By.xpath("//div[@id='divUserName']/input"));
		txt_usernameById.sendKeys("Admin");
		txt_passwordById.sendKeys("admin123");
		btn_loginById.click();

		// driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		// txt_usernameByName.clear();
		log.info("Todo fue exitoso");

		try {

			WebElement link_welcome = driver.findElement(By.xpath("//a[@id='wlcome']"));
			if (link_welcome.getSize() != null) {
				System.out.println("El login fue exitoso");
			}
		} catch (NoSuchElementException e) {
			System.out.println("El login no fue exitoso");
		}
		
		
		//hacer el ejercicio con cssSelector y tagname
		//tener un metodo donde regrese un nombre random y un numero random.

	}
	
	public String randomName() {
		
		//Se pueda generar un nombre Random y tambien crear un metodo para que se vean numero random.
		String[] gente=new String[] {"Sergio","Ivan","Jorge","Raul"};
		return "";
	}

}

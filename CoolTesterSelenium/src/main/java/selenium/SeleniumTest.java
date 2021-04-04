package selenium;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
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

import comun.LeerProperties;

public class SeleniumTest {
	public static Logger log = Logger.getLogger(SeleniumTest.class);

	static LeerProperties prop = new LeerProperties();
	
	static WebDriver driver;
	static String path = System.getProperty("user.dir");

	public static void main(String[] args) {
		/*String rutaChrome = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);*/

		prop.getSystemProperties();
		
		String url = System.getProperty("URL");
		driver=startDriver(url);
		log.info("Se abrira un URL");
		//driver.get(url);
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

			WebElement link_welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
			if (link_welcome.getSize() != null) {
				System.out.println("El login fue exitoso");
			}
		} catch (NoSuchElementException e) {
			System.out.println("El login no fue exitoso");
		}
		
		
		//hacer el ejercicio con cssSelector y tagname
		//tener un metodo donde regrese un nombre random y un numero random.
		
		
		System.out.println(getRandomNumber(2));
		System.out.println(getRandomNumber(10));
		System.out.println(getRandomNumber(20));
		System.out.println(getRandomNumber(30));
		System.out.println(getRandomNumber(50));
		System.out.println(getRandomNumber(100));
		

	}//fin main
	
	public static String randomName() {
		String[] people = new String[] { "Sergio", "Ivan", "John", "Marcus", "Henry", "Ismael", "Nishant", "Rakesh",
				"Carlos", "Felix", "Miriam", "Diana", "Adriana", "Alejandro", "Gaby", "Caro", "Melisa", "Aimee",
				"Nataly", "Fernando", "Thomas", "Fidel", "Javier", "Ricardo", "Monica", "Nidia", "Eddy", "Evert", "Ben",
				"Anu", "Shan", "Prathap","Rosa","Azucena" };
		
		List<String> names = Arrays.asList(people);
		
		Collections.shuffle(names);
		
		int index = new Random().nextInt(names.size());
		String randomName = names.get(index);
		
		return randomName;
	}//TEst
	
	public static String randomName2() {
		Date date = new Date();
		List<String> names = new ArrayList<>();
		names.add("Sergio");
		names.add("Ivan");
		names.add("John");
		names.add("Marcus");
		names.add("Henry");
		names.add("Ismael");
		names.add("Nishant");
		names.add("Rakesh");
		names.add("Carlos");
		names.add("Felix");
		names.add("Miriam");
		names.add("Diana");
		names.add("Adriana");
		names.add("Alejandro");
		names.add("Gaby");
		names.add("Caro");
		names.add("Melisa");
		names.add("Aimee");
		names.add("Nataly");
		names.add("Fernando");
		names.add("Thomas");
		names.add("Fidel");
		names.add("Javier");
		names.add("Ricardo");
		names.add("Monica");
		names.add("Nidia");
		names.add("Eddy");
		names.add("Evert");
		names.add("Ben");
		names.add("Anu");
		names.add("Shan");
		names.add("Prathap");
		names.add("Rosa");
		names.add("Azucena");
		Collections.shuffle(names);
		
		int index = new Random().nextInt(names.size());
		DateFormat formatt = new SimpleDateFormat("HHmmssddMMyyyy");
		
		String randomName = names.get(index);

		return randomName+formatt.format(date)+"@gmail.com";
	}
	
	
	public static String getRandomNumber(int length) {
		StringBuilder str = new StringBuilder();
		Random random = new Random();

		for (int i = 0; i < length; i++) {
			str.append(random.nextInt(10));
		}
		return str.toString();

	}
	


	

	
	public static WebDriver startDriver(String url)
	{
	    try {
		prop.getSystemProperties();
		String browser = System.getProperty("BROWSER");
		
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
		
		
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    	System.out.println("El driver no puede ser inicializado");
	    
	    }
	    return driver;
		
	}//fin startDriver
	

}

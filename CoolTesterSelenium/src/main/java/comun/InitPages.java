package comun;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class InitPages {
	
WebDriver driver;
	
	/**
	 * @author Angelica Fernandez
	 * @Date 10-04-2021
	 * @Description constructur inicializa el driver
	 * @param WebDriver
	 **/
	public InitPages(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * @author Angelica Fernandez
	 * @Date 10-04-2021
	 * @Description inicializa el page factory de una clase dada
	 * @param Class
	 **/
	public <TPage extends Base> TPage getPage(Class<TPage> pageClass) {
		return PageFactory.initElements(driver, pageClass);
	}

}

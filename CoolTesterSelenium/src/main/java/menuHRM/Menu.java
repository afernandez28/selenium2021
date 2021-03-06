package menuHRM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import comun.Base;

public class Menu extends Base{
	
	
	@FindBy(xpath="//ul[@id='mainMenuFirstLevelUnorderedList']/li/a/b")
	
	List<WebElement> list_Menu;
	
	@FindBy(xpath="//li[@class='current main-menu-first-level-list-item']//a")
	List<WebElement> list_subMenu;
	
	@FindBy(id="welcome")
	WebElement link_welcome;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement link_logout;
	
	
	/**
	 * @Description Selecciona un menu y submenu dado los nombres
	 * @autor Sergio ramones
	 * @Date 10/04/2021
	 * @param String, String
	 * @return N/A
	 * @throws Exception 
	 */
	
	public void seleccionaMenuSubMenu(String menu, String subMenu) throws Exception {
		
		selectElementByValue(list_Menu,menu);
		selectElementByValue(list_subMenu,subMenu);
		takeScreenShot();
		
		
		
	}
	
	/**
	 * @Description hacer logout de la pagina
	 * @autor Sergio ramones
	 * @Date 10/04/2021
	 * @param String, String
	 * @return N/A
	 * @throws Exception 
	 */
	
	public void cerrarSession()  {
		
		highlighElement(link_welcome);
		click(link_welcome);
		highlighElement(link_logout);
		click(link_logout);
		
		
		
	}
	
	
	

}

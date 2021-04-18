package loginHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import comun.Base;

public class Login extends Base{
	
	
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



/**
 * @Description Metodo para hacer un login exitoso y validar que estemos dentro
 * @author Angelica
 * @date 10/047/2021
 * @param String, String
 * 
 **/


public void loginExitoso(String user, String password)
{
	highlighElement(txt_usernameById);
	ingresarTexto(txt_usernameById, user);
	highlighElement(txt_passwordById);
	ingresarTexto(txt_passwordById, password);
	highlighElement(btn_loginById);
	click(btn_loginById);
	takeScreenShot();
	
	if(verificarElementoExiste(link_welcome)==false) {
		Assert.fail("El login no fue exitoso");
		
	}
	
}

/**
 * @Description Metodo para Validar credenciales
 * @author Angelica
 * @date 10/047/2021
 * @param String, String, String
 * 
 **/


public void loginError(String user, String password, String mensajeError)
{
	
	
	highlighElement(txt_usernameById);
	ingresarTexto(txt_usernameById, user);
	highlighElement(txt_passwordById);
	ingresarTexto(txt_passwordById, password);
	highlighElement(btn_loginById);
	click(btn_loginById);
	
	highlighElement(text_mensajeDeError);
	takeScreenShot();

	Assert.assertEquals(text_mensajeDeError.getText(), mensajeError);
	
}







}//fin Login

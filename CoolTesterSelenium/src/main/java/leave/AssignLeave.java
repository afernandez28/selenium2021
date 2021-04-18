package leave;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import comun.Base;

public class AssignLeave  extends Base{
	
	
    @FindBy(id="assignleave_txtEmployee_empName")
	WebElement txt_name;
	
	@FindBy(id="assignleave_txtLeaveType")
	WebElement dp_type;
	
	//el formato de la fecha es AAAA-MM-DD
	@FindBy(id="assignleave_txtFromDate")
	WebElement txt_fromDate;
	
	@FindBy(id="assignleave_txtToDate")
	WebElement txt_toDate;
	
	@FindBy(id="assignleave_duration_duration")
	WebElement dp_duration;
	

	
	
	@FindBy(id="assignleave_txtComment")
	WebElement txt_comment;
	
	//@FindBy(xpath="//form[@id='frmLeaveApply']//li/span[@class='validation-error']")
	//WebElement mensaje_error;
	

	//@FindBy(xpath="//form[@id='frmLeaveApply']//li/span[@for='assignleave_txtFromDate']")
	//WebElement mensaje_error_fecha;
	

	
	@FindBy(id="assignBtn")
	WebElement btn_assign;
	
	
	@FindBy(xpath="//div[@id='leaveBalanceConfirm']//p")
	WebElement text_mensaje;
	
	@FindBy(id="confirmOkButton")
	WebElement btn_ok;
	
	@FindBy(id="confirmCancelButton")
	WebElement btn_cancel;
	
	@FindBy(xpath="//div[@class='box single']//h1")
	WebElement text_header;
	
	
	
	
	
	
	

	
	/*
public void validaCamposObligatorios() throws Exception{
		
		
		
		highlighElement(btn_asignar);
		click(btn_asignar);
	
	
		if(getText(txt_name).equals("")) {
			Assert.assertEquals(mensaje_error.getText(), "Invalid");
			System.out.println("Se mostro mensaje Invalid");
		}
		
		if(getText(db_type).equals("--Select--")) {
		
			Assert.assertEquals(mensaje_error.getText(), "Required");
			System.out.println("Se mostro mensaje Required");
	}
		
		if(getText(date_from).equals("")) {
			Assert.assertEquals(mensaje_error_fecha.getText(), "Should be a valid date in yyyy-mm-dd format");
			System.out.println("Se mostro mensaje Should be a valid date in yyyy-mm-dd format");
		}
		
		if(getText(date_to).equals("")) {
			Assert.assertEquals(mensaje_error_fecha.getText(), "Should be a valid date in yyyy-mm-dd format");
			System.out.println("Se mostro mensaje Should be a valid date in yyyy-mm-dd format");
		}
		
		takeScreenShot();

		
	} //fin validaCamposObligatorios
*/

	/**
	 * @Description selecciona vacaciones validad
	 * @Author Sergio Ramones
	 * @Date 17/04/2021
	 * @Parameter N/A
	 * @return N/A
	 * @throws Exception 
	 *@throws StaleElementReferenceException
	 
	 **/
	
	public void pedirVacacionesValidas(String name, String leaveType, String fromDate, String toDate, String duration, String comment, String mensajeEsperado) throws Exception {

	
		ingresarTexto(txt_name,name);
		click(dp_type);
		selectDropdownByValue(dp_type, leaveType);
		ingresarTexto(txt_fromDate,fromDate);
		ingresarTexto(txt_toDate, toDate);
		selectDropdownByValue(dp_duration, duration);
		ingresarTexto(txt_comment, comment);
		click(btn_assign);
		
		/*if(getText(text_mensaje).equals(mensajeEsperado)) {
			Reporter.log("El mensaje esperado es igual al obtenido ["+mensajeEsperado+" ]" + " ["+getText(text_mensaje)+" ]");
		}
		else
		{
			Assert.fail("El mensaje esperado no es igual al obtenido ["+mensajeEsperado+" ]" + " ["+getText(text_mensaje)+" ]");
		}
			
		click(btn_ok);*/
		if(verificarElementoExiste(text_header)==true) {
			Reporter.log("Las vacaciones fueron pedidas exitosamente",true);
		}
		else
		{
			Assert.fail("Las vacaciones no fueron pedidas correctamente");
		}
		
	}

}

package com.innodata.WKGermany.pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin {

	WebDriver driver;
	static Logger log = Logger.getLogger(Signin.class.getClass());
	WebElement Signinmenu = driver.findElement(By.xpath("//a[@class='login']"));
	WebElement alreadyemail = driver.findElement(By.xpath("//input[@id='email']"));
	WebElement alreadypass = driver.findElement(By.xpath("//input[@id='passwd']"));
	WebElement Submitsigninbutton = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
	WebElement Createemail= driver.findElement(By.xpath("//input[@id='email_create']"));
	WebElement submitcreate = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
/**	
	*Click on Signin menu
	*/
	public void Clickonsigninmenu()
    {
		log.info("Clickinng on signin menu");
		Signinmenu.click();
	}
/*	
 * This method will enter email adress to email testbox
 * @param emailadress
 */
	public void enteremailadresstosignin(String emailadress)
	{
		log.info("Enetring email adress to email textbox ");
		alreadyemail.sendKeys(emailadress);
	}
	/*	This method will enter password to email testbox*/
	public void enterpasswordadresstosignin(String password)
	{
		log.info("Enetring password to email textbox");
		alreadypass.sendKeys(password);
	}
	/*	This method will click on submit buttonsss*/
	public void clickonsubmitbutton()
	{
		log.info("Clickinng on signin button");
		submitcreate.click();
	}
	/*	This method will enter email adress on create email textbox*/
	public void enteremailadresstocreateaccount(String emailadresscreate)
	{
		log.info("Enter email adress to create account menu");
		Createemail.sendKeys(emailadresscreate);
	}
	/*	This method will click on create email button*/
	public void clickoncreateaccount()
	{
		log.info("Click on createaccount menu");
		Createemail.click();
	}
	
}

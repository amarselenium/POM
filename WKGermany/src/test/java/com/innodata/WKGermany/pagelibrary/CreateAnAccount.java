package com.innodata.WKGermany.pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAnAccount {
	
	WebDriver driver;
	
	Logger log = Logger.getLogger(CreateAnAccount.class.getClass());

     WebElement  Mrradiobutton = driver.findElement(By.xpath("//input[@id='id_gender1']"));
     WebElement  Mrsradiobutton = driver.findElement(By.xpath("//input[@id='id_gender2']"));
     WebElement  Personalinfoirstnametextbox = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
     WebElement  Personalinfolastnametextbox = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
     WebElement  EmailPersonalinfo = driver.findElement(By.xpath("//input[@id='email']"));
     WebElement  PasswordPersonalInfo = driver.findElement(By.xpath("//input[@id='passwd']"));
     WebElement  DOBDay = driver.findElement(By.xpath("//select[@id='days']"));
     WebElement DOBMonth = driver.findElement(By.xpath("//select[@id='months']"));
     WebElement DOBYear = driver.findElement(By.xpath(".//*[@id='years']"));
     WebElement Signupforournewsletter  = driver.findElement(By.xpath("//input[@id='newsletter']"));
     WebElement Receivecheckbox  = driver.findElement(By.xpath("//input[@id='optin']"));
     
     WebElement AdressLabel = driver.findElement(By.xpath("//h3[contains(text(),'Your address')]"));
    
     WebElement AdressFirstname = driver.findElement(By.xpath("//input[@id='firstname']"));
     WebElement AdressLastname = driver.findElement(By.xpath("//input[@id='lastname']"));
     WebElement AdressCompany = driver.findElement(By.xpath("//input[@id='company']"));
     WebElement AdressPrimary = driver.findElement(By.xpath("//input[@id='address1']"));
     WebElement AdressSecondary = driver.findElement(By.xpath("//input[@id='address2']"));
     WebElement AdressCity = driver.findElement(By.xpath("//input[@id='city']"));
     WebElement AdressState = driver.findElement(By.xpath("//select[@id='id_state']"));
     WebElement AdressPostcode = driver.findElement(By.xpath("//input[@id='postcode']"));
     WebElement AdressCountry = driver.findElement(By.xpath("//select[@id='id_country']"));
     WebElement AdressAdditionalInfo = driver.findElement(By.xpath("//textarea[@id='other']"));
     WebElement AdressHomePhone = driver.findElement(By.xpath("//input[@id='phone']"));
     WebElement AdressMobilePhone = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
     WebElement AdressAliasAdress = driver.findElement(By.xpath("//input[@name='alias']"));
     WebElement AdressRegisterButton = driver.findElement(By.xpath("//button[@id='submitAccount']"));
     
   
     
     
     
     
     
     
     
     
     
     
     
}

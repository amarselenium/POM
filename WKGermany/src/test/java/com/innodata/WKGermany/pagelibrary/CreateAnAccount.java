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
     WebElement  Firstnametextbox = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
     WebElement  lastnametextbox = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
     WebElement  EmailPersonalinfo = driver.findElement(By.xpath("//input[@id='email']"));
     WebElement  PasswordPersonalInfo = driver.findElement(By.xpath("//input[@id='passwd']"));
     WebElement  DOBDay = driver.findElement(By.xpath("//select[@id='days']"));
     WebElement DOBMonth = driver.findElement(By.xpath("//select[@id='months']"));
     WebElement DOBYear = driver.findElement(By.xpath(".//*[@id='years']"));
     WebElement Signupforournewsletter  = driver.findElement(By.xpath("//input[@id='newsletter']"));
     WebElement Receivecheckbox  = driver.findElement(By.xpath("//input[@id='optin']"));
     
     WebElement AdressLabel = driver.findElement(By.xpath("//h3[contains(text(),'Your address')]"));
    
     
}

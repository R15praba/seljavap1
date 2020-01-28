package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B extends A{
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\murali\\eclipse-workspace\\Maven\\driver\\chromedrivernaw.exe");	
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement us = driver.findElement(By.id("email"));

us.sendKeys(getData(1, 0));
WebElement pass = driver.findElement(By.id("pass"));
pass.sendKeys(getData(2, 0));










}
}

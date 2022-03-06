package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) throws  InterruptedException{
//        System.setProperty("webdriver.chrome.driver","/Users/mac/Documents/selenium/drivers/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.rasseed.com/en");
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        //_6ltg
//        //_6ltj
//        WebElement element=driver.findElement(By.className("ng-tns-c78-2 ant-select-selection-item ng-star-inserted"));
//        Select select=new Select(element);
//        select.selectByIndex(1);

        System.setProperty("webdriver.chrome.driver","/Users/mac/Documents/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
//_6ltg
//_6ltj
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("mohammedhasna2015@gmail.com");
        Thread.sleep(3000);

        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("12345678@@@");
        Thread.sleep(3000);

        WebElement element=driver.findElement(By.name("login"));
        element.click();
        Thread.sleep(9000);

       // driver.close();

    }
}

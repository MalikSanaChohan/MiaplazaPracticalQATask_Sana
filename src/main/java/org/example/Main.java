package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        driver.get("https://miacademy.co/#/");
        driver.findElement(By.xpath("//a[@href='https://miaprep.com/online-school/']")).click();
        driver.findElement(By.xpath("//div[@class='wp-block-button']//a")).click();
        driver.findElement(By.xpath("//div[@class='flag-container']")).click();
        driver.findElement(By.xpath("//ul[contains(@class,'country-list')]//li[@data-dial-code='92']")).click();
        driver.findElement(By.xpath("//input[@name='PhoneNumber']")).sendKeys("3026569857");
        driver.findElement(By.xpath("//input[@elname='First' and @name='Name']")).sendKeys("Ali");
        driver.findElement(By.xpath("//input[@elname='Last' and @name='Name']")).sendKeys("Malik");
        driver.findElement(By.id("Email-arialabel")).sendKeys("sanamalik@gmail.com");
        driver.findElement(By.xpath("//span[@id= 'select2-Dropdown-arialabel-container']//div")).click();
        driver.findElement(By.xpath("//li[text()='Yes']")).click();
        driver.findElement(By.xpath("//label[@for ='Checkbox_4']")).click();
        driver.findElement(By.xpath("//label[@for ='Checkbox_2']")).click();
        driver.findElement(By.id("Date-date")).click();
        driver.findElement(By.xpath("//a[text()='18']")).click();
        driver.findElement(By.xpath("//div[@class='inlineBlock nextAlign']//button")).click();
    }
}
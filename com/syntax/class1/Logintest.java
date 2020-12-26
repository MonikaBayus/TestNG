package com.syntax.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Logintest {

    WebDriver driver;//instance variable; I am using this instance variable inside different methods;

    @BeforeMethod
    public void openAndNavigate(){
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
    driver = new ChromeDriver();
    driver.get("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

}
@Test
    public void  validAdminLogin() {
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
    driver.findElement(By.id("btnLogin")).click();
    WebElement welcomeMessage = driver.findElement(By.cssSelector("a#welcome"));

    if (welcomeMessage.isDisplayed()) {
        System.out.println("Test Pass");
    } else {
        System.out.println("Test Fail");
        }
    }

        @Test
        public void titleValidation(){
        String expectedTitle = "Human Management System";//from user story
        String actualTitle  = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title is valid. Test Pass");
        }else{
            System.out.println("Title is not matched. test Failed");
        }
        }

        @AfterMethod
        public void closeBrowser(){
            driver.quit();

    }

}
//Browser will open and close 2 times;

//scope of local variable is inside the method, constructor or block of code;
//adding validation after the test  - like - welcome text is displayed;
//NullpointerException  - variable that I have is pointing to NUllPoint Object, so there is no Object;
//User story 1: US 12345 - As an admin user should be able to login with valid credentilas;
//User story 2: US 12675 - Title of HRSM should be displayed as "Human Management System";
//User story 3: US 17666 - Syntax logo should be present on login page;
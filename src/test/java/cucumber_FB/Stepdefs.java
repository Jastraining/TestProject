package cucumber_FB;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class Stepdefs {
    ChromeDriver driver;

    @Given("^open browser and Start application$")
    public void open_browser_and_Start_application() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        String baseUrl = "https://de-de.facebook.com/";
        driver.get(baseUrl);
        driver.manage().window().maximize();


    }

    @When("^i enter valid username and password$")
    public void i_enter_valid_username_and_password() throws Exception {
        driver.findElement(By.id("email")).sendKeys("lovelyjaspreet@yahoo.co.in");
        driver.findElement(By.id("pass")).sendKeys("msingh");

    }

    @Then("^user should be able to login$")
    public void user_should_be_able_to_login() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
        System.out.println("hello");
        driver.quit();

    }

}
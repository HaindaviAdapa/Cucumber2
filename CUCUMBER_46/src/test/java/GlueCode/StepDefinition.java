package GlueCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition
{
WebDriver driver;
	@Given("User Opens chrome browser")
	public void user_opens_chrome_browser() {
	    
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();    // driver=111222
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			driver.manage().window().maximize() ;	
			
		
	}
	@When("User Opens URL{string}")
	public void user_opens_url_https_opensource_demo_orangehrmlive_com_web_index_php_auth_login(String TestURL) {
	    
		driver.get(TestURL);
		
	}
	@Given("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String UserName1, String PassWord1) throws Exception {
	  
		findElement(By.xpath("//input[@name='username']")).sendKeys(UserName1);
		findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PassWord1);
		findElement(By.xpath("//button[@type='submit']")).click();

		
	}
	@Then("User navigates to Skills Page")
	public void user_navigates_to_skills_page() throws Exception {
	    
		findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		findElement(By.xpath("//span[text()='Qualifications ']")).click();
		findElement(By.xpath("//a[text()='Skills']")).click();
		
		
	}
	@When("User creates Skills record as Skill Name as {string} and Skill Description as {string}")
	public void user_creates_skills_record_as_skill_name_as_and_skill_description_as(String SkillName1, String SkillDescr1) throws Exception {
	    
		findElement(By.xpath("//button[text()=' Add ']")).click();
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName1);
		findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys(SkillDescr1);
		findElement(By.xpath("//button[text()=' Save ']")).click();
	  
		
	}
	@Then("Close browser")
	public void close_browser() {
	    
		driver.close();
		
	}

	public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;

	
	}



}



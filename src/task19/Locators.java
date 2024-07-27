package task19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

		public class Locators {

		    public static void main(String[] args) {
		        // Setup WebDriverManager to manage the ChromeDriver
		        WebDriverManager.chromedriver().setup();
		        
		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		            // Navigate to the Guvi page
		            driver.get("https://www.guvi.in/register");
		            
		            // Maximize the browser window
		            driver.manage().window().maximize();

		            // Locate elements using different locators
		            
		            //full Name
		     
		            WebElement element1 = driver.findElement(By.id("name"));
		            WebElement element3 = driver.findElement(By.cssSelector("input#name"));
		            WebElement element4 = driver.findElement(By.xpath("//input[@id='name']"));
		            WebElement element5 = driver.findElement(By.xpath("//input[@class='form-control']"));
		            WebElement element6 = driver.findElement(By.xpath("//input[@id='name' and @class='form-control']"));
		            
		            //Email field
		            WebElement element7 = driver.findElement(By.id("email"));
		            WebElement element9 = driver.findElement(By.cssSelector("input#email"));
		            WebElement element10 = driver.findElement(By.xpath("//input[@id='email']"));
		            WebElement element11 = driver.findElement(By.xpath("//input[@type='email']"));
		            WebElement element12 = driver.findElement(By.xpath("//input[@type='email' and @id='email']"));

		            //Password field
		            WebElement element13 = driver.findElement(By.id("password"));
		            WebElement element = driver.findElement(By.cssSelector("input.password-err"));
		            WebElement element15 = driver.findElement(By.cssSelector("input#password"));
		            WebElement element16 = driver.findElement(By.xpath("//input[@id='password']"));
		            WebElement element17 = driver.findElement(By.xpath("//input[@id='password' and @class='form-control password-err']"));
		            
		            //Mobile number
		            WebElement element18 = driver.findElement(By.id("mobileNumber"));
		            WebElement element19 = driver.findElement(By.cssSelector("input.countrycode-left"));
		            WebElement element20 = driver.findElement(By.cssSelector("input.form-control.countrycode-left"));
		            WebElement element21 = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		            WebElement element22 = driver.findElement(By.xpath("//input[@id='mobileNumber' and @class='form-control countrycode-left']"));

		  
		            // Close the browser
		            driver.quit();
		        
		    }
}

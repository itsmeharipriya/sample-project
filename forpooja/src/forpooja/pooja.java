package forpooja;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class pooja {


	    public static void main(String[] args) {
	        // Set the path of chromedriver.exe

	        // 1. Set path to GeckoDriver
	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\SYSTEM\\geckodriver.exe");

	        // 2. Launch Firefox browser
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();

	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Open Google
	        driver.get("https://www.google.com");

	        // Find the search box and enter a search term
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("Selenium WebDriver");

	        // Submit the search form
	        searchBox.submit();

	        // Wait for page to load (simple sleep, better to use WebDriverWait)
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Print the page title
	        System.out.println("Page title is: " + driver.getTitle());

	        // Close the browser
	        driver.quit();
	    }
	}



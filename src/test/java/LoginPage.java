import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public void login (){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.com/demo/");




        WebElement admin = waitForWebElement(driver, By.xpath("/html/body/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/a"));
        admin.click();

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("admin@phptravels.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password");

    }
    public WebElement waitForWebElement(WebDriver driver, By locator){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated());
        return element;
    }
}

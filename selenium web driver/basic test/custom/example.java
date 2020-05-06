import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
  
public class example {  
  
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK\\Downloads\\chromedriver_win32\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("C:\\Users\\ABHISHEK\\OneDrive\\Documents\\example.html");  
          
    
          
    // Click on the male button  
    driver.findElement(By.id("Male")).click(); 
       
    }      

      
    }  

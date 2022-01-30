package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Google {

    public static void main(String arg[]) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://open.spotify.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@data-testid='login-button']")).click();
       // Thread.sleep(3000);
        driver.findElement(By.id("login-username")).sendKeys("diablito_lynx@hotmail.com");
      //  Thread.sleep(3000);
        driver.findElement(By.id("login-password")).sendKeys("gera1991");
      //  Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();
       // Thread.sleep(13000);
        driver.findElement(By.xpath("//ul[@class='RSg3qFREWrqWCuUvDpJR']/li[2]")).click();

        driver.quit();

    }
}




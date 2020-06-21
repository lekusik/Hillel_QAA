package Lesson25_GRID;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestParametersXML {

    public WebDriver driver;
    public DesiredCapabilities cap = new DesiredCapabilities();

    @Parameters({"browser"})
    @Test
    public void launchBrowser(String browser) throws MalformedURLException, InterruptedException {
        switch (browser) {
            case "chrome": {
                cap.setPlatform(Platform.ANY);
                cap.setBrowserName("chrome");
                ChromeOptions options = new ChromeOptions();
                options.merge(cap);
                break;
            }
            case "firefox": {
                cap.setPlatform(Platform.ANY);
                cap.setBrowserName("firefox");
                FirefoxOptions options = new FirefoxOptions();
                options.merge(cap);
                break;
            }
            case "edge": {
                cap.setPlatform(Platform.ANY);
                cap.setBrowserName("MicrosoftEdge");
                EdgeOptions options = new EdgeOptions();
                options.merge(cap);
                break;
            }
            case "ie": {
                cap.setPlatform(Platform.ANY);
                cap.setBrowserName("internet explorer");
                InternetExplorerOptions options = new InternetExplorerOptions();
                options.merge(cap);
                break;
            }
            case "opera": {
                cap.setPlatform(Platform.ANY);
                cap.setBrowserName("opera");
                OperaOptions options = new OperaOptions();
                options.merge(cap);
                break;
            }
        }

        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        if (browser.equals("ie")) {
            // metro.zakaz.ua doesn't support ie
            // so let's open rozetka.ua instead
            driver.get("https://rozetka.ua");
        } else {
            driver.get("https://metro.zakaz.ua/ru");
            driver.findElement(By.xpath("//*[@data-marker='Address']")).click();
            driver.findElement(By.xpath("//*[@data-marker='Pickup']")).click();
            driver.findElement(By.xpath("//*[contains(@class, 'PickupAddressSelect__select__control')]")).click();
            driver.findElement(By.xpath("//*[contains(text(),'Киев')][@tabindex='-1']")).click();
            driver.findElement(By.xpath("//*[@data-marker-popup='Address']//*[contains(text(), 'METRO Теремки')]/../..//*[@data-marker='Radio button']")).click();
            driver.findElement(By.xpath("//*[@data-marker='To shopping']")).click();
        }
        Thread.sleep(3000);
        driver.quit();
    }
}

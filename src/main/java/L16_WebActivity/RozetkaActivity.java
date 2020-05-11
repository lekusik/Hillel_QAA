package L16_WebActivity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RozetkaActivity {

    public static String browser = "chrome";
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        //  фабрика по выбору драйвера
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        //  раскрываем окно браузера на весь экран
        driver.manage().window().maximize();

        //  открываем страницу сайта https://rozetka.com.ua
        driver.get("https://rozetka.com.ua/");

        //  логинимся существующим юзером (создан заранее)
        //  находим элементы дома разными способами
        driver.findElement(By.linkText("войдите в личный кабинет")).click();
        driver.findElement(By.id("auth_email")).sendKeys("lekusik+qaa@gmail.com");
        driver.findElement(By.id("auth_pass")).sendKeys("Test1234");
        driver.findElement(By.xpath("//user-identification//button[contains(text(),'Войти')]")).click();
        Thread.sleep(3000); //  задержка на 3 секунды

        //  ищем айфоны: вводим поисковый запрос и нажимает кнопку submit
        driver.findElement(By.cssSelector("header input[name='search']")).sendKeys("iphone");
        driver.findElement(By.className("search-form__submit")).click();
        Thread.sleep(5000);

        //  навешиваем различные фильтры
        //  продавец - розетка
        driver.findElement(By.cssSelector(".sidebar [data-filter-name='seller'] label[for='Rozetka']")).click();
        Thread.sleep(2000);

        //  цена: до 20000 грн (предварительно очистить форму ввода)
        driver.findElement(By.cssSelector(".sidebar [data-filter-name='price'] input[formcontrolname='max']")).clear();
        driver.findElement(By.xpath("//*[@class='sidebar']//*[@data-filter-name='price']//input[@formcontrolname='max']"))
                .sendKeys("20000");
        driver.findElement(By.xpath("//*[@class='sidebar']//*[@data-filter-name='price']//button[@type='submit']")).click();
        Thread.sleep(2000);

        //  размер экрана от 6" до 6.49"
        driver.findElement(By.xpath("//*[@class='sidebar']//*[@data-filter-name='23777']//label[@for='6\" - 6.49\"']")).click();
        Thread.sleep(2000);

        //  добавление товаров в список сравнения (перебираем foreach-ем)
        List<WebElement> goodsTOcompare = driver.findElements(By.xpath(
                "//*[starts-with(@class, 'content')]//li//*[@class='goods-tile']//button[starts-with(@class, 'compare-button')]"));
        for (WebElement good : goodsTOcompare)
        {
            good.click();
        }
        Thread.sleep(2000);

        //  добавление товаров в виш-лист (перебираем foreach-ем)
        List<WebElement> wishes = driver.findElements(By.xpath(
                "//*[starts-with(@class, 'content')]//li//*[@class='goods-tile']//button[starts-with(@class, 'wish-button')]"));
        for (WebElement wish : wishes)
        {
            wish.click();
        }
        Thread.sleep(2000);

        //  удаление всех списков сравнения
        //  по наведению на иконку "весы" можно увидеть несколько списков сравнения, сгруппированных по категории товара
        String libraIcon = "//header//ul[@class='header-actions']//a[contains(@class, 'header-actions__button_type_compare')]";
        String deleteListBtn = "//header//ul[@class='header-actions']//ul[@class='header-comparison__list']" +
                "//li[@class='header-comparison__item']//button";
        //  наводимся на иконку "Весы"
        mouseOver(libraIcon);

        //  до тех пор, пока существуют элементы в списках сравнения, удаляем эти элементы по одному
        while (isElementPresent(deleteListBtn)) {
            mouseOver(libraIcon);
            driver.findElement(By.xpath(deleteListBtn)).click();
            Thread.sleep(2000);
        }
        Thread.sleep(2000);

        //  переход на страницу виш-листа и удаление виш-листа
        driver.findElement(By.xpath("//header//ul[@class='header-actions']//a[contains(@href, 'wishlists')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("wishlist-delete")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".popup-wishlist-remove-buttons a[name='wishlist-delete-submit']")).click();
        Thread.sleep(2000);

        //  signout юзера
        mouseOver("//*[@id='user_menu']");
        driver.findElement(By.cssSelector("#header_user_menu a[name='signout']")).click();
    }

    //  статический метод
    //  возвращает true, если элемент найден,
    //  и false, если элемент отсутствует
    public static boolean isElementPresent(String locator){
        try {
            driver.findElement(By.xpath(locator));
            return true;
        } catch (Throwable t){
            return false;
        }
    }

    //  статический метод
    //  наводит мышку на элемент
    public static void mouseOver(String locator) {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(locator));
        action.moveToElement(we).perform();
    }


}

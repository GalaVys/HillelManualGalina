import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

   public  class AutoRia{
     By brand = By.xpath( "//input[@id='brandTooltipBrandAutocompleteInput-brand']");
     By model = By.xpath("//input[@id='brandTooltipBrandAutocompleteInput-model']");
//     By Region = By.xpath("//*[@id='brandTooltipBrandAutocomplete-region']/label");
     By Region = By.xpath("//label[@data-text='Регіон']");
     By submitButton = By.xpath("//button[@type='submit']");

     By YearFrom = By.xpath("//select[@id='yearFrom']");
     By YearTo = By.xpath("//select[@id='yearTo']");
     By PriceFrom = By.xpath("//input[@id='priceFrom']");
     By PriceTo = By.xpath("//input[@id='priceTo']");



     @Test
     public void firstTest() throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://auto.ria.com/uk/");
       driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

       driver.findElement(brand).sendKeys("BMW");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//li[@data-value='9']")).click();

       driver.findElement(model).sendKeys("X6");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//li[@data-value='2153']")).click();

       driver.findElement(Region).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='brandTooltipBrandAutocomplete-region']/ul/li[2]")).click();

       driver.findElement(YearFrom).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='yearFrom']/option[24]")).click();

       driver.findElement(YearTo).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='yearTo']/option[2]")).click();

       driver.findElement(PriceFrom).sendKeys("2000");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='yearTo']/option[2]"));

       driver.findElement(PriceTo).sendKeys("20000");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='yearTo']/option[2]"));

       driver.findElement(submitButton).click();



     }

  //String YearFrom = "//select[@id='yearFrom']";
     //*[@id="yearFrom"]
  //String YearTo = "//select[@id='yearTo']";
  //String PriceFrom = "//input[@id='priceFrom']";
  //String PriceTo = "//input[@id='priceTo']";



 // @Test
  //public void openSite() throws InterruptedException {
    //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    //WebDriver driver = new ChromeDriver();

    // 1. открытие сайта
    // driver.get("https://auto.ria.com/uk/");
    //driver.navigate().to("https://auto.ria.com/uk/");
    //Thread.sleep(5000);
    //driver.close();
//    driver.navigate().to("https://hillel.ua/");

    // 2. Навигация по сайту
//    driver.navigate().back();
//    driver.navigate().forward();
//    driver.navigate().refresh();
//    driver.close();

    // 3. Размеры окна
    //driver.manage().window().minimize();
    //driver.manage().window().maximize();

    // 4. Ожидание
    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    //Thread.sleep(1000);


  }


//package tests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//import wrappers.Input;
//import wrappers.PickList;
//
//import java.time.Duration;
//
//public class AccountTest extends BaseTest {
//    @Test
//    public void createAccount() {
//        () -> loginPage.open();
//        driver.get("https://tms41-dev-ed.my.salesforce.com/");
//        driver.findElement(By.id("username")).sendKeys("drak@tms.sandbox");
//        driver.findElement(By.id("password")).sendKeys("Password01!!");
//        driver.findElement(By.id("Login")).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        //wait.until()
//        driver.get("https://tms41-dev-ed.lightning.force.com/lightning/o/Account/new");
//        new Input(driver, "Account Name").write("TMS Eugen");
//        new Input(driver, "Account Number").write("123456789");
//        new PickList(driver,"Rating").select("Hot");
//        driver.findElement(By.xpath("//*[text()='Parent Account']/ancestor::lightning-input//input")).sendKeys("TMS Eugen");
//        driver.findElement(By.xpath("*//button[@name='SaveEdit']")).click();
//
//
//    }
//}

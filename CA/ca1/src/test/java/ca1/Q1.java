package ca1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(co);
	
	driver.navigate().to("https://www.amazon.in/dp/B09V4FNFHN/ref=s9_acsd_al_bw_c2_x_3_i?pf_rd_m=A1K21FY43GMZF8&pf_rd_s=merchandised-search-8&pf_rd_r=0PD2EPPB5M15N0BSBFYZ&pf_rd_t=101&pf_rd_p=64c31b69-15c1-4531-93b4-090f6566dcd7&pf_rd_i=1375458031&th=1");
	driver.manage().window().maximize();
	
	WebElement ac = driver.findElement(By.id("add-to-cart-button"));
	ac.click();

	WebElement cart = driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"));
	cart.click();
	
	WebElement qty = driver.findElement(By.xpath("//*[@id=\"sc-active-C445a7c0e-2ecc-4944-89f7-678e5f63f587\"]/div[4]/div/div[2]/div[1]/span[1]/span/span[1]/span/span/span/span"));
	qty.click();
	
	WebElement qty1 = driver.findElement(By.xpath("//*[@id=\"quantity_3\"]"));
	qty1.click();
	
	WebElement del = driver.findElement(By.xpath("//*[@id=\"sc-active-C445a7c0e-2ecc-4944-89f7-678e5f63f587\"]/div[4]/div/div[2]/div[1]/span[2]/span/input"));
	del.click();
	
	
  }
}

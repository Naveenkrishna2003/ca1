package ca1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2 {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(co);
	
	driver.navigate().to("https://www.amazon.in/dp/B09V4FNFHN/ref=s9_acsd_al_bw_c2_x_3_i?pf_rd_m=A1K21FY43GMZF8&pf_rd_s=merchandised-search-8&pf_rd_r=0PD2EPPB5M15N0BSBFYZ&pf_rd_t=101&pf_rd_p=64c31b69-15c1-4531-93b4-090f6566dcd7&pf_rd_i=1375458031&th=1");
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("charger");
     
	WebElement sb = driver.findElement(By.id("nav-search-submit-button"));
	sb.click();
	
	WebElement filter = driver.findElement(By.xpath("//*[@id=\"p_89/Ambrane\"]/span/a/div/label/i"));
	filter.click();
	
			
	driver.navigate().back();
	
	WebElement filter1 = driver.findElement(By.xpath("//*[@id=\"p_36/1318503031\"]/span/a/span"));
	filter1.click();
	
	driver.navigate().back();
	
	WebElement filter2 = driver.findElement(By.xpath("//*[@id=\"p_n_specials_match/21618256031\"]/span/a/div/label/i"));
	filter2.click();

	
	
	
	
}
}
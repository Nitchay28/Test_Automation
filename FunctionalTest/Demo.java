package FunctionalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	
	public static <WebDriver> void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		
		driver.findElement(By.id("mui-1")).sendKeys("prexo.mis@dealsdray.com");
		
		driver.findElement(By.id("mui-2")).sendKeys("prexo.mis@dealsdray.com");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.id("root")).click();
		
		driver.findElement(By.name("full")).click();
		
		String projectpath = System.getProperty("user.dir");
		
		driver.findElement(By.id("file-upload-button")).sendKeys("C:\\Users\\Windows 11\\eclipse-workspace\\mavensample\\File\\demo-daa.xlsx");
		
		//driver.findElement(By.xpath("projectpath"));
		
		driver.close();
		
		System.out.println("Screenshot and demo  taken Successfully!");
		
	}

}

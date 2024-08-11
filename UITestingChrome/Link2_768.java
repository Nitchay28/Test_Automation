package UITestingChrome;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Screen Resolutions Desktop:-1366×768

public class Link2_768 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/calley-lifetime-offer/");
		
		driver.manage().window().setSize(new Dimension(1366, 768));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Windows 11\\eclipse-workspace\\mavensample\\Screenshots\\DELLInspiron(Link2)+1366X768_"+timestamp()+".png");
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(5000);
		
		driver.close();
		System.out.println("Screenshot taken Successfully!");

	}

	private static String timestamp() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());

	}

}

package UITestingChrome;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link3_1080 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/see-a-demo/");
		
		driver.manage().window().setSize(new Dimension(1920, 1080));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Windows 11\\eclipse-workspace\\mavensample\\Screenshots\\DELLInspiron(Link3)+1920X1080_"+timestamp()+".png");
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

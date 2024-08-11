package UITestingFireFox;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Screen Resolutions-Firefox 1366×768


public class Link1_786 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.getcalley.com/");
		
		driver.manage().window().setSize(new Dimension(1366, 768));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Windows 11\\eclipse-workspace\\mavensample\\Screenshots1\\DELLInspiron-FX(Link1)+1366×768_"+timestamp()+".png");
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



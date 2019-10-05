package sample;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sampletest {
	@Test
	public void firsttest()
	{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\ds\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		try{
	        Thread.sleep(1000);
	        long id = Thread.currentThread().getId();
	        BufferedImage image = new Robot().createScreenCapture(new Rectangle(
	                Toolkit.getDefaultToolkit().getScreenSize()));
	            ImageIO.write(image, "jpg", new File("D:\\New folder (3)\\seleniumworkspace\\sample\\screenshot\\screenshot.jpg"));
	    }
	    catch(Exception e){
	        e.printStackTrace();
	    }
	}

}

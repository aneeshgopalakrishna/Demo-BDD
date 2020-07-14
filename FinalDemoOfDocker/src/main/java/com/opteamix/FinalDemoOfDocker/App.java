package com.opteamix.FinalDemoOfDocker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
class App{
	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver;
		System.out.println("Chrome started");
		DesiredCapabilities cap=DesiredCapabilities.chrome();
//		cap.setPlatform(Platform.LINUX);
//		cap.setVersion("");
		driver=new RemoteWebDriver(new URL("http://192.168.43.160:4444/wd/hub"),cap);
		driver.manage().window().maximize();
		System.out.println("Screen Maximized");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Loading the link of Google");
		WebElement searchBox=null;
		for(int i=0;i<50;i++) {
		File file = new File("/TextFile.txt");   
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		driver.get("http://www.google.com/");
		System.out.println("Loaded the link of Google");
		
		searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(st);
		Thread.sleep(5000);
		searchBox.submit();
		Thread.sleep(5000);
		System.out.println("Sent the keyword for a search");
		String text1 = driver.getTitle();
		System.out.println("title :"+text1);
		Thread.sleep(5000);
		break;
		}
		}
	
		driver.quit(); 
	}
}

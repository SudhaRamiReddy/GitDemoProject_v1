package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getcommands {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.wellsfargo.com/com/");
		
		System.out.println("Tittle of the Web page "+ driver.getTitle());
		System.out.println("Tittle of the Url" + driver.getCurrentUrl());
		
		driver.close();
		

	}

}

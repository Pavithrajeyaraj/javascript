package javascriptexcecutor1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayaprakasam\\Desktop\\New folder (2)\\javascriptexcecutor1\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.greenstechnologys.com/");
WebElement down = driver.findElement(By.xpath("//p[text()='Copyright © 2019 greenstechnologys.com. All Rights Reserved.']"));
String text = down.getText();
System.out.println(text);
JavascriptExecutor s =(JavascriptExecutor)driver;
s.executeScript("arguments[0].scrollIntoView(true)", down);

	}

}

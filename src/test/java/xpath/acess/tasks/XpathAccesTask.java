package xpath.acess.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAccesTask {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--disable notification");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://www.google.com/search?sxsrf=ALeKk01NZAULDjCJdlqAzrEXI97ycDWnGQ%3A1615375034348&source=hp&ei=uqpIYMvvEtLZz7sPxLiXiAc&iflsig=AINFCbYAAAAAYEi4ygTo7btn3BxG8xcAc26kePJaFKcO&q=greens&btnK=Google+Search");
//		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).click();
//		List<WebElement> findElements = driver.findElements(By.xpath("//*[@class='a4bIc']//parent::div//parent::div//following::div[@role='option']"));
//		for (int i = 0; i < findElements.size(); i++) {
//			String text = findElements.get(i).getText();
//			System.out.println(text);
//			
//		}
	
	//ittrate all courese details in greens technology webpage using xpath access
//		driver.get("http://www.greenstechnologys.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		Actions actions = new Actions(driver);
//		WebElement findElement = driver.findElement(By.xpath("//*[text()='COURSES']"));
//		WebElement findElement2 = driver.findElement(By.xpath("//*[text()='Oracle Training']"));
//		WebElement findElement3 = driver.findElement(By.xpath("//*[text()='Robotic Process Automation Training']"));
//		actions.moveToElement(findElement).perform();
//		
//		
//	//	List<WebElement> findElements = driver.findElements(By.xpath("//*[text()='COURSES']//parent::li//child::ul//child::li"));
//		List<WebElement> findElements = driver.findElements(By.xpath("//*[text()='COURSES']//parent::li//child::ul//child::li//child::a//span"));
//		
//		for (int i = 0; i < findElements.size(); i++) {
//			WebElement webElement = findElements.get(i);
//			String text3 = webElement.getText();
//			System.out.println(text3);
//		}	
//		actions.moveToElement(findElement2).perform();
//			List<WebElement> findElements2 = driver.findElements(By.xpath("//*[text()='Oracle Training']//following::ul//child::a//span"));
//			for (int j = 0; j < findElements2.size(); j++) {
//				String text = findElements2.get(j).getText();
//				System.out.println(text);
//			}
//			actions.moveToElement(findElement3).perform();	
//			List<WebElement> findElements3 = driver.findElements(By.xpath("//*[text()='Robotic Process Automation Training']//following::ul//child::a//span"));
//			for (int j2 = 0; j2 < findElements3.size(); j2++) {
//				String text1 = findElements3.get(j2).getText();
//				System.out.println(text1);
					
			//	}
				
				
			
			
			
		
	
	
	//using xpath acess click login button
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		robot.keyRelease(KeyEvent.VK_ESCAPE);
//		try {
//			driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
//		} catch (Exception e) {
//			
//		}
//		
//driver.findElement(By.xpath("//*[@class='_3704LK']//parent::div//parent::div//parent::form//following::div//child::a[text()='Login']")).click();
//		
//	
//	
		
		
		
		//using xpath access to perform actions in makemytrip webpage 
//		driver.get("https://www.makemytrip.com/flights/?gclid=Cj0KCQiA-aGCBhCwARIsAHDl5x8j3O_vx6Kf6bv3d9ITiOgvR3GpiIdeV39kvNmDRwozqzkmFV6Tp7MaAvZUEALw_wcB&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|263079100974&s_kwcid=AL!1631!3!263079100974!e!!g!!makemytrip&ef_id=Cj0KCQiA-aGCBhCwARIsAHDl5x8j3O_vx6Kf6bv3d9ITiOgvR3GpiIdeV39kvNmDRwozqzkmFV6Tp7MaAvZUEALw_wcB:G:s");
//		driver.manage().window().maximize();
//		WebElement findElement2 = driver.findElement(By.xpath("//p[text()='Login or Create Account']"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(findElement2).perform();
//		WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Hotels']"));
//		findElement3.isEnabled();
//		findElement3.click();
//		driver.findElement(By.xpath("//*[@id='city']")).click();
//		List<WebElement> find = driver.findElements(By.xpath("//*[text()='SUGGESTIONS ']//following::ul//child::div//child::div[@class='spaceBetween makeFlex hrtlCenter ']"));
//		String s ="Dubai";
//		for (int i = 0; i < find.size(); i++) {
//			String text = find.get(i).getText();
//			System.out.println(text);
//			if (text.equalsIgnoreCase(s)) {
//				
//				
//				Thread.sleep(5000);
//				WebElement findElement = driver.findElement(By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']"));
//				JavascriptExecutor executor = (JavascriptExecutor) driver;
//				executor.executeScript("arguments[0].setAttribute('value','Dubai')",findElement);
//				findElement.clear();
//				findElement.sendKeys(s);
//		
//			
//			
//			}
//			
//		}
		
		//To Click the indigo flight from filter list
//		driver.get("https://www.makemytrip.com/flight/search?itinerary=MAA-BLR-11/03/2021&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		//driver.findElement(By.xpath("//a[text()='Search']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//p[text()='Popular Filters']//parent::div//child::div//span[text()='IndiGo']")).click();
		
		
		
		
		driver.get("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	}

}

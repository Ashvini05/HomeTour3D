package HomeTour3D.pages;

import java.io.IOException;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HomeTour3D.utility.CaptureScreenshot;

public class HomeTour3D_takeScreenshot {
	private static WebDriver driver;
	
	
	@FindBy(xpath ="//a[@class='scene']")
	private List<WebElement> Ele_List;
	
	public void getListofEle() throws IOException, InterruptedException
	{
		CaptureScreenshot screenshot= new CaptureScreenshot(driver);
		for(int i=0;i<Ele_List.size();i++)
		{	
			
			Ele_List.get(i).click();
			Thread.sleep(2000);
			screenshot.takeScreenShot("page_"+i);
			//System.out.println("name of the element is --->"+Ele_List.get(i).getText());
			
		}		
	}
		
	public HomeTour3D_takeScreenshot(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	 }	
}


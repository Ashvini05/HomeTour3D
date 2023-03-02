package HomeTour3D.HomePage;
import java.io.IOException;
import org.testng.annotations.Test;

import HomeTour3D.Base.TestBase;
import HomeTour3D.pages.HomeTour3D_takeScreenshot;



public class TC_01_WelcomePage extends TestBase{

	@Test
	public void HomeTore3D() throws IOException, InterruptedException
	{
		
		HomeTour3D_takeScreenshot HM3D = new HomeTour3D_takeScreenshot(driver);
		HM3D.getListofEle();
	}
}

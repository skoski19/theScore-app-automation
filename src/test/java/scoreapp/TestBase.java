package scoreapp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import util.AppiumUtil;

public class TestBase extends AppiumUtil{
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	

	@BeforeClass(alwaysRun=true)
	public void configureAppium() throws MalformedURLException, URISyntaxException  
	{
		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Suki\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
				
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 3a");
		options.setApp("C:\\gitRepos\\theScore-app-automation\\src\\test\\java\\resources\\theScore_2440.apk");
		options.setCapability("autoGrantPermissions", true);
		options.setCapability("autoAcceptAlerts", true);
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@AfterClass(alwaysRun=true)
	public void tearDown() 
	{
		driver.quit();
		service.stop();
	}

}

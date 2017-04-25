package com.experitest.auto;

import java.net.URL;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.experitest.appium.SeeTestAndroidDriver;
import com.experitest.appium.SeeTestAndroidElement;
import com.experitest.appium.SeeTestCapabilityType;
import com.experitest.manager.client.PManager;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidLoginFailTest extends BaseTest {
	protected SeeTestAndroidDriver<SeeTestAndroidElement> driver = null;
	
	@BeforeMethod
	@Parameters("deviceQuery")
	public void setUp(@Optional("@os='android'") String deviceQuery) throws Exception{
		init();
		// Init application / device capabilities
		// dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
		// dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
		dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
		dc.setCapability(SeeTestCapabilityType.DEVICE_QUERY, deviceQuery);
		dc.setCapability(SeeTestCapabilityType.TEST_NAME, "AndroidLoginTest");
		driver = new SeeTestAndroidDriver<>(new URL(getProperty("url",cloudProperties)), dc);
	}
	
	@Test
	public void test(){
		driver.findElement(in.Repo.obj("and_login.usernameTextField")).sendKeys("company");
		driver.findElement(in.Repo.obj("and_login.passwordTextField")).sendKeys("company1");
		driver.findElement(in.Repo.obj("and_login.loginButton")).click();
		driver.findElement(in.Repo.obj("and_login_error.Invalid_username_password"));
		driver.findElement(in.Repo.obj("and_login_error.Close")).click();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		PManager.getInstance().addReportFolder(driver.getReportFolder());

	}
	
}

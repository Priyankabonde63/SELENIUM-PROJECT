package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {

/*	@Test(priority = -3)
	public void tc1() {
		Reporter.log("1Hey...!", true);
	}
	
	@Test(priority = 1)
	public void tc2() {
		Reporter.log("2Hey...!", true);
	}
	
	@Test(priority = -2)
	public void tc3() {
		Reporter.log("3Hey...!", true);
	}   */
	
	@Test(dependsOnMethods = {"tc2"})
	public void tc1() {
		Reporter.log("1Hey...!", true);
	}
	
	@Test(dependsOnMethods = "tc3")
	public void tc2() {
		Reporter.log("2Hey...!", true);
	//	Assert.fail();
	}
	
	@Test()
	public void tc3() {
		Reporter.log("3Hey...!", true);
	}  
}


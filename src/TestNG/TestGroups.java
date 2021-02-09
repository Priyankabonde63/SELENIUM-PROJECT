package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroups {
	
		@Test(groups = "smoke", priority = 3)
		public void tc1() {
			Reporter.log("1Hey...!", true);
		}
		
		@Test(groups = "regration", dependsOnMethods = "functional")
		public void tc2() {
			Reporter.log("2Hey...!", true);
		}
		
		@Test(groups = "functional", dependsOnMethods = "smoke",priority = -2)
		public void tc3() {
			Reporter.log("3Hey...!", true);
		}   
		
		@Test(groups = "smoke", priority = 2)
		public void tc4() {
			Reporter.log("4Hey...!", true);
		}
		
		@Test(groups = "functional", dependsOnMethods = "smoke",priority = -3)
		public void tc5() {
			Reporter.log("5Hey...!", true);
		}
		
		@Test(groups = "smoke", priority = 1)
		public void tc6() {
			Reporter.log("6Hey...!", true);
		}  
		
		@Test(groups = "functional", dependsOnMethods = "smoke")
		public void tc7() {
			Reporter.log("7Hey...!", true);
		}  
	}





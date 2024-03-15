package com.akhilsystem_release.test.registresion_workflow;

import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.Test;

import com.akhilsystem_release.base.Base;

public class RegistresiopnWorkflow extends Base {

	@Test
	public void openAppointment() throws ElementNotInteractableException, InterruptedException {
		this.SignIn(driver, "Akhil Demo", "Akhil Demo Delhi");
//		this.menu(driver, "OPD", "Registration Workflow", sleep, timeout);
	}
}

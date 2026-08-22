package com.datasyncinc.framework.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	// driver initialization and closing will be done in the step definition class, so we will not do it here in the hooks class
	
	
	
	@Before
	public void methodToRunBeforeScenario() {
		
	
		// openning the browser and navigating to the url will be done in the step definition class
		
	}
	
	
	@After
	public void methodToRunAfterScenario() {
		
		// closing the browser will be done in the step definition class
		
		
	}
	
	

}

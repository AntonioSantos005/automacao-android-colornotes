package stepsDefinitions;

import static utils.Utils.acessarColorNote;
import static utils.Utils.driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks {
	
	@Before
	public void setUp() throws Exception {
		acessarColorNote();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}

package jaytest;

import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "Features",
			glue= {"stepDefinition"}
						
			)
	public class Jay_Test_Runner {


	

}
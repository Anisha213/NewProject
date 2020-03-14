package org.step;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.data.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass{
@Before
public void beforeScenario() {
launchChromeBrowser();
loadUrl();
}
@After
public void afterScenario(Scenario sc) {
if (!sc.isFailed()) {
	TakesScreenshot tk= (TakesScreenshot)driver;
	byte[] b1 = tk.getScreenshotAs(OutputType.BYTES);

System.out.println(b1);
sc.embed(b1, "images/png");

}
	
}
}

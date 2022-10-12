package StepRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/cucumber1.html"},
        monochrome=true,
        features = {"C:\\selenium-grid\\LMS-Hackthon\\src\\main\\resources"},
        //tags = "@Tag1",
        glue= "StepDefinition")
class TestRunner extends AbstractTestNGCucumberTests
{
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios()
    {
        return super.scenarios();
    }
}


package runner;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/SearchBox.feature",
        glue = {"stepdefinitions","configuration.hooks"}
//        monochrome = true,
//        publish = true,
//        dryRun = false,
//        plugin = {
//                "pretty",
//                "html:target/cucumber-reports/index.html",
//                "json:target/cucumber-reports/cucumber-report.json",
//                "junit:target/cucumber-reports/cucumber-results.xml",
//                "pretty:target/cucumber-reports/cucumber-pretty.txt",
//                "rerun:target/cucumber-reports/rerun.txt"
//        },
//        tags = "@RegressionTest and not @pending"
//        tags = "@SmokeTest and not @pending"
//        tags = "@Target TestAutomation and not @pending"
)


public class TestRunner  {


//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
//
//    @Before
//    public void beforeScenario(Scenario scenario) {
//
//    }
//
//    private TestNGCucumberRunner testNGCucumberRunner;
//
//    @BeforeClass()
//    public void setUpClass() throws Exception {
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }

//    @Test(dataProvider = "features")
//    public void my_test(CucumberFeatureWrapper cucumberFeature) {
//        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//    }
//
//
//    @DataProvider
//    public Object[][] features() {
//        return testNGCucumberRunner.provideFeatures();
//    }


//    @AfterClass
//    public void tearDown() {
//        testNGCucumberRunner.finish();
//    }


}

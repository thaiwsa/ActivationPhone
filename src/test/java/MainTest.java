/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(format = "pretty",
        glue = {"nht.test.stepDef"},
        tags = {"@all"},
        features = {"classpath:features"})
public class MainTest {
}

package mycucumber.features.contextone;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

import io.cucumber.spring.CucumberContextConfiguration;
import lab.junatek.labcucumber.LabCucumberApplication;
import mycucumber.features.contextone.bean.ConfigOne;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.SelectDirectories;
import org.junit.platform.suite.api.Suite;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Suite
@IncludeEngines("cucumber")
@SelectDirectories("src/test/java/mycucumber/features/contextone/feature")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "mycucumber.features.contextone")
@CucumberContextConfiguration
@ContextConfiguration(classes = {LabCucumberApplication.class, ConfigOne.class})
@ExtendWith(SpringExtension.class)
public class OneRunCucumberTest {
}

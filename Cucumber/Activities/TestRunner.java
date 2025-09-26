package TestRunner;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;

import io.cucumber.junit.platform.engine.Constants;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(
  key = Constants.GLUE_PROPERTY_NAME,
  value = "StepDefination")
@ConfigurationParameter(
  key = Constants.FILTER_TAGS_PROPERTY_NAME,
  value = "@Activity3")
@ConfigurationParameter(
		key = Constants.PLUGIN_PROPERTY_NAME,
		value = "pretty, html:Reports/HTML_Report.html, junit:Reports/XML_Report.xml, json:Reports/JSON_Report.json"
	)
@ConfigurationParameter(
	    key = Constants.PLUGIN_PUBLISH_ENABLED_PROPERTY_NAME,
	    value = "true"
	)
public class TestRunner {

}

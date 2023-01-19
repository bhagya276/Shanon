package step_Def;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature\\cucumber.feature",glue={"step_Def"},plugin = {"pretty","html:target\\HTML\\report.html"})

public class Runner_class {

}


package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(

            plugin = {"html:target/Paralel-reports1.html",
                    "json:target/json-Paralel-reports/cucumber1.json",
                    "junit:target/xml-Paralel-report/cucumber1.xml"
            },
            features = "src/test/resources",
            glue = "stepdefinitions",
            tags = "@smoke",

            dryRun = false

    )

    public class ParalelRunner1 {

    }



$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/registerScenarioOutline.feature");
formatter.feature({
  "line": 1,
  "name": "demo scenario outline for register",
  "description": "",
  "id": "demo-scenario-outline-for-register",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Successful register with valid credentials",
  "description": "",
  "id": "demo-scenario-outline-for-register;successful-register-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Registartion page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I provide \u003cGender\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I provide valid \u003cFirst name\u003e and \u003cLast name\u003e and \u003cEmail\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I provide valid \u003cPassword\u003e and \u003cConfirmPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should able to see \"Registration successfull\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "demo-scenario-outline-for-register;successful-register-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "Gender",
        "First name",
        "Last name",
        "Email",
        "Password",
        "ConfirmPassword"
      ],
      "line": 9,
      "id": "demo-scenario-outline-for-register;successful-register-with-valid-credentials;;1"
    },
    {
      "cells": [
        "Male",
        "Akash",
        "Pawar",
        "akash77@gmail.com",
        "qwerty",
        "qwerty"
      ],
      "line": 10,
      "id": "demo-scenario-outline-for-register;successful-register-with-valid-credentials;;2"
    },
    {
      "cells": [
        "Male",
        "mahesh",
        "kumar",
        "mahesh77@gmail.com",
        "qwerty123",
        "qwerty123"
      ],
      "line": 11,
      "id": "demo-scenario-outline-for-register;successful-register-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9768357400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Successful register with valid credentials",
  "description": "",
  "id": "demo-scenario-outline-for-register;successful-register-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Registartion page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I provide Male",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I provide valid Akash and Pawar and akash77@gmail.com",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I provide valid qwerty and qwerty",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should able to see \"Registration successfull\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterOutline.registartion_page_is_opened()"
});
formatter.result({
  "duration": 11178135600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterOutline.i_provide_Male(String,String,String,String,String)"
});
formatter.result({
  "duration": 1311500,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027com.stepdefinition.RegisterOutline.i_provide_Male(String,String,String,String,String) in file:/E:/cucumbersession/CucumberDemoWebShop/bin/\u0027 with pattern [^I provide Male$] is declared with 5 parameters. However, the gherkin step has 0 arguments []. \nStep: When I provide Male\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Akash and Pawar",
      "offset": 16
    },
    {
      "val": "akash77@gmail.com",
      "offset": 36
    }
  ],
  "location": "OutlineDemo.i_provide_valid_akash_abd_gmail_com_and_aA(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "qwerty",
      "offset": 16
    },
    {
      "val": "qwerty",
      "offset": 27
    }
  ],
  "location": "OutlineDemo.i_provide_valid_akash_abd_gmail_com_and_aA(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Registration successfull",
      "offset": 22
    }
  ],
  "location": "RegisterOutline.i_should_able_to_see(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4456706500,
  "status": "passed"
});
formatter.before({
  "duration": 5236062100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Successful register with valid credentials",
  "description": "",
  "id": "demo-scenario-outline-for-register;successful-register-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Registartion page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I provide Male",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I provide valid mahesh and kumar and mahesh77@gmail.com",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I provide valid qwerty123 and qwerty123",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should able to see \"Registration successfull\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterOutline.registartion_page_is_opened()"
});
formatter.result({
  "duration": 12149631000,
  "status": "passed"
});
formatter.match({
  "location": "RegisterOutline.i_provide_Male(String,String,String,String,String)"
});
formatter.result({
  "duration": 732900,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027com.stepdefinition.RegisterOutline.i_provide_Male(String,String,String,String,String) in file:/E:/cucumbersession/CucumberDemoWebShop/bin/\u0027 with pattern [^I provide Male$] is declared with 5 parameters. However, the gherkin step has 0 arguments []. \nStep: When I provide Male\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "mahesh and kumar",
      "offset": 16
    },
    {
      "val": "mahesh77@gmail.com",
      "offset": 37
    }
  ],
  "location": "OutlineDemo.i_provide_valid_akash_abd_gmail_com_and_aA(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "qwerty123",
      "offset": 16
    },
    {
      "val": "qwerty123",
      "offset": 30
    }
  ],
  "location": "OutlineDemo.i_provide_valid_akash_abd_gmail_com_and_aA(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Registration successfull",
      "offset": 22
    }
  ],
  "location": "RegisterOutline.i_should_able_to_see(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4877609200,
  "status": "passed"
});
});
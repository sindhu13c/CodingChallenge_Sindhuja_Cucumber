$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/testing/apple/CucumberProject/cucumberSession.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Purchase IPad",
  "description": "",
  "id": "purchase-ipad",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 22,
  "name": "Select Ipad",
  "description": "",
  "id": "purchase-ipad;select-ipad",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User Click On Ipad Link",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Click On Buy Link",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Click On Silver Color",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Click On 32GB Storage",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Click On WiFI+Cellular Connectivity",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Click On AppleCare",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Click On Add",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Click On Continue",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Click On AddToBag",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Click On ReviewBag Button",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Click On CheckOut",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Click On ContinueasGuest",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Select ContinueToShipping Address",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter Address Details",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Click On ContinueToPayment",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Select Credit/Debit",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Enter CreditCard Details",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Click On Order",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Verify Error Message",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberStep.user_launch_the_application()"
});
formatter.result({
  "duration": 6876838672,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.user_Click_On_Ipad_Link()"
});
formatter.result({
  "duration": 640888827,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.click_On_Buy_Link()"
});
formatter.result({
  "duration": 2126080448,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.click_On_Silver_Color()"
});
formatter.result({
  "duration": 1174189219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32",
      "offset": 9
    }
  ],
  "location": "cucumberStep.click_On_GB_Storage(int)"
});
formatter.result({
  "duration": 1161366608,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.click_On_WiFI_Cellular_Connectivity()"
});
formatter.result({
  "duration": 1181825608,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.click_On_AppleCare()"
});
formatter.result({
  "duration": 1138186863,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.click_On_Add()"
});
formatter.result({
  "duration": 1098230477,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.click_On_Continue()"
});
formatter.result({
  "duration": 2313008407,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.click_On_AddToBag()"
});
formatter.result({
  "duration": 3405060416,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.click_On_ReviewBag_Button()"
});
formatter.result({
  "duration": 2249340235,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.click_On_CheckOut()"
});
formatter.result({
  "duration": 1174187396,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.click_On_ContinueasGuest()"
});
formatter.result({
  "duration": 1118745635,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.select_ContinueToShipping_Address()"
});
formatter.result({
  "duration": 1384060987,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.enter_Address_Details()"
});
formatter.result({
  "duration": 7792407736,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.click_On_ContinueToPayment()"
});
formatter.result({
  "duration": 1107209551,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.select_Credit_Debit()"
});
formatter.result({
  "duration": 1115696696,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.enter_CreditCard_Details()"
});
formatter.result({
  "duration": 3753124880,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.click_On_Order()"
});
formatter.result({
  "duration": 1223604575,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.verify_Error_Message()"
});
formatter.result({
  "duration": 1057614053,
  "status": "passed"
});
formatter.match({
  "location": "cucumberStep.close_Browser()"
});
formatter.result({
  "duration": 1078462512,
  "status": "passed"
});
});
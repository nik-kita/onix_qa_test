# onix_qa_test

For run existing tests you need to open any of test classes. In future project will be upgraded. It is only **TODAY** solution.
##### Test classes in project tree structure _(between horizontal lines)_:
```
.
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── engine_layer
│   │   │   │   ├── OnixWebDriver.java
│   │   │   │   └── OnixWebElement.java
│   │   │   ├── Lab.java
│   │   │   ├── locators
│   │   │   │   ├── BaseLoc.java
│   │   │   │   ├── DropDownLoc.java
│   │   │   │   ├── FormAuthenticationLoc.java
│   │   │   │   ├── GeneralLocators.java
│   │   │   │   ├── JsAlertsLoc.java
│   │   │   │   ├── Locator.java
│   │   │   │   └── MainPageLoc.java
│   │   │   └── page_objects
│   │   │       ├── BasePO.java
│   │   │       ├── DropDownPO.java
│   │   │       ├── FormAuthenticationPO.java
│   │   │       ├── JsAlertsPO.java
│   │   │       └── MainPO.java
│   │   └── resources
│   └── test
│       └── java
```
------------------------------------------------------------------------
```
│           ├── DropDownTests.java
│           ├── FormAuthenticationTests.java
│           ├── JsAlertsPageTests.java
│           ├── MainPageTests.java
│           └── TestRunner.java
```
-------------------------------------------------------------------------
```
└── target
```

### How run:
Now every class has only smoke tests for every page object. So you should open any of them and click 'run'.

## P.S.
In future this projects will has ability to run test from tesng.xml files, from command line like maven command etc.. And also it will generate allure report.

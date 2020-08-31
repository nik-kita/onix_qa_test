# onix_qa_test
This project is simply testing user interface of http://the-internet.herokuapp.com/.
For this issue uses Page Object Pattern.
Also test runs in parallel class mode.
In this project are using such technologies as: Maven, Selenium, TestNG, Allure etc.. You may see all list 
if you open POM.xml file.
So you should open this site and look on it to understand what these tests will test.
For now they simply check all elements on some pages. So today there are only smoke tests
for some pages of this site.


## HOW RUN:
> * #### `mvn clean test -Dsurefire.suiteXmlFiles=testng.xml`
> * #### `allure serve allure-results`
---
 ##### HOW RUN (instruction in all details, step by step):
1. open terminal and install maven and allure if they are not already installed:
    * install maven:
        * `sudo apt install maven`
    * install allure:
        * `sudo apt-add-repository ppa:qameta/allure`
        * `sudo apt-get update` 
        * `sudo apt-get install allure`
2. clone this project from git-hub to your computer and go to folder with project:
   * `git clone https://github.com/nik-kita/onix_test.git`
   * `cd onix_qa_test/`
3. run all test by maven:
   * `mvn clean test -Dsurefire.suiteXmlFiles=testng.xml`
4. see allure report in browser:
   * `allure serve allure-results`

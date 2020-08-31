# onix_qa_test



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

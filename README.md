- Apache Maven should be installed, to check it execute "mvn -v". 
  Instruction how to setup Maven You can find here: https://maven.apache.org/install.html;
- Build tests: "mvn package";

###For tests building required parameters should be set:

- "-Denvironment" — Environment for which You would like to run tests, e.g. "-Denvironment=qatest"
- "-DrunnerFile" — Runner file which specifies browsers strategy for test execution:
    1. "-DrunnerFile=all_browsers" — It means that tests will be executed in all available browsers;
    2. "-DrunnerFile=select_browser" - It means that tests will be executed in one of the specific browser
    that You can set using "-Dbrowser" parameter e.g. "-Dbrowser=Chrome";
    
For example if You want to run tests for "........" only in Chrome You can use the following command: 
"mvn clean package -DrunnerFile=select_browser -Dbrowser=CHROME";
For run tests in all available browsers: "mvn package -DrunnerFile=select_browser";

####Note:

- Web testbase.Browsers Drivers will be downloaded automatically using dependencies in the "pom.xml" file;
- Test execution report You can find in the "target/surefire-reports/emailable-report.html";
- For run specific test suites You can use "*.xml" files in the "runner" folder and set name of the specific test case;
- Available browsers: Chrome, Firefox, Edge, IE11 (Tests in IE11 and Edge currently aren't working, should be provided solution soon);
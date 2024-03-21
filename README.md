# theScore app Automation

## Automation for theScore app with Android testing using Appium, Java, TestNG and Maven
This project is the foundation for an automation suite with the Score app and Android tests.  

The framework uses a  page object model design pattern, which makes the test automation programmer-friendly by keeping tests and the element locators separate. This keeps the code clean and understandable. The result is that test cases can easily be implemented, updated, maintained, and reused.

## PreRequisites
- [JAVA 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
- [Appium 2](https://appium.io/docs/en/2.0/quickstart/install/)
- [Eclipse IDE for Java Developers Version: 2024-03](https://www.eclipse.org/downloads/packages/release/2024-03/r)
- Maven
- [Android studio](https://developer.android.com/studio?gad_source=1&gclid=CjwKCAjwkuqvBhAQEiwA65XxQKNR5mR_6PnP7KDVrlUbRKH1M5VDXeHDKBI_cuTs1szo927wDAxQsBoCX3gQAvD_BwE&gclsrc=aw.ds) with emulator (for this example Pixel 3a used).
- Set environment variable ANDROID_HOME, JAVA_HOME
- Tests Run on Appium default host ```http://127.0.0.1:4723``  
- Package dependencies from [Maven Repository](https://mvnrepository.com/)

  Add following to pom.xml

```xml
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>
</dependency>

<dependency>
    <groupId>io.appium</groupId>
    <artifactId>java-client</artifactId>
    <version>9.2.0</version>
</dependency>
```

## How to run
- Import the Maven project into Eclipse
- Open src/test/java/scoreapp/ScoreTests.java
- Right click the file and Run as> TestNG Test

## The Automated Test: SelectLeagueTeamValidateStandings steps
- Loads the app theScore_2440.apk into the emulator
- Clicks 'Get Started' button
- Selects Leagues 'NFL Football' and 'NASCAR Racing' verifies they were selected
- Clicks 'Continue' button
- Asserts that the app is on the 'Favorite Teams' page
- Clicks 'Continue' button
- Asserts that the app is on the 'Never miss a game' page
- Clicks 'Done' button
- Asserts that 'Favorites' is selected
- Selects the 'Leagues' link
- Selects the 'MLB' and asserts that it has been selected
- Selects 'Standings' and asserts that the 'Standings' page is selected
- Navigates 'Back'
- Asserts that the navigation 'Back' landed on the 'Leagues' page
- Exits the app

## Test run results - testng html report
![results](https://github.com/skoski19/theScore-app-automation/assets/32649231/de8b3919-5d64-4ab9-9fee-0811d23f66c5)

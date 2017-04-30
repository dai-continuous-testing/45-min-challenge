# 45 minutes challenge 
[![N|Experitest](http://i.imgur.com/N7lezU8.jpg)](https://www.experitest.com)

The 45 minutes challenge is the hosted repository which followed Experitest webinar, the goal was to set a CI enviroment which allows full mobile UI Functional automation cycle in less than 45 minutes.

To watch the webinar - [Recorded Webinar session](https://goo.gl/rHAhPy)

# Getting Started
```sh
$ git clone https://github.com/ExperitestOfficial/45-min-challenge.git
$ cd 45-min-challenge
$ ./gradlew build
```


# Run your first test :

 - Connect to a SeeTestCloud instance, you can use SeeTestCloud Online https://cloud.experitest.com click on Sign-up if you don't have a user.
- Edit the cloud.properties file, add your username and password combination - if you are using the online cloud - your username and project is same as the email used to register
[cloud.properites](https://github.com/ExperitestOfficial/45-min-challenge/blob/master/cloud.properties)
```sh
#Cloud properties file
url=https\://cloud.experitest.com
griduser=<youremailaddress>
gridpass=<yourpassword>
project=<youremailaddress>
```
- Run the [testng.xml](https://github.com/ExperitestOfficial/45-min-challenge/blob/master/testng.xml) suite file or gradlew test from terminal

### Tools used for the demo

| Solution | Description | Link |
| ------ | ------ | ------ |
| [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)|Java was choosen as our programming to develop our test and porject |  ![Imgur](http://i.imgur.com/isNvn7U.png?2) |
| [Github](https://github.com/ExperitestOfficial/45-min-challenge.git) |GitHub hosts our Git Source Code Management repository| ![Imgur](http://i.imgur.com/TjRhSwm.png?1) |
| [TestNG](http://testng.org/doc/) |TestNG is our Testing Framework| ![Imgur](http://i.imgur.com/QZgCSUu.jpg?1)  |
| [Gradle](https://gradle.org/) |Gradle is used as our build tool| ![Imgur](http://i.imgur.com/GpaW1Vy.png?1) |
| [Jenkins](www.jenkins.io) |Jenkins is our Continious Integration server|![Imgur](http://i.imgur.com/EwkBXwy.png?1) | 
| [Appium](www.appium.io) |Appium is our Mobile Automation Driver|![Imgur](http://i.imgur.com/Hk5S6ZV.png?1) | 
| [Eclipse](https://eclipse.org/) |Eclipse along with SeeTest plugin allows us to develop our tests|![Imgur](http://i.imgur.com/BaBqtlC.png?1) | 
### Experitest tools used for the demo

| Solution | Description | Link |
| ------ | ------ | ------ |
| [SeeTestAutomation](https://experitest.com/download/seetestautomation/)|SeeTest executes our tests cases and eases the development phase | ![Imgur](http://i.imgur.com/rdD3VxZ.png?1)|
| [SeeTestCloud](https://experitest.com/mobile-cloud-testing/seetestcloud-online/) |SeeTestCloud is our mobile lab solution,  hosts and manages our devices | ![Imgur](http://i.imgur.com/V7WwGmg.png?1) | 
| [SeeTestReporter](https://docs.experitest.com/display/SR/SeeTest+Reporter) |SeeTestReporter consolidates for us to results of tests executed in the lab | ![Imgur](http://i.imgur.com/dN5FFSp.png?1)  |



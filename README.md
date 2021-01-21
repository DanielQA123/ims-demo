
Coverage: 61.6%
## Inventory Management System (IMS)

Project Description:

The development of a functional application, that uses programming fundamentals such as Java eclipse IDE, MySQL, Git and GitHub. With existing prior knowledge of the listed programming modules, 
to develop a working application that an end user/potential client can interact with via, a Command-Line Interface to input a set of user requirements to get a specific output, related to the user stories. 
Essentially to track inventory levels for orders, customers and items. 
Also, to use unit testing and integration testing to test the code to meet the requirements. 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes of the project on the command line. 
See deployment for notes on how to deploy the project on a live system.

### Prerequisites

The following software listed are the prerequisites needed to continue work on the project, as well as YouTube tutorials: 

```
* GitHub account created.
* Git software downloaded to the local computer.
* Java with Eclipse downloaded to the local computer.
* MySQL workbench.
* MySQL GCP with a Google Cloud Platform account.

```

### Installing

This is a set of instructions, to install all the prerequisties needed to get a development environment running.  

Each step below must be followed throughly to get all the neccessary software needed to have on you local computer. 

```
*To download Git (https://git-scm.com/)
*To download MySQL workbench (https://dev.mysql.com/downloads/workbench/)
*Download GCP (https://console.cloud.google.com/home/dashboard?project=bustling-nomad-298315)
*To download Java (https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html)
*To download Eclipse for Java (https://www.eclipse.org/downloads/)
*To download Maven (https://maven.apache.org/download.cgi)

Press the link above to download the required software. For Git and Maven please download the latest version of the software. 
For Java please download, Java 14 or 14.01 not 15 because errors might develop during testing. Depending on your type of computer, 
please select the correct package (this message is for windows, mac and linux users).

```
And repeat the same process for each of the link and select the correct package

```
repeat the process until the download is finished
```

To check if git is downloaded, right click your mouse and select git bash. Then type ls to check if the git command is working. 
 

## Running the tests

Automated tests, is a testing process that is designed to be reusable after numerous attempts and to provide reliable results.
The test helps us test the working functionality of the class objects. 
 

### Unit Tests 

Unit testing, is the idea to ensure that our unit functions in isolation are meeting our expectations.
When performing certain actions of our code. We do these unit tests because the code we write might not be the code that 
we designed potentially, when working with programming languages. Testing provides quality assurance to us 
developers to highlight potential defects in our code. For this project, a JUnit test was done to test the code and to do 
this we added a Maven dependency to the pom.xml to generate the unit test. A unit test, is an approach normally used to 
target the fundamental building blocks of an application to prove the application is working. This is very useful when using an 
object-oriented language such as Java.  

```
@Test(timeout = 1000)
public void test(){

 try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

``` 
Integration Tests 

Integration testing is a testing approach that targets specific features in a code and targets the fundamental building blocks of an application. 
This is essentially the idea to prove each integration of the application is working and it's how you expected. 
To perform/run Integration test it can be done with a Java JUnit test as well

```
controller.createCustomer()

```

 

### And coding style tests

 
This was not covered!

 

```
No example
```

 

## Deployment

Need to understand the fundamentals and basics of git commands, SQL commands. The follow the Installing and the Prerequisites stages carefully. 
Needs to understand the fundamentals of JUnit and Integration testing to a certain degree.  

## Built With


* [Maven](https://maven.apache.org/) - Dependency Management

 
## Versioning

 

We use [SemVer](http://semver.org/) for versioning.

 

## Authors

 

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* **Daniel Ahuchogu** - *Additional work and Further Development on Chris Perrins initial work * - [DanielQA123](https://github.com/DanielQA123/ims-demo.git)

## License

 

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

 

*For help in [Choosing a license](https://choosealicense.com/)*

 

## Acknowledgments

* I would like to thank, Christopher Perrins for given me his IMS template.
* Inspiration: Muhammad Ali, My family and Peers.
* I would to thank Aswene and Vinesh, for giving me advice to develop this project to a good working standard. 


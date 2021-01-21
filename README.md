Coverage: 61.6%

## Inventory Management System (IMS)

Project Description:

The development of a functional application, that uses programming fundamentals such as Java eclipse IDE, MySQL, Git and GitHub. To build a working application that an end user can interact with via,
a Command-Line Interface to input a user requirements to get a specific output.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

The following software listed are the prerequisties needed to continue work on the project: 

* GitHub account created.
* Git software downloaded to the local computer.
* Java with Eclipse downloaded to the local computer.
* MySQL workbench.
* MySQL GCP with a Google Cloud Platform account.

For most of the software listed above, you can find websites and youtube tutorials to download the software to your local computer. 
Some basic knowledge of Git commands, SQL commands as well as entity relationship and Intermediate Java is needed but not compuslory.  

Things you need to install the necessary software and how to install them:

```
On your web browser, type download Git and select the page that has the latest version of Git. 
While git is downloading, creating a new GitHub account so you can you use Git to authenticate your GitHub with the software. 
So when you create a new repository by using git forking and cloning command it will be linked with Git . 
```
```
Create a new Google Cloud Platform account, click on the MySQL tab to create a local MySQL instance. 
When creating an instance you want to set the name of the instance, the region, password and the location. Once the instance is created open a terminal line, to open the database gcloud sql connect database - -user = root - -quiet. 
If an errors occurs, click the URL/web address to allow the database/API. Then your password you set for this project.  
Download MySQL workbench as well to practice with some functionalities. 
```
```
Type on your web browser, download Java eclipse 14 or 14.01. 
Once that’s downloaded, you need to integrate a Maven package as well so you can build the project as a Maven project. 
You can do this from the eclipse market place or from the web browser but get the latest version. 
```
### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Automated tests, is a testing process that is designed to be reuseable after numerous attempts and to provide reliable results.
The test helps us test the working functionality of the class objects. 

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

Unit testing, is the idea to ensure that our unit fuctions in isolation are meeting our expectations.
When performing certain actions of our code. We do these unit tests because the code we write might not be the code that 
we designed potentially, when working with programming languages. Testing provides quality assurance to us 
developers to highlight potential defects in our code. For this project, a JUnit test was done to test the code and to do 
this we added a Maven dependency to the pom.xml to generate the unit test. A unit test, is an approach normally used to 
target the fundamental building blocks of an application to prove the application is working. This is very useful when using an 
object-oriented language such as Java. 

```
An example of a Maven dependency in a pom.xml:

<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>

```
```
An example of a test case when attempting a JUnit test: 
@Test
public void test1() {
    fail("Fail");
}

@Test(timeout = 1000)
public void test2() {
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

```
### Integration Tests 
Explain what these tests test, why and how to run them

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* **Daniel Ahuchogu** - *Additional work and Further Development* - [DanielQA123](https://github.com/DanielQA123/ims-demo.git)
## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* I would like to thank, Christophor Perrins for given me his IMS template.
* Inspiration: Mumhamad Ali, My family and Peers.
* I would to thank Aswene and Vinesh, for giving me advice to develop this project to a good working standard. 


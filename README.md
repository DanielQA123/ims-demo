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

### Installing

The steps below show necessary steps of installing the needed software to get the development environment running and working. 
To start adding values in my project file.  

``````
On your web browser, type download Git and select the page that has the latest version of Git. 
While git is downloading, creating a new GitHub account so you can you use Git to authenticate your GitHub with the software. 
So when you create a new repository by using git forking and cloning command it will be linked with Git. Open git bash on your desktop, cope the https link, 
where you git forked the project. To clone the files on your local computer. 
```
```
until finished cloning git repo.
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
You can do this from the eclipse market place or from the web browser but get the latest version. This will help you when you are going to run a JUnit test after buiding the application. 
```
```
On Java eclipse, use file open to open the project file has a maven project. 
```
```
End with an example of getting some data out of the system or using it for a little demo. Once you finishing the installing method 
Add some data, using a set od user requirements from a specification given to you. For example infomation relating to a customer i.e. name, email, surname
make packages to test these data and connect it with a local MySQL instance to check if these values are present.  

## Running the tests

Automated tests, is a testing process that is designed to be reuseable after numerous attempts and to provide reliable results.
The test helps us test the working functionality of the class objects. 

## Unit Tests 

Unit testing, is the idea to ensure that our unit fuctions in isolation are meeting our expectations.
When performing certain actions of our code. We do these unit tests because the code we write might not be the code that 
we designed potentially, when working with programming languages. Testing provides quality assurance to us 
developers to highlight potential defects in our code. For this project, a JUnit test was done to test the code and to do 
this we added a Maven dependency to the pom.xml to generate the unit test. A unit test, is an approach normally used to 
target the fundamental building blocks of an application to prove the application is working. This is very useful when using an 
object-oriented language such as Java. 

## Integration Tests 

Integration testing is a testing approach that targets specific features in a code and targets the fundamental building blocks of an application. 
This is essentially the idea to prove each integration of the application is working and it's how you expected. 
To perform/run Integration test it can be done with a Java JUnit test as well. The example below shows this clearly:  
## Deployment

Need to understand the fundamentals and basics of git commands, SQL commands. The follow the Installing and the Prerequisites stages carefully. 
Needs to understand the fundamentals of JUnit and Integration testing to a certain degree. 

### Built With

* [Maven](https://maven.apache.org/) - Dependency Management

### Versioning

We use [SemVer](http://semver.org/) for versioning.

### Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* **Daniel Ahuchogu** - *Additional work and Further Development on Chris Perrins intital work * - [DanielQA123](https://github.com/DanielQA123/ims-demo.git)
## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

### Acknowledgments

* I would like to thank, Christophor Perrins for given me his IMS template.
* Inspiration: Mumhamad Ali, My family and Peers.
* I would to thank Aswene and Vinesh, for giving me advice to develop this project to a good working standard. 


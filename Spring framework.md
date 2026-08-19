





1\. What is the Spring Framework?



Spring Framework is a Java framework used to build enterprise applications.



It helps developers create applications that are:



Loosely coupled

Easy to test

Easy to maintain

Modular

Scalable

Traditional Java approach







Suppose we have two classes:



class Engine {





&#x20;   public void start() {

&#x20;       System.out.println("Engine Started");

&#x20;   }

}





class Car {





&#x20;   Engine engine = new Engine();





&#x20;   public void drive() {

&#x20;       engine.start();

&#x20;       System.out.println("Car is running");

&#x20;   }

}





Here, the Car class itself creates the Engine object.



Engine engine = new Engine();



This creates tight coupling.



If we want to change Engine to another implementation, we may need to modify the Car class.



Spring solves this problem using:



IoC – Inversion of Control

DI – Dependency Injection







2\. What is a Framework?



A framework provides a predefined structure for developing applications.



Without Spring, you manually:



Create objects.

Connect objects.

Manage object lifecycle.

Configure dependencies.







**With Spring:**



Developer

&#x20;   ↓

Defines Classes

&#x20;   ↓

Spring Container

&#x20;   ↓

Creates Objects

&#x20;   ↓

Connects Dependencies

&#x20;   ↓

Manages Object Lifecycle







3\. What is the Spring Container?



The Spring Container is the heart of the Spring Framework.



Its main responsibilities are:



Creating objects

Configuring objects

Managing objects

Injecting dependencies

Managing object lifecycle





The objects managed by the Spring Container are called:



Spring Beans



Example



class Employee {





}





Normally:



Employee emp = new Employee();



You manually create the object.





With Spring:



Spring Container

&#x20;      ↓

Creates Employee Object

&#x20;      ↓

Manages Employee Object



That object becomes a Spring Bean.





4\. What is IoC?



IoC = Inversion of Control



Normally, the programmer controls object creation.



Traditional approach



Engine engine = new Engine();







You are controlling the object creation.



Spring approach



Spring Container

&#x20;      ↓

Creates Engine Object

&#x20;      ↓

Provides it to Car









Now the control is transferred from:



Programmer

&#x20;   ↓

Spring Container



This is called Inversion of Control.







5\. What is Dependency Injection?



A dependency is an object required by another object.



For example:



class Car {





&#x20;   private Engine engine;





}



Here:



Car

&#x20;↓ depends on

Engine



Instead of creating the Engine object inside Car, Spring injects it.



class Car {





&#x20;   private Engine engine;





&#x20;   public Car(Engine engine) {

&#x20;       this.engine = engine;

&#x20;   }

}



Spring will do something conceptually like:



Engine engine = new Engine();





Car car = new Car(engine);



This is called:



Dependency Injection (DI)





6\. Types of Dependency Injection



Spring mainly supports three types.



A. Constructor Injection

@Component

class Engine {





}





@Component

class Car {





&#x20;   private final Engine engine;





&#x20;   public Car(Engine engine) {

&#x20;       this.engine = engine;

&#x20;   }

}



Spring automatically injects the Engine object into Car.



Flow

Spring Container

&#x20;     │

&#x20;     ├── Creates Engine

&#x20;     │

&#x20;     └── Creates Car

&#x20;              │

&#x20;              └── Injects Engine



Constructor injection is generally the preferred approach.







B. Setter Injection



@Component

class Car {





&#x20;   private Engine engine;





&#x20;   @Autowired

&#x20;   public void setEngine(Engine engine) {

&#x20;       this.engine = engine;

&#x20;   }

}



Spring calls the setter method and injects the dependency.





C. Field Injection



@Component

class Car {





&#x20;   @Autowired

&#x20;   private Engine engine;

}



Spring directly injects the object into the field.



For modern applications, constructor injection is generally preferred because dependencies are explicit and easier to test.





7\. What is a Spring Bean?



A Bean is simply an object managed by the Spring Container.



Example:



@Component

class Employee {





}



Spring creates:



Employee Object



and manages it.



Therefore:



Employee Object

&#x20;      +

Managed by Spring

&#x20;      =

Spring Bean





8\. Core Container Modules



The Spring Framework Core Container traditionally consists of four important modules:



Spring Core Container

│

├── Core

├── Beans

├── Context

└── SpEL

&#x20;   └── Spring Expression Language









9\. Core Module



The Core module provides the fundamental features of Spring.



The most important concepts are:



IoC

Dependency Injection

Resource management

Utility classes



The Core module is the foundation on which Spring is built.



Simple idea



Core Module

&#x20;    ↓

Provides fundamental Spring functionality

&#x20;    ↓

IoC + Dependency Injection







10\. Beans Module



The Beans module is responsible for managing Spring Beans.



It provides features related to:



Bean creation

Bean configuration

Dependency injection

Bean lifecycle







For example:



@Component

class Engine {





}



Spring identifies this class as a bean.



Then:



@Component

class Car {





&#x20;   private final Engine engine;





&#x20;   public Car(Engine engine) {

&#x20;       this.engine = engine;

&#x20;   }

}



The Beans module helps manage these relationships.



Flow



Engine Bean

&#x20;    ↓

Spring Container

&#x20;    ↓

Car Bean







11\. BeanFactory



One important interface in the Spring Core Container is:



BeanFactory



BeanFactory is a basic IoC container.



It is responsible for:



Creating Beans

&#x20;     ↓

Configuring Beans

&#x20;     ↓

Managing Beans

&#x20;     ↓

Providing Beans



Conceptually:



BeanFactory factory;



Then:



Employee emp = factory.getBean(Employee.class);





12\. ApplicationContext



ApplicationContext is a more advanced version of BeanFactory.



BeanFactory

&#x20;    ↓

Basic Bean Management





ApplicationContext

&#x20;    ↓

Advanced Bean Management

&#x20;    +

Additional Enterprise Features







ApplicationContext provides:



Bean management

Dependency injection

Event handling

Internationalization (i18n)

Resource loading

Application configuration



In modern Spring applications, we generally work with:



ApplicationContext





13\. BeanFactory vs ApplicationContext





Feature	BeanFactory	ApplicationContext



Bean Management	Yes	Yes



Dependency Injection	Yes	Yes



Internationalization	Limited/No	Yes



Event Handling	No	Yes



Resource Loading	Basic	Yes



Enterprise Features	Limited	Yes



Commonly used today	Less	Yes









Relationship:



BeanFactory

&#x20;    ↑

ApplicationContext



ApplicationContext extends BeanFactory.







14\. Context Module



The Context module provides the ApplicationContext.



It acts as an advanced container.



Example:



ApplicationContext context;



The Context module allows Spring applications to:



Access beans

Manage configuration

Handle events

Load resources



Conceptually:



Application

&#x20;    │

&#x20;    ▼

ApplicationContext

&#x20;    │

&#x20;┌───┼────┐

&#x20;▼   ▼    ▼

Bean Event Resource

Management





15\. SpEL – Spring Expression Language



SpEL stands for:



Spring Expression Language



It allows you to dynamically access and manipulate data.



For example:



@Value("#{employee.name}")

private String employeeName;



Or using properties:



@Value("${server.port}")

private int port;



SpEL can perform operations such as:



Mathematical operations

Logical operations

Property access

Method calls

Collection access

Conditional expressions



Example:



@Value("#{10 + 20}")

private int result;



Result:



30



16\. Complete Core Container Architecture



&#x20;                SPRING CORE CONTAINER

&#x20;                        │

&#x20;        ┌───────────────┼───────────────┐

&#x20;        │               │               │

&#x20;        ▼               ▼               ▼

&#x20;      CORE            BEANS          CONTEXT

&#x20;        │               │               │

&#x20;        │               │               │

&#x20;        ▼               ▼               ▼

&#x20;     IoC \& DI       BeanFactory   ApplicationContext

&#x20;                        │

&#x20;                        │

&#x20;                        ▼

&#x20;                      SpEL

&#x20;               Spring Expression Language







A more practical view:



Developer writes classes

&#x20;         │

&#x20;         ▼

&#x20;  @Component / @Bean

&#x20;         │

&#x20;         ▼

&#x20;   Spring Configuration

&#x20;         │

&#x20;         ▼

&#x20;   ApplicationContext

&#x20;         │

&#x20;         ▼

&#x20;┌──────────────────────┐

&#x20;│  Spring IoC Container │

&#x20;└──────────────────────┘

&#x20;         │

&#x20;         ▼

&#x20;    Creates Beans

&#x20;         │

&#x20;         ▼

&#x20;  Injects Dependencies

&#x20;         │

&#x20;         ▼

&#x20; Manages Bean Lifecycle







17\. First Simple Spring Example



Consider two classes:



Engine.java

package com.example;





import org.springframework.stereotype.Component;





@Component

public class Engine {





&#x20;   public void start() {

&#x20;       System.out.println("Engine Started");

&#x20;   }

}





Car.java



package com.example;





import org.springframework.stereotype.Component;





@Component

public class Car {





&#x20;   private final Engine engine;





&#x20;   public Car(Engine engine) {

&#x20;       this.engine = engine;

&#x20;   }





&#x20;   public void drive() {





&#x20;       engine.start();





&#x20;       System.out.println("Car is Running");

&#x20;   }

}





Main Application



package com.example;





import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;





public class Main {





&#x20;   public static void main(String\[] args) {





&#x20;       ApplicationContext context =

&#x20;               new AnnotationConfigApplicationContext("com.example");





&#x20;       Car car = context.getBean(Car.class);





&#x20;       car.drive();

&#x20;   }

}



Output



Engine Started

Car is Running







18\. What Happens Internally?



When this code executes:



ApplicationContext context =

&#x20;       new AnnotationConfigApplicationContext("com.example");



Spring performs the following steps.



Step 1: Scan the package

com.example



Spring searches for:



@Component



Step 2: Finds Engine



@Component

public class Engine



Spring creates an object.



Engine Bean Created





Step 3: Finds Car



@Component

public class Car



Spring sees:



public Car(Engine engine)



Spring understands:



Car requires Engine





Step 4: Dependency Injection



Spring injects:



Engine Bean

&#x20;    ↓

Car Bean





Step 5: Beans are stored in the Container



ApplicationContext

&#x20;      │

&#x20;      ├── Engine Bean

&#x20;      │

&#x20;      └── Car Bean





Step 6: Get the Bean



Car car = context.getBean(Car.class);



Then:



car.drive();





19\. Different Ways to Create Spring Beans



There are three common configuration approaches.



1\. XML Configuration



Old approach:



<bean id="engine"

&#x20;     class="com.example.Engine"/>





<bean id="car"

&#x20;     class="com.example.Car"/>





2\. Java Configuration



@Configuration

public class AppConfig {





&#x20;   @Bean

&#x20;   public Engine engine() {





&#x20;       return new Engine();

&#x20;   }





&#x20;   @Bean

&#x20;   public Car car() {





&#x20;       return new Car(engine());

&#x20;   }

}





3\. Annotation Configuration



Most commonly used with modern Spring applications:



@Component

public class Engine {





}

@Component

public class Car {





}



Common stereotype annotations include:



@Component

@Service

@Repository

@Controller

@RestController







20\. Important Annotations



@Component



Marks a general Spring-managed component.



@Component

public class EmployeeService {





}





@Service



Used mainly for the service/business layer.



@Service

public class EmployeeService {





}







@Repository



Used mainly for the persistence/data access layer.



@Repository

public class EmployeeRepository {





}





@Controller



Used for web applications.



@Controller

public class EmployeeController {





}





@RestController



Used to create REST APIs.



@RestController

public class EmployeeRestController {





}





21\. @Configuration and @Bean



Instead of:



@Component



we can explicitly define beans using Java configuration.



@Configuration

public class AppConfig {





&#x20;   @Bean

&#x20;   public Engine engine() {

&#x20;       return new Engine();

&#x20;   }





&#x20;   @Bean

&#x20;   public Car car() {

&#x20;       return new Car(engine());

&#x20;   }

}



Then:



ApplicationContext context =

&#x20;       new AnnotationConfigApplicationContext(AppConfig.class);



Get the bean:



Car car = context.getBean(Car.class);





car.drive();





22\. Bean Lifecycle – Basic Idea



A Spring Bean goes through a lifecycle.



1\. Bean Definition

&#x20;      ↓

2\. Bean Creation

&#x20;      ↓

3\. Dependency Injection

&#x20;      ↓

4\. Initialization

&#x20;      ↓

5\. Bean Ready for Use

&#x20;      ↓

6\. Application Stops

&#x20;      ↓

7\. Bean Destruction



Example:



@Component

public class DatabaseConnection {





&#x20;   @PostConstruct

&#x20;   public void init() {





&#x20;       System.out.println("Database Connection Initialized");

&#x20;   }





&#x20;   @PreDestroy

&#x20;   public void destroy() {





&#x20;       System.out.println("Database Connection Closed");

&#x20;   }

}





23\. Important Concept: Loose Coupling



Consider this:



public class Car {





&#x20;   private Engine engine;





&#x20;   public Car(Engine engine) {

&#x20;       this.engine = engine;

&#x20;   }

}



Now suppose we have different engines:



interface Engine {





&#x20;   void start();

}





@Component



class PetrolEngine implements Engine {





&#x20;   public void start() {

&#x20;       System.out.println("Petrol Engine Started");

&#x20;   }

}







@Component

class ElectricEngine implements Engine {





&#x20;   public void start() {

&#x20;       System.out.println("Electric Engine Started");

&#x20;   }

}





The Car depends on the interface:



public class Car {





&#x20;   private Engine engine;





&#x20;   public Car(Engine engine) {

&#x20;       this.engine = engine;

&#x20;   }

}







This is loose coupling.



&#x20;         Engine

&#x20;            ▲

&#x20;     ┌──────┴──────┐

&#x20;     │             │

PetrolEngine   ElectricEngine

&#x20;     │             │

&#x20;     └──────┬──────┘

&#x20;            ▼

&#x20;           Car



Spring helps manage these dependencies.



24\. Complete Conceptual Flow





&#x20;                JAVA CLASSES

&#x20;                     │

&#x20;                     ▼

&#x20;           @Component / @Bean

&#x20;                     │

&#x20;                     ▼

&#x20;             SPRING CONTAINER

&#x20;                     │

&#x20;       ┌─────────────┼─────────────┐

&#x20;       ▼             ▼             ▼

&#x20;   Creates        Configures    Manages

&#x20;    Beans          Beans         Beans

&#x20;       │

&#x20;       ▼

&#x20; Dependency Injection

&#x20;       │

&#x20;       ▼

&#x20;  ApplicationContext

&#x20;       │

&#x20;       ▼

&#x20;  Application Uses Beans





25\. Core Container Summary



Module		Purpose

===============================================



Core		Provides fundamental IoC and DI functionality



Beans		Creates and manages Spring Beans



Context		Provides ApplicationContext and additional enterprise features



SpEL		Provides Spring Expression Language





26\. Easy Way to Remember



Think of a company:



Employees = Java Objects

HR Department = Spring Container

Employee Management = Bean Management

Assigning Employees to Teams = Dependency Injection

Company Rules = Configuration



So:



Java Object

&#x20;   ↓ managed by Spring

Spring Bean





Object Dependency

&#x20;   ↓ provided by Spring

Dependency Injection





Object Creation Control

&#x20;   ↓ transferred to Spring

Inversion of Control

Final Learning Order



I recommend learning Spring in this sequence:



1\. What is Spring Framework?

&#x20;         ↓

2\. What is IoC?

&#x20;         ↓

3\. What is Dependency Injection?

&#x20;         ↓

4\. Types of DI

&#x20;         ↓

5\. What is a Spring Bean?

&#x20;         ↓

6\. BeanFactory

&#x20;         ↓

7\. ApplicationContext

&#x20;         ↓

8\. Core Container Modules

&#x20;  ├── Core

&#x20;  ├── Beans

&#x20;  ├── Context

&#x20;  └── SpEL

&#x20;         ↓

9\. Spring Configuration

&#x20;  ├── XML

&#x20;  ├── Java Configuration

&#x20;  └── Annotations

&#x20;         ↓

10\. Bean Lifecycle

&#x20;         ↓



11\. Spring Boot





The most important foundation to understand before moving to Spring Boot is:



IoC + Dependency Injection + Spring Beans + ApplicationContext



Once these concepts are clear, topics such as Spring MVC, Spring Boot, Spring Data JPA, Spring Security, and Microservices become much easier to understand.



what is @componet in spring



You mean @Component in Spring.



What is @Component?



@Component is a Spring annotation used to tell the Spring Framework:



"This class should be managed by the Spring Container."



When Spring finds a class annotated with @Component, it creates an object of that class and manages it as a Spring Bean.





1\. Without @Component



public class Employee {





}



If you want to create an object:



Employee emp = new Employee();



Here, you are creating the object manually.





2\. With @Component



import org.springframework.stereotype.Component;





@Component

public class Employee {





}



Now Spring will automatically create the object.



Employee Class

&#x20;     ↓

@Component

&#x20;     ↓

Spring detects the class

&#x20;     ↓

Creates Employee object

&#x20;     ↓

Manages it as a Spring Bean



So you usually don't need to write:



Employee emp = new Employee();



Instead, you can get the object from the Spring Container.





3\. Simple Example



Engine.java



import org.springframework.stereotype.Component;





@Component

public class Engine {





&#x20;   public void start() {

&#x20;       System.out.println("Engine Started");

&#x20;   }

}





Here:



@Component



tells Spring:



Create an Engine object and manage it.



Car.java



import org.springframework.stereotype.Component;





@Component

public class Car {





&#x20;   private final Engine engine;





&#x20;   public Car(Engine engine) {

&#x20;       this.engine = engine;

&#x20;   }





&#x20;   public void drive() {

&#x20;       engine.start();

&#x20;       System.out.println("Car is running");

&#x20;   }

}



Spring performs these steps:



Step 1: Finds @Component on Engine

&#x20;            ↓

Step 2: Creates Engine Bean

&#x20;            ↓

Step 3: Finds @Component on Car

&#x20;            ↓

Step 4: Creates Car Bean

&#x20;            ↓

Step 5: Car requires Engine

&#x20;            ↓

Step 6: Spring injects Engine into Car



This is called Dependency Injection.



4\. How does Spring find @Component classes?



Spring uses Component Scanning.



Example:



@Configuration

@ComponentScan("com.example")

public class AppConfig {





}



Spring scans the package:



com.example



It looks for classes containing:



@Component



For example:



com.example

&#x20;   │

&#x20;   ├── Employee.java     → @Component

&#x20;   │

&#x20;   ├── Engine.java       → @Component

&#x20;   │

&#x20;   └── Car.java          → @Component



Spring automatically registers them as beans.



5\. @Component = Generic Spring Bean



Think of this:



Java Class

&#x20;   +

@Component

&#x20;   ↓

Spring Managed Object

&#x20;   ↓

Spring Bean



Example:



@Component

public class StudentService {





}



Spring internally manages an object similar to:



StudentService studentService = new StudentService();



But Spring creates and manages it, not your application code.



6\. What is the Default Bean Name?



Example:



@Component

public class EmployeeService {





}



By default, the bean name will be:



employeeService



The first letter becomes lowercase.



You can also provide your own name:



@Component("empService")

public class EmployeeService {





}



Now the bean name is:



empService



7\. @Component vs @Bean



These two are commonly confused.



@Component



Used directly on a class:



@Component

public class Engine {





}



Spring discovers it using component scanning.



@Bean



Used on a method:



@Configuration

public class AppConfig {





&#x20;   @Bean

&#x20;   public Engine engine() {

&#x20;       return new Engine();

&#x20;   }

}



Here, Spring executes the method and registers its returned object as a bean.



Easy comparison



@Component		@Bean



Applied to a class	Applied to a method



Uses component scanning	Uses explicit configuration



Spring creates the object	Developer defines how to create the object



Good for your own application classes	Useful for third-party or custom object creation





8\. Related Annotations



Spring provides specialized versions of @Component:



@Component

&#x20;   │

&#x20;   ├── @Service

&#x20;   ├── @Repository

&#x20;   └── @Controller



For example:



Service Layer



@Service

public class EmployeeService {





}



Repository Layer



@Repository

public class EmployeeRepository {





}



Controller Layer



@Controller

public class EmployeeController {





}



These are also treated as Spring-managed components.



Simple Definition to Remember



@Component tells Spring that this class is a Spring-managed component. During component scanning, Spring creates an object of this class and registers it as a Spring Bean.



Visual flow



@Component

&#x20;     ↓

Component Scanning

&#x20;     ↓

Spring detects the class

&#x20;     ↓

Creates Object

&#x20;     ↓

Registers as Bean

&#x20;     ↓

Manages its lifecycle

&#x20;     ↓

Can inject it into other components











What is AOP in Spring?



AOP stands for:



Aspect-Oriented Programming



AOP is used to separate common functionality that is required across multiple parts of an application.



For example:



Logging

Security

Transaction management

Performance monitoring

Exception handling

Auditing



Instead of writing the same code in every method, AOP allows us to write that functionality once and apply it wherever needed.



1\. The Problem Without AOP



Suppose we have a service:



@Service

public class EmployeeService {





&#x20;   public void addEmployee() {





&#x20;       System.out.println("Logging: addEmployee started");





&#x20;       // Business Logic

&#x20;       System.out.println("Employee Added");





&#x20;       System.out.println("Logging: addEmployee completed");

&#x20;   }





&#x20;   public void deleteEmployee() {





&#x20;       System.out.println("Logging: deleteEmployee started");





&#x20;       // Business Logic

&#x20;       System.out.println("Employee Deleted");





&#x20;       System.out.println("Logging: deleteEmployee completed");

&#x20;   }

}



Notice that logging code is repeated:



Logging

&#x20;  ↓

Business Logic

&#x20;  ↓

Logging



This repeated functionality is called a cross-cutting concern.



2\. Solution Using AOP



With AOP, we separate the logging logic:



&#x20;                Application

&#x20;                     │

&#x20;       ┌─────────────┼─────────────┐

&#x20;       │                           │

&#x20;       ▼                           ▼

&#x20;Business Logic              Cross-Cutting Logic

&#x20;       │                           │

&#x20;       │                    Logging

&#x20;       │                    Security

&#x20;       │                    Transactions

&#x20;       │                    Monitoring

&#x20;       │

&#x20;       ▼

&#x20;EmployeeService



Now your business class focuses only on business logic:



@Service

public class EmployeeService {





&#x20;   public void addEmployee() {

&#x20;       System.out.println("Employee Added");

&#x20;   }





&#x20;   public void deleteEmployee() {

&#x20;       System.out.println("Employee Deleted");

&#x20;   }

}



The logging can be handled separately using AOP.



3\. Real-Life Example



Imagine you have a company with 100 employees.



Before entering the office:



Employee

&#x20;  ↓

Security Check

&#x20;  ↓

Office Work



Security checking is not part of the employee's actual job, but it applies to everyone.



Similarly, in an application:



Method Call

&#x20;   ↓

Logging / Security / Transaction

&#x20;   ↓

Actual Business Method



AOP allows us to add this common functionality around the business methods.



4\. Important AOP Terminology



There are several important terms:



AOP

&#x20;│

&#x20;├── Aspect

&#x20;├── Advice

&#x20;├── Join Point

&#x20;├── Pointcut

&#x20;├── Target Object

&#x20;└── Proxy



Let's understand them one by one.



5\. Aspect



An Aspect is a class that contains cross-cutting functionality.



For example:



@Aspect

@Component

public class LoggingAspect {





}



This class can contain logging logic.



Example

LoggingAspect

&#x20;      │

&#x20;      ├── Logging

&#x20;      ├── Monitoring

&#x20;      └── Security



6\. Join Point



A Join Point is a point during program execution where an Aspect can be applied.



In Spring AOP, this is typically a method execution.



Example:



public void addEmployee() {

}



The execution of:



addEmployee()



can be a Join Point.



Similarly:



public void deleteEmployee() {

}



also provides a method execution where AOP advice can run.





7\. Advice



Advice is the actual action that the Aspect performs.



For example:



Logging before method



or:



Logging after method



Spring provides different types of advice.



A. @Before



Runs before the target method.



AOP Logic

&#x20;  ↓

Target Method



Example:



@Before("execution(\* com.example.service.\*.\*(..))")

public void logBefore() {





&#x20;   System.out.println("Method started");

}





B. @After



Runs after the method finishes, regardless of whether it succeeds or throws an exception.



Target Method

&#x20;  ↓

AOP Logic



Example:



@After("execution(\* com.example.service.\*.\*(..))")

public void logAfter() {





&#x20;   System.out.println("Method completed");

}

C. @AfterReturning



Runs only when the method completes successfully.



Target Method

&#x20;     ↓

Success

&#x20;     ↓

AOP Logic



Example:



@AfterReturning(

&#x20;   pointcut = "execution(\* com.example.service.\*.\*(..))",

&#x20;   returning = "result"

)

public void logResult(Object result) {





&#x20;   System.out.println("Result: " + result);

}





D. @AfterThrowing



Runs when the method throws an exception.



Target Method

&#x20;     ↓

Exception

&#x20;     ↓

AOP Logic







Example:



@AfterThrowing(

&#x20;   pointcut = "execution(\* com.example.service.\*.\*(..))",

&#x20;   throwing = "ex"

)

public void logException(Exception ex) {





&#x20;   System.out.println("Exception: " + ex.getMessage());

}





E. @Around



@Around is the most powerful advice.



It can execute code:



Before the method

Call the method

After the method

Before Logic

&#x20;    ↓

Target Method

&#x20;    ↓

After Logic



Example:



@Around("execution(\* com.example.service.\*.\*(..))")

public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {





&#x20;   System.out.println("Before method");





&#x20;   Object result = joinPoint.proceed();





&#x20;   System.out.println("After method");





&#x20;   return result;

}





8\. Pointcut



A Pointcut defines:



Where should the Advice be applied?



Example:



execution(\* com.example.service.\*.\*(..))



This means approximately:



All methods

&#x20;    ↓

Inside

&#x20;    ↓

com.example.service package







Breaking it down:



execution(

&#x20;   \*                         → Any return type

&#x20;   com.example.service.\*     → Any class

&#x20;   .\*                        → Any method

&#x20;   (..)                      → Any number of arguments

)





9\. Target Object



The Target Object is the actual object whose method is being executed.



Example:



@Service

public class EmployeeService {





&#x20;   public void addEmployee() {

&#x20;       System.out.println("Adding Employee");

&#x20;   }

}



Here:



EmployeeService



is the Target Object.



10\. Proxy



Spring usually uses a Proxy Object to apply AOP behavior.



Instead of directly calling:



EmployeeService



Spring may conceptually create a proxy around it:



Client

&#x20;  ↓

Spring AOP Proxy

&#x20;  ↓

EmployeeService



The proxy performs:



Logging

Security

Transaction



and then calls the actual method.



11\. Complete AOP Flow



Suppose we call:



employeeService.addEmployee();



The flow is:



Client

&#x20;  │

&#x20;  ▼

Spring Proxy

&#x20;  │

&#x20;  ▼

@Before Advice

&#x20;  │

&#x20;  ▼

addEmployee()

&#x20;  │

&#x20;  ▼

@AfterReturning Advice

&#x20;  │

&#x20;  ▼

@After Advice



If an exception occurs:



Client

&#x20;  ↓

Spring Proxy

&#x20;  ↓

@Before

&#x20;  ↓

Target Method

&#x20;  ↓

Exception

&#x20;  ↓

@AfterThrowing

&#x20;  ↓

@After





12\. Complete Spring AOP Example



Step 1: Service Class

package com.example.service;





import org.springframework.stereotype.Service;





@Service

public class EmployeeService {





&#x20;   public void addEmployee() {





&#x20;       System.out.println("Employee Added");

&#x20;   }





&#x20;   public void deleteEmployee() {





&#x20;       System.out.println("Employee Deleted");

&#x20;   }

}





Step 2: Create Aspect

package com.example.aspect;





import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;





@Aspect

@Component

public class LoggingAspect {





&#x20;   @Before("execution(\* com.example.service.\*.\*(..))")

&#x20;   public void logBefore() {





&#x20;       System.out.println("Logging: Method execution started");

&#x20;   }

}





Step 3: Run the Method



employeeService.addEmployee();





Output

Logging: Method execution started

Employee Added



The logging method runs automatically before:



addEmployee()







13\. Easy Diagram

&#x20;               @Aspect

&#x20;                  │

&#x20;                  ▼

&#x20;            LoggingAspect

&#x20;                  │

&#x20;                  │

&#x20;       Pointcut selects methods

&#x20;                  │

&#x20;                  ▼

&#x20;       ┌─────────────────────┐

&#x20;       │ EmployeeService     │

&#x20;       │                     │

&#x20;       │ addEmployee()       │

&#x20;       │ deleteEmployee()    │

&#x20;       └─────────────────────┘

&#x20;                  │

&#x20;                  ▼

&#x20;            Advice Executes





14\. Practical Uses of AOP in Spring



AOP is commonly used for:



Logging

Method started

Method completed

Security

User Request

&#x20;    ↓

Check Authorization

&#x20;    ↓

Allow / Deny



Transactions





For example:



@Transactional

public void transferMoney() {





&#x20;   withdrawMoney();





&#x20;   depositMoney();

}



If something fails:



Transaction

&#x20;   ↓

Error

&#x20;   ↓

Rollback



Spring internally uses AOP concepts for many features, including transaction management.



Performance Monitoring

Start Time

&#x20;   ↓

Execute Method

&#x20;   ↓

End Time

&#x20;   ↓

Calculate Execution Time



Auditing

Who performed the operation?

When was it performed?

What operation was performed?







15\. Quick Summary



AOP = Aspect-Oriented Programming





Used to separate:

&#x20;   ↓

Cross-Cutting Concerns





Examples:

&#x20;   ├── Logging

&#x20;   ├── Security

&#x20;   ├── Transactions

&#x20;   ├── Monitoring

&#x20;   └── Exception Handling





Important terms



Term	Meaning



Aspect	Class containing cross-cutting logic



Advice	Action performed by an Aspect



Join Point	Point where advice can be applied; in Spring AOP, typically a method execution



Pointcut	Expression that selects join points



Target	Actual object being advised



Proxy	Object Spring uses to apply AOP behavior










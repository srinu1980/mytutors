

1\. What is Maven?



Maven is a build automation and project management tool used primarily for Java projects. It simplifies project builds, dependency management, testing, packaging, and deployment.





Key Features:



Dependency Management



Build Automation



Standard Project Structure



Plugin Support



Multi-Module Projects





Example:



Instead of manually downloading JAR files, Maven automatically downloads dependencies from repositories.



<dependency>

&#x20;   <groupId>org.springframework.boot</groupId>

&#x20;   <artifactId>spring-boot-starter-web</artifactId>

</dependency>







2\. Maven Build Life Cycle Stages



A Maven Build Lifecycle consists of a sequence of phases.



Important Phases:





Phase			Description

\-------------------------------------------------------------

validate		Validates project structure

compile			Compiles source code

test			Executes unit tests

package			Creates JAR/WAR

verify			Runs quality checks

install			Installs artifact into local repository

deploy			Deploys artifact to remote repository







Command:

\---------------

mvn clean install







Build Flow:

\--------------



validate

&#x20;  ↓

compile

&#x20;  ↓

test

&#x20;  ↓

package

&#x20;  ↓

verify

&#x20;  ↓

install

&#x20;  ↓

deploy







3\. What is the use of pom.xml?







POM stands for Project Object Model.



pom.xml is the heart of a Maven project and contains:





* Project Information
* 
* Dependencies
* 
* Plugins
* 
* Build Configuration
* 
* Profiles
* 
* Repositories





Example:

=========

<project>

&#x20;   <groupId>com.company</groupId>

&#x20;   <artifactId>employee-service</artifactId>

&#x20;   <version>1.0</version>



&#x20;   <dependencies>

&#x20;       <dependency>

&#x20;           <groupId>org.springframework.boot</groupId>

&#x20;           <artifactId>spring-boot-starter-web</artifactId>

&#x20;       </dependency>

&#x20;   </dependencies>

</project>







4\. What is Spring Framework?





Spring is a lightweight, open-source Java framework used for developing enterprise applications.





It provides:



* Dependency Injection
* 
* Aspect Oriented Programming
* 
* Transaction Management
* 
* Security
* 
* Web Development Support





5\. What are the Features of Spring Framework?



Core Features:

1\. IoC Container

Manages object creation and dependencies.



2\. Dependency Injection

Reduces tight coupling.



3\. Aspect-Oriented Programming (AOP)

Handles logging, security, auditing.



4\. Transaction Management

Database transaction support.



5\. Spring MVC

Web application development.



6\. Security

Authentication and Authorization.



7\. Integration Support

JPA, Hibernate, JMS, REST APIs.



8\. Testing Support

JUnit and Mockito integration.







6\. What is Inversion of Control (IoC)?



IoC is a principle where Spring Framework creates and manages objects instead of the developer creating them manually.



Without IoC



EmployeeService service = new EmployeeService();





With IoC

@Autowired

private EmployeeService service;



Spring creates the object and injects it automatically.





Benefits:



Loose Coupling



Better Maintainability



Easier Testing







7\. What are the ways to configure IoC?



There are three ways:



1\. XML Configuration

<bean id="employeeService"

&#x20;     class="com.demo.EmployeeService"/>





2\. Annotation Configuration

@Service

public class EmployeeService {

}





3\. Java-Based Configuration





@Configuration

public class AppConfig {



&#x20;   @Bean

&#x20;   public EmployeeService employeeService() {

&#x20;       return new EmployeeService();

&#x20;   }

}









8\. What are the types of Dependency Injection in Spring?



There are mainly two types:



1\. Constructor Injection (Recommended)



@Service

public class EmployeeService {



&#x20;   private EmployeeRepository repository;



&#x20;   public EmployeeService(EmployeeRepository repository) {

&#x20;       this.repository = repository;

&#x20;   }

}





Advantages:



Mandatory Dependencies



Immutable Objects



Easy Unit Testing





2\. Setter Injection











9\. What are the different Spring Bean Scopes?





1\. Singleton (Default)



One object for entire application.



2\. Prototype

Creates new object every request.



4\. Session

5\. Application







10\. What are the advantages of Spring Boot?



1\. Auto Configuration

Automatically configures beans.



2\. Embedded Servers

Tomcat, Jetty, Undertow.



3\. Starter Dependencies

Simplifies dependency management.



4\. Production Ready

Actuator support.



5\. Minimal Configuration

No XML required.



6\. Faster Development

Less boilerplate code.





11\. Explain Bean Life Cycle



Steps:

1\. Bean Instantiation

new EmployeeService();

↓



2\. Dependency Injection

Spring injects dependencies.



↓



3\. Bean Initialization

@PostConstruct

public void init() {

&#x20;  System.out.println("Bean Initialized");

}

↓



4\. Bean Ready to Use

Business methods execute.



↓



5\. Bean Destruction

@PreDestroy

public void destroy() {

&#x20;  System.out.println("Bean Destroyed");

}







12\. How to Handle Global Exception Handler?



Using @RestControllerAdvice.





Custom Exception



public class EmployeeNotFoundException

&#x20;       extends RuntimeException {



&#x20;   public EmployeeNotFoundException(String msg) {

&#x20;       super(msg);

&#x20;   }

}







Benefits:



Centralized Exception Handling



Cleaner Controllers



Consistent Error Responses







13\. What is AOP? Advice Types and Pointcuts



What is AOP?



AOP stands for Aspect-Oriented Programming.



It separates cross-cutting concerns such as:



Logging



Security



Auditing



Transaction Management







14\. What is Spring Boot Starter?



Spring Boot Starter is a pre-configured dependency package that bundles all required libraries for a particular functionality.







"Spring Boot Starters are dependency descriptors that simplify Maven/Gradle configuration by providing a ready-made set of libraries for specific functionalities."





16\. Explain Spring MVC Architecture



Spring MVC (Model-View-Controller) is a design pattern used for developing web applications by separating business logic, presentation, and request handling.





Components



1\. Model

Contains application data and business logic.



public class Employee {

&#x20;   private Long id;

&#x20;   private String name;

}



2\. View

Displays data to the user.







3\. Controller

Handles client requests and returns responses.



@Controller

public class EmployeeController {



&#x20;   @GetMapping("/employees")

&#x20;   public String getEmployees() {

&#x20;       return "employees";

&#x20;   }

}





Request Flow



Client Request

&#x20;     ↓

DispatcherServlet

&#x20;     ↓

Controller

&#x20;     ↓

Service Layer

&#x20;     ↓

Repository Layer

&#x20;     ↓

Database

&#x20;     ↓

Controller

&#x20;     ↓

View/JSON Response

&#x20;     ↓

Client





Interview One-Liner



"Spring MVC follows the Model-View-Controller pattern where DispatcherServlet acts as the front controller to process all incoming requests."



17\. What is DispatcherServlet?



DispatcherServlet is the Front Controller of Spring MVC.



It receives all incoming requests and dispatches them to the appropriate controller.





Responsibilities



Receives HTTP requests



Identifies controller methods



Invokes controller methods



Processes responses



Returns View or JSON response



Flow

Client

&#x20; ↓

DispatcherServlet

&#x20; ↓

Controller

&#x20; ↓

Service

&#x20; ↓

Repository

&#x20; ↓

Database







"DispatcherServlet is the central component of Spring MVC that handles all incoming requests and routes them to the appropriate controller."



18\. Difference between @Controller and @RestController





Feature		@Controller		@RestController



Used For	MVC Applications	REST APIs



Return Type	View Name		JSON/XML Response



Requires	 @ResponseBody	Yes	No



Response	JSP/HTML/Thymeleaf	JSON





@Controller Example



@Controller

public class HomeController {



&#x20;   @GetMapping("/home")

&#x20;   public String home() {

&#x20;       return "home";

&#x20;   }

}





"@RestController is a combination of @Controller and @ResponseBody, used for building RESTful APIs."



19\. What is @RequestMapping vs @GetMapping?





@RequestMapping



Can handle all HTTP methods.



@RequestMapping("/employees")

public String getEmployees() {

&#x20;   return "employees";

}









@GetMapping("/employees")



public List<Employee> getEmployees() {

&#x20;   return employeeService.getAll();

}







"@GetMapping is a specialized shortcut annotation for GET requests, whereas @RequestMapping can handle any HTTP method."









20\. What are Spring Data JPA Repositories?



Spring Data JPA repositories provide built-in CRUD operations without writing SQL queries.





Methods:



save()

findById()

findAll()

deleteById()





"JpaRepository is the most commonly used repository because it provides CRUD, pagination, and sorting features."



21\. How does Spring Data JPA create queries automatically?



Spring Data JPA uses Method Naming Conventions to generate SQL queries automatically.



Example Entity



"Spring Data JPA parses repository method names and automatically generates SQL queries at runtime."





22\. How to Define Custom Query Methods (JPQL)?



JPQL (Java Persistence Query Language) is used to write custom queries based on entity objects instead of table names.





"JPQL queries are written using entity names and field names instead of database table names."





23\. What is the Difference Between Authentication and Authorization?









"Authentication identifies the user, while Authorization determines what resources the authenticated user can access."





24\. How to Secure REST APIs in Spring Boot?



Spring Boot REST APIs can be secured using Spring Security and JWT Authentication.







"REST APIs in Spring Boot are commonly secured using Spring Security and JWT, where JWT tokens are used for stateless authentication and role-based authorization."





EXplain jwt flow in spring boot



JWT Flow in Spring Boot



What is JWT?



JWT (JSON Web Token) is a secure token used for authentication and authorization in Spring Boot applications.



A JWT contains user information and is digitally signed, allowing the server to verify its authenticity without storing session data.





















JWT Structure



A JWT consists of three parts:



Header.Payload.Signature





Header



Contains token type and signing algorithm.



{

&#x20; "alg": "HS256",

&#x20; "typ": "JWT"

}





Payload



Contains user information (claims).



{

&#x20; "sub": "admin",

&#x20; "role": "ADMIN"

}





Signature

Generated using a secret key to prevent tampering.





JWT Authentication Flow

+--------+                    +-------------+

| Client |                    | Spring Boot |

+--------+                    +-------------+

&#x20;    |                               |

&#x20;    | Login Request                 |

&#x20;    | username/password             |

&#x20;    |------------------------------>|

&#x20;    |                               |

&#x20;    | Validate Credentials          |

&#x20;    |                               |

&#x20;    | Generate JWT Token            |

&#x20;    |<------------------------------|

&#x20;    |                               |

&#x20;    | Store Token                   |

&#x20;    |                               |

&#x20;    | Request Protected API         |

&#x20;    | Authorization: Bearer Token   |

&#x20;    |------------------------------>|

&#x20;    |                               |

&#x20;    | JWT Filter Validates Token    |

&#x20;    |                               |

&#x20;    | Extract Username \& Roles      |

&#x20;    |                               |

&#x20;    | Set Authentication Context    |

&#x20;    |                               |

&#x20;    | Access Resource               |

&#x20;    |<------------------------------|







Step-by-Step JWT Flow









Step 1: User Login



Client sends credentials:



POST /auth/login







Request Body:



{

&#x20; "username":"admin",

&#x20; "password":"admin123"

}





Step 2: Authentication



Spring Security uses:



AuthenticationManager

to validate username and password.



authenticationManager.authenticate(

&#x20;   new UsernamePasswordAuthenticationToken(

&#x20;       username,

&#x20;       password

&#x20;   )

);

If credentials are invalid:



401 Unauthorized

Step 3: Generate JWT Token

After successful authentication:



String token =

&#x20;     jwtService.generateToken(userDetails);

Example JWT:



eyJhbGciOiJIUzI1NiJ9...

Response:



{

&#x20;  "token":"eyJhbGciOiJIUzI1NiJ9..."

}

Step 4: Client Stores Token

The frontend stores JWT:



Local Storage



Session Storage



Secure Cookie



Example:



localStorage.setItem("token", jwtToken);

Step 5: Access Protected APIs

Client sends token in every request.



GET /employees

Header:



Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...

Step 6: JWT Filter Executes

A custom filter extending:



OncePerRequestFilter

runs before controller execution.



@Component

public class JwtAuthenticationFilter

&#x20;       extends OncePerRequestFilter {

}

Responsibilities:



Read Authorization header



Extract JWT



Validate token



Extract username



Load user details



Set Authentication



Step 7: Validate JWT

jwtService.validateToken(

&#x20;       token,

&#x20;       userDetails

);

Validation checks:



Signature



Expiration Time



Username



Token Integrity



Why JWT is Preferred?

Stateless

No session stored on server.



Scalable

Works well in microservices.



Secure

Digitally signed.



Faster

No database lookup for every request.



Cross Platform

Can be used by:



React



Angular



Mobile Apps



Microservices



Interview Answer (2-Minute Version)

"JWT (JSON Web Token) is used for stateless authentication in Spring Boot. When a user logs in, Spring Security validates the credentials using AuthenticationManager. If authentication is successful, a JWT token is generated and returned to the client. The client sends this token in the Authorization header for subsequent requests. A custom JwtAuthenticationFilter intercepts each request, validates the token, extracts user details and roles, and stores authentication information in the SecurityContext. Spring Security then performs authorization based on roles and permissions. Since JWT is stateless, the server does not maintain session data, making it suitable for REST APIs and microservices."





Explain CascadeType methods in spring boot relational mappings



Cascade Types in Spring Boot (JPA/Hibernate)

What is Cascade Type?

Cascade Type is used to automatically propagate operations performed on a parent entity to its child entities.



Without cascade, you need to save/delete parent and child entities separately.



With cascade, operations on the parent are automatically applied to the child.



Real-Time Example

Consider:



Department

&#x20;  |

&#x20;  | One-To-Many

&#x20;  |

Employees

If a Department is saved, updated, or deleted, we may want the same operation to happen automatically on all Employees.



This is achieved using Cascade Types.



@OneToMany(mappedBy = "department",

&#x20;          cascade = CascadeType.ALL)

private List<Employee> employees;

Types of Cascade Operations

1\. CascadeType.PERSIST

Purpose

When the parent entity is saved, child entities are also saved automatically.



Example

@OneToMany(cascade = CascadeType.PERSIST)

private List<Employee> employees;

Code

Department dept = new Department();

dept.setName("IT");



Employee emp = new Employee();

emp.setName("John");



dept.setEmployees(List.of(emp));



departmentRepository.save(dept);

Result

Department Saved

Employee Saved Automatically

2\. CascadeType.MERGE

Purpose

When the parent entity is updated, child entities are also updated.



Example

@OneToMany(cascade = CascadeType.MERGE)

private List<Employee> employees;

Code

department.setName("Software Development");



employee.setName("David");



departmentRepository.save(department);

Result

Department Updated

Employee Updated Automatically

3\. CascadeType.REMOVE

Purpose

When the parent entity is deleted, child entities are also deleted.



Example

@OneToMany(cascade = CascadeType.REMOVE)

private List<Employee> employees;

Code

departmentRepository.deleteById(1L);

Result

Department Deleted

All Employees Deleted

SQL Generated

DELETE FROM employee

WHERE department\_id = 1;



DELETE FROM department

WHERE id = 1;

4\. CascadeType.REFRESH

Purpose

Reloads the parent and child entities from the database.



Example

@OneToMany(cascade = CascadeType.REFRESH)

private List<Employee> employees;

Code

entityManager.refresh(department);

Result

Department Reloaded

Employees Reloaded

Latest database values are fetched.



5\. CascadeType.DETACH

Purpose

Removes parent and child entities from the persistence context.



Example

@OneToMany(cascade = CascadeType.DETACH)

private List<Employee> employees;

Code

entityManager.detach(department);

Result

Department Detached

Employees Detached

Changes are no longer tracked by Hibernate.



6\. CascadeType.ALL

Purpose

Applies all cascade operations.



Equivalent To

cascade = {

&#x20;CascadeType.PERSIST,

&#x20;CascadeType.MERGE,

&#x20;CascadeType.REMOVE,

&#x20;CascadeType.REFRESH,

&#x20;CascadeType.DETACH

}

Example

@OneToMany(

&#x20;     mappedBy="department",

&#x20;     cascade=CascadeType.ALL

)

private List<Employee> employees;

Result

Save Parent -> Save Child

Update Parent -> Update Child

Delete Parent -> Delete Child

Refresh Parent -> Refresh Child

Detach Parent -> Detach Child

Complete Example

Department Entity

@Entity

public class Department {



&#x20;   @Id

&#x20;   @GeneratedValue

&#x20;   private Long departmentId;



&#x20;   private String departmentName;



&#x20;   @OneToMany(

&#x20;           mappedBy = "department",

&#x20;           cascade = CascadeType.ALL

&#x20;   )

&#x20;   private List<Employee> employees;

}

Employee Entity

@Entity

public class Employee {



&#x20;   @Id

&#x20;   @GeneratedValue

&#x20;   private Long employeeId;



&#x20;   private String employeeName;



&#x20;   @ManyToOne

&#x20;   @JoinColumn(name = "department\_id")

&#x20;   private Department department;

}

Cascade Type Summary

Cascade Type	Description

PERSIST	Save parent → Save child

MERGE	Update parent → Update child

REMOVE	Delete parent → Delete child

REFRESH	Reload parent → Reload child

DETACH	Detach parent → Detach child

ALL	Applies all cascade operations

Interview Question

What is CascadeType in JPA?

Answer:



"CascadeType is a JPA feature that automatically propagates persistence operations from a parent entity to its associated child entities. Common cascade types are PERSIST, MERGE, REMOVE, REFRESH, DETACH, and ALL. For example, with CascadeType.ALL, saving, updating, or deleting a Department automatically performs the same operation on its Employee entities."



Best Practice

Use CascadeType.ALL for tightly coupled parent-child relationships (e.g., Order → OrderItems).



Be careful with CascadeType.REMOVE, as deleting a parent will delete all associated child records.



Avoid CascadeType.ALL in Many-to-Many relationships unless you fully understand the impact.





Explain Lazy and Eager



Lazy vs Eager Fetching in Spring Boot (JPA/Hibernate)

What is Fetching?

Fetching determines when related entities are loaded from the database.



Consider:



Department

&#x20;   |

&#x20;   | One-To-Many

&#x20;   |

Employees

When we load a Department, should Employees also be loaded immediately?



This behavior is controlled by FetchType.LAZY and FetchType.EAGER.



1\. FetchType.LAZY

Definition

Related entities are loaded only when they are actually needed.



Example

@Entity

public class Department {



&#x20;   @Id

&#x20;   private Long id;



&#x20;   private String name;



&#x20;   @OneToMany(mappedBy = "department",

&#x20;              fetch = FetchType.LAZY)

&#x20;   private List<Employee> employees;

}

Code

Department dept =

&#x20;   departmentRepository.findById(1L).get();



System.out.println(dept.getName());

SQL Executed

SELECT \* FROM department

WHERE id = 1;

Employees are not loaded.



When Employees Are Accessed

dept.getEmployees();

Now Hibernate executes:



SELECT \* FROM employee

WHERE department\_id = 1;

Behavior

Load Department

&#x20;      ↓

Employees Not Loaded

&#x20;      ↓

Access Employees

&#x20;      ↓

Employees Loaded

Advantages

Better Performance



Reduces Memory Usage



Loads data only when required



Disadvantages

Can cause:



LazyInitializationException

if the session is already closed.



2\. FetchType.EAGER

Definition

Related entities are loaded immediately along with the parent entity.



Example

@Entity

public class Department {



&#x20;   @OneToMany(

&#x20;       mappedBy = "department",

&#x20;       fetch = FetchType.EAGER)

&#x20;   private List<Employee> employees;

}

Code

Department dept =

&#x20;   departmentRepository.findById(1L).get();

SQL Executed

SELECT \*

FROM department d

LEFT JOIN employee e

ON d.id = e.department\_id

WHERE d.id = 1;

Behavior

Load Department

&#x20;      ↓

Load Employees Immediately

Even if employees are not used, they are fetched.



Advantages

Data is readily available



No LazyInitializationException



Disadvantages

More Memory Consumption



Slower Queries



Can create unnecessary joins



Default Fetch Types in JPA

Relationship	Default Fetch Type

@ManyToOne	EAGER

@OneToOne	EAGER

@OneToMany	LAZY

@ManyToMany	LAZY

Example

@ManyToOne

private Department department;

By default:



fetch = FetchType.EAGER

Real-Time Example

Employee Management System

Employee Entity

@ManyToOne(fetch = FetchType.EAGER)

private Department department;

When Employee is loaded:



Employee emp =

&#x20;    employeeRepository.findById(1L).get();

Department is also loaded immediately.



Department Entity

@OneToMany(

&#x20;      mappedBy = "department",

&#x20;      fetch = FetchType.LAZY)

private List<Employee> employees;

When Department is loaded:



Department dept =

&#x20;     departmentRepository.findById(1L).get();

Employees are loaded only when:



dept.getEmployees();

is called.



Interview Comparison

Feature	LAZY	EAGER

Data Loading	On Demand	Immediate

Performance	Better	Slower

Memory Usage	Less	More

Database Queries	Fewer Initially	More Initially

Recommended	Yes	Use Carefully

Risk	LazyInitializationException	Performance Issues

Which One Should We Use?

Recommended

fetch = FetchType.LAZY

for most relationships because it improves performance.



Use EAGER

Only when related data is always required.



Example:



Employee → Department

If every employee screen always shows department details, EAGER may be acceptable.



Interview Answer

What is the difference between LAZY and EAGER fetching?



"LAZY loading fetches related entities only when they are accessed, whereas EAGER loading fetches related entities immediately along with the parent entity. LAZY improves performance by reducing unnecessary database calls and memory usage, while EAGER ensures related data is available instantly but may lead to performance issues due to unnecessary joins. In JPA, @OneToMany and @ManyToMany are LAZY by default, while @ManyToOne and @OneToOne are EAGER by default."











what is dependency injection in spring



Fast answer

Dependency Injection (DI) in Spring is a design pattern where the Spring container creates and injects the required objects (dependencies) into a class, instead of the class creating those objects itself.



Without Dependency Injection

The class creates its own dependency:



public class Car {

&#x20;   private Engine engine = new Engine(); // tightly coupled

}

Problems:



Tight coupling



Difficult to test



Hard to replace implementations



With Dependency Injection in Spring

Spring creates the Engine object and injects it into Car.



@Component

public class Engine {

}

@Component

public class Car {



&#x20;   private final Engine engine;



&#x20;   @Autowired

&#x20;   public Car(Engine engine) {

&#x20;       this.engine = engine;

&#x20;   }

}

Here:



Spring creates an Engine bean.



Spring creates a Car bean.



Spring injects the Engine bean into the Car constructor.



Types of Dependency Injection in Spring

1\. Constructor Injection (Recommended)

@Component

public class Car {



&#x20;   private final Engine engine;



&#x20;   public Car(Engine engine) {

&#x20;       this.engine = engine;

&#x20;   }

}

Advantages:



Dependencies are mandatory.



Easier unit testing.



Supports immutable fields (final).



2\. Setter Injection

@Component

public class Car {



&#x20;   private Engine engine;



&#x20;   @Autowired

&#x20;   public void setEngine(Engine engine) {

&#x20;       this.engine = engine;

&#x20;   }

}

Used when dependency is optional.



3\. Field Injection

@Component

public class Car {



&#x20;   @Autowired

&#x20;   private Engine engine;

}

Easy to write but generally discouraged because it:



Makes testing harder.



Hides dependencies.



How Spring Knows What to Inject

Spring manages objects called Beans.



Beans can be created using annotations such as:



@Component

@Service

@Repository

@Controller

or using Java configuration:



@Configuration

public class AppConfig {



&#x20;   @Bean

&#x20;   public Engine engine() {

&#x20;       return new Engine();

&#x20;   }

}

Benefits of Dependency Injection

Loose coupling



Better testability



Easier maintenance



Flexible implementation switching



Cleaner code



Simple Real-Life Analogy

Think of a Car needing an Engine:



Without DI: Car goes to the factory and builds its own engine.



With DI: A factory (Spring Container) provides the engine to the car.



The car only knows it needs an engine; it doesn't care how the engine was created.



In one sentence: Dependency Injection in Spring is the process where the Spring IoC container automatically provides the required dependencies (beans) to an object, promoting loose coupling and easier maintenance.








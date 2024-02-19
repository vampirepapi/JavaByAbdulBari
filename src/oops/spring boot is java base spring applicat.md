spring boot is java base spring application

Spring Framework:

It is a comprehensive framework for building Java applications.
It provides support for various functionalities like transaction management, JDBC operations, File uploading, Exception handling, etc.
It requires manual configuration either through XML or Java-based annotations.
You need to deploy your application to a web server (like Tomcat, Jetty, etc.).
You need to manually include all the dependencies.

Spring Boot:

It is built on top of the Spring Framework and simplifies its use.
It provides an easier and faster way to set up, configure, and run both simple and web-based applications.
It automatically configures your application based on the dependencies you have added to the project by using the concept of Starter Auto-Configurators.
It has embedded Tomcat, Jetty, and Undertow servers, which means you can run Spring Boot applications without needing to deploy on a Web Server.
It provides a set of starter projects that include a lot of dependencies that you can include in your project.
It comes with non-functional features like metrics, health checks, externalized configuration, etc. which makes it production-ready.

What are the Spring Boot key components?

Spring Boot auto-configuration.
Spring Boot CLI.
Spring Boot starter POMs.
Spring Boot Actuators.

Spring Boot Starters: These are a set of convenient dependency descriptors that you can include in your application. Starters make it easy to set up and manage Spring Boot applications, as you get a bundle of related dependencies together.

Auto-Configuration: Spring Boot Auto-Configuration attempts to automatically configure your Spring application based on the jar dependencies that you have added.

Spring Boot Actuator: It provides production-ready features for your Spring Boot application. It allows you to monitor your application and interact with it.

Spring Boot CLI: This is a command line tool that can be used if you want to quickly prototype with Spring. It allows you to run Groovy scripts, which means that you have a familiar Java-like syntax, without so much boilerplate code.

Embedded HTTP Servers: Spring Boot can embed Tomcat, Jetty, or Undertow directly. No need to deploy WAR files.

What is the starter dependency of the Spring boot module?
Spring boot provides numbers of starter dependency, here are the most commonly used -

Data JPA starter.
Test Starter.
Security starter.
Web starter.
Mail starter.
Thymeleaf starter

 How does Spring Boot works?
Spring Boot automatically configures your application based on the dependencies you have added to the project by using annotation. The entry point of the spring boot application is the class that contains @SpringBootApplication annotation and the main method.

Spring Boot automatically scans all the components included in the project by using @ComponentScan annotation.
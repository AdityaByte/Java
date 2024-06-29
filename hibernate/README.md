
# Hibernate Framework

Hibernate is a Java framework that simplifies the development of Java application to interact with the database.
It is a light weight, open source ORM(Object Relational Mapping) tool. Hibernate implements the specifications of JPA( Java Persistance Api) for data Persistance.



## ORM - Object Relational Mapping

ORM stands for Object Relational Mapping , An ORM tool simplifies the data creation, data manipulation and data access.It is a programming technique that maps the Object to the data stored in the database.

In simple words we can say that , generally in java we stored data in the form of objects and in a Relational database we store data in tabular format means in rows and colums so hibernate is a tool that maps object to the table.




## Documentation

[Hibernate Official Documentation](https://hibernate.org/orm/documentation/6.5/)


## Maven Depolyment

To use the Hibernate Framework in our project you have to add it in the dependencies of your project for this follow the following steps and the following steps are for the intellij idea ide...

##### 1. Make a new project named anything you want and make it using maven.
##### 2. Inside the pom.xml file add this code -
##### 3. Add hibernate dependency and mysql connector to it.

```bash
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>6.5.2.Final</version>
    <type>pom</type>
</dependency>

<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.3.0</version>
</dependency>

```

##### 3. After that restart the maven and write you code inside the src/App.java file


## Author

- [@AdityaByte](https://www.github.com/AdityaByte)


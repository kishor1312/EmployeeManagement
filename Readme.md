Junit tutorial

- Why testing
    - Ensures quality of the system / solution
    - Ensure the code coverage
    - Unit testing / Integration testing / Black box testing / smoke testing

- why junit
  - takes care of unit testing (responsibility of development team/resource)
  - a separate block or function as a separate unit, and it is tested individually

- what is junit
  - Unit testing framework (junit5)
  - Auto-supported in Spring Boot, but the version of Junit depends on Spring boot version as well

- how is integrated with Spring boot
  - Starter pom -> spring-boot-starter-test -> has by default support for required libraries like junit, jupiter, asserts, mockito
  
- different annotations in junit
  - https://junit.org/junit5/docs/current/user-guide/
  
- how to write junit test for business logic
  - write sample calculator class & write tests for the methods in that class


a. Assertion
  - methods of assertion library
  - https://assertj.github.io/doc/

b. mocking
  - faking a real object as a dummmy or mock object


Test driven development
  - write the test first, and then code later
  - need to develop a calculator app which will handle integer manipulation
  - when a=10, b=5
    - a+b = 15, a-b=5, a*b=50, a/b = 2
  - when a=10, b=0
    - a+b = 10, a-b=10, a*b=0, a/b= arithmatic exception / handle the exception and print the error





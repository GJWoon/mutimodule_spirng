# Spring Boot를 사용한 MultiModule 실습입니다.



- 멀티 모듈이란 서로 독립적인 프로젝트(인증, 어플리케이션)를 하나의 프로젝트로 묶어 모듈로서 사용되는 구조를 말합니다.

- 멀티 모듈을 사용하면 공통적인 기능을 모아 하나의 모듈로 만드는 것이 가능하며 인증과 어플리케이션에서 공통으로 사용하는 util, domain, Repository등을 모듈로 분리해 사용할 수 있습니다.


- Common module과 API module을 만들어 JPA를 사용한 간단한 Mysql DB연동 및 CustomExcpetion을 적용 하였습니다. 

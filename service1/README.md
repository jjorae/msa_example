# Example Service
ConfigServer 테스트를 위한 예제용 서비스

### bootstrap.yml 지원 안함
인터넷에서 찾은 예제들에는 bootstrap.yml 파일을 생성해서 사용하지만 더 이상 해당 방식은 지원하지 않는다. (Spring Boot 2.4부터)

현재는 application.properties나 application.yml에 아래와 같은 속성을 추가한다.

spring.config.import=optional:configserver:

위와 같이 설정하면 http://localhost:8888의 기본 위치에 있는 Config 서버에 연결

optional: 접두사를 제거하면 Config 서버에 연결할 수 없는 경우 클라이언트 실패

Config 서버의 위치를 변경하려면 spring.cloud.config.uri를 설정하거나 spring.config.import에 추가. spring.config.import=optional:configserver:http://myhost:8888

uri property가 우선.

https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_spring_cloud_config_client

### spring-boot-starter-actuator
* 재시작 없이 설정을 refresh할 때 Spring Boot Actuator 필요
* 설정 변경 후 curl -X POST "http://localhost:8080/actuator/refresh" 호출
* /actuator/refresh 쓰려면 management.endpoints.web.exposure.include 옵션을 "*"나 refresh로 주어야함.

### Spring Cloud Bus
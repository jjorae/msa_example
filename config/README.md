# Config server
MSA의 Config server 예제

* 테스트를 위해 공통 설정 파일을 Github에 업로드해서 테스트
* 설정 파일 위치를 여러 방법으로 지정 가능한 것으로 보이므로 스터디 필요

### Spring Cloud Config Server 기능
* HTTP, resource-based API for external configuration (name-value pairs, or equivalent YAML content)
* Encrypt and decrypt property values (symmetric or asymmetric)
* Embeddable easily in a Spring Boot application using @EnableConfigServer
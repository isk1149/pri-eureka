package com.joongnior.pri.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer 애너테이션의 역할
 *
 * [Eureka 서버 구성 활성화]
 * @EnableEurekaServer 애너테이션은 Spring Boot 애플리케이션에 Eureka 서버 관련 설정을 자동으로 구성합니다.
 * 이 애너테이션이 추가되면, Spring은 Eureka 서버를 설정하고 필요한 빈을 생성합니다.
 *
 * [서비스 레지스트리 기능 제공]
 * 이 애너테이션을 통해 애플리케이션은 서비스 레지스트리 역할을 하게 됩니다.
 * 다른 서비스들이 이 서버에 자신을 등록하고, 다른 서비스들을 검색할 수 있게 됩니다.
 *
 * [관리 및 모니터링 대시보드 제공]
 * @EnableEurekaServer를 사용하면 기본적으로 Eureka 대시보드가 활성화되어
 * 서비스 인스턴스의 상태를 모니터링하고 관리할 수 있는 웹 UI를 제공합니다.
 */
@SpringBootApplication
@EnableEurekaServer
public class PriEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriEurekaApplication.class, args);
	}

}

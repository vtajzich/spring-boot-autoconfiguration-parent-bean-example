package net.tajzich.example.spring.boot.autoconfiguration.parentbean.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource

@Configuration
@ComponentScan
@ImportResource('classpath:parent-context.xml')
@EnableAutoConfiguration
class Application {

    static void main(String[] args) {
        SpringApplication.run Application, args
    }
}

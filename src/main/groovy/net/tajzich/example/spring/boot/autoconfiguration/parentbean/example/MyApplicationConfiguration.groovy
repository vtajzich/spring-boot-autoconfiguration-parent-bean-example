package net.tajzich.example.spring.boot.autoconfiguration.parentbean.example

import net.tajzich.example.spring.boot.autoconfiguration.parentbean.example.configuration.ConditionalOnCreateBean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource

@ConditionalOnCreateBean
@ImportResource('classpath:child-context.xml')
@Configuration
class MyApplicationConfiguration {

}

package net.tajzich.example.spring.boot.autoconfiguration.parentbean.example.configuration

import org.springframework.boot.autoconfigure.condition.ConditionOutcome
import org.springframework.boot.autoconfigure.condition.SpringBootCondition
import org.springframework.context.annotation.ConditionContext
import org.springframework.core.env.PropertyResolver
import org.springframework.core.type.AnnotatedTypeMetadata

class OnCreateBeanCondition extends SpringBootCondition {

    @Override
    ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {

        PropertyResolver resolver = context.getEnvironment();

        boolean createBean = resolver.getProperty('net.tajzich.example.create_bean', Boolean)

        if (createBean) {
            return ConditionOutcome.match()
        } else {
            return ConditionOutcome.noMatch('create_bean is set to false')
        }
    }
}

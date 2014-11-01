package net.tajzich.example.spring.boot.autoconfiguration.parentbean.example.service

import groovy.transform.ToString

/**
 * Created by vtajzich
 */
@ToString(includePackage = false)
class Greater {

    String commonProperty

    String greet() {
        return "Hello $commonProperty!"
    }
}

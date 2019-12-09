package my.rest.api

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TestBSpec extends Specification implements DomainUnitTest<TestB> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}

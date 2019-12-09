package my.rest.api

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class BookInterceptorSpec extends Specification implements InterceptorUnitTest<BookInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test book interceptor matching"() {
        when:"A request matches the interceptor"
        withRequest(controller:"book")

        then:"The interceptor does match"
        interceptor.doesMatch()
    }
}

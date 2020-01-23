package my.rest.api

/**
 * test hierarchy in grails with table per domain class.
 */
class TestA {

    int a
    String b

    static constraints = {
    }

    static mapping = {
        tablePerHierarchy false
    }
}

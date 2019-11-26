package my.rest.api

class Author {

    String name

    static constraints = {
    }

    static hasMany = [books: Book]
}

package my.rest.api

class Author {

    String firstName
    String lastName

    static constraints = {
    }

    static mapping = {
    }

    static hasMany = [authorBook: AuthorBook]
}

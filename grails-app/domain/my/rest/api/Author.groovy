package my.rest.api

class Author {

    String firstName
    String lastName
    List<Integer> booksIds


    static transients = ['booksIds']

    static constraints = {
    }

    static mapping = {
    }

    static hasMany = [authorBook: AuthorBook]

    @Override
    String toString() {
        return firstName + lastName + booksIds.size()
    }
}

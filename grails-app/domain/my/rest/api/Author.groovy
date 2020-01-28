package my.rest.api

class Author {

    String firstName
    String lastName
    static constraints = {
    }

    static mapping = {
        books joinTable: [name: "author_book", key: 'author_id']
    }

    static hasMany = [books: Book]

    @Override
    String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}'
    }
}

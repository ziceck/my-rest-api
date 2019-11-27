package my.rest.api

class AuthorBook {

    static constraints = {
    }

    static belongsTo = [book: Book, author: Author]
}

package my.rest.api

class Book {

	String title
	int year
    static belongsTo = [Author]
    static constraints = {
    }

    static mapping = {
        authors joinTable: [name: "author_book", key: 'book_id' ]
    }

    static hasMany = [authors: Author]
}

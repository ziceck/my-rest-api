package my.rest.api

class Book {

	String title
	int year
	
    static constraints = {
    }

    static mapping = {
    }

    static hasMany = [authorBook: AuthorBook]
}

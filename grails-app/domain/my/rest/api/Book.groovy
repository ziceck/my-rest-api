package my.rest.api

class Book {

	String title
	int year
	
    static constraints = {
    }

    static belongsTo = [author: Author]
}

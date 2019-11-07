package my.rest.api

class BookService {

	def show(long idBook) {
		return Book.get(idBook)
	}

	def save(Map params) {
		def book = new Book(params)
		book.save(flush: true, failOnError: true)
		return book
	}

	def update(Map params, long idBook) {
		def book = Book.get(idBook)
		book.title = params.book
		book.year = params.year as Integer
		return book.refresh()
	}

	def index() {
		return Book.list()
	}

	def delete(long idBook) {
		def book = Book.get(idBook)
		book.delete(flush: true, failOnError: true)
		return book
	}
}
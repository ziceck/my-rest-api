package my.rest.api

import static org.springframework.http.HttpStatus.CREATED
import static org.springframework.http.HttpStatus.NO_CONTENT
import static org.springframework.http.HttpStatus.OK

class BookController {

	BookService bookService

	def show(Long id) {
		respond bookService.get(id)
	}

	def save(Book book) {
		if (book.hasErrors())
			respond book.errors, view:'create'
		else respond bookService.save(book), [status: CREATED, view:"show"]
	}

	def update(Book book) {
		respond bookService.save(book), [status: OK, view: "show"]
	}

	def index() {
		println new Date().time
		respond bookService.list(params), model: [bookCount: bookService.count()]
	}

	def delete(Long id) {
		bookService.delete(id)
		render status: NO_CONTENT
	}
}
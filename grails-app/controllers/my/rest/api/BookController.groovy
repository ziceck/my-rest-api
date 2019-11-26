package my.rest.api

import static org.springframework.http.HttpStatus.CREATED
import static org.springframework.http.HttpStatus.OK

class BookController {

	BookService bookService

	def show(Long id) {
		respond bookService.get(id)
	}

	def save(Book book) {
		respond bookService.save(book), [status: CREATED, view:"show"]
	}

	def update(Book book) {
		respond bookService.save(book), [status: OK, view: "show"]
	}

	def index() {
		respond bookService.list(params), model: [bookCount: bookService.count()]
	}

	def delete(Long id) {
		Book book = bookService.get(1)
		bookService.delete(id)
		respond book, [status: OK, view: "show"]
	}
}
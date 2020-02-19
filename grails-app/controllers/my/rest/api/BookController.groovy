package my.rest.api

import static org.springframework.http.HttpStatus.*

class BookController {

  static allowedMethods = [
      index : 'GET',
      show  : 'GET',
      save  : 'POST',
      update: 'PUT',
      delete: 'DELETE'
  ]

  BookService bookService

  def show(Long id) {
    respond bookService.get(id)
  }

  def save(Book book) {
    if (book.hasErrors())
      respond book.errors, view: 'create'
    else respond bookService.save(book), [status: CREATED, view: "show"]
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
package my.rest.api

import grails.validation.ValidationException

import static org.springframework.http.HttpStatus.*

class AuthorBookController {

    AuthorBookService authorBookService

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond authorBookService.list(params), model: [authorBookCount: authorBookService.count()]
    }

    def show(Long id) {
        respond authorBookService.get(id)
    }

    def save(AuthorBook authorBook) {
        if (authorBook == null) {
            render status: NOT_FOUND
        } else {
            try {
                authorBookService.save(authorBook)
                respond authorBook, [status: CREATED, view: "show"]
            } catch (ValidationException e) {
                respond authorBook.errors, view: 'create'
            }
        }
    }

    def update(AuthorBook authorBook) {
        if (authorBook == null) {
            render status: NOT_FOUND
        } else {
            try {
                authorBookService.save(authorBook)
                respond authorBook, [status: OK, view: "show"]
            } catch (ValidationException e) {
                respond authorBook.errors, view: 'edit'
            }
        }
    }

    def delete(Long id) {
        if (id == null) {
            render status: NOT_FOUND
        } else {
            authorBookService.delete(id)
            render status: NO_CONTENT
        }
    }
}

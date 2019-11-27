package my.rest.api

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class AuthorController {

    AuthorService authorService

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond authorService.list(params), model:[authorCount: authorService.count()]
    }

    def show(Long id) {
        respond authorService.get(id)
    }

    def save(Author author) {
        if (author == null) {
            render status: NOT_FOUND
        } else {
            try {
                authorService.save(author)
                respond author, [status: CREATED, view:"show"]
            } catch (ValidationException e) {
                respond author.errors, view:'create'
            }
        }
    }

    def update(Author author) {
        if (author == null) {
            render status: NOT_FOUND
        } else {
            try {
                authorService.save(author)
                respond author, [status: OK, view:"show"]
            } catch (ValidationException e) {
                respond author.errors, view:'edit'
            }
        }
    }

    def delete(Long  id) {
        if (id == null) {
            render status: NOT_FOUND
        } else {
            authorService.delete(id)
            render status: NO_CONTENT
        }
    }
}

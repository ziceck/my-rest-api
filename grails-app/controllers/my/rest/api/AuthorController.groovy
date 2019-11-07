package my.rest.api

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class AuthorController {

    AuthorService authorService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

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
            return
        }

        try {
            authorService.save(author)
        } catch (ValidationException e) {
            respond author.errors, view:'create'
            return
        }

        respond author, [status: CREATED, view:"show"]
    }

    def update(Author author) {
        if (author == null) {
            render status: NOT_FOUND
            return
        }

        try {
            authorService.save(author)
        } catch (ValidationException e) {
            respond author.errors, view:'edit'
            return
        }

        respond author, [status: OK, view:"show"]
    }

    def delete(Long id) {
        if (id == null) {
            render status: NOT_FOUND
            return
        }

        authorService.delete(id)

        render status: NO_CONTENT
    }
}

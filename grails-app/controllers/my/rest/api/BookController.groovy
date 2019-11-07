package my.rest.api

import grails.converters.JSON
import static org.springframework.http.HttpStatus.*

class BookController {

	def bookService

	def show() {
		respond bookService.show(params.id as long)
	}

	def save() {
		respond bookService.save(request.JSON as Map), [status: OK, view: "show"]
	}

	def update() {
		render bookService.update(request.JSON as Map, params.id as long) as JSON
	}

	def index() {
		respond bookService.index()
	}

	def delete() {
		render bookService.delete(params.id as long) as JSON
	}
}
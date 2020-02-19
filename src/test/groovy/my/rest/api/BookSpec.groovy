package my.rest.api

import grails.testing.gorm.DomainUnitTest
import spock.lang.Shared
import spock.lang.Specification

class BookSpec extends Specification implements DomainUnitTest<Book> {
  @Shared
  int id

  def setup() {
  }

  def cleanup() {
  }

  def "test save Book"() {
    setup:
    def book = new Book(title: 'Book One', year: 2020).save()
    println book.title
    expect:
    Book.count() == 1
  }

  def "test save author into book"() {
    setup:
    def author = new Author(firstName: 'Bob', lastName: 'Boob').save()
    def book = new Book(title: 'Book One', year: 2020, authors: [author]).save()
    println book.title
    expect:
    book.authors.size() == 1
  }
}

package my.rest.api

import grails.gorm.services.Service

@Service(AuthorBook)
interface AuthorBookService {

    AuthorBook get(Serializable id)

    List<AuthorBook> list(Map args)

    Long count()

    void delete(Serializable id)

    Author save(AuthorBook author)

}

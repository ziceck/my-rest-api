package my.rest.api

class UrlMappings {

    static mappings = {
        delete "/api/$controller${'s'}/$id(.$format)?"(action:"delete")
        get "/api/$controller${'s'}(.$format)?"(action:"index")
        get "/api/$controller${'s'}/$id(.$format)?"(action:"show")
        post "/api/$controller${'s'}(.$format)?"(action:"save")
        put "/api/$controller${'s'}/$id(.$format)?"(action:"update")
        patch "/api/$controller${'s'}/$id(.$format)?"(action:"patch")

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
        "401"(view: '/notAuthorized')
        "403"(view: '/forbidden')
        "/api"(view: 'api')
    }
}

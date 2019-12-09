package my.rest.api

import com.mysecurerest.Authority
import com.mysecurerest.User
import com.mysecurerest.UserAuthority

class BootStrap {

    def init = { servletContext ->
        def role1 = new Authority(authority:"ROLE_USER").save flush:true
        def user1 = new User(username:"user1",password:"pwd1").save flush:true
        UserAuthority.create(user1,role1)
        new TestB(a: 1, b: "a", c: 2, d: "b").save(flush: true, failOnError: true)
        new TestB(a: 3, b: "c", c: 4, d: "d").save(flush: true, failOnError: true)
    }
    def destroy = {
    }
}

package my.rest.api

import com.mysecurerest.Authority
import com.mysecurerest.User
import com.mysecurerest.UserAuthority

class BootStrap {

    def init = { servletContext ->
        def role1 = new Authority(authority:"ROLE_USER").save flush:true
        def user1 = new User(username:"user1",password:"pwd1").save flush:true
        UserAuthority.create(user1,role1)
    }
    def destroy = {
    }
}

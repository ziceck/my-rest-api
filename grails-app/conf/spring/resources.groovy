package spring


import com.mysecurerest.UserPasswordEncoderListener
import org.springframework.web.servlet.i18n.CookieLocaleResolver
// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    localeResolver(CookieLocaleResolver) {
        defaultLocale = new Locale('es')
    } //set language
}

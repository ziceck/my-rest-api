// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.mysecurerest.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.mysecurerest.UserAuthority'
grails.plugin.springsecurity.authority.className = 'com.mysecurerest.Authority'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
		[pattern: '/',               access: ['permitAll']],
		[pattern: '/error',          access: ['permitAll']],
		[pattern: '/index',          access: ['permitAll']],
		[pattern: '/index.gsp',      access: ['permitAll']],
		[pattern: '/shutdown',       access: ['permitAll']],
		[pattern: '/assets/**',      access: ['permitAll']],
		[pattern: '/**/js/**',       access: ['permitAll']],
		[pattern: '/**/css/**',      access: ['permitAll']],
		[pattern: '/**/images/**',   access: ['permitAll']],
		[pattern: '/**/favicon.ico', access: ['permitAll']],
		[pattern: '/notAuthorized',  access: ['permitAll']],
		[pattern: '/api',			 access: ['permitAll']],
		[pattern: '/api/**', 		 access: ['ROLE_USER']]
]



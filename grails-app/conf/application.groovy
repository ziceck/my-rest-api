// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.mysecurerest.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.mysecurerest.UserAuthority'
grails.plugin.springsecurity.authority.className = 'com.mysecurerest.Authority'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
		[pattern: '/assets/**', 		    access: ['permitAll']],
		[pattern: '/**/js/**', 			    access: ['permitAll']],
		[pattern: '/**/css/**', 		    access: ['permitAll']],
		[pattern: '/**/images/**', 		  access: ['permitAll']],
		[pattern: '/**/favicon.ico', 	  access: ['permitAll']],
		[pattern: '/', 					        access: ['permitAll']],
		[pattern: '/application/index', access: ['permitAll']], /*Se le debe dar permiso tanto a la ruta en urlMappings como a la ruta del controladror*/
		[pattern: '/api', 				      access: ['permitAll']],
		[pattern: '/notAuthorized', 	  access: ['permitAll']],
		[pattern: '/**', 				        access: ['ROLE_USER']]
]



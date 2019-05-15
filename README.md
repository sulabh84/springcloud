# springcloud

tutor site : http://dustin.schultz.io/ps-scf/

----------------------------------------------------
## Eureka Server

### eureka server
https://start.spring.io/
add :
   eureka sever
   devtools
   actuator
 
eureka.dashboard.enable=true  => by default

Dashboard of discovery server: localhost:8761
   
### eureka service
    eureka discovery
	devtools
	actuator
	
configure two instances of it with below environment properties
instace 1:
	server.port=8081
	service.instance.name=instance 1
  
	server.port=8082
	service.instance.name=instance 2
  
### eureka client
    eureka discovery
	devtools
	actuator

------------------------------------------------------

## ZUUL - API Gateway

### create gateway-service
	eureka discovery
	ZUUL
	
### hello-zuul-service
	eureka discovery
	web
	
### goodbye-zuul-service
	eureka discovery
	web
	
### Start one-by-one in below order
	eureka server
	gateway-service
	goodbye-zuul-service
	hello-zuul-service
	
### Hit Zuul service to hello-zuul-service:
	http://localhost:8080/hello-zuul
	
### Hit Zuul service to goodbye-zuul-service:
	http://localhost:8080/goodbye-zuul
	
### Zuul has four type of filters: (extends ZuulFilter)
	Pre
	route
	Post
	error
	
-------------------------------------------------------

## Application Config Server

### Endpoint
	GET /{application}/{profile}[/{label}]
	application = spring.application.name
	profile = spring.profiles.active  (default is by default)
	label = branch in a git repo (Optional)
	
	-- label is always is master
	GET /{application}-{profile}.(yml | properties)
	
	GET /{label}/{application}-{profile}.(yml | properties)
	
### Create a config server
	add below dependency
		config server
		eureka discovery
		actuator
		
### Setup the config git repo;
	https://github.com/sulabh84/scf-config-repository
	
### Start the server:
	http://localhost:8888/config-client-app/default
	http://localhost:8888/config-client-app.properties
	http://localhost:8888/config-client-app.yml
	http://localhost:8888/config-client-app-prod.properties
	
	
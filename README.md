# springcloud

tutor site : http://dustin.schultz.io/ps-scf/

## eureka server
https://start.spring.io/
add :
   eureka sever
   devtools
   actuator
 
eureka.dashboard.enable=true  => by default

localhost:8761
   
## eureka service
    eureka discovery
	devtools
	actuator
	
configure two instances of it with below environment properties
instace 1:
	server.port=8081
	service.instance.name=instance 1
  
	server.port=8082
	service.instance.name=instance 2
  
## eureka client
    eureka discovery
	devtools
	actuator

------------------------------------------------------

## ZUUL - API Gateway

create gateway-service
	eureka discovery
	ZUUL
	
hello-zuul-service
	eureka discovery
	web
	
goodbye-zuul-service
	eureka discovery
	web
	

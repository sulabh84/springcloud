# springcloud

tutor site : http://dustin.schultz.io/ps-scf/

## eureka server
https://start.spring.io/
add :
   eureka sever
   devtools
   actuator
   
## eureka client
    eureka discovery
	devtools
	actuator
	
configure two instances of it with below environment properties
instace 1:
  server.port=8081
  service.instance.name=instance 1
  
  server.port=8082
  service.instance.name=instance 2
   
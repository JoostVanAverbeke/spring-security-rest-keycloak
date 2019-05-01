# spring-security-rest-keycloak

Example REST application utilizing [Keycloak](http://www.keycloak.org) for 
managing.
 
# User Account Service
Login with a created user for the realm spring-security-example

[http://localhost:8080/auth/realms/spring-security-example/account](http://localhost:8080/auth/realms/spring-security-example/account)

This will pop up a keycloak login screen. 



Read the blog post [here](https://sandor-nemeth.github.io/java/spring/2017/06/15/spring-boot-with-keycloak.html)

admin keycloak user = initial1, password = zaq1!QAZ


http://localhost:8080/auth/realms/master/protocol/openid-connect/token

## Retrieve Access Token

curl \
  -d "client_id=curl" \
  -d "username=joe_admin" \
  -d "password=admin" \
  -d "grant_type=password" \
  'http://localhost:8080/auth/realms/spring-security-example/protocol/openid-connect/token'
  
  
  
  
  
  
curl -d 'client_id=curl' -d 'username=joe_admin' -d 'password=admin' -d 'grant_type=password' 'http://localhost:8080/auth/realms/spring-security-example/protocol/openid-connect/token'




curl --data 'grant_type=password&client_id=curl&username=user1&password=keycloak' http://localhost:8080/auth/realms/master/protocol/openid-connect/token


curl --data "grant_type=password&client_id=curl&username=john&password=john" http://localhost:8080/auth/realms/springboot/protocol/openid-connect/token


curl id = ad3f62b3-6e6c-4e9d-92ba-fff5ec6caede
spring-security-demo-app = 1b0da6ec-9058-4c45-9792-6e0570032151


./kcadm.sh create clients/1b0da6ec-9058-4c45-9792-6e0570032151/roles -r spring-security-example -s name=admin -s 'description=Admin role'
./kcadm.sh create clients/1b0da6ec-9058-4c45-9792-6e0570032151/roles -r spring-security-example -s name=user -s 'description=User role'


./kcadm.sh  get clients/1b0da6ec-9058-4c45-9792-6e0570032151/installation/providers/keycloak-oidc-keycloak-json -r spring-security-example


Returns

{
  "realm" : "spring-security-example",
  "bearer-only" : true,
  "auth-server-url" : "http://localhost:8080/auth",
  "ssl-required" : "external",
  "resource" : "spring-security-demo-app",
  "verify-token-audience" : true,
  "use-resource-role-mappings" : true,
  "confidential-port" : 0
}

Paused at:
https://sandor-nemeth.github.io/java/spring/2017/06/15/spring-boot-with-keycloak.html
Continue with "The rest service" 
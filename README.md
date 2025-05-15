# web-sso
Implementing SSO using Spring boot, Spring Security, Keycloak, Docker, Oauth2...

## Authorization Server
We use Keycloak as authorization server, a docker based image app with volume persistence for (like users, realms, roles, etc).

> image: quay.io/keycloak/keycloak:24.0.1

To keep it simple, we will its built-in H2 in-memory DB, but for a production app pls make sure to use a real DB like MySQL..

## Resource server 

We use a spring boot app for our resource server, this app contains our data to be fetched by clients

<details>
  <summary>Dependencies list</summary>

> spring-boot-starter-oauth2-resource-server
>
> spring-boot-starter-security
>
> spring-boot-starter-web
</details>



# web-sso
Implementing SSO using Spring boot, Spring Security, Keycloak, Docker, Oauth2...

### Authorization Server
We use Keycloak as authorization server, a docker based image app with volume persistence for (like users, realms, roles, etc).

> image: quay.io/keycloak/keycloak:24.0.1

To keep it simple, we will its built-in H2 in-memory DB, but for a production app pls make sure to use a real DB like MySQL..


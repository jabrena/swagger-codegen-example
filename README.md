# OpenAPI ecosystem

## Motivation

Develop and operate digital services is not easy, exist multiple  alternatives and Dev teams require maintain the 
learning pace continuously.

Services can be consumed using different [API Styles](./api-styles.md) like
SOAP, REST, GraphQL or gRPC.

This repository explores few Maven plugins to be used in some examples with 
Spring Framework and the approach **API First** for REST.

## OpenAPI

**The OpenAPI Specification (OAS)** defines a standard, language-agnostic interface to RESTful APIs 
which allows both humans and computers to discover and understand the capabilities of the service 
without access to source code, documentation, or through network traffic inspection.

## API First

An API-first approach means that for any given development project, 
your APIs are treated as **first-class citizens**. 
That everything about a project revolves around the idea that the end product will be consumed by mobile devices, 
and that APIs will be consumed by client applications.

## Scenarios simulated

- [ ] OpenAPI Spec
- [x] Usage of swagger codegen
- [x] Usage of openapi-generator
- [x] Generate a Server with openapi-generator
- [x] Generate a client with openapi-generator
- [ ] Generate multiple clients in the same development with openapi-generator
- [ ] Edge cases with OpenAPI

## How to build in local?

The project uses **Java 17** & **Maven**.

```
export MAVEN_OPTS=" --add-exports jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED \
--add-exports jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED \
--add-exports jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED \
--add-exports jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED \
--add-exports jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED "

mvn clean verify
```

## References

- https://tanzu.vmware.com/developer/guides/app-enhancements-spring-k8s/
- https://github.com/swagger-api/swagger-codegen/blob/master/modules/swagger-codegen-maven-plugin/README.md
- https://editor.swagger.io/
- https://www.thecodejournal.tech/2021/02/generating-code-using-maven-swagger-to-java/
- https://openapi-generator.tech/docs/swagger-codegen-migration/
- https://www.baeldung.com/spring-rest-openapi-documentation
- https://github.com/MasterCloudApps-Projects/REST-gRPC-GraphQL
- https://auth0.com/blog/the-business-value-of-api-first-design/

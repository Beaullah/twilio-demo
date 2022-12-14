# Twilio-demo by Bonita

This is the demo app to send message to users using Twilio API.

### - Requisite -

Go to the configuration YML file and change the following Twilio configurations, because I have exhausted my trial accessibily access.

```
twilio:
  account_sid: [Twilio-account-Sid]
  auth_token: [Twilio-account-token]
  trial_number: [Twilio-given-number]
```

## JSON requests

This is the request API method which I have configured to send message using the Twillio service.

Request Header
```
http://localhost:8080/api/twilio/{{mobile-number}}/send
```

Request Boy:
```
{
    "message" : "Hello, I am Bonita."
}
```

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.0/maven-plugin/reference/html/#build-image)
* [GraalVM Native Image Support](https://docs.spring.io/spring-boot/docs/3.0.0/reference/html/native-image.html#native-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.0/reference/htmlsingle/#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.0/reference/htmlsingle/#web)

### Springboot Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)


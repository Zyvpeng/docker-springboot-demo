FROM maven:3.8.3-openjdk-11 AS MAVEN_BUILD
COPY settings.xml /usr/share/maven/conf/settings.xml
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package

FROM maslick/minimalka:jdk11
COPY --from=MAVEN_BUILD /build/target/example-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8088
ENTRYPOINT ["java","-jar","/app/SpringBootQuickStart1.jar"]
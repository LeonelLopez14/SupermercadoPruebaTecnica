
FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app
RUN apt-get update && apt-get install -y maven
COPY . .
RUN if [ -f "prueba_tecnica_supermercado/pom.xml" ]; then \
        mvn package -DskipTests -f prueba_tecnica_supermercado/pom.xml; \
    else \
        mvn package -DskipTests; \
    fi

FROM eclipse-temurin:21-jdk-jammy
COPY --from=build /app/target/prueba_tecnica_supermercado-0.0.1.jar app_pruebatecsuper.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_pruebatecsuper.jar"]

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
WORKDIR /app
COPY --from=build /app /app
RUN find /app -name "*.jar" -path "*/target/*" | head -1 | xargs -I {} cp {} /app/app_pruebatecsuper.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app_pruebatecsuper.jar"]
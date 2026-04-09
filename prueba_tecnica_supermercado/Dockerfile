
#compilar
FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app
RUN apt-get update && apt-get install -y maven
COPY . .
RUN mvn package -DskipTests

#imagen final
FROM eclipse-temurin:21-jdk-jammy
COPY --from=build /app/target/prueba_tecnica_supermercado-0.0.1.jar app_pruebatecsuper.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_pruebatecsuper.jar"]
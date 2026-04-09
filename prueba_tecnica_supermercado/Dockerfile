
#compilar
FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app
COPY . .
RUN chmod +x ./mvnw
RUN ./mvnw package -DskipTests

#imagen final
FROM eclipse-temurin:21-jdk-jammy
COPY --from=build /app/target/prueba_tecnica_supermercado-0.0.1.jar app_pruebatecsuper.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_pruebatecsuper.jar"]

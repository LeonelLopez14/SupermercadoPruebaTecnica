

FROM eclipse-temurin:21-jdk-jammy
ARG JAR_FILE=target/prueba_tecnica_supermercado-0.0.1.jar
COPY ${JAR_FILE} app_pruebatecsuper.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_pruebatecsuper.jar"]

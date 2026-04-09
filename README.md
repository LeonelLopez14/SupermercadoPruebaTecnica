# Prueba técnica junior supermercado

Prueba tecnica junior en la que se crea una API RESTful para un Supermercado
usando Java, SpringBoot, JPA+Hibernate, MySQL y Docker.

## Tecnologías utilizadas
- Java 21
- Spring Boot 4.0.5
- MySQL 8.3.0
- Docker

## Requisitos previos
- Docker instalado
- Java 21

## Cómo correr el proyecto localmente

1. Clonar el repositorio
git clone https://github.com/LeonelLopez14/SupermercadoPruebaTecnica

2. Levantar con Docker Compose
docker-compose up --build

3. La app estará disponible en http://localhost:8080

## Endpoints
| Método | URL | Descripción |
|--------|-----|-------------|
| GET    | /productos | Lista todos los productos |
| POST   | /productos | Crea un producto |

## Variables de entorno
| Variable | Descripción |
|----------|-------------|
| DB_URL | URL de conexión a la base de datos |
| DB_USERNAME | Usuario de la BD |
| DB_PASSWORD | Contraseña de la BD |

## Demo
https://tu-app.onrender.com
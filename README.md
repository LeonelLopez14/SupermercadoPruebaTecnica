# Prueba técnica junior supermercado
![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.5-green)
![MySQL](https://img.shields.io/badge/MySQL-8.3.0-blue)
![Docker](https://img.shields.io/badge/Docker-yes-blue)

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
\``bash
git clone https://github.com/LeonelLopez14/SupermercadoPruebaTecnica
\``

2. Levantar con Docker Compose
\``bash
docker-compose up --build
\``

3. La app estará disponible en http://localhost:8080

## Endpoints
| Método | URL 							 | Descripción 						|
|--------|-------------------------------|----------------------------------|
| GET    | api/producto/todos			 | Lista todos los productos		|
| GET    | api/producto/{id}			 | Lista un producto por Id 		|
| POST   | api/producto/crear		   	 | Crea un producto 				|
| PUT    | api/producto/actualizar		 | Actualiza un producto 			|
| DELETE | api/producto/eliminar/{id} 	 | Elimina un producto por id 		|
| GET	 | api/sucursal/todas 			 | Lista todas las sucursales 		|
| GET    | api/sucursal/{id} 			 | Lista una sucursal por Id 		|
| POST   | api/sucursal/crear 			 | Crea una sucursal 				|										
| PUT    | api/sucursal/actualizar 		 | Actualiza una sucursal 			|
| DELETE | api/sucursal/eliminar/{id} 	 | Elimina una sucursal por id 		|
| GET    | api/venta/todas 				 | Lista todas las ventas 			|
| GET    | api/venta/{id} 				 | Lista una venta por Id 			|
| POST   | api/venta/crear 				 | Crea una venta 					|
| PUT    | api/venta/actualizar 		 | Actualiza una venta 				|
| DELETE | api/venta/eliminar/{id} 		 | Elimina una venta por Id 		|
| GET    | api/detalle-venta/todos 		 | Lista todos los detalle de venta |
| GET    | api/detalle-venta/{id} 		 | Lista un detalle de venta por id |
| POST   | api/detalle-venta/crear 		 | Crea un detalle de venta 		|
| PUT    | api/detalle-venta/actualizar  | Actualiza un detalle de venta 	|
| DELETE | api/detalle-venta/borrar/{id} | Borra un detalle de venta por Id |

## Variables de entorno
| Variable | Descripción |
|----------|-------------|
| DB_URL | URL de conexión a la base de datos |
| DB_USERNAME | Usuario de la BD |
| DB_PASSWORD | Contraseña de la BD |

## Demo
https://supermercadopruebatecnica.onrender.com/
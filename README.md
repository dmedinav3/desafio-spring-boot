# Desafío Técnico: Gestión de Tareas con Spring Boot y Java 8

La empresa NUEVO SPA desea desarrollar una plataforma de gestión de tareas para mejorar la productividad de sus equipos. El sistema debe permitir a los usuarios crear, actualizar, eliminar y listar tareas. Además, se requiere autenticación mediante JWT y documentación de la API utilizando OpenAPI y Swagger.

## Objetivo:
Crear una API RESTful utilizando Spring Boot 2.5.4 que gestione usuarios y tareas, aplicando buenas prácticas, principios SOLID y utilizando las tecnologías especificadas.

## Requisitos Técnicos:
### Java 8:
Utiliza Java 8 para la implementación.
Utiliza las características de Java 8, como lambdas y streams, cuando sea apropiado.

### Spring Boot 2.5.4:
Construye la aplicación utilizando Spring Boot 2.5.4 o una version superior 2.X.X que soporte java 8.

### Base de Datos:

Utiliza una base de datos H2.
Crea tres tablas: usuarios, tareas y estados_tarea.
La tabla usuarios debe contener datos pre cargados.
La tabla estados_tarea debe contener estados pre cargados.

### JPA:
Implementa una capa de persistencia utilizando JPA para almacenar y recuperar las tareas.

### JWT (JSON Web Token):

Implementa la autenticación utilizando JWT para validar usuarios.

### OpenAPI y Swagger:

Documenta la API utilizando OpenAPI y Swagger.

## Funcionalidades:
### Autenticación:
Implementa un endpoint para la autenticación de usuarios utilizando JWT.

### CRUD de Tareas:
Implementa operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para las tareas.

## Consideraciones:
### Seguridad:
Asegúrate de que las operaciones CRUD de tareas solo sean accesibles para usuarios autenticados.

### Documentación:
Utiliza OpenAPI y Swagger para documentar claramente la API.

### Código Limpio:
Escribe código ordenado, aplicando buenas prácticas y principios SOLID.

### Creatividad
Se espera dada la descripción del problema se creen las entidades y metodos en consecuencia a lo solicitado.

## Entregables:
### Repositorio de GitHub:
Proporciona un enlace al repositorio de GitHub que contenga el código fuente.

### Documentación:
Incluye instrucciones claras sobre cómo ejecutar y probar la aplicación.

## Evaluación:
Se evaluará la solución en función de los siguientes criterios:

Correcta implementación de las funcionalidades solicitadas.
Aplicación de buenas prácticas de desarrollo y principios SOLID.
Uso adecuado de Java 8, Spring Boot 2.5.4, H2, JWT, OpenAPI y Swagger.
Claridad y completitud de la documentación.

# Desafío Técnico: Gestión de Tareas con Spring Boot y Java 17

La empresa NUEVO SPA desea desarrollar una plataforma de gestión de tareas para mejorar la productividad de sus equipos. El sistema debe permitir a los usuarios crear, actualizar, eliminar y listar tareas. Además, se requiere autenticación mediante JWT y documentación de la API utilizando OpenAPI y Swagger.

# Java 17
# Springboot 2.7.14
# Swagger 2
# JWT 0.11
# H2

# Se adjunta script data.sql con el insert para las tablas roles y status

# Para registrar usuario utilizar endpoint de /auth/register, ejemplo :
# curl --location 'http://localhost:8088/api/auth/register' \
# --header 'Content-Type: application/json' \
# --header 'Cookie: JSESSIONID=63DD7C95DD4473BC05EF1C1F420C8C5B' \
# --data '{
# "username" : "test",
# "password" : "password"
# }'


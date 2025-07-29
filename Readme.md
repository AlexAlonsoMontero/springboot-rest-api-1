# API REST Básica con Spring Boot

## 📝 Descripción

API REST para gestionar productos y fabricantes, implementando operaciones CRUD básicas con Spring Boot y MySQL.

## 🛠 Tecnologías Utilizadas

- **Spring Boot 3.x**: Framework principal
- **MySQL**: Base de datos relacional
- **JPA / Hibernate**: Persistencia de datos
- **Maven**: Gestión de dependencias
- **Lombok**: Reducción de código boilerplate

## 🏗 Estructura del Proyecto

- **Entidades**:

  - `Maker`: Fabricante de productos
  - `Product`: Productos relacionados con fabricantes

- **Capas**:
  - **Repository**: Interfaces para acceso a datos
  - **DAO**: Implementación de la capa de acceso a datos
  - **Service**: Lógica de negocio
  - **Controller**: Endpoints REST

## 📊 Modelo de Datos

### Tabla Fabricante

- id (Long)
- name (String)

### Tabla Products

- id (Long)
- name (String)
- price (BigDecimal)
- id_fabricante (Foreign Key)

## 🔄 Relaciones

- Un fabricante puede tener múltiples productos (One-to-Many)
- Un producto pertenece a un único fabricante (Many-to-One)

## ⚙️ Configuración

### Configuración de la base de datos

Por seguridad, los datos sensibles como usuario y contraseña no deben subirse al repositorio. El archivo `application.properties` está incluido en `.gitignore`.

Crea tu propio archivo `src/main/resources/application.properties` con la siguiente estructura:

```properties
spring.datasource.url=jdbc:mysql://<host>:<puerto>/<nombre_base_de_datos>
spring.datasource.username=<usuario>
spring.datasource.password=<contraseña>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=create
```

Reemplaza `<host>`, `<puerto>`, `<nombre_base_de_datos>`, `<usuario>` y `<contraseña>` por tus propios datos locales.

**Ejemplo:**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/rest_api_db
spring.datasource.username=miusuario
spring.datasource.password=miclave
```

**Nota:** No compartas tus credenciales en el repositorio público.

## 🚀 Funcionalidades

- CRUD completo para fabricantes y productos
- Manejo de relaciones entre entidades
- Validación de datos
- Respuestas HTTP apropiadas
- Manejo de excepciones

## 📝 Autor

Alejandro Alonso

## 📄 Licencia

Este proyecto está bajo la Licencia MIT

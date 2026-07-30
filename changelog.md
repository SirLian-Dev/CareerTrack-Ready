# 📜 CHANGELOG.md

Todos los cambios importantes realizados en CareerTrack Ready serán registrados en este documento.

Este proyecto sigue un versionado incremental y documenta cada cambio relevante para mantener un historial claro de la evolución del producto.

---

# [0.2.0] - En desarrollo

## 🎯 Objetivo de la versión

Construir una infraestructura sólida y escalable que sirva como base para el desarrollo de CareerTrack Ready.

---

## Agregado

### Infraestructura

- Configuración inicial del proyecto con Spring Boot.
- Integración con PostgreSQL.
- Configuración de Maven.
- Perfiles de desarrollo mediante archivos de configuración.

### Arquitectura

- Arquitectura por capas.
- Separación entre Controller, Service y Repository.
- Patrón DTO.
- Manejo global de excepciones.

### Seguridad

- Integración de Spring Security.
- Encriptación de contraseñas mediante BCrypt.
- Implementación inicial de JWT.
- AuthenticationService.
- CustomUserDetailsService.
- JwtService.

### Base de datos

- Modelo inicial de usuarios.
- Persistencia mediante Spring Data JPA.

### Documentación

Se creó la documentación inicial del proyecto:

- README.md
- CURRENT_STATUS.md
- PROJECT_STATE.md
- AI_CONTEXT.md
- vision.md
- requirements.md
- architecture.md
- roadmap.md
- api-design.md
- database-design.md

---

## Cambiado

- El proyecto deja de presentarse como un backend genérico y pasa a convertirse oficialmente en **CareerTrack Ready**, el primer producto del ecosistema CareerTrack.
- Se redefine el propósito del producto para centrarse en el análisis de perfiles profesionales frente a vacantes laborales.
- Toda la documentación oficial pasa a mantenerse en español.

---

## Corregido

- Mejoras en la organización del repositorio.
- Revisión y reorganización de la estructura documental.
- Optimización del archivo `pom.xml`.
- Ajustes en la configuración del entorno de desarrollo.

---

## Pendiente para la versión 0.3.0

- Finalizar la autenticación JWT.
- Implementar el filtro JWT.
- Configurar completamente Spring Security.
- Proteger los endpoints.
- Completar el flujo de autenticación.

---

# Próximas versiones previstas

## 0.3.0

Autenticación completa.

## 0.4.0

Análisis de vacantes.

## 0.5.0

Perfil profesional.

## 0.6.0

Sistema de recomendaciones.

## 0.7.0

Dashboard del usuario.

## 1.0.0

Primer MVP estable de CareerTrack Ready.

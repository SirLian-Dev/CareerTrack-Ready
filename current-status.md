# 📌 Estado Actual del Proyecto

> Este documento representa el estado actual de CareerTrack Ready.
>
> Debe actualizarse al finalizar cada hito importante o antes de iniciar una nueva versión del producto.

---

# Información General

| Propiedad | Valor |
|------------|--------|
| Producto | CareerTrack Ready |
| Ecosistema | CareerTrack |
| Versión actual | v0.2.0 |
| Estado | 🟡 En desarrollo |
| Etapa | Infraestructura |
| Repositorio | CareerTrack-Ready |

---

# Descripción

CareerTrack Ready es el primer producto del ecosistema CareerTrack.

Actualmente el desarrollo está enfocado en construir una infraestructura sólida que permita desarrollar funcionalidades de negocio de forma escalable, mantenible y segura.

La infraestructura desarrollada será la base para todas las funcionalidades del producto.

---

# Progreso General

| Área | Estado |
|------|--------|
| Documentación | ██████████ 100% |
| Arquitectura | ██████████ 100% |
| Base de datos | ██████████ 100% |
| Gestión de usuarios | ██████████ 100% |
| Autenticación | ████████░░ 80% |
| Seguridad | ███████░░░ 70% |
| Dominio de negocio | ██░░░░░░░░ 20% |
| Testing | ░░░░░░░░░░ 0% |
| Frontend | ░░░░░░░░░░ 0% |

---

# Funcionalidades Completadas

## Infraestructura

- Spring Boot configurado
- PostgreSQL integrado
- Maven configurado
- Perfiles de desarrollo

## Arquitectura

- Arquitectura por capas
- DTO Pattern
- Repository Pattern
- Manejo global de excepciones

## Seguridad

- BCrypt
- JwtService
- AuthenticationService
- CustomUserDetailsService

---

# Funcionalidades en Desarrollo

- JWT Authentication Filter
- SecurityConfig
- Endpoints protegidos

---

# Próximo Objetivo

Finalizar el módulo de autenticación.

Una vez completado comenzará el desarrollo del dominio de negocio de CareerTrack Ready.

---

# Próximos Módulos

- Gestión de Vacantes
- Empresas
- Dashboard
- Estadísticas
- Recomendaciones
- Historial de análisis

---

# Deuda Técnica

Actualmente identificada:

- No existen pruebas automatizadas.
- JWT aún no está completamente integrado.
- No existe documentación OpenAPI.
- No existe frontend.

---

# Estado General

La infraestructura del backend se considera estable.

Las próximas versiones estarán enfocadas en agregar funcionalidades del producto, evitando cambios arquitectónicos importantes.

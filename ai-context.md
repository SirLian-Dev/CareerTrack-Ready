# 🤖 AI_CONTEXT.md

> **Contexto oficial para asistentes de IA y desarrolladores**
>
> Este documento proporciona el contexto necesario para comprender CareerTrack Ready antes de realizar cualquier modificación en el proyecto.
>
> Todo asistente de IA o desarrollador debe leer este documento antes de analizar, modificar o generar código.

---

# 1. Propósito del proyecto

CareerTrack Ready es el primer producto del ecosistema **CareerTrack**.

Su objetivo es ayudar a desarrolladores junior y profesionales en crecimiento a comprender cómo mejorar su perfil profesional frente a una vacante específica mediante un análisis honesto, claro y accionable.

CareerTrack Ready no pretende reemplazar a un reclutador.

Su propósito es actuar como un mentor digital que ayude al usuario a identificar fortalezas, oportunidades de mejora y un plan de aprendizaje priorizado para aumentar sus posibilidades de obtener empleo.

---

# 2. Objetivo del MVP

La primera versión funcional del producto debe permitir que un usuario pueda:

- Crear una cuenta.
- Iniciar sesión.
- Completar su perfil profesional.
- Analizar una vacante laboral.
- Obtener un informe detallado sobre su compatibilidad con la vacante.
- Recibir recomendaciones claras para mejorar.
- Consultar el historial de análisis realizados.

Toda funcionalidad que no aporte valor directo a este objetivo debe ser evaluada antes de implementarse.

---

# 3. Estado actual del proyecto

Versión actual:

v0.2.0

Etapa:

Construcción de infraestructura.

Actualmente el backend ya cuenta con la mayor parte de la infraestructura necesaria.

Las próximas versiones estarán enfocadas principalmente en desarrollar el dominio del negocio.

---

# 4. Filosofía del proyecto

CareerTrack Ready sigue los siguientes principios:

- Documentación antes que código.
- Simplicidad antes que complejidad.
- Código claro antes que código inteligente.
- Arquitectura estable antes que velocidad de desarrollo.
- Cambios pequeños e incrementales.
- El código debe ser fácil de mantener.
- Cada funcionalidad debe resolver un problema real.

La documentación forma parte del producto y debe mantenerse actualizada.

---

# 5. Arquitectura

El backend utiliza una arquitectura por capas.

```text
Controller
      │
      ▼
Service
      │
      ▼
Repository
      │
      ▼
Database
```

Cada capa tiene una única responsabilidad.

No deben mezclarse responsabilidades entre capas.

---

# 6. Tecnologías utilizadas

## Backend

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- JWT

## Herramientas

- Eclipse IDE
- Git
- GitHub
- pgAdmin 4

---

# 7. Convenciones de desarrollo

Todo nuevo código debe cumplir las siguientes reglas:

- Mantener el estilo existente del proyecto.
- Priorizar la legibilidad.
- Evitar duplicación de código.
- Utilizar nombres descriptivos.
- Mantener separadas las responsabilidades.
- Respetar la arquitectura existente.
- Aplicar principios SOLID cuando sea posible.
- Agregar comentarios únicamente cuando aporten contexto útil.

---

# 8. Flujo oficial de desarrollo

Toda nueva funcionalidad debe seguir el siguiente proceso:

1. Investigación
2. Planeación
3. Documentación
4. Revisión de la documentación
5. Implementación
6. Pruebas
7. Actualización de la documentación
8. Commit
9. Release (cuando aplique)

No se deben implementar funcionalidades directamente sin haber sido documentadas.

---

# 9. Prioridad actual

La prioridad inmediata es completar el módulo de autenticación.

Pendientes principales:

- JWT Authentication Filter
- Configuración definitiva de Spring Security
- Protección de endpoints
- Flujo completo de autenticación

Hasta finalizar este módulo no deben iniciarse nuevas funcionalidades del dominio del negocio.

---

# 10. Restricciones

Antes de modificar el proyecto, verificar si existe una decisión documentada al respecto.

No realizar los siguientes cambios sin justificación:

- Cambiar la arquitectura principal.
- Incorporar dependencias innecesarias.
- Sustituir tecnologías ya adoptadas.
- Eliminar documentación.
- Duplicar funcionalidades existentes.
- Introducir soluciones experimentales en el código principal.

---

# 11. Documentación obligatoria

Antes de comenzar cualquier tarea deben revisarse los siguientes documentos:

1. README.md
2. CURRENT_STATUS.md
3. PROJECT_STATE.md
4. DECISIONS.md
5. docs/vision.md
6. docs/requirements.md
7. docs/architecture.md
8. docs/roadmap.md

Estos documentos representan la fuente oficial de información del proyecto.

---

# 12. Cómo debe colaborar una IA

Una IA debe actuar como un colaborador técnico.

Debe:

- Comprender el contexto antes de escribir código.
- Explicar las decisiones importantes.
- Mantener la consistencia del proyecto.
- Detectar posibles mejoras sin romper la arquitectura.
- Respetar las decisiones previamente documentadas.
- Favorecer soluciones simples y mantenibles.

No debe asumir requisitos que no estén documentados.

Cuando exista ambigüedad, debe solicitar aclaración antes de implementar cambios.

---

# 13. Visión a largo plazo

CareerTrack Ready es el primer producto del ecosistema CareerTrack.

En el futuro coexistirá con otros productos desarrollados bajo los mismos principios definidos por CareerTrack Foundation.

Toda decisión técnica debe considerar:

- Escalabilidad.
- Mantenibilidad.
- Reutilización.
- Claridad.

---

# 14. Regla fundamental

Antes de implementar cualquier funcionalidad, responder la siguiente pregunta:

> **¿Esta funcionalidad aporta valor directo al objetivo del MVP de CareerTrack Ready?**

Si la respuesta es **no**, debe posponerse para una versión futura.

---

# 15. Mensaje final

CareerTrack Ready no nació como un ejercicio académico.

Nació con el propósito de convertirse en un producto real que ayude a las personas a mejorar sus oportunidades laborales.

Cada decisión tomada en este proyecto busca equilibrar calidad técnica, simplicidad y valor para el usuario.

Antes de escribir código, comprende el problema que intentamos resolver.
Después, implementa la solución más clara, mantenible y coherente con la visión del producto.

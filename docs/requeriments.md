# 📋 requirements.md

> **Especificación oficial de requisitos de CareerTrack Ready**
>
> Este documento describe el comportamiento esperado del sistema, sus funcionalidades principales y los requisitos que deberán cumplirse durante el desarrollo del producto.
>
> Todos los cambios funcionales deberán reflejarse en este documento.

---

# 1. Objetivo

CareerTrack Ready tiene como objetivo ayudar a desarrolladores junior y profesionales en crecimiento a comprender qué tan preparados están para una oportunidad laboral y qué acciones pueden tomar para mejorar su perfil profesional.

El sistema deberá proporcionar análisis claros, recomendaciones accionables y un seguimiento del progreso del usuario.

---

# 2. Alcance del MVP

La primera versión del producto estará enfocada exclusivamente en el análisis del perfil profesional.

El MVP permitirá que un usuario pueda:

- Registrarse.
- Iniciar sesión.
- Gestionar su perfil profesional.
- Analizar una vacante.
- Obtener un informe de compatibilidad.
- Recibir recomendaciones personalizadas.
- Consultar su historial de análisis.

Todo aquello que no aporte valor directo a estas funcionalidades quedará fuera del alcance del MVP.

---

# 3. Actores del sistema

## Usuario

Persona que utiliza CareerTrack Ready para analizar su perfil profesional y recibir recomendaciones.

---

## Sistema

Backend encargado de procesar la información, comparar perfiles, almacenar datos y generar resultados.

---

# 4. Requisitos funcionales

## RF-001 Registro de usuarios

El sistema deberá permitir que un usuario cree una cuenta utilizando:

- Nombre
- Correo electrónico
- Contraseña

El correo deberá ser único.

Las contraseñas deberán almacenarse cifradas mediante BCrypt.

---

## RF-002 Autenticación

El sistema deberá permitir que un usuario inicie sesión utilizando sus credenciales.

La autenticación utilizará JWT.

Solo los usuarios autenticados podrán acceder a los recursos protegidos.

---

## RF-003 Gestión del perfil

El usuario podrá:

- Actualizar información personal.
- Agregar experiencia.
- Registrar tecnologías conocidas.
- Registrar habilidades.
- Indicar nivel de experiencia.
- Agregar enlaces relevantes (GitHub, LinkedIn, Portafolio).

---

## RF-004 Gestión de vacantes

El usuario podrá registrar una vacante mediante:

- URL
- Texto completo
- Información manual

El sistema almacenará la información para futuras consultas.

---

## RF-005 Comparación de perfiles

El sistema deberá comparar:

- Habilidades requeridas.
- Tecnologías.
- Nivel de experiencia.
- Competencias.

El resultado será un análisis estructurado.

---

## RF-006 Informe de resultados

Después del análisis el sistema deberá mostrar:

- Compatibilidad general.
- Fortalezas.
- Debilidades.
- Tecnologías faltantes.
- Prioridad de aprendizaje.
- Recomendaciones.

---

## RF-007 Historial

El usuario podrá consultar todos los análisis realizados anteriormente.

---

# 5. Requisitos no funcionales

## RNF-001 Rendimiento

Las respuestas del backend deberán mantenerse rápidas incluso con un crecimiento moderado del número de usuarios.

---

## RNF-002 Seguridad

El sistema deberá proteger:

- Credenciales.
- Tokens.
- Información personal.

---

## RNF-003 Escalabilidad

La arquitectura deberá permitir incorporar nuevos módulos sin modificar la base existente.

---

## RNF-004 Mantenibilidad

El código deberá seguir una arquitectura organizada y facilitar futuras modificaciones.

---

## RNF-005 Documentación

Toda funcionalidad implementada deberá estar documentada.

---

# 6. Reglas de negocio

## RB-001

Cada correo electrónico será único.

---

## RB-002

Solo usuarios autenticados podrán acceder a su información.

---

## RB-003

Cada análisis pertenecerá únicamente al usuario que lo creó.

---

## RB-004

Las recomendaciones deberán generarse a partir de la comparación entre el perfil del usuario y la vacante analizada.

---

## RB-005

El historial conservará todos los análisis realizados, salvo eliminación explícita por parte del usuario.

---

# 7. Exclusiones del MVP

Las siguientes funcionalidades no forman parte de la primera versión:

- Portal de empleo.
- Empresas.
- Publicación de vacantes.
- Mensajería.
- Red social.
- Cursos.
- Chat.
- Aplicación móvil.
- Notificaciones.
- IA generativa.

---

# 8. Criterios de aceptación del MVP

El MVP será considerado funcional cuando un usuario pueda:

✅ Crear una cuenta.

✅ Iniciar sesión.

✅ Completar su perfil.

✅ Registrar una vacante.

✅ Analizar la vacante.

✅ Obtener un informe.

✅ Consultar su historial.

---

# 9. Evolución del producto

Los requisitos descritos en este documento corresponden únicamente al MVP.

Las versiones futuras incorporarán nuevas funcionalidades siguiendo el roadmap oficial del proyecto.

---

# Principio rector

Cada nueva funcionalidad deberá responder afirmativamente a la siguiente pregunta:

> **¿Esta característica ayuda al usuario a comprender mejor su perfil profesional y a convertirse en un mejor candidato?**

Si la respuesta es negativa, la funcionalidad deberá evaluarse para una versión futura.

# 📖 DECISIONS.md

> Registro oficial de decisiones estratégicas, funcionales y técnicas de CareerTrack Ready.
>
> Este documento conserva el contexto y el razonamiento detrás de las decisiones más importantes del proyecto.
>
> Antes de proponer un cambio relevante, revisa este documento para evitar repetir discusiones ya resueltas.

---

# Estado del documento

Versión: 1.0

Última actualización: Julio 2026

---

# Formato de las decisiones

Cada decisión contiene:

- ID
- Estado
- Fecha
- Contexto
- Decisión
- Justificación
- Consecuencias

---

# DEC-001

## Título

CareerTrack Ready existe para ayudar a las personas a convertirse en mejores candidatos.

**Estado**

✅ Aprobada

**Fecha**

Julio 2026

### Contexto

Inicialmente el proyecto fue concebido como un gestor de postulaciones laborales.

Durante la definición del producto se identificó que el verdadero problema de los desarrolladores junior no era organizar sus postulaciones, sino comprender qué les impedía acceder a mejores oportunidades laborales.

### Decisión

CareerTrack Ready se enfocará en ayudar a los usuarios a mejorar su perfil profesional mediante análisis honestos, claros y accionables.

No competirá directamente con portales de empleo.

### Justificación

Esta propuesta aporta mayor valor al usuario y diferencia el producto frente a soluciones existentes.

### Consecuencias

Todas las funcionalidades futuras deberán contribuir al crecimiento profesional del usuario.

---

# DEC-002

## Título

CareerTrack se convierte en un ecosistema de productos.

**Estado**

✅ Aprobada

### Contexto

El alcance del proyecto dejó de corresponder a una única aplicación.

### Decisión

CareerTrack pasa a representar un ecosistema.

CareerTrack Ready será su primer producto.

CareerTrack Foundation definirá los principios comunes.

### Justificación

Permite escalar el proyecto sin limitar futuras iniciativas.

### Consecuencias

Cada nuevo producto deberá alinearse con CareerTrack Foundation.

---

# DEC-003

## Título

CareerTrack Ready reutiliza el backend existente.

**Estado**

✅ Aprobada

### Contexto

Ya existía una infraestructura estable desarrollada con Spring Boot.

### Decisión

El backend construido inicialmente será la base tecnológica de CareerTrack Ready.

No se desarrollará un backend desde cero.

### Justificación

Reduce tiempo de desarrollo y aprovecha el trabajo ya realizado.

### Consecuencias

La infraestructura actual debe mantenerse estable y evolucionar de forma incremental.

---

# DEC-004

## Título

La documentación tiene prioridad sobre el código.

**Estado**

✅ Aprobada

### Contexto

El proyecto utilizará asistentes de IA durante su desarrollo.

### Decisión

Toda funcionalidad seguirá el flujo:

Investigación

↓

Planeación

↓

Documentación

↓

Revisión

↓

Implementación

↓

Pruebas

↓

Actualización documental

↓

Commit

### Justificación

Evita improvisaciones y facilita el trabajo con IA.

### Consecuencias

No se implementarán funcionalidades sin documentación previa.

---

# DEC-005

## Título

La IA es una colaboradora técnica.

**Estado**

✅ Aprobada

### Contexto

El proyecto utilizará agentes de desarrollo.

### Decisión

Las IA implementan código.

Las decisiones del producto pertenecen al equipo humano.

### Justificación

Mantiene una dirección estratégica coherente.

### Consecuencias

Las decisiones arquitectónicas importantes deberán documentarse antes de implementarse.

---

# DEC-006

## Título

Toda la documentación oficial estará en español.

**Estado**

✅ Aprobada

### Contexto

El idioma principal del equipo es el español.

### Decisión

Toda la documentación oficial se redactará en español.

### Justificación

Facilita el mantenimiento y reduce errores de interpretación.

### Consecuencias

Si en el futuro se requiere documentación en inglés, será una traducción de la versión oficial en español.

---

# DEC-007

## Título

Separación entre documentación del repositorio y documentación del producto.

**Estado**

✅ Aprobada

### Decisión

Los documentos relacionados con el funcionamiento del repositorio permanecerán en la raíz.

La documentación funcional del producto permanecerá dentro de la carpeta docs/.

### Justificación

Mejora la organización y evita duplicidades.

---

# DEC-008

## Título

Cada documento tiene una única responsabilidad.

**Estado**

✅ Aprobada

### Decisión

No se duplicará información entre documentos.

Cada archivo tendrá un propósito claramente definido.

### Justificación

Reduce inconsistencias y simplifica el mantenimiento.

---

# DEC-009

## Título

Desarrollo incremental.

**Estado**

✅ Aprobada

### Decisión

Solo existirá una prioridad principal de desarrollo en cada etapa.

No se desarrollarán múltiples módulos simultáneamente.

### Justificación

Reduce deuda técnica y mantiene el enfoque.

---

# DEC-010

## Título

La simplicidad es un principio del proyecto.

**Estado**

✅ Aprobada

### Decisión

Siempre que existan varias soluciones técnicamente válidas, se priorizará la más sencilla, clara y mantenible.

### Justificación

CareerTrack Ready busca ser un producto sostenible a largo plazo.

---

# DEC-011

## Título

El proyecto también es una herramienta de aprendizaje.

**Estado**

✅ Aprobada

### Contexto

El desarrollo del producto forma parte del crecimiento profesional de su fundador.

### Decisión

Las decisiones técnicas y la documentación deberán favorecer la comprensión del proyecto.

### Justificación

El conocimiento adquirido durante el desarrollo es un objetivo adicional del proyecto.

---

# DEC-012

## Título

CareerTrack Ready es un producto real.

**Estado**

✅ Aprobada

### Decisión

El proyecto no será tratado como un ejercicio académico ni únicamente como un portafolio.

### Justificación

El objetivo es construir un producto capaz de generar valor para los usuarios y convertirse en una solución comercial.

---

# DEC-013

## Título

El repositorio debe ser comprensible para asistentes de IA.

**Estado**

✅ Aprobada

### Decisión

Toda IA debe ser capaz de comprender el proyecto leyendo únicamente la documentación oficial.

### Justificación

Reducir la dependencia del contexto conversacional.

---

# DEC-014

## Título

El MVP debe resolver un único problema.

**Estado**

✅ Aprobada

### Decisión

El MVP se centrará exclusivamente en ayudar al usuario a comprender y mejorar su perfil profesional frente a una vacante.

### Justificación

Permite validar la propuesta de valor antes de ampliar el alcance del producto.

---

# DECISIONES FUTURAS

Las decisiones que aún no hayan sido aprobadas podrán registrarse con los siguientes estados:

- 🟡 Propuesta
- 🔵 En evaluación
- 🟢 Aprobada
- 🔴 Rechazada
- ⚫ Obsoleta

Cuando una decisión cambie, nunca deberá eliminarse.

Su estado deberá actualizarse para conservar el historial del proyecto.

---

# Principio final

Las decisiones registradas en este documento representan el conocimiento institucional de CareerTrack Ready.

Toda modificación importante del producto deberá respetar estas decisiones o justificar claramente por qué deben actualizarse.

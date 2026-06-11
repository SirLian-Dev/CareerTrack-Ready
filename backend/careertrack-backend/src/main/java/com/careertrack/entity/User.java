package com.careertrack.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User { //Clase encargada de representar usuarios en la base de datos, con sus atributos y anotaciones para la persistencia.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Id en SQL automático.

    @Column(nullable = false, length = 100)
    private String name; //Nombre del Usuario

    @Column(nullable = false, unique = true)
    private String email; //Correo Electrónico único.

    @Column(nullable = false)
    private String password; //Contraseña del usuario

    private LocalDateTime createdAt; //Fecha y hora de creación del usuario, útil para auditoría y seguimiento de registros.
    private LocalDateTime updatedAt;

}
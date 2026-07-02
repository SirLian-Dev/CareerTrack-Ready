package com.careertrack.entity;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements UserDetails { 
	//Clase encargada de representar usuarios en la base de datos, con sus atributos y anotaciones para la persistencia.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Id en SQL automático.

    @Column(nullable = false, length = 100)
    private String name; //Nombre del Usuario

    @Column(nullable = false, unique = true)
    private String email; //Correo Electrónico único.

    @Column(nullable = false)
    private String password; //Contraseña del usuario
    
    //Fecha y hora de creación del usuario, útil para auditoría y seguimiento de registros.
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
 // Retorna los permisos del usuario
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getUsername() {
    	//Spring Security utilizará el email como username
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
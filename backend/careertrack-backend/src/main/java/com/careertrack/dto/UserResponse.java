package com.careertrack.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
//Permite devolver solo los datos necesarios de los Usuarios. 

	private Long id;
    private String name;
    private String email;

}
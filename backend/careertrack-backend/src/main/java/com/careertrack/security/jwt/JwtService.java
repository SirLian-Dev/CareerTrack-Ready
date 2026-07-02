package com.careertrack.security.jwt;

import java.security.Key;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

	@Value("${application.security.jwt.secret-key}")
	private String secretKey; // Se obtiene la clave secreta desde application-dev.properties
		
	@Value("${application.security.jwt.expiration}")
	private long jwtExpiration; // Tiempo de expiración del token en milisegundos

	public String generateToken(String username) {
	//Genera un JWT para el usuario autenticado. El username será el email del usuario.
	    return Jwts.builder()
	    		.subject(username)
	    		.issuedAt(new Date())
	            .expiration(new Date(System.currentTimeMillis() + jwtExpiration))
	            .signWith(getSigningKey())// Firma digital del token
	            .compact();
	}


	public String extractUsername(String token) {
		// Extrae el email almacenado dentro del token.
	    return extractAllClaims(token)
	            .getSubject();
	}


	public boolean isTokenValid(String token,String username) {
		// Verifica si el token pertenece al usuario y además no está expirado.
	    String extractedUsername= extractUsername(token);
	
	    return extractedUsername.equals(username) && !isTokenExpired(token);
	}


	private boolean isTokenExpired(String token) {
	//Verifica si la fecha de expiración ya pasó.
	    return extractAllClaims(token)
	            .getExpiration()
	            .before(new Date());
	}


	private Claims extractAllClaims(String token) {
	//Obtiene toda la información contenida dentro del JWT.
	    return Jwts.parser()
	    		.verifyWith((javax.crypto.SecretKey) getSigningKey())// Valida la firma usando nuestra clave secreta
	    		.build()
	    		.parseSignedClaims(token)
	    		.getPayload();
	}


	private Key getSigningKey() {
	// Convierte la clave Base64 almacenada en application.properties a una clave utilizable por JWT.
	    byte[] keyBytes = Decoders.BASE64.decode(secretKey);
	
	    return Keys.hmacShaKeyFor(keyBytes);
	}


}

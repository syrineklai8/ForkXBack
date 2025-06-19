package tn.esprit.examen.SpringSecurity;

import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.crypto.SecretKey;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;

@Component
public class JwtUtil {

  private final SecretKey key = Keys.hmacShaKeyFor("12345678901234567890123456789012".getBytes(StandardCharsets.UTF_8));

  public String generateToken(String username, String role) {
    return Jwts.builder()
      .subject(username)
      .claim("role", role)
      .issuedAt(new Date())
      .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10h
      .signWith(key, Jwts.SIG.HS256) // use SIG constant for HS256
      .compact();
  }

  public String extractUsername(String token) {
    return extractClaims(token).getSubject();
  }

  public Claims extractClaims(String token) {
    JwtParser parser = Jwts.parser()
      .verifyWith(key).build(); // ⚠️ Nouvel usage avec verifyWith()
    return parser.parseSignedClaims(token).getPayload(); // ⚠️ Nouvel usage
  }

  public boolean isTokenExpired(String token) {
    return extractClaims(token).getExpiration().before(new Date());
  }

  public boolean validateToken(String token, String username) {
    return (username.equals(extractUsername(token)) && !isTokenExpired(token));
  }
}



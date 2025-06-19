package tn.esprit.examen.SpringSecurity;

import lombok.AllArgsConstructor;
import lombok.Data;
import tn.esprit.examen.entities.RoleStaff;

@Data
@AllArgsConstructor
public class JwtResponse {
  private String token;
  private RoleStaff role;
}

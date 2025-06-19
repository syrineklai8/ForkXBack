package tn.esprit.examen.DTOSignUp;

import lombok.Data;
import tn.esprit.examen.entities.RoleStaff;

@Data
public class SignupRequest {
  private String email;
  private String password;
  private String nameStaff;
  private RoleStaff roleStaff;
}

